/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Controle.Cliente;
import Conexao.Conexao;
import Controle.Login;
import com.mysql.jdbc.Statement;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Karinne Angelo dos Santos Ventura - 2° DS AMS (ETEC ZONA LESTE)
 */
public class CatalogoBalas extends javax.swing.JFrame {

    Conexao conexao;
    private int idPedidoAtual; // Armazena o ID do pedido gerado para esta execução
    private SessaoCompra sessaoCompra;
  
    public CatalogoBalas(SessaoCompra sessaoCompra) {
        // Inicialização dos componentes do JFrame
        initComponents();
        
        this.sessaoCompra = sessaoCompra;    
                
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

        menu = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        opcao1 = new javax.swing.JButton();
        pirulitosBotao = new javax.swing.JButton();
        chicletesBotao = new javax.swing.JButton();
        chocolatesBotao = new javax.swing.JButton();
        perfilBotao = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        bloco1Balas1 = new javax.swing.JPanel();
        comprar1 = new javax.swing.JButton();
        qtnd1 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos = new javax.swing.JLabel();
        tituloProduto1 = new javax.swing.JLabel();
        box1 = new javax.swing.JCheckBox();
        bloco1Balas2 = new javax.swing.JPanel();
        comprar2 = new javax.swing.JButton();
        qtnd2 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos7 = new javax.swing.JLabel();
        tituloProduto13 = new javax.swing.JLabel();
        box3 = new javax.swing.JCheckBox();
        bloco1Balas3 = new javax.swing.JPanel();
        comprar3 = new javax.swing.JButton();
        qtnd3 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos8 = new javax.swing.JLabel();
        tituloProduto14 = new javax.swing.JLabel();
        box4 = new javax.swing.JCheckBox();
        bloco1Balas4 = new javax.swing.JPanel();
        comprar4 = new javax.swing.JButton();
        qtnd4 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos1 = new javax.swing.JLabel();
        tituloProduto2 = new javax.swing.JLabel();
        box5 = new javax.swing.JCheckBox();
        bloco1Balas5 = new javax.swing.JPanel();
        qtnd5 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos10 = new javax.swing.JLabel();
        tituloProduto16 = new javax.swing.JLabel();
        box7 = new javax.swing.JCheckBox();
        comprar6 = new javax.swing.JButton();
        bloco1Balas6 = new javax.swing.JPanel();
        qtnd6 = new javax.swing.JSpinner();
        imagemCatalogoPirulitos9 = new javax.swing.JLabel();
        tituloProduto15 = new javax.swing.JLabel();
        box6 = new javax.swing.JCheckBox();
        comprar5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        excluir = new javax.swing.JButton();
        finalizarCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        totalCompra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(102, 0, 204));
        menu.setForeground(new java.awt.Color(102, 0, 204));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/icone.png"))); // NOI18N

        opcao1.setBackground(new java.awt.Color(102, 0, 204));
        opcao1.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        opcao1.setForeground(new java.awt.Color(255, 255, 255));
        opcao1.setText("Balas");
        opcao1.setBorder(null);
        opcao1.setBorderPainted(false);
        opcao1.setContentAreaFilled(false);
        opcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao1ActionPerformed(evt);
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

        perfilBotao.setBackground(new java.awt.Color(102, 0, 204));
        perfilBotao.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        perfilBotao.setForeground(new java.awt.Color(255, 255, 255));
        perfilBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/perfil.png"))); // NOI18N
        perfilBotao.setBorder(null);
        perfilBotao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        perfilBotao.setBorderPainted(false);
        perfilBotao.setContentAreaFilled(false);
        perfilBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagem)
                .addGap(37, 37, 37)
                .addComponent(opcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pirulitosBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chicletesBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chocolatesBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perfilBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perfilBotao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(opcao1)
                                .addComponent(pirulitosBotao)
                                .addComponent(chicletesBotao)
                                .addComponent(chocolatesBotao))))
                    .addComponent(imagem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(43, 0, 87));

        bloco1Balas1.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

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

        imagemCatalogoPirulitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/gomets.png"))); // NOI18N

        tituloProduto1.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto1.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto1.setText("700g");

        box1.setBackground(new java.awt.Color(43, 0, 87));
        box1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box1.setForeground(new java.awt.Color(255, 255, 255));
        box1.setText("Bala de Goma Gomets");
        box1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bloco1Balas1Layout = new javax.swing.GroupLayout(bloco1Balas1);
        bloco1Balas1.setLayout(bloco1Balas1Layout);
        bloco1Balas1Layout.setHorizontalGroup(
            bloco1Balas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas1Layout.createSequentialGroup()
                .addGroup(bloco1Balas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(bloco1Balas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtnd1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagemCatalogoPirulitos)))
                    .addGroup(bloco1Balas1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(tituloProduto1))
                    .addGroup(bloco1Balas1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(comprar1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloco1Balas1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(box1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        bloco1Balas1Layout.setVerticalGroup(
            bloco1Balas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos)
                .addGap(23, 23, 23)
                .addComponent(qtnd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bloco1Balas2.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

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

        imagemCatalogoPirulitos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/balafini.png"))); // NOI18N

        tituloProduto13.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto13.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto13.setText("Caixa com 24 un.");

        box3.setBackground(new java.awt.Color(43, 0, 87));
        box3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box3.setForeground(new java.awt.Color(255, 255, 255));
        box3.setText("Bala Fini Sabor Banana 100g");
        box3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bloco1Balas2Layout = new javax.swing.GroupLayout(bloco1Balas2);
        bloco1Balas2.setLayout(bloco1Balas2Layout);
        bloco1Balas2Layout.setHorizontalGroup(
            bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas2Layout.createSequentialGroup()
                .addGroup(bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(box3))
                    .addGroup(bloco1Balas2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(comprar2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloco1Balas2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloProduto13)
                            .addGroup(bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(qtnd2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(imagemCatalogoPirulitos7)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bloco1Balas2Layout.setVerticalGroup(
            bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos7)
                .addGap(23, 23, 23)
                .addComponent(qtnd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        bloco1Balas3.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

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

        imagemCatalogoPirulitos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/7belo.png"))); // NOI18N

        tituloProduto14.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto14.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto14.setText("600g");

        box4.setBackground(new java.awt.Color(43, 0, 87));
        box4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box4.setForeground(new java.awt.Color(255, 255, 255));
        box4.setText("7 Belo - Framboesa ");
        box4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bloco1Balas3Layout = new javax.swing.GroupLayout(bloco1Balas3);
        bloco1Balas3.setLayout(bloco1Balas3Layout);
        bloco1Balas3Layout.setHorizontalGroup(
            bloco1Balas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas3Layout.createSequentialGroup()
                .addGroup(bloco1Balas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(bloco1Balas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtnd3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagemCatalogoPirulitos8)))
                    .addGroup(bloco1Balas3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(comprar3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloco1Balas3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(box4)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloProduto14)
                .addGap(102, 102, 102))
        );
        bloco1Balas3Layout.setVerticalGroup(
            bloco1Balas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos8)
                .addGap(18, 18, 18)
                .addComponent(qtnd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        bloco1Balas4.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

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

        imagemCatalogoPirulitos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/azedinhauva.png"))); // NOI18N

        tituloProduto2.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto2.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto2.setText("600g");

        box5.setBackground(new java.awt.Color(43, 0, 87));
        box5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box5.setForeground(new java.awt.Color(255, 255, 255));
        box5.setText("Bala Azedinha - Uva");
        box5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bloco1Balas4Layout = new javax.swing.GroupLayout(bloco1Balas4);
        bloco1Balas4.setLayout(bloco1Balas4Layout);
        bloco1Balas4Layout.setHorizontalGroup(
            bloco1Balas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas4Layout.createSequentialGroup()
                .addGroup(bloco1Balas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(box5))
                    .addGroup(bloco1Balas4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(tituloProduto2))
                    .addGroup(bloco1Balas4Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(bloco1Balas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemCatalogoPirulitos1)
                            .addComponent(qtnd4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bloco1Balas4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(comprar4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bloco1Balas4Layout.setVerticalGroup(
            bloco1Balas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos1)
                .addGap(12, 12, 12)
                .addComponent(qtnd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comprar4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        bloco1Balas5.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        qtnd5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        imagemCatalogoPirulitos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/azedinhamorango.png"))); // NOI18N

        tituloProduto16.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto16.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto16.setText("600g");

        box7.setBackground(new java.awt.Color(43, 0, 87));
        box7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box7.setForeground(new java.awt.Color(255, 255, 255));
        box7.setText("Bala Azedinha - Morango");
        box7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box7ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout bloco1Balas5Layout = new javax.swing.GroupLayout(bloco1Balas5);
        bloco1Balas5.setLayout(bloco1Balas5Layout);
        bloco1Balas5Layout.setHorizontalGroup(
            bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas5Layout.createSequentialGroup()
                .addGroup(bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(box7))
                    .addGroup(bloco1Balas5Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(imagemCatalogoPirulitos10)
                                .addGroup(bloco1Balas5Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(tituloProduto16))
                                .addComponent(qtnd5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bloco1Balas5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(comprar6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bloco1Balas5Layout.setVerticalGroup(
            bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos10)
                .addGap(12, 12, 12)
                .addComponent(qtnd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comprar6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        bloco1Balas6.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        qtnd6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        imagemCatalogoPirulitos9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/jujuba.png"))); // NOI18N

        tituloProduto15.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto15.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto15.setText("500g");

        box6.setBackground(new java.awt.Color(43, 0, 87));
        box6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        box6.setForeground(new java.awt.Color(255, 255, 255));
        box6.setText("Jujuba Delikuky Sortidas");
        box6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        javax.swing.GroupLayout bloco1Balas6Layout = new javax.swing.GroupLayout(bloco1Balas6);
        bloco1Balas6.setLayout(bloco1Balas6Layout);
        bloco1Balas6Layout.setHorizontalGroup(
            bloco1Balas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas6Layout.createSequentialGroup()
                .addGroup(bloco1Balas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas6Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(tituloProduto15))
                    .addGroup(bloco1Balas6Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(bloco1Balas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemCatalogoPirulitos9)
                            .addComponent(qtnd6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bloco1Balas6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(box6))
                    .addGroup(bloco1Balas6Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(comprar5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        bloco1Balas6Layout.setVerticalGroup(
            bloco1Balas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(box6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qtnd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comprar5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detalhes da Compra");

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
        jScrollPane1.setViewportView(tabela);

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

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total da Compra:");

        totalCompra.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bloco1Balas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloco1Balas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bloco1Balas5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bloco1Balas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bloco1Balas6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bloco1Balas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(finalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloco1Balas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bloco1Balas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bloco1Balas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco1Balas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(excluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(finalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pirulitosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirulitosBotaoActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE PIRULITOS
        CatalogoPirulitos pag = new CatalogoPirulitos(sessaoCompra);
        pag.setVisible(true);
        this.setVisible(false);  // Esconde a página atual
    }//GEN-LAST:event_pirulitosBotaoActionPerformed

    private void chicletesBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicletesBotaoActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE CHICLETES
        CatalogoChicletes pag = new CatalogoChicletes(sessaoCompra);
        pag.setVisible(true);
        this.setVisible(false);  // Esconde a página atual
    }//GEN-LAST:event_chicletesBotaoActionPerformed

    private void chocolatesBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolatesBotaoActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE CHOCOLATES
        CatalogoChocolates pag = new CatalogoChocolates(sessaoCompra);
        pag.setVisible(true);
        this.setVisible(false);  // Esconde a página atual
    }//GEN-LAST:event_chocolatesBotaoActionPerformed

    private void comprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar1ActionPerformed

    qtnd = Integer.parseInt(qtnd1.getValue().toString()); // Quantidade escolhida pelo usuário
    double preco = 21.70; // Preço do produto
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
        preco = 63.99;
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
        preco = 15;
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
        preco = 8.40;
        total = qtnd * preco;
        
        if (qtnd > 0) { // Valida se a quantidade é maior que zero
            sessaoCompra.adicionarProduto(box5.getText(), preco, qtnd);
            calcularTotalCompra();
        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma quantidade válida!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_comprar4ActionPerformed

    private void comprar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar5ActionPerformed
        qtnd = Integer.parseInt(qtnd6.getValue().toString());
        preco = 8.40;
        total = qtnd * preco;

        if (qtnd > 0) { // Valida se a quantidade é maior que zero
            sessaoCompra.adicionarProduto(box6.getText(), preco, qtnd);
            calcularTotalCompra();
        } else {
            JOptionPane.showMessageDialog(this, "Escolha uma quantidade válida!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_comprar5ActionPerformed

    private void comprar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar6ActionPerformed
        qtnd = Integer.parseInt(qtnd5.getValue().toString());
        preco = 11.20;
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

    private void perfilBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilBotaoActionPerformed
       // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE PIRULITOS
        HistoricoCliente pag = new HistoricoCliente();
        pag.setVisible(true);
        this.setVisible(false);  // Esconde a página atual
    }//GEN-LAST:event_perfilBotaoActionPerformed

    private void opcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao1ActionPerformed
        CatalogoBalas pag = new CatalogoBalas(sessaoCompra);
        pag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opcao1ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box3ActionPerformed

    private void box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box5ActionPerformed

    private void box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box7ActionPerformed

 
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
            java.util.logging.Logger.getLogger(CatalogoBalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoBalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoBalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoBalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SessaoCompra sessao = new SessaoCompra();
                new CatalogoBalas(sessao).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bloco1Balas1;
    private javax.swing.JPanel bloco1Balas2;
    private javax.swing.JPanel bloco1Balas3;
    private javax.swing.JPanel bloco1Balas4;
    private javax.swing.JPanel bloco1Balas5;
    private javax.swing.JPanel bloco1Balas6;
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
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagemCatalogoPirulitos;
    private javax.swing.JLabel imagemCatalogoPirulitos1;
    private javax.swing.JLabel imagemCatalogoPirulitos10;
    private javax.swing.JLabel imagemCatalogoPirulitos7;
    private javax.swing.JLabel imagemCatalogoPirulitos8;
    private javax.swing.JLabel imagemCatalogoPirulitos9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel menu;
    private javax.swing.JButton opcao1;
    private javax.swing.JButton perfilBotao;
    private javax.swing.JButton pirulitosBotao;
    private javax.swing.JSpinner qtnd1;
    private javax.swing.JSpinner qtnd2;
    private javax.swing.JSpinner qtnd3;
    private javax.swing.JSpinner qtnd4;
    private javax.swing.JSpinner qtnd5;
    private javax.swing.JSpinner qtnd6;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel tituloProduto1;
    private javax.swing.JLabel tituloProduto13;
    private javax.swing.JLabel tituloProduto14;
    private javax.swing.JLabel tituloProduto15;
    private javax.swing.JLabel tituloProduto16;
    private javax.swing.JLabel tituloProduto2;
    private javax.swing.JTextField totalCompra;
    // End of variables declaration//GEN-END:variables

}
