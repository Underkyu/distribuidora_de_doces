/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class CatalogoChocolates extends javax.swing.JFrame {

    /**
     * Creates new form Catalogo
     */
    public CatalogoChocolates() {
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
        pirulitosBotao = new javax.swing.JButton();
        chicleteBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoPesquisar = new javax.swing.JTextField();
        opcao4 = new javax.swing.JButton();
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

        pirulitosBotao.setBackground(new java.awt.Color(102, 0, 204));
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

        chicleteBotao.setBackground(new java.awt.Color(102, 0, 204));
        chicleteBotao.setForeground(new java.awt.Color(255, 255, 255));
        chicleteBotao.setText("Chicletes");
        chicleteBotao.setBorder(null);
        chicleteBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chicleteBotaoActionPerformed(evt);
            }
        });
        chicleteBotao.setBorderPainted(false);        // Remove a borda
        chicleteBotao.setContentAreaFilled(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pesquisar:");

        opcao4.setBackground(new java.awt.Color(102, 0, 204));
        opcao4.setForeground(new java.awt.Color(255, 255, 255));
        opcao4.setText("Chocolates");
        opcao4.setBorder(null);
        opcao4.setBorderPainted(false);        // Remove a borda
        opcao4.setContentAreaFilled(false);

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
                .addComponent(pirulitosBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chicleteBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcao4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
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
                            .addComponent(chicleteBotao)
                            .addComponent(jLabel1)
                            .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcao4)))
                    .addComponent(imagem))
                .addGap(13, 13, 13))
        );

        bloco1Balas.setBackground(new java.awt.Color(204, 204, 204));

        botaoComprar.setText("Comprar");

        tituloProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloProduto.setText("Chocolate Trento Meio Amargo ");

        imagemCatalogoPirulitos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/trento.png"))); // NOI18N

        valor1.setText("jTextField2");
        valor1.setEnabled(false);

        tituloProduto1.setText("800g");

        javax.swing.GroupLayout bloco1BalasLayout = new javax.swing.GroupLayout(bloco1Balas);
        bloco1Balas.setLayout(bloco1BalasLayout);
        bloco1BalasLayout.setHorizontalGroup(
            bloco1BalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloco1BalasLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(tituloProduto1))
            .addGroup(bloco1BalasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloProduto))
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
                .addGap(20, 20, 20)
                .addComponent(bloco1Balas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(629, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bloco1Balas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pirulitosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pirulitosBotaoActionPerformed
    // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE PIRULITOS 
    CatalogoPirulitos pag = new CatalogoPirulitos();
    pag.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_pirulitosBotaoActionPerformed

    private void balasBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balasBotaoActionPerformed
    // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE BALAS
    CatalogoBalas pag = new CatalogoBalas();
    pag.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_balasBotaoActionPerformed

    private void chicleteBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicleteBotaoActionPerformed
    // BOTÃO QUE REDIRECIONA PARA A PÁGINA DE CHICLETES 
    CatalogoChicletes pag = new CatalogoChicletes();
    pag.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_chicleteBotaoActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoChocolates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balasBotao;
    private javax.swing.JPanel bloco1Balas;
    private javax.swing.JButton botaoComprar;
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JButton chicleteBotao;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagemCatalogoPirulitos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton opcao4;
    private javax.swing.JButton pirulitosBotao;
    private javax.swing.JLabel tituloProduto;
    private javax.swing.JLabel tituloProduto1;
    private javax.swing.JTextField valor1;
    // End of variables declaration//GEN-END:variables
}
