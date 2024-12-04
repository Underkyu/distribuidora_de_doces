/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle.Estoque;

import java.awt.Color;
import Conexao.Conexao;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.concurrent.locks.StampedLock;
import java.sql.Statement;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class AdicionarProduto extends javax.swing.JFrame {
Conexao con_produtos;
    /**
     * Creates new form Clientes
     */
    public AdicionarProduto() {
        initComponents();
        con_produtos = new Conexao();
        con_produtos.conecta();
        con_produtos.executaSQL("select * from produto order by id_produto");
        preenchaerTabela();
         getContentPane().setBackground(new Color(43,0,87));
         // Configurações da página
        setResizable(false);
        setLocationRelativeTo(null);

         Codigo.setVisible(false);
        Produtos.setBorderPainted(false);        // Remove a borda
        Produtos.setContentAreaFilled(false);    // Remove o fundo
        Fornecedor.setBorderPainted(false);        // Remove a borda
        Fornecedor.setContentAreaFilled(false);    // Remove o fundo
        Categoria.setBorderPainted(false);        // Remove a borda
        Categoria.setContentAreaFilled(false);    // Remove o fundo
        Voltar.setBorderPainted(false);        // Remove a borda
        Voltar.setContentAreaFilled(false);    // Remove o fundo
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Controle/Imagens/icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Titulo3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        valorProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idFornecedorProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idCategoriaProduto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        quantEstoqueProduto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        quantMinimaProduto = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Fornecedor = new javax.swing.JButton();
        Produtos = new javax.swing.JToggleButton();
        Categoria = new javax.swing.JToggleButton();
        Titulo = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Lupa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Produtos = new javax.swing.JTable();
        PesquisarProduto = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        Codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 0, 204));

        Titulo3.setBackground(new java.awt.Color(255, 255, 255));
        Titulo3.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(255, 255, 255));
        Titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo3.setText("Cadastrar Produto");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/doce.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(Titulo3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Valor");

        idFornecedorProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFornecedorProdutoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Id do Fornecedor");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quantidade Minima");

        idCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCategoriaProdutoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Id da Categoria");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Quantidade Estoque");

        quantMinimaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantMinimaProdutoActionPerformed(evt);
            }
        });

        Cadastrar.setBackground(new java.awt.Color(102, 0, 204));
        Cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        Cadastrar.setText("Cadastrar ");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));

        Fornecedor.setBackground(new java.awt.Color(102, 0, 204));
        Fornecedor.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        Fornecedor.setForeground(new java.awt.Color(255, 255, 255));
        Fornecedor.setText("Fornecedor");
        Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FornecedorActionPerformed(evt);
            }
        });

        Produtos.setBackground(new java.awt.Color(102, 0, 204));
        Produtos.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        Produtos.setForeground(new java.awt.Color(255, 255, 255));
        Produtos.setText("Produtos");
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });

        Categoria.setBackground(new java.awt.Color(102, 0, 204));
        Categoria.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        Categoria.setForeground(new java.awt.Color(255, 255, 255));
        Categoria.setText("Categoria");
        Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActionPerformed(evt);
            }
        });

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/icone.png"))); // NOI18N

        Voltar.setBackground(new java.awt.Color(102, 0, 204));
        Voltar.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        Voltar.setForeground(new java.awt.Color(255, 255, 255));
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Produtos)
                .addGap(18, 18, 18)
                .addComponent(Fornecedor)
                .addGap(18, 18, 18)
                .addComponent(Categoria)
                .addGap(18, 18, 18)
                .addComponent(Voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Titulo)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Produtos)
                    .addComponent(Fornecedor)
                    .addComponent(Categoria)
                    .addComponent(Voltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/lupa.png"))); // NOI18N

        jScrollPane1.setBorder(null);

        Tabela_Produtos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabela_Produtos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabela_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Id_fornecedor", "Id_categoria", "Nome", "Valor", "Quantidade_estoque", "Quantidade_minima"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Produtos.setRowHeight(50);
        Tabela_Produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_ProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Produtos);

        PesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarProdutoActionPerformed(evt);
            }
        });
        PesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisarProdutoKeyReleased(evt);
            }
        });

        Limpar.setBackground(new java.awt.Color(102, 0, 204));
        Limpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Limpar.setForeground(new java.awt.Color(255, 255, 255));
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idCategoriaProduto)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantEstoqueProduto)
                                    .addComponent(jLabel9))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantMinimaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeProduto)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valorProduto)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idFornecedorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(Cadastrar)
                .addGap(30, 30, 30)
                .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Lupa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idFornecedorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quantMinimaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quantEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(Limpar))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Lupa))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFornecedorProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFornecedorProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFornecedorProdutoActionPerformed

    private void quantMinimaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantMinimaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantMinimaProdutoActionPerformed

    private void idCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCategoriaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCategoriaProdutoActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        String nome = nomeProduto.getText();
        double valor =  Double.parseDouble(valorProduto.getText());
        int idFornecedor = Integer.parseInt(idFornecedorProduto.getText());
        int idCategoria = Integer.parseInt(idCategoriaProduto.getText());
        int quantMinima = Integer.parseInt(quantMinimaProduto.getText());
        int quantEstoque = Integer.parseInt(quantEstoqueProduto.getText());
        
        try{
            if(Codigo.getText().equals("")){
                String insert_sql="insert into produto (id_fornecedor,id_categoria,nome_produto,valor_unitario,quantidade_estoque,quantidade_minima) "
                    + "values ('"+idFornecedor+"','"+idCategoria+"','"+nome+"','"+valor+"','"+quantEstoque+"','"+quantMinima+"')";
                   System.out.println(insert_sql);
                con_produtos.statement.executeUpdate(insert_sql);
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");;
                AdicionarProduto tela =  new AdicionarProduto();
                tela.setVisible(true);
                setVisible(false);
            }else{
                String insert_sql="update produto set id_fornecedor="+idFornecedor+",id_categoria="+idCategoria+",nome_produto='"+nome+"',valor_unitario="+valor+",quantidade_estoque="+quantEstoque+",quantidade_minima="+quantMinima+" where id_produto = "+Codigo.getText();
                System.out.println(insert_sql);
                con_produtos.statement.executeUpdate(insert_sql);
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");;
                AdicionarProduto tela =  new AdicionarProduto();
                tela.setVisible(true);
                setVisible(false);
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
            System.out.println(erro);
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FornecedorActionPerformed
        AdicionarFornecedor tela = new AdicionarFornecedor();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_FornecedorActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        AdicionarProduto tela = new AdicionarProduto();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ProdutosActionPerformed

    private void CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActionPerformed
        AdicionarCategoria tela = new AdicionarCategoria();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_CategoriaActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        Produtos tela = new Produtos();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_VoltarActionPerformed

    private void PesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarProdutoActionPerformed

    }//GEN-LAST:event_PesquisarProdutoActionPerformed

    private void PesquisarProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarProdutoKeyReleased
        try{
            String pesquisa = "select * from produto where nome_produto like '"+ PesquisarProduto.getText()+"%'" ;
            con_produtos.executaSQL(pesquisa);

            if(con_produtos.resultset.first()){
                preenchaerTabela();
            }else{
                JOptionPane.showMessageDialog(null, "Não existem dados com esse parametro");
            }
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null,"Dados não localizados");
        }
    }//GEN-LAST:event_PesquisarProdutoKeyReleased

    private void Tabela_ProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_ProdutosMouseClicked
        int linha_selecionada = Tabela_Produtos.getSelectedRow();
        
        nomeProduto.setText(Tabela_Produtos.getValueAt(linha_selecionada, 3).toString());
        valorProduto.setText(Tabela_Produtos.getValueAt(linha_selecionada, 4).toString());
        idFornecedorProduto.setText(Tabela_Produtos.getValueAt(linha_selecionada, 1).toString());
        idCategoriaProduto.setText(Tabela_Produtos.getValueAt(linha_selecionada, 2).toString());
        quantEstoqueProduto.setText(Tabela_Produtos.getValueAt(linha_selecionada, 5).toString());
        quantMinimaProduto.setText(Tabela_Produtos.getValueAt(linha_selecionada, 6).toString());
        Codigo.setText(Tabela_Produtos.getValueAt(linha_selecionada, 0).toString());
        
    }//GEN-LAST:event_Tabela_ProdutosMouseClicked

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        nomeProduto.setText("");
        valorProduto.setText("");
        idCategoriaProduto.setText("");
        idFornecedorProduto.setText("");
        quantEstoqueProduto.setText("");
        quantMinimaProduto.setText("");
        Codigo.setText("");
    }//GEN-LAST:event_LimparActionPerformed

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarProduto().setVisible(true);
            }
        });
    }
          public void preenchaerTabela(){
        /*Tabela_Pedidos.getColumnModel().getColumn(1).setPreferredWidth(150);
        Tabela_Pedidos.getColumnModel().getColumn(2).setPreferredWidth(150);
        Tabela_Pedidos.getColumnModel().getColumn(3).setPreferredWidth(150);
        Tabela_Pedidos.getColumnModel().getColumn(4).setPreferredWidth(200);
        Tabela_Pedidos.getColumnModel().getColumn(5).setPreferredWidth(150);
        Tabela_Pedidos.getColumnModel().getColumn(6).setPreferredWidth(125);*/
        
        DefaultTableModel modelo = (DefaultTableModel) Tabela_Produtos.getModel();
        modelo.setNumRows(0);
        
        try {
            con_produtos.resultset.beforeFirst();
            while(con_produtos.resultset.next()){
                modelo.addRow(new Object[]{
                    con_produtos.resultset.getString("id_produto"),con_produtos.resultset.getString("id_fornecedor"),con_produtos.resultset.getString("id_categoria"), con_produtos.resultset.getString("nome_produto"), con_produtos.resultset.getString("valor_unitario"), con_produtos.resultset.getString("quantidade_estoque"), con_produtos.resultset.getString("quantidade_minima")
                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao listar a tabela");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JToggleButton Categoria;
    private javax.swing.JTextField Codigo;
    private javax.swing.JButton Fornecedor;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel Lupa;
    private javax.swing.JTextField PesquisarProduto;
    private javax.swing.JToggleButton Produtos;
    private javax.swing.JTable Tabela_Produtos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JButton Voltar;
    private javax.swing.JTextField idCategoriaProduto;
    private javax.swing.JTextField idFornecedorProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JTextField quantEstoqueProduto;
    private javax.swing.JTextField quantMinimaProduto;
    private javax.swing.JTextField valorProduto;
    // End of variables declaration//GEN-END:variables
}
