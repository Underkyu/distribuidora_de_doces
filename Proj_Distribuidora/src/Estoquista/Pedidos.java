/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Estoquista;

import java.awt.Color;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Pedidos extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Pedidos() {
        initComponents();
         getContentPane().setBackground(new Color(255,255,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Pedidos = new javax.swing.JTable();
        Pesquisar = new javax.swing.JTextField();
        Lupa = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabela_Pedidos2 = new javax.swing.JTable();
        Pesquisar2 = new javax.swing.JTextField();
        Lupa2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Pedidos");

        jScrollPane1.setBorder(null);

        Tabela_Pedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabela_Pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Id_cliente", "Data", "Valor_total", "Status_pedido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabela_Pedidos);

        Pesquisar.setText("Pesquisar\n");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Estoquista/lupa.png"))); // NOI18N

        Titulo1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Produto vendido");

        jScrollPane3.setBorder(null);

        Tabela_Pedidos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabela_Pedidos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Id_pedido", "Id_produito", "Quantidade", "Preço_final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Tabela_Pedidos2);

        Pesquisar2.setText("Pesquisar\n");
        Pesquisar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesquisar2ActionPerformed(evt);
            }
        });

        Lupa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Estoquista/lupa.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lupa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lupa2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lupa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pesquisar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lupa2))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarActionPerformed

    private void Pesquisar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesquisar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pesquisar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lupa;
    private javax.swing.JLabel Lupa2;
    private javax.swing.JTextField Pesquisar;
    private javax.swing.JTextField Pesquisar2;
    private javax.swing.JTable Tabela_Pedidos;
    private javax.swing.JTable Tabela_Pedidos2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
