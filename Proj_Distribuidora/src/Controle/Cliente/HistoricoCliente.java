/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle.Cliente;


import Conexao.Conexao;
import Controle.Login;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.*;
import java.sql.SQLException;

/**
 *
 * @author Karinne Angelo dos Santos Ventura - 2° DS AMS (ETEC ZONA LESTE)
 */

public class HistoricoCliente extends javax.swing.JFrame {
    Conexao conexao;
    DefaultTableModel model;
    private int idPedidoSelecionado;


   public HistoricoCliente() {
        // Inicialização dos componentes do JFrame
        initComponents();
        // Define o ícone da janela
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Controle/Imagens/icon.png")));
        // Configurações da janela
        setResizable(false);
        setLocationRelativeTo(null);
        // Mudar a cor do fundo
        getContentPane().setBackground(new Color(43, 0, 87));
        // Instanciar a classe de conexão e conectar ao banco de dados
        conexao = new Conexao();
        conexao.conecta();
        // Chamar métodos para carregar dados
        carregarDadosCliente();
        carregarDadosTabela();
        // Definindo o modelo da tabela
        model = (DefaultTableModel) tabelaCompra.getModel();
    }
    
   private void imprimirExtrato() {
        // Verifica se algum pedido foi selecionado
        if (idPedidoSelecionado == 0) {
            JOptionPane.showMessageDialog(this, "Selecione um pedido para imprimir o extrato!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        StringBuilder extrato = new StringBuilder();
        extrato.append("Extrato do Pedido: ").append(idPedidoSelecionado).append("\n\n");

        double totalPedido = 0;  // Variável para somar o total do pedido

        try {
            // SQL para buscar os itens do pedido selecionado
            String sql = "SELECT nome_produto, preco, quantidade, total FROM item_pedido WHERE id_pedido = ?";

            // Prepara a consulta SQL
            try (PreparedStatement pstmt = conexao.conexao.prepareStatement(sql)) {
                pstmt.setInt(1, idPedidoSelecionado);
                ResultSet rs = pstmt.executeQuery();

                // Verifica se encontrou algum item
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(this, "Nenhum item encontrado para este pedido.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Exibe os itens do pedido
                do {
                    String nomeProduto = rs.getString("nome_produto");
                    double preco = rs.getDouble("preco");
                    int quantidade = rs.getInt("quantidade");
                    double total = rs.getDouble("total");

                    extrato.append("Produto: ").append(nomeProduto).append("\n")
                            .append("Preço: R$ ").append(preco).append("\n")
                            .append("Quantidade: ").append(quantidade).append("\n")
                            .append("Total: R$ ").append(total).append("\n\n");

                    totalPedido += total;  // Soma o total do pedido
                } while (rs.next());

                // Exibe o total geral no final
                extrato.append("Total Geral do Pedido: R$ ").append(totalPedido).append("\n");

                // Exibe o extrato completo em um JOptionPane
                JOptionPane.showMessageDialog(this, extrato.toString(), "Extrato de Compra", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao buscar os itens do pedido: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao gerar o extrato: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


    // Exibir os dados do cliente
    private void carregarDadosCliente() {
        String cpf = Login.cpfUsuarioLogado.replaceAll("\\D", ""); // Remove pontuações do CPF
        String sql = "SELECT id_cliente, nome_cliente, endereco_cliente, telefone_cliente, cpf_cliente, data_nasc, senha FROM cliente WHERE cpf_cliente = ?";

        try (PreparedStatement ps = conexao.conexao.prepareStatement(sql)) {
            // Debug: Exibir o CPF usado na consulta
            System.out.println("CPF usado na consulta: " + cpf);

            // Configura o CPF como parâmetro da consulta
            ps.setString(1, cpf);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Preenche os campos de texto com os dados do cliente
                    campoCod.setText(rs.getString("id_cliente"));
                    campoNome.setText(rs.getString("nome_cliente"));
                    campoEndereco.setText(rs.getString("endereco_cliente"));
                    campoTelefone.setText(rs.getString("telefone_cliente"));
                    campoCpf.setText(rs.getString("cpf_cliente"));
                    campoData.setText(rs.getString("data_nasc"));
                    campoSenha.setText(rs.getString("senha"));
                } else {
                    JOptionPane.showMessageDialog(this, "Cliente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao acessar os dados do cliente: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    // Exibir os dados do pedido na tabela
    private void carregarDadosTabela() {
        String cpf = Login.cpfUsuarioLogado.replaceAll("\\D", "");
        String sql = "SELECT id_pedido, data, valor_total, status_pedido " +
                     "FROM pedido " +
                     "WHERE id_cliente = (SELECT id_cliente FROM cliente WHERE cpf_cliente = ?)";

        try (PreparedStatement pstmt = conexao.conexao.prepareStatement(sql)) {
            pstmt.setString(1, cpf);
            try (ResultSet rs = pstmt.executeQuery()) {
                // Limpa a tabela antes de adicionar novos dados
                DefaultTableModel modeloTabela = (DefaultTableModel) tabelaCompra.getModel();
                modeloTabela.setRowCount(0);

                // Adiciona os dados da consulta na tabela
                while (rs.next()) {
                    int idPedido = rs.getInt("id_pedido");
                    String data = rs.getString("data");
                    double valorTotal = rs.getDouble("valor_total");
                    String statusPedido = rs.getString("status_pedido");

                    modeloTabela.addRow(new Object[]{idPedido, data, valorTotal, statusPedido});
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar os dados do pedido: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menu = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        tituloCPF = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        tituloEndereco = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        tituloTelefone = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        imagem1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCompra = new javax.swing.JTable();
        botaoFinalizar2 = new javax.swing.JButton();
        tituloCPF1 = new javax.swing.JLabel();
        tituloEndereco1 = new javax.swing.JLabel();
        campoData = new javax.swing.JTextField();
        tituloNome1 = new javax.swing.JLabel();
        campoCod = new javax.swing.JTextField();
        editarBotao = new javax.swing.JButton();
        campoTelefone = new javax.swing.JFormattedTextField();
        campoSenha = new javax.swing.JTextField();
        tituloEndereco2 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        sairBotao = new javax.swing.JButton();
        voltarBotao = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(102, 0, 204));
        menu.setForeground(new java.awt.Color(102, 0, 204));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/icone.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(43, 0, 87));

        titulo2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("Verifique os seus dados e edite algum que esteja incorreto.");

        tituloCPF.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloCPF.setForeground(new java.awt.Color(255, 255, 255));
        tituloCPF.setText("CPF:");

        campoCpf.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        campoCpf.setEnabled(false);
        campoCpf.setEditable(false);

        tituloEndereco.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloEndereco.setForeground(new java.awt.Color(255, 255, 255));
        tituloEndereco.setText("Nome:");

        campoNome.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        tituloTelefone.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloTelefone.setForeground(new java.awt.Color(255, 255, 255));
        tituloTelefone.setText("Telefone:");

        titulo1.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("Detalhes da Compra");

        titulo3.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        titulo3.setForeground(new java.awt.Color(255, 255, 255));
        titulo3.setText("Cliente");

        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/customer.png"))); // NOI18N

        tabelaCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaCompra.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        tabelaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Pedido", "Data", "Valor Total", "Status do Pedido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCompraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCompra);

        botaoFinalizar2.setBackground(new java.awt.Color(43, 0, 87));
        botaoFinalizar2.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 14)); // NOI18N
        botaoFinalizar2.setForeground(new java.awt.Color(255, 255, 255));
        botaoFinalizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/finalizarBotao.png"))); // NOI18N
        botaoFinalizar2.setText("Imprimir Extrato");
        botaoFinalizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizar2ActionPerformed(evt);
            }
        });

        tituloCPF1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloCPF1.setForeground(new java.awt.Color(255, 255, 255));
        tituloCPF1.setText("Data de Nascimento:");

        tituloEndereco1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloEndereco1.setForeground(new java.awt.Color(255, 255, 255));
        tituloEndereco1.setText("Senha:");

        campoData.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });

        tituloNome1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloNome1.setForeground(new java.awt.Color(255, 255, 255));
        tituloNome1.setText("Código do Cliente:");

        campoCod.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        campoCod.setEnabled(false);

        editarBotao.setBackground(new java.awt.Color(43, 0, 87));
        editarBotao.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        editarBotao.setForeground(new java.awt.Color(255, 255, 255));
        editarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/edit.png"))); // NOI18N
        editarBotao.setText("Editar Dados");
        editarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBotaoActionPerformed(evt);
            }
        });

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoSenha.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        tituloEndereco2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloEndereco2.setForeground(new java.awt.Color(255, 255, 255));
        tituloEndereco2.setText("Endereço:");

        campoEndereco.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloNome1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloCPF)
                                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tituloEndereco)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tituloEndereco2))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tituloTelefone)
                                    .addComponent(tituloCPF1)
                                    .addComponent(tituloEndereco1)
                                    .addComponent(campoData)
                                    .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                    .addComponent(campoSenha))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoFinalizar2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titulo1)
                                .addComponent(editarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(titulo2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo3)
                        .addContainerGap(797, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titulo3)
                .addGap(6, 6, 6)
                .addComponent(titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addComponent(imagem1)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tituloTelefone)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tituloCPF1)
                                    .addComponent(tituloEndereco))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tituloEndereco1)
                                    .addComponent(tituloEndereco2)))
                            .addComponent(tituloCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(editarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(botaoFinalizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jScrollPane3.setViewportView(jPanel1);

        sairBotao.setBackground(new java.awt.Color(255, 102, 102));
        sairBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/logout.png"))); // NOI18N
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });

        voltarBotao.setBackground(new java.awt.Color(43, 0, 87));
        voltarBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/voltarBotao.png"))); // NOI18N
        voltarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(imagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarBotao)
                .addGap(18, 18, 18)
                .addComponent(sairBotao)
                .addGap(33, 33, 33))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(imagem))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sairBotao, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(voltarBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFinalizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizar2ActionPerformed
    imprimirExtrato();

    }//GEN-LAST:event_botaoFinalizar2ActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataActionPerformed

    private void editarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBotaoActionPerformed
    // Recebimento dos campos
    String nome = campoNome.getText();
    String endereco = campoEndereco.getText(); // Corrigido
    String tel = campoTelefone.getText();
    String data = campoData.getText();
    String senha = campoSenha.getText();
    String cpf = campoCpf.getText();
    String sql;
    String msg;

    try (Connection conn = conexao.conecta()) {
        if (campoCod.getText().equals("")) {
            // Inserção de um novo registro se o campo de código estiver vazio
            sql = "INSERT INTO cliente (nome_cliente, endereco_cliente, telefone_cliente, data_nasc, senha, cpf_cliente) VALUES (?, ?, ?, ?, ?, ?)";
            msg = "Gravação de um novo registro";

            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, nome);
                pst.setString(2, endereco);
                pst.setString(3, tel);
                pst.setString(4, data);
                pst.setString(5, senha);
                pst.setString(6, cpf);
                pst.executeUpdate();
            }
        } else {
            // Atualização de um registro existente sem alterar o CPF
            sql = "UPDATE cliente SET nome_cliente=?, endereco_cliente=?, telefone_cliente=?, data_nasc=?, senha=? WHERE id_cliente=?";
            msg = "Alteração de registro";

            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, nome);
                pst.setString(2, endereco);
                pst.setString(3, tel);
                pst.setString(4, data);
                pst.setString(5, senha);
                pst.setInt(6, Integer.parseInt(campoCod.getText())); // Corrigido
                pst.executeUpdate();
            }
        }

        JOptionPane.showMessageDialog(this, msg + " realizada com sucesso!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException errosql) {
        JOptionPane.showMessageDialog(this, "Erro na gravação:\n" + errosql.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_editarBotaoActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
        // Exibe uma caixa de diálogo de confirmação
    int resposta = JOptionPane.showConfirmDialog(this, 
            "Você realmente deseja deslogar?", 
            "Confirmar Logout", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE);

    // Verifica a resposta do usuário
    if (resposta == JOptionPane.YES_OPTION) {
        // Fecha a janela atual
        this.dispose();
        
        // Redireciona para a tela de login
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true); // Certifique-se de que TelaLogin é o nome da sua classe de login
        });
    } else {
        // O usuário escolheu não deslogar, permanece na página
        JOptionPane.showMessageDialog(this, 
                "Logout cancelado.", 
                "Informação", 
                JOptionPane.INFORMATION_MESSAGE);
    }

    }//GEN-LAST:event_sairBotaoActionPerformed

    private void voltarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBotaoActionPerformed
       SessaoCompra sessaoCompra = new SessaoCompra(); 
        CatalogoBalas abrir = new CatalogoBalas(sessaoCompra);
        abrir.setVisible(true);
        dispose(); // Fecha a tela de login
        return;
    }//GEN-LAST:event_voltarBotaoActionPerformed

    private void tabelaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCompraMouseClicked
         // Captura o índice da linha selecionada
        int row = tabelaCompra.getSelectedRow();
        if (row != -1) {
            // Obtém o ID do pedido na primeira coluna da linha selecionada
            idPedidoSelecionado = Integer.parseInt(tabelaCompra.getValueAt(row, 0).toString());
            System.out.println("Pedido Selecionado: " + idPedidoSelecionado); // Apenas para depuração
        }
    }//GEN-LAST:event_tabelaCompraMouseClicked

    // Método main
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoCliente().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinalizar2;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JButton editarBotao;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton sairBotao;
    private javax.swing.JTable tabelaCompra;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel tituloCPF;
    private javax.swing.JLabel tituloCPF1;
    private javax.swing.JLabel tituloEndereco;
    private javax.swing.JLabel tituloEndereco1;
    private javax.swing.JLabel tituloEndereco2;
    private javax.swing.JLabel tituloNome1;
    private javax.swing.JLabel tituloTelefone;
    private javax.swing.JButton voltarBotao;
    // End of variables declaration//GEN-END:variables
}
