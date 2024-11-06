/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author Karinne Angelo dos Santos Ventura - 2° DS AMS (ETEC ZONA LESTE)
 */

public class CatalogoChicletes extends javax.swing.JFrame {
    
    public CatalogoChicletes() {
        // Inicialização dos componentes do JFrame
        initComponents();
        
        // Define o ícone da janela
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Controle/Imagens/icon.png")));
        
        // Configurações da página
        setResizable(false);
        setLocationRelativeTo(null);
        
        // Cor de fundo da tela 
        getContentPane().setBackground(new Color(43, 0, 87));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        balasBotao = new javax.swing.JButton();
        pirulitosBotao = new javax.swing.JButton();
        chicletesBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoPesquisar = new javax.swing.JTextField();
        chocolatesBotao = new javax.swing.JButton();
        bloco1Balas3 = new javax.swing.JPanel();
        botaoComprar2 = new javax.swing.JButton();
        jSpinner3 = new javax.swing.JSpinner();
        tituloProduto4 = new javax.swing.JLabel();
        imagemCatalogoPirulitos2 = new javax.swing.JLabel();
        valor3 = new javax.swing.JTextField();
        tituloProduto5 = new javax.swing.JLabel();
        bloco1Balas2 = new javax.swing.JPanel();
        jSpinner2 = new javax.swing.JSpinner();
        tituloProduto2 = new javax.swing.JLabel();
        imagemCatalogoPirulitos1 = new javax.swing.JLabel();
        valor2 = new javax.swing.JTextField();
        tituloProduto3 = new javax.swing.JLabel();
        botaoComprar6 = new javax.swing.JButton();
        bloco1Balas1 = new javax.swing.JPanel();
        botaoComprar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        tituloProduto = new javax.swing.JLabel();
        imagemCatalogoPirulitos = new javax.swing.JLabel();
        valor1 = new javax.swing.JTextField();
        tituloProduto1 = new javax.swing.JLabel();
        bloco1Balas4 = new javax.swing.JPanel();
        botaoComprar3 = new javax.swing.JButton();
        jSpinner4 = new javax.swing.JSpinner();
        tituloProduto6 = new javax.swing.JLabel();
        imagemCatalogoPirulitos3 = new javax.swing.JLabel();
        valor4 = new javax.swing.JTextField();
        tituloProduto7 = new javax.swing.JLabel();
        bloco1Balas5 = new javax.swing.JPanel();
        botaoComprar4 = new javax.swing.JButton();
        jSpinner5 = new javax.swing.JSpinner();
        tituloProduto8 = new javax.swing.JLabel();
        imagemCatalogoPirulitos4 = new javax.swing.JLabel();
        valor5 = new javax.swing.JTextField();
        tituloProduto9 = new javax.swing.JLabel();
        bloco1Balas6 = new javax.swing.JPanel();
        botaoComprar5 = new javax.swing.JButton();
        jSpinner6 = new javax.swing.JSpinner();
        tituloProduto10 = new javax.swing.JLabel();
        imagemCatalogoPirulitos5 = new javax.swing.JLabel();
        valor6 = new javax.swing.JTextField();
        tituloProduto11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(102, 0, 204));
        menu.setForeground(new java.awt.Color(102, 0, 204));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/icone.png"))); // NOI18N

        balasBotao.setBackground(new java.awt.Color(102, 0, 204));
        balasBotao.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        balasBotao.setForeground(new java.awt.Color(255, 255, 255));
        balasBotao.setText("Balas");
        balasBotao.setBorder(null);
        balasBotao.setBorderPainted(false);
        balasBotao.setContentAreaFilled(false);
        balasBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balasBotaoActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pesquisar:");

        campoPesquisar.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagem)
                .addGap(37, 37, 37)
                .addComponent(balasBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pirulitosBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chicletesBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chocolatesBotao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(balasBotao)
                            .addComponent(pirulitosBotao)
                            .addComponent(chicletesBotao)
                            .addComponent(jLabel1)
                            .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chocolatesBotao)))
                    .addComponent(imagem))
                .addGap(13, 13, 13))
        );

        bloco1Balas3.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        botaoComprar2.setBackground(new java.awt.Color(43, 0, 87));
        botaoComprar2.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        botaoComprar2.setForeground(new java.awt.Color(255, 255, 255));
        botaoComprar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        botaoComprar2.setText("Comprar");
        botaoComprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprar2ActionPerformed(evt);
            }
        });

        jSpinner3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        tituloProduto4.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        tituloProduto4.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto4.setText("Pirulito Pop - Melancia");

        imagemCatalogoPirulitos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/7belo.png"))); // NOI18N

        valor3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        valor3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor3.setText("R$ 9,99");
        valor3.setEnabled(false);

        tituloProduto5.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto5.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto5.setText("672g");

        javax.swing.GroupLayout bloco1Balas3Layout = new javax.swing.GroupLayout(bloco1Balas3);
        bloco1Balas3.setLayout(bloco1Balas3Layout);
        bloco1Balas3Layout.setHorizontalGroup(
            bloco1Balas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas3Layout.createSequentialGroup()
                .addGroup(bloco1Balas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tituloProduto4))
                    .addGroup(bloco1Balas3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(tituloProduto5))
                    .addGroup(bloco1Balas3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(bloco1Balas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemCatalogoPirulitos2)
                            .addComponent(valor3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bloco1Balas3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(botaoComprar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bloco1Balas3Layout.setVerticalGroup(
            bloco1Balas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloProduto4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoComprar2)
                .addContainerGap())
        );

        bloco1Balas2.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        jSpinner2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        tituloProduto2.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        tituloProduto2.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto2.setText("Bala Fini Sabor Banana 100g");

        imagemCatalogoPirulitos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/balafini.png"))); // NOI18N

        valor2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        valor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor2.setText("R$ 63,99");
        valor2.setEnabled(false);

        tituloProduto3.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto3.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto3.setText("Caixa com 24 un.");

        botaoComprar6.setBackground(new java.awt.Color(43, 0, 87));
        botaoComprar6.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        botaoComprar6.setForeground(new java.awt.Color(255, 255, 255));
        botaoComprar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        botaoComprar6.setText("Comprar");
        botaoComprar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bloco1Balas2Layout = new javax.swing.GroupLayout(bloco1Balas2);
        bloco1Balas2.setLayout(bloco1Balas2Layout);
        bloco1Balas2Layout.setHorizontalGroup(
            bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas2Layout.createSequentialGroup()
                        .addComponent(tituloProduto2)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas2Layout.createSequentialGroup()
                        .addGroup(bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoComprar6)
                            .addComponent(tituloProduto3)
                            .addGroup(bloco1Balas2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imagemCatalogoPirulitos1)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(64, 64, 64))))
        );
        bloco1Balas2Layout.setVerticalGroup(
            bloco1Balas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloProduto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoComprar6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bloco1Balas1.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        botaoComprar.setBackground(new java.awt.Color(43, 0, 87));
        botaoComprar.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        botaoComprar.setForeground(new java.awt.Color(255, 255, 255));
        botaoComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        botaoComprar.setText("Comprar");
        botaoComprar.setBorder(null);
        botaoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        tituloProduto.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        tituloProduto.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto.setText("Pirulito BigBig - Tutti Frutti");

        imagemCatalogoPirulitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/bigbig.png"))); // NOI18N

        valor1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        valor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor1.setText("R$ 12,60");
        valor1.setEnabled(false);

        tituloProduto1.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto1.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto1.setText("700g");

        javax.swing.GroupLayout bloco1Balas1Layout = new javax.swing.GroupLayout(bloco1Balas1);
        bloco1Balas1.setLayout(bloco1Balas1Layout);
        bloco1Balas1Layout.setHorizontalGroup(
            bloco1Balas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas1Layout.createSequentialGroup()
                .addGroup(bloco1Balas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(bloco1Balas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagemCatalogoPirulitos)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bloco1Balas1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(botaoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas1Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(bloco1Balas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas1Layout.createSequentialGroup()
                        .addComponent(tituloProduto1)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas1Layout.createSequentialGroup()
                        .addComponent(tituloProduto)
                        .addGap(21, 21, 21))))
        );
        bloco1Balas1Layout.setVerticalGroup(
            bloco1Balas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bloco1Balas4.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        botaoComprar3.setBackground(new java.awt.Color(43, 0, 87));
        botaoComprar3.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        botaoComprar3.setForeground(new java.awt.Color(255, 255, 255));
        botaoComprar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        botaoComprar3.setText("Comprar");
        botaoComprar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprar3ActionPerformed(evt);
            }
        });

        jSpinner4.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N

        tituloProduto6.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        tituloProduto6.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto6.setText("Florestal - Pop Kiss Cereja");

        imagemCatalogoPirulitos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/azedinhauva.png"))); // NOI18N

        valor4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        valor4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor4.setText("R$ 16,71");
        valor4.setEnabled(false);

        tituloProduto7.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto7.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto7.setText("500g");

        javax.swing.GroupLayout bloco1Balas4Layout = new javax.swing.GroupLayout(bloco1Balas4);
        bloco1Balas4.setLayout(bloco1Balas4Layout);
        bloco1Balas4Layout.setHorizontalGroup(
            bloco1Balas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloProduto7)
                .addGap(92, 92, 92))
            .addGroup(bloco1Balas4Layout.createSequentialGroup()
                .addGroup(bloco1Balas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1Balas4Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(bloco1Balas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valor4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagemCatalogoPirulitos3)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bloco1Balas4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(botaoComprar3))
                    .addGroup(bloco1Balas4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tituloProduto6)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        bloco1Balas4Layout.setVerticalGroup(
            bloco1Balas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloProduto6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoComprar3)
                .addContainerGap())
        );

        bloco1Balas5.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        botaoComprar4.setBackground(new java.awt.Color(43, 0, 87));
        botaoComprar4.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        botaoComprar4.setForeground(new java.awt.Color(255, 255, 255));
        botaoComprar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        botaoComprar4.setText("Comprar");
        botaoComprar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprar4ActionPerformed(evt);
            }
        });

        jSpinner5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        tituloProduto8.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        tituloProduto8.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto8.setText("Bala Azedinha - Morango");

        imagemCatalogoPirulitos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/azedinhamorango.png"))); // NOI18N

        valor5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        valor5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor5.setText("R$ 8,40");
        valor5.setEnabled(false);

        tituloProduto9.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto9.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto9.setText("600g");

        javax.swing.GroupLayout bloco1Balas5Layout = new javax.swing.GroupLayout(bloco1Balas5);
        bloco1Balas5.setLayout(bloco1Balas5Layout);
        bloco1Balas5Layout.setHorizontalGroup(
            bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas5Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas5Layout.createSequentialGroup()
                        .addComponent(tituloProduto8)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas5Layout.createSequentialGroup()
                        .addGroup(bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemCatalogoPirulitos4)
                            .addGroup(bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(valor5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas5Layout.createSequentialGroup()
                        .addComponent(tituloProduto9)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas5Layout.createSequentialGroup()
                        .addComponent(botaoComprar4)
                        .addGap(65, 65, 65))))
        );
        bloco1Balas5Layout.setVerticalGroup(
            bloco1Balas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloProduto8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoComprar4)
                .addContainerGap())
        );

        bloco1Balas6.setBackground(new java.awt.Color(43, 0, 87));
        bloco1Balas6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        botaoComprar5.setBackground(new java.awt.Color(43, 0, 87));
        botaoComprar5.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        botaoComprar5.setForeground(new java.awt.Color(255, 255, 255));
        botaoComprar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/checklist.png"))); // NOI18N
        botaoComprar5.setText("Comprar");
        botaoComprar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprar5ActionPerformed(evt);
            }
        });

        jSpinner6.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N

        tituloProduto10.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        tituloProduto10.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto10.setText("Jujuba Delikuky Sortidas");

        imagemCatalogoPirulitos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/jujuba.png"))); // NOI18N

        valor6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        valor6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor6.setText("R$ 11,20");
        valor6.setEnabled(false);

        tituloProduto11.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 12)); // NOI18N
        tituloProduto11.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto11.setText("500g");

        javax.swing.GroupLayout bloco1Balas6Layout = new javax.swing.GroupLayout(bloco1Balas6);
        bloco1Balas6.setLayout(bloco1Balas6Layout);
        bloco1Balas6Layout.setHorizontalGroup(
            bloco1Balas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1Balas6Layout.createSequentialGroup()
                .addGroup(bloco1Balas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas6Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(tituloProduto10))
                    .addGroup(bloco1Balas6Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(bloco1Balas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemCatalogoPirulitos5)
                            .addGroup(bloco1Balas6Layout.createSequentialGroup()
                                .addComponent(tituloProduto11)
                                .addGap(27, 27, 27))
                            .addComponent(valor6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(bloco1Balas6Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(botaoComprar5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bloco1Balas6Layout.setVerticalGroup(
            bloco1Balas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1Balas6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloProduto10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloProduto11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCatalogoPirulitos5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoComprar5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloco1Balas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloco1Balas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco1Balas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco1Balas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bloco1Balas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bloco1Balas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bloco1Balas6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pirulitosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirulitosBotaoActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE PIRULITOS
        CatalogoPirulitos pag = new CatalogoPirulitos();
        pag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pirulitosBotaoActionPerformed

    private void chicletesBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicletesBotaoActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE CHICLETES
        CatalogoChicletes pag = new CatalogoChicletes();
        pag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_chicletesBotaoActionPerformed

    private void chocolatesBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolatesBotaoActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE CHOCOLATES
        CatalogoChocolates pag = new CatalogoChocolates();
        pag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_chocolatesBotaoActionPerformed

    private void botaoComprar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoComprar2ActionPerformed

    private void botaoComprar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoComprar6ActionPerformed

    private void botaoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarActionPerformed
        // PROCESSO DE COMPRA

    }//GEN-LAST:event_botaoComprarActionPerformed

    private void botaoComprar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoComprar3ActionPerformed

    private void botaoComprar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoComprar4ActionPerformed

    private void botaoComprar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoComprar5ActionPerformed

    private void balasBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balasBotaoActionPerformed
        // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE BALAS
        CatalogoBalas pag = new CatalogoBalas();
        pag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_balasBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogoChicletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoChicletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoChicletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoChicletes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoChicletes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balasBotao;
    private javax.swing.JPanel bloco1Balas1;
    private javax.swing.JPanel bloco1Balas2;
    private javax.swing.JPanel bloco1Balas3;
    private javax.swing.JPanel bloco1Balas4;
    private javax.swing.JPanel bloco1Balas5;
    private javax.swing.JPanel bloco1Balas6;
    private javax.swing.JButton botaoComprar;
    private javax.swing.JButton botaoComprar2;
    private javax.swing.JButton botaoComprar3;
    private javax.swing.JButton botaoComprar4;
    private javax.swing.JButton botaoComprar5;
    private javax.swing.JButton botaoComprar6;
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JButton chicletesBotao;
    private javax.swing.JButton chocolatesBotao;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagemCatalogoPirulitos;
    private javax.swing.JLabel imagemCatalogoPirulitos1;
    private javax.swing.JLabel imagemCatalogoPirulitos2;
    private javax.swing.JLabel imagemCatalogoPirulitos3;
    private javax.swing.JLabel imagemCatalogoPirulitos4;
    private javax.swing.JLabel imagemCatalogoPirulitos5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JPanel menu;
    private javax.swing.JButton pirulitosBotao;
    private javax.swing.JLabel tituloProduto;
    private javax.swing.JLabel tituloProduto1;
    private javax.swing.JLabel tituloProduto10;
    private javax.swing.JLabel tituloProduto11;
    private javax.swing.JLabel tituloProduto2;
    private javax.swing.JLabel tituloProduto3;
    private javax.swing.JLabel tituloProduto4;
    private javax.swing.JLabel tituloProduto5;
    private javax.swing.JLabel tituloProduto6;
    private javax.swing.JLabel tituloProduto7;
    private javax.swing.JLabel tituloProduto8;
    private javax.swing.JLabel tituloProduto9;
    private javax.swing.JTextField valor1;
    private javax.swing.JTextField valor2;
    private javax.swing.JTextField valor3;
    private javax.swing.JTextField valor4;
    private javax.swing.JTextField valor5;
    private javax.swing.JTextField valor6;
    // End of variables declaration//GEN-END:variables
}
