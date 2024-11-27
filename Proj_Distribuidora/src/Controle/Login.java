/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle;

import Controle.Cliente.CatalogoBalas;
import Conexao.Conexao;
import Controle.Cliente.HistoricoCliente;
import Controle.Cliente.SessaoCompra;
import Controle.Estoque.Produtos;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;  // Adicionado
import java.sql.PreparedStatement;

/**
 *
 * @author Maria Eduarda Monteiro Viana - 2° DS AMS
 */

import java.awt.Toolkit;
import java.sql.Connection;
public class Login extends javax.swing.JFrame {
    Conexao conexao_login;
    private Connection conn;
    public static String cpfUsuarioLogado;  // Variável para armazenar o CPF do usuário logado
    public static int idClienteLogado;  // Variável para armazenar o ID do cliente logado
    private SessaoCompra sessaoCompra;

    public Login() {
        
        // Inicialização dos componentes do JFrame
        initComponents();
        
        this.sessaoCompra = sessaoCompra;
        
        // Define o ícone da janela
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Controle/Imagens/icon.png")));

        // Config das propriedades da página
        setResizable(false);
        setLocationRelativeTo(null);
    
        // Mudar a cor do fundo
        getContentPane().setBackground(new Color(43, 0, 87));

        // Realizar a conexão com o banco 
        conexao_login = new Conexao(); 
        conexao_login.conecta();
    }

    private void realizarLogin() {
    // Obtém CPF e senha inseridos pelo usuário
    String cpf = campoCpf.getText().replaceAll("\\D", "").trim();  // Remove caracteres não numéricos
    String senha = SenhaCampo.getText().trim();

    if (cpf.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Verifica na tabela 'usuario' primeiro, caso o usuário esteja registrado lá
        String queryUsuario = "SELECT * FROM usuario WHERE cpf = ? AND senha = ?";
        try (PreparedStatement pstUsuario = conexao_login.conexao.prepareStatement(queryUsuario)) {
            pstUsuario.setString(1, cpf);
            pstUsuario.setString(2, senha);
            try (ResultSet rsUsuario = pstUsuario.executeQuery()) {
                if (rsUsuario.next()) {
                    // Usuário encontrado na tabela 'usuario'
                    cpfUsuarioLogado = cpf;  // Salva o CPF logado
                    System.out.println("Usuário encontrado na tabela 'usuario': " + cpf);

                    // Abre a tela de Produtos
                    Produtos produtos = new Produtos();
                    produtos.setVisible(true);
                    dispose(); // Fecha a tela de login
                    return;
                }
            }
        }

        // Se não encontrar na tabela 'usuario', verifica na tabela 'cliente'
        String queryCliente = "SELECT id_cliente FROM cliente WHERE cpf_cliente = ? AND senha = ?";
        try (PreparedStatement pstCliente = conexao_login.conexao.prepareStatement(queryCliente)) {
            pstCliente.setString(1, cpf);
            pstCliente.setString(2, senha);
            try (ResultSet rsCliente = pstCliente.executeQuery()) {
                if (rsCliente.next()) {
                    // Cliente encontrado na tabela 'cliente'
                    cpfUsuarioLogado = cpf;  // Salva o CPF logado
                    idClienteLogado = rsCliente.getInt("id_cliente");  // Armazena o id_cliente do cliente logado
                    System.out.println("Cliente encontrado na tabela 'cliente': " + cpf);

                    // Abre a tela de HistoricoCliente
                    SessaoCompra sessaoCompra = new SessaoCompra(); 
                    CatalogoBalas abrir = new CatalogoBalas(sessaoCompra);
                    abrir.setVisible(true);
                    dispose(); // Fecha a tela de login
                    return;
                }
            }
        }

        // Se não encontrado em nenhuma tabela
        System.out.println("Usuário não encontrado em nenhuma tabela: " + cpf);
        JOptionPane.showMessageDialog(this, "Usuário não cadastrado! Por favor, realize o cadastro.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

        // Redireciona para a tela de Inscrição
        Inscricao inscricao = new Inscricao();
        inscricao.setVisible(true);
        dispose(); // Fecha a tela de login

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao acessar os dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        tituloNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        tituloCPF = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        tituloEndereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        tituloTelefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        titulo1 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        imagem1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCompra = new javax.swing.JTable();
        campOtELEFONE1 = new javax.swing.JTextField();
        titulotELEFONE1 = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        botaoFinalizar2 = new javax.swing.JButton();
        campoCpf = new javax.swing.JTextField();
        SenhaCampo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entrarBotao = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(43, 0, 87));

        titulo2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setText("Verifique os seus dados antes de finalizar a compra.");

        tituloNome.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloNome.setForeground(new java.awt.Color(255, 255, 255));
        tituloNome.setText("Nome:");

        campoNome.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        tituloCPF.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloCPF.setForeground(new java.awt.Color(255, 255, 255));
        tituloCPF.setText("CPF:");

        campoCPF.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        tituloEndereco.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloEndereco.setForeground(new java.awt.Color(255, 255, 255));
        tituloEndereco.setText("Endereço:");

        campoEndereco.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        tituloTelefone.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        tituloTelefone.setForeground(new java.awt.Color(255, 255, 255));
        tituloTelefone.setText("Telefone:");

        campoTelefone.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        titulo1.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setText("Detalhes da Compra");

        titulo3.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        titulo3.setForeground(new java.awt.Color(255, 255, 255));
        titulo3.setText("Cliente");

        tabelaCompra.setBackground(new java.awt.Color(204, 153, 255));
        tabelaCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaCompra.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tabelaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Produto", "Quantidade", "Preço Unitário"
            }
        ));
        jScrollPane2.setViewportView(tabelaCompra);

        campOtELEFONE1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        titulotELEFONE1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        titulotELEFONE1.setForeground(new java.awt.Color(255, 255, 255));
        titulotELEFONE1.setText("Consultar:");

        botaoExcluir.setBackground(new java.awt.Color(43, 0, 87));
        botaoExcluir.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 14)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setText("Excluir Produto");

        botaoVoltar.setBackground(new java.awt.Color(43, 0, 87));
        botaoVoltar.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("Voltar");

        botaoFinalizar2.setBackground(new java.awt.Color(43, 0, 87));
        botaoFinalizar2.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 14)); // NOI18N
        botaoFinalizar2.setForeground(new java.awt.Color(255, 255, 255));
        botaoFinalizar2.setText("Finalizar Compra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo3)
                                    .addComponent(titulo2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tituloNome)
                                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tituloCPF)
                                            .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tituloEndereco)
                                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tituloTelefone)
                                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(imagem1)))))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulotELEFONE1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campOtELEFONE1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(botaoFinalizar2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tituloCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloEndereco)
                        .addGap(2, 2, 2)
                        .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagem1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulotELEFONE1)
                    .addComponent(campOtELEFONE1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFinalizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 255));

        campoCpf.setBackground(new java.awt.Color(43, 0, 87));
        campoCpf.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        campoCpf.setForeground(new java.awt.Color(255, 255, 255));
        campoCpf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Geometr212 BkCn BT", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        campoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfActionPerformed(evt);
            }
        });

        SenhaCampo.setBackground(new java.awt.Color(43, 0, 87));
        SenhaCampo.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        SenhaCampo.setForeground(new java.awt.Color(255, 255, 255));
        SenhaCampo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Geometr212 BkCn BT", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        SenhaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaCampoActionPerformed(evt);
            }
        });

        entrarBotao.setBackground(new java.awt.Color(102, 0, 204));
        entrarBotao.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        entrarBotao.setForeground(new java.awt.Color(255, 255, 255));
        entrarBotao.setText("Entrar");
        entrarBotao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        entrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBotaoActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Se inscrever");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        titulo4.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        titulo4.setForeground(new java.awt.Color(255, 255, 255));
        titulo4.setText("LOGIN");

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/icone.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo4)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagem)
                        .addGap(128, 128, 128)))
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SenhaCampo)
                            .addComponent(campoCpf)
                            .addComponent(entrarBotao, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(imagem)
                            .addGap(18, 18, 18)
                            .addComponent(titulo4))))
                .addGap(18, 18, 18)
                .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(SenhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(entrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SenhaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaCampoActionPerformed
       
    }//GEN-LAST:event_SenhaCampoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // REDIRECIONAMENTO PARA O BOTÃO DE INSCRIÇÃO (CADASTRO DE CLIENTE)
        Inscricao inscrição = new Inscricao();
        inscrição.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfActionPerformed
        
    }//GEN-LAST:event_campoCpfActionPerformed

    private void entrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBotaoActionPerformed
    realizarLogin();
   
    }//GEN-LAST:event_entrarBotaoActionPerformed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SenhaCampo;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoFinalizar2;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campOtELEFONE1;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JButton entrarBotao;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagem1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaCompra;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel tituloCPF;
    private javax.swing.JLabel tituloEndereco;
    private javax.swing.JLabel tituloNome;
    private javax.swing.JLabel tituloTelefone;
    private javax.swing.JLabel titulotELEFONE1;
    // End of variables declaration//GEN-END:variables
}
