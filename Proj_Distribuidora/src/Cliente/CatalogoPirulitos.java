/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle.Cliente;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class CatalogoPirulitos extends javax.swing.JFrame {

    /**
     * Creates new form Catalogo
     */
    public CatalogoPirulitos() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        balasBotao = new javax.swing.JButton();
        opcao2 = new javax.swing.JButton();
        chicletesBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoPesquisar = new javax.swing.JTextField();
        chocolatesBotao = new javax.swing.JButton();
        bloco1Balas = new javax.swing.JPanel();
        botaoComprar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        tituloProduto = new javax.swing.JLabel();
        imagemCatalogoPirulitos = new javax.swing.JLabel();
        valor1 = new javax.swing.JTextField();
        tituloProduto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(102, 0, 204));
        menu.setForeground(new java.awt.Color(102, 0, 204));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/icone.png"))); // NOI18N

        balasBotao.setBackground(new java.awt.Color(102, 0, 204));
        balasBotao.setForeground(new java.awt.Color(255, 255, 255));
        balasBotao.setText("Balas");
        balasBotao.setBorder(null);
        balasBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balasBotaoActionPerformed(evt);
            }
        });
        balasBotao.setBorderPainted(false);        // Remove a borda
        balasBotao.setContentAreaFilled(false);

        opcao2.setBackground(new java.awt.Color(102, 0, 204));
        opcao2.setForeground(new java.awt.Color(255, 255, 255));
        opcao2.setText("Pirulitos");
        opcao2.setBorder(null);
        opcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao2ActionPerformed(evt);
            }
        });
        opcao2.setBorderPainted(false);        // Remove a borda
        opcao2.setContentAreaFilled(false);

        chicletesBotao.setBackground(new java.awt.Color(102, 0, 204));
        chicletesBotao.setForeground(new java.awt.Color(255, 255, 255));
        chicletesBotao.setText("Chicletes");
        chicletesBotao.setBorder(null);
        chicletesBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chicletesBotaoActionPerformed(evt);
            }
        });
        chicletesBotao.setBorderPainted(false);        // Remove a borda
        chicletesBotao.setContentAreaFilled(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pesquisar:");

        chocolatesBotao.setBackground(new java.awt.Color(102, 0, 204));
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
                .addGap(18, 18, 18)
                .addComponent(opcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chicletesBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chocolatesBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
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
                            .addComponent(opcao2)
                            .addComponent(chicletesBotao)
                            .addComponent(jLabel1)
                            .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chocolatesBotao)))
                    .addComponent(imagem))
                .addGap(13, 13, 13))
        );

        bloco1Balas.setBackground(new java.awt.Color(204, 204, 204));

        botaoComprar.setText("Comprar");

        tituloProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloProduto.setText("Bubbaloo Tutti-Frutti");

        imagemCatalogoPirulitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/bubbaloo.png"))); // NOI18N

        valor1.setText("jTextField2");
        valor1.setEnabled(false);

        tituloProduto1.setText("700g");

        javax.swing.GroupLayout bloco1BalasLayout = new javax.swing.GroupLayout(bloco1Balas);
        bloco1Balas.setLayout(bloco1BalasLayout);
        bloco1BalasLayout.setHorizontalGroup(
            bloco1BalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1BalasLayout.createSequentialGroup()
                .addGroup(bloco1BalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloco1BalasLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(tituloProduto1))
                    .addGroup(bloco1BalasLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(bloco1BalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bloco1BalasLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imagemCatalogoPirulitos)))
                    .addGroup(bloco1BalasLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(botaoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1BalasLayout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addComponent(tituloProduto)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        bloco1BalasLayout.setVerticalGroup(
            bloco1BalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bloco1BalasLayout.createSequentialGroup()
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
                .addComponent(botaoComprar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bloco1Balas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bloco1Balas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao2ActionPerformed
    }//GEN-LAST:event_opcao2ActionPerformed

    private void balasBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balasBotaoActionPerformed
    // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE BALAS
    CatalogoBalas pag = new CatalogoBalas();
    pag.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_balasBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogoPirulitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoPirulitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoPirulitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoPirulitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoPirulitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balasBotao;
    private javax.swing.JPanel bloco1Balas;
    private javax.swing.JButton botaoComprar;
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JButton chicletesBotao;
    private javax.swing.JButton chocolatesBotao;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagemCatalogoPirulitos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton opcao2;
    private javax.swing.JLabel tituloProduto;
    private javax.swing.JLabel tituloProduto1;
    private javax.swing.JTextField valor1;
    // End of variables declaration//GEN-END:variables
}
