/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle.Cliente;

import java.awt.Toolkit;
import Conexao.Conexao;
import Controle.Login;
import com.mysql.jdbc.Statement;
import javax.swing.*;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import java.util.UUID;

/**
 *
 * @author aange
 */
    public class CatalogoChocolates extends javax.swing.JFrame {
    Conexao conexao;
    private int idPedidoAtual; // Armazena o ID do pedido gerado para esta execução
    private SessaoCompra sessaoCompra;
    
    public CatalogoChocolates(SessaoCompra sessaoCompra) {
        this.sessaoCompra = sessaoCompra;
        
       // Inicialização dos componentes do JFrame
        initComponents();

        // Configuração do DefaultTableModel
       tabela.setModel(sessaoCompra.getModeloTabela()); // A tabela usa o modelo da sessão
       
       calcularTotalCompra();

        // Define o ícone da janela
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Controle/Imagens/icon.png")));

        // Configurações da página
        setResizable(false);
        setLocationRelativeTo(null);

        // Cor de fundo da tela
        getContentPane().setBackground(new Color(43, 0, 87));

        // Realizar a conexão com o banco
        conexao = new Conexao();
        conexao.conecta();
    }

    int sum = 0, qtnd;
    double preco, total;
    DefaultTableModel model = new DefaultTableModel();
    
   private void calcularTotalCompra() {
        double total = 0.0;
        for (int i = 0; i < sessaoCompra.getModeloTabela().getRowCount(); i++) {
            total += (double) sessaoCompra.getModeloTabela().getValueAt(i, 3); // Soma o valor total de cada linha
        }
        totalCompra.setText(String.format("%.2f", total));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        bloco1Balas7 = new javax.swing.JPanel();
        comprar1 = new javax.swing.JButton();
        qtnd1 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos2 = new javax.swing.JLabel();
        tituloProduto3 = new javax.swing.JLabel();
        box1 = new javax.swing.JCheckBox();
        bloco1Balas8 = new javax.swing.JPanel();
        comprar2 = new javax.swing.JButton();
        qtnd2 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos11 = new javax.swing.JLabel();
        tituloProduto17 = new javax.swing.JLabel();
        box3 = new javax.swing.JCheckBox();
        bloco1Balas9 = new javax.swing.JPanel();
        comprar3 = new javax.swing.JButton();
        qtnd3 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos12 = new javax.swing.JLabel();
        tituloProduto18 = new javax.swing.JLabel();
        box4 = new javax.swing.JCheckBox();
        bloco1Balas10 = new javax.swing.JPanel();
        comprar4 = new javax.swing.JButton();
        qtnd4 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos3 = new javax.swing.JLabel();
        tituloProduto4 = new javax.swing.JLabel();
        box5 = new javax.swing.JCheckBox();
        bloco1Balas11 = new javax.swing.JPanel();
        comprar5 = new javax.swing.JButton();
        qtnd5 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos13 = new javax.swing.JLabel();
        tituloProduto19 = new javax.swing.JLabel();
        box6 = new javax.swing.JCheckBox();
        bloco1Balas12 = new javax.swing.JPanel();
        comprar6 = new javax.swing.JButton();
        qtnd6 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos14 = new javax.swing.JLabel();
        tituloProduto20 = new javax.swing.JLabel();
        box7 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        excluir = new javax.swing.JButton();
        finalizarCompra = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        totalCompra = new javax.swing.JTextField();
        menu = new javax.swing.JPanel();
        imagem1 = new javax.swing.JLabel();
        opcao = new javax.swing.JButton();
        pirulitosBotao = new javax.swing.JButton();
        chicletesBotao = new javax.swing.JButton();
        chocolatesBotao = new javax.swing.JButton();
        perfilBotao1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(43, 0, 87));

        bloco1Balas7.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        comprar1.setBackground(new java.awt.Color(43, 0, 87));
        comprar1.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        comprar1.setForeground(new java.awt.Color(255, 255, 255));
        comprar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        comprar1.setText("Comprar");
        comprar1.setBorder(null);
        comprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar1ActionPerformed(evt);
            }
        });

        qtnd1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        imagemCatalogoPirulitos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/trento.png"))); // NOI18N

        tituloProduto3.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto3.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto3.setText("Caixa com 30 un.");

        box1.setBackground(new java.awt.Color(43, 0, 87));
        box1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box1.setForeground(new java.awt.Color(255, 255, 255));
        box1.setText("Trento Mini - Chocolate ao Leite");
        box1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bloco1Balas7Layout = new javax.swing.GroupLayout(bloco1Balas7);
        bloco1Balas7.setLayout(bloco1Balas7Layout);
        bloco1Balas7Layout.setHorizontalGroup(
            bloco1Balas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas7Layout.createSequentialGroup()
                .addGroup(bloco1Balas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas7Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(comprar1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloco1Balas7Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(bloco1Balas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloProduto3)
                            .addGroup(bloco1Balas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qtnd1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imagemCatalogoPirulitos2))))
                    .addComponent(box1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bloco1Balas7Layout.setVerticalGroup(
            bloco1Balas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos2)
                .addGap(23, 23, 23)
                .addComponent(qtnd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bloco1Balas8.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        comprar2.setBackground(new java.awt.Color(43, 0, 87));
        comprar2.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        comprar2.setForeground(new java.awt.Color(255, 255, 255));
        comprar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        comprar2.setText("Comprar");
        comprar2.setBorder(null);
        comprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar2ActionPerformed(evt);
            }
        });

        qtnd2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        imagemCatalogoPirulitos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/mmAmendoim.png"))); // NOI18N

        tituloProduto17.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto17.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto17.setText("45g");

        box3.setBackground(new java.awt.Color(43, 0, 87));
        box3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box3.setForeground(new java.awt.Color(255, 255, 255));
        box3.setText("M&M Amendoim ");
        box3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bloco1Balas8Layout = new javax.swing.GroupLayout(bloco1Balas8);
        bloco1Balas8.setLayout(bloco1Balas8Layout);
        bloco1Balas8Layout.setHorizontalGroup(
            bloco1Balas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas8Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(tituloProduto17)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bloco1Balas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas8Layout.createSequentialGroup()
                        .addGroup(bloco1Balas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(box3)
                            .addGroup(bloco1Balas8Layout.createSequentialGroup()
                                .addGroup(bloco1Balas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imagemCatalogoPirulitos11)
                                    .addComponent(qtnd2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas8Layout.createSequentialGroup()
                        .addComponent(comprar2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        bloco1Balas8Layout.setVerticalGroup(
            bloco1Balas8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos11)
                .addGap(21, 21, 21)
                .addComponent(qtnd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        bloco1Balas9.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        comprar3.setBackground(new java.awt.Color(43, 0, 87));
        comprar3.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        comprar3.setForeground(new java.awt.Color(255, 255, 255));
        comprar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        comprar3.setText("Comprar");
        comprar3.setBorder(null);
        comprar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar3ActionPerformed(evt);
            }
        });

        qtnd3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        imagemCatalogoPirulitos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/mmChocolate.png"))); // NOI18N

        tituloProduto18.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto18.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto18.setText("45g");

        box4.setBackground(new java.awt.Color(43, 0, 87));
        box4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box4.setForeground(new java.awt.Color(255, 255, 255));
        box4.setText("M&M Chocolate");
        box4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bloco1Balas9Layout = new javax.swing.GroupLayout(bloco1Balas9);
        bloco1Balas9.setLayout(bloco1Balas9Layout);
        bloco1Balas9Layout.setHorizontalGroup(
            bloco1Balas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas9Layout.createSequentialGroup()
                .addGroup(bloco1Balas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas9Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(tituloProduto18))
                    .addGroup(bloco1Balas9Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(bloco1Balas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemCatalogoPirulitos12)
                            .addComponent(qtnd3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bloco1Balas9Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(box4))
                    .addGroup(bloco1Balas9Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(comprar3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        bloco1Balas9Layout.setVerticalGroup(
            bloco1Balas9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagemCatalogoPirulitos12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(qtnd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        bloco1Balas10.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        comprar4.setBackground(new java.awt.Color(43, 0, 87));
        comprar4.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        comprar4.setForeground(new java.awt.Color(255, 255, 255));
        comprar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        comprar4.setText("Comprar");
        comprar4.setBorder(null);
        comprar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar4ActionPerformed(evt);
            }
        });

        qtnd4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        imagemCatalogoPirulitos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/prestigio.png"))); // NOI18N

        tituloProduto4.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto4.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto4.setText("Caixa com 28 un.");

        box5.setBackground(new java.awt.Color(43, 0, 87));
        box5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box5.setForeground(new java.awt.Color(255, 255, 255));
        box5.setText("Prestígio Chocloate ao Leite");
        box5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bloco1Balas10Layout = new javax.swing.GroupLayout(bloco1Balas10);
        bloco1Balas10.setLayout(bloco1Balas10Layout);
        bloco1Balas10Layout.setHorizontalGroup(
            bloco1Balas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas10Layout.createSequentialGroup()
                .addGroup(bloco1Balas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas10Layout.createSequentialGroup()
                        .addGroup(bloco1Balas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bloco1Balas10Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(comprar4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bloco1Balas10Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(bloco1Balas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloProduto4)
                                    .addGroup(bloco1Balas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imagemCatalogoPirulitos3)
                                        .addComponent(qtnd4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(box5)))
                .addContainerGap())
        );
        bloco1Balas10Layout.setVerticalGroup(
            bloco1Balas10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos3)
                .addGap(12, 12, 12)
                .addComponent(qtnd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        bloco1Balas11.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        comprar5.setBackground(new java.awt.Color(43, 0, 87));
        comprar5.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        comprar5.setForeground(new java.awt.Color(255, 255, 255));
        comprar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        comprar5.setText("Comprar");
        comprar5.setBorder(null);
        comprar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar5ActionPerformed(evt);
            }
        });

        qtnd5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        imagemCatalogoPirulitos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/twix.png"))); // NOI18N

        tituloProduto19.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto19.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto19.setText("Caixa com 21 un.");

        box6.setBackground(new java.awt.Color(43, 0, 87));
        box6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box6.setForeground(new java.awt.Color(255, 255, 255));
        box6.setText("Twix - Chocolate com Caramelo");
        box6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bloco1Balas11Layout = new javax.swing.GroupLayout(bloco1Balas11);
        bloco1Balas11.setLayout(bloco1Balas11Layout);
        bloco1Balas11Layout.setHorizontalGroup(
            bloco1Balas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas11Layout.createSequentialGroup()
                .addGroup(bloco1Balas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(box6))
                    .addGroup(bloco1Balas11Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(bloco1Balas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comprar5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bloco1Balas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tituloProduto19)
                                .addGroup(bloco1Balas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imagemCatalogoPirulitos13)
                                    .addComponent(qtnd5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        bloco1Balas11Layout.setVerticalGroup(
            bloco1Balas11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto19)
                .addGap(30, 30, 30)
                .addComponent(imagemCatalogoPirulitos13)
                .addGap(31, 31, 31)
                .addComponent(qtnd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        bloco1Balas12.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        comprar6.setBackground(new java.awt.Color(43, 0, 87));
        comprar6.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        comprar6.setForeground(new java.awt.Color(255, 255, 255));
        comprar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        comprar6.setText("Comprar");
        comprar6.setBorder(null);
        comprar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar6ActionPerformed(evt);
            }
        });

        qtnd6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        imagemCatalogoPirulitos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/sneakers.png"))); // NOI18N

        tituloProduto20.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto20.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto20.setText("Caixa com 21 un.");

        box7.setBackground(new java.awt.Color(43, 0, 87));
        box7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box7.setForeground(new java.awt.Color(255, 255, 255));
        box7.setText("Snickers");
        box7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bloco1Balas12Layout = new javax.swing.GroupLayout(bloco1Balas12);
        bloco1Balas12.setLayout(bloco1Balas12Layout);
        bloco1Balas12Layout.setHorizontalGroup(
            bloco1Balas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas12Layout.createSequentialGroup()
                .addGroup(bloco1Balas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas12Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(comprar6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloco1Balas12Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(bloco1Balas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloProduto20)
                            .addGroup(bloco1Balas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(imagemCatalogoPirulitos14)
                                .addComponent(qtnd6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(box7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bloco1Balas12Layout.setVerticalGroup(
            bloco1Balas12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qtnd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Detalhes da Compra");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabela);

        excluir.setBackground(new java.awt.Color(43, 0, 87));
        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/lixo.png"))); // NOI18N
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        finalizarCompra.setBackground(new java.awt.Color(43, 0, 87));
        finalizarCompra.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        finalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        finalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/finalizarBotao.png"))); // NOI18N
        finalizarCompra.setText("Finalizar Compra");
        finalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarCompraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total da Compra:");

        totalCompra.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(finalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco1Balas7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloco1Balas10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco1Balas8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco1Balas9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloco1Balas9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bloco1Balas8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco1Balas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco1Balas10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(finalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jScrollPane4.setViewportView(jPanel2);

        menu.setBackground(new java.awt.Color(102, 0, 204));
        menu.setForeground(new java.awt.Color(102, 0, 204));

        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/icone.png"))); // NOI18N

        opcao.setBackground(new java.awt.Color(102, 0, 204));
        opcao.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        opcao.setForeground(new java.awt.Color(255, 255, 255));
        opcao.setText("Balas");
        opcao.setBorder(null);
        opcao.setBorderPainted(false);
        opcao.setContentAreaFilled(false);
        opcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoActionPerformed(evt);
            }
        });

        pirulitosBotao.setBackground(new java.awt.Color(102, 0, 204));
        pirulitosBotao.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        pirulitosBotao.setForeground(new java.awt.Color(255, 255, 255));
        pirulitosBotao.setText("Pirulitos");
        pirulitosBotao.setBorder(null);
        pirulitosBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pirulitosBotaoActionPerformed(evt);
            }
        });
        pirulitosBotao.setBorderPainted(false);        // Remove a borda
        pirulitosBotao.setContentAreaFilled(false);

        chicletesBotao.setBackground(new java.awt.Color(102, 0, 204));
        chicletesBotao.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        chicletesBotao.setForeground(new java.awt.Color(255, 255, 255));
        chicletesBotao.setText("Chicletes");
        chicletesBotao.setBorder(null);
        chicletesBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chicletesBotaoActionPerformed(evt);
            }
        });
        chicletesBotao.setBorderPainted(false);
        chicletesBotao.setContentAreaFilled(false);

        chocolatesBotao.setBackground(new java.awt.Color(102, 0, 204));
        chocolatesBotao.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        chocolatesBotao.setForeground(new java.awt.Color(255, 255, 255));
        chocolatesBotao.setText("Chocolates");
        chocolatesBotao.setBorder(null);
        chocolatesBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolatesBotaoActionPerformed(evt);
            }
        });
        chocolatesBotao.setBorderPainted(false);        // Remove a borda
        chocolatesBotao.setContentAreaFilled(false);

        perfilBotao1.setBackground(new java.awt.Color(102, 0, 204));
        perfilBotao1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        perfilBotao1.setForeground(new java.awt.Color(255, 255, 255));
        perfilBotao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/perfil.png"))); // NOI18N
        perfilBotao1.setBorder(null);
        perfilBotao1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        perfilBotao1.setBorderPainted(false);
        perfilBotao1.setContentAreaFilled(false);
        perfilBotao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilBotao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagem1)
                .addGap(37, 37, 37)
                .addComponent(opcao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pirulitosBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chicletesBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chocolatesBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perfilBotao1)
                .addGap(33, 33, 33))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagem1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(perfilBotao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcao)
                            .addComponent(pirulitosBotao)
                            .addComponent(chicletesBotao)
                            .addComponent(chocolatesBotao))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar1ActionPerformed
    qtnd = Integer.parseInt(qtnd1.getValue().toString()); // Quantidade escolhida pelo usuário
    double preco = 24.90; // Preço do produto
    double total = qtnd * preco; // Total do produto

        if (qtnd > 0) {
            sessaoCompra.adicionarProduto(box1.getText(), preco, qtnd);
            calcularTotalCompra();
        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma quantidade válida!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_comprar1ActionPerformed

    private void comprar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar2ActionPerformed
        qtnd = Integer.parseInt(qtnd2.getValue().toString());
        preco = 3.99;
        total = qtnd * preco;

        if (qtnd > 0) { // Valida se a quantidade é maior que zero
           sessaoCompra.adicionarProduto(box3.getText(), preco, qtnd);
           calcularTotalCompra();

        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma quantidade válida!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_comprar2ActionPerformed

    private void comprar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar3ActionPerformed
        qtnd = Integer.parseInt(qtnd3.getValue().toString());
        preco = 3.99;
        total = qtnd * preco;

        if (qtnd > 0) { // Valida se a quantidade é maior que zero
            sessaoCompra.adicionarProduto(box4.getText(), preco, qtnd);
            calcularTotalCompra();
        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma quantidade válida!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_comprar3ActionPerformed

    private void comprar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar4ActionPerformed
        qtnd = Integer.parseInt(qtnd4.getValue().toString());
        preco = 47.89;
        total = qtnd * preco;
        
        if (qtnd > 0) { // Valida se a quantidade é maior que zero
            sessaoCompra.adicionarProduto(box5.getText(), preco, qtnd);
            calcularTotalCompra();
        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma quantidade válida!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_comprar4ActionPerformed

    private void comprar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar5ActionPerformed
        qtnd = Integer.parseInt(qtnd5.getValue().toString());
        preco = 24.99;
        total = qtnd * preco;

        if (qtnd > 0) { // Valida se a quantidade é maior que zero
            sessaoCompra.adicionarProduto(box6.getText(), preco, qtnd);
            calcularTotalCompra();
        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma quantidade válida!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_comprar5ActionPerformed

    private void comprar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar6ActionPerformed
         qtnd = Integer.parseInt(qtnd6.getValue().toString());
        preco = 62;
        total = qtnd * preco;

        if (qtnd > 0) { // Valida se a quantidade é maior que zero
            sessaoCompra.adicionarProduto(box7.getText(), preco, qtnd);
            calcularTotalCompra();
        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma quantidade válida!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_comprar6ActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
      int selectedRow = tabela.getSelectedRow(); // Obtém a linha selecionada na tabela

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione um item para excluir.", "Atenção", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, 
            "Deseja realmente excluir o item selecionado?", 
            "Confirmação", 
            JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        // Remove o item do modelo da tabela
        double valorRemovido = Double.parseDouble(tabela.getValueAt(selectedRow, 3).toString());
        sessaoCompra.getModeloTabela().removeRow(selectedRow);
        
        // Atualiza o total da compra
        sessaoCompra.getTotalCompra(); // Ajusta o total na SessaoCompra
        calcularTotalCompra();

        JOptionPane.showMessageDialog(this, "Item excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }  
    }//GEN-LAST:event_excluirActionPerformed

    private void pirulitosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirulitosBotaoActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE PIRULITOS
        CatalogoPirulitos pag = new CatalogoPirulitos(sessaoCompra);
        pag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pirulitosBotaoActionPerformed

    private void chicletesBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicletesBotaoActionPerformed
         // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE CHICLETES
        CatalogoChicletes pag = new CatalogoChicletes(sessaoCompra);
        pag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_chicletesBotaoActionPerformed

    private void chocolatesBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolatesBotaoActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE CHOCOLATES
        CatalogoChocolates pag = new CatalogoChocolates(sessaoCompra);
        pag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_chocolatesBotaoActionPerformed

    private void finalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarCompraActionPerformed
                                            
    DefaultTableModel modelo = sessaoCompra.getModeloTabela();
    if (modelo.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Adicione produtos antes de finalizar a compra!", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        conexao.conecta();

        // Insere os itens na tabela item_pedido
        // Primeiro, insere o pedido para obter o ID gerado automaticamente
        String sqlPedido = "INSERT INTO pedido (id_cliente, valor_total, data) VALUES (?, ?, NOW())";
        PreparedStatement pstmtPedido = conexao.conexao.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS);
        pstmtPedido.setInt(1, Login.idClienteLogado);  // ID do cliente logado
        pstmtPedido.setDouble(2, sessaoCompra.getTotalCompra());  // Valor total da compra
        pstmtPedido.executeUpdate();  // Executa a inserção do pedido

        // Obter o ID do pedido gerado automaticamente
        ResultSet rs = pstmtPedido.getGeneratedKeys();
        int novoIdPedido = 0;  // Inicializa o ID do pedido
        if (rs.next()) {
            novoIdPedido = rs.getInt(1);  // O ID do pedido gerado automaticamente pelo banco
            System.out.println("ID do Pedido: " + novoIdPedido);
        } else {
            // Caso não consiga obter o ID gerado
            JOptionPane.showMessageDialog(this, "Erro ao gerar ID do pedido", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Sai do método caso ocorra erro
        }

        // Agora insere os itens do pedido
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String nomeProduto = modelo.getValueAt(i, 0).toString();
            double preco = Double.parseDouble(modelo.getValueAt(i, 1).toString());
            int quantidade = Integer.parseInt(modelo.getValueAt(i, 2).toString());
            double total = Double.parseDouble(modelo.getValueAt(i, 3).toString());
            int quantidadeTotal; //Variavel que armazena a quantidade para ser armazenada no banco
            
            
            System.out.println(nomeProduto);
            String sqlQuantidadeItem = "SELECT quantidade_estoque FROM produto WHERE nome_produto like '" +nomeProduto+"%'"; //Pega a quantidade do produto a partir do nome
            System.out.println(sqlQuantidadeItem);
            PreparedStatement pstmtQuantidadeProduto= conexao.conexao.prepareStatement(sqlQuantidadeItem);
            ResultSet rsQuantidadeProduto = pstmtQuantidadeProduto.executeQuery();
            if (rsQuantidadeProduto.next()) { // Move o cursor para o próximo registro, se houver
                int quantidadeProduto = rsQuantidadeProduto.getInt("quantidade_estoque");
                System.out.println("Quantidade atual no estoque: " + quantidadeProduto);
                quantidadeTotal = quantidadeProduto - quantidade;
            } else {
                System.out.println("Produto não encontrado.");
                return; // Sai do método, pois não há produto correspondente
            }
            sqlQuantidadeItem = "UPDATE produto SET quantidade_estoque= "+ quantidadeTotal +" WHERE nome_produto like '" +nomeProduto+"%'"; //Pega a quantidade do produto a partir do nome
            System.out.println(sqlQuantidadeItem);
            PreparedStatement pstmtProduto= conexao.conexao.prepareStatement(sqlQuantidadeItem);
            pstmtProduto.executeUpdate(); 

            String sqlItemPedido = "INSERT INTO item_pedido (id_pedido, nome_produto, preco, quantidade, total) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmtItemPedido = conexao.conexao.prepareStatement(sqlItemPedido);
            pstmtItemPedido.setInt(1, novoIdPedido);  // Usa o idPedido gerado
            pstmtItemPedido.setString(2, nomeProduto);
            pstmtItemPedido.setDouble(3, preco);
            pstmtItemPedido.setInt(4, quantidade);
            pstmtItemPedido.setDouble(5, total);
            pstmtItemPedido.executeUpdate();  // Insere cada item do pedido
        }
        
        // Obter o horário atual
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataHoraFormatada = agora.format(formato);
        
        System.out.println("Horário da compra: " + dataHoraFormatada);  // Apenas para teste ou use onde necessário

        // Mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Compra finalizada com sucesso! ID do Pedido: " + novoIdPedido, "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        // Limpa a sessão de compra e os controles da interface
        sessaoCompra.limparCompra();
        box1.setSelected(false);
        box3.setSelected(false);
        box4.setSelected(false);
        box5.setSelected(false);
        box6.setSelected(false);
        box7.setSelected(false);
        
        qtnd1.setValue(0);
        qtnd2.setValue(0);
        qtnd3.setValue(0);
        qtnd4.setValue(0);
        qtnd5.setValue(0);
        qtnd6.setValue(0);
        
        totalCompra.setText("0.00");

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao finalizar compra: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } finally {
        conexao.desconecta();  // Desconecta do banco
    }
    }//GEN-LAST:event_finalizarCompraActionPerformed

    private void opcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoActionPerformed
        CatalogoBalas pag = new CatalogoBalas(sessaoCompra);
        pag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcaoActionPerformed

    private void perfilBotao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilBotao1ActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE PIRULITOS
        HistoricoCliente pag = new HistoricoCliente();
        pag.setVisible(true);
        this.setVisible(false);  // Esconde a página atual
    }//GEN-LAST:event_perfilBotao1ActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogoChocolates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoChocolates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoChocolates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoChocolates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SessaoCompra sessao = new SessaoCompra();
                new CatalogoChocolates(sessao).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bloco1Balas10;
    private javax.swing.JPanel bloco1Balas11;
    private javax.swing.JPanel bloco1Balas12;
    private javax.swing.JPanel bloco1Balas7;
    private javax.swing.JPanel bloco1Balas8;
    private javax.swing.JPanel bloco1Balas9;
    private javax.swing.JCheckBox box1;
    private javax.swing.JCheckBox box3;
    private javax.swing.JCheckBox box4;
    private javax.swing.JCheckBox box5;
    private javax.swing.JCheckBox box6;
    private javax.swing.JCheckBox box7;
    private javax.swing.JButton chicletesBotao;
    private javax.swing.JButton chocolatesBotao;
    private javax.swing.JButton comprar1;
    private javax.swing.JButton comprar2;
    private javax.swing.JButton comprar3;
    private javax.swing.JButton comprar4;
    private javax.swing.JButton comprar5;
    private javax.swing.JButton comprar6;
    private javax.swing.JButton excluir;
    private javax.swing.JButton finalizarCompra;
    private javax.swing.JLabel imagem1;
    private javax.swing.JLabel imagemCatalogoPirulitos11;
    private javax.swing.JLabel imagemCatalogoPirulitos12;
    private javax.swing.JLabel imagemCatalogoPirulitos13;
    private javax.swing.JLabel imagemCatalogoPirulitos14;
    private javax.swing.JLabel imagemCatalogoPirulitos2;
    private javax.swing.JLabel imagemCatalogoPirulitos3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel menu;
    private javax.swing.JButton opcao;
    private javax.swing.JButton perfilBotao1;
    private javax.swing.JButton pirulitosBotao;
    private javax.swing.JSpinner qtnd1;
    private javax.swing.JSpinner qtnd2;
    private javax.swing.JSpinner qtnd3;
    private javax.swing.JSpinner qtnd4;
    private javax.swing.JSpinner qtnd5;
    private javax.swing.JSpinner qtnd6;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel tituloProduto17;
    private javax.swing.JLabel tituloProduto18;
    private javax.swing.JLabel tituloProduto19;
    private javax.swing.JLabel tituloProduto20;
    private javax.swing.JLabel tituloProduto3;
    private javax.swing.JLabel tituloProduto4;
    private javax.swing.JTextField totalCompra;
    // End of variables declaration//GEN-END:variables
}
