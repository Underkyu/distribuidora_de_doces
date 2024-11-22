/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle.Estoque;

import java.awt.Color;
import Conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class AdicionarFornecedor extends javax.swing.JFrame {
Conexao con_produtos;
Conexao con_fornecedor;
Conexao con_categoria;
    /**
     * Creates new form Clientes
     */
    public AdicionarFornecedor() {
        initComponents();
        con_produtos = new Conexao();
        con_produtos.conecta();
         getContentPane().setBackground(new Color(43,0,87));
         setLocationRelativeTo(null);
        Produtos.setBorderPainted(false);        // Remove a borda
        Produtos.setContentAreaFilled(false);    // Remove o fundo
        Fornecedor.setBorderPainted(false);        // Remove a borda
        Fornecedor.setContentAreaFilled(false);    // Remove o fundo
        Categoria.setBorderPainted(false);        // Remove a borda
        Categoria.setContentAreaFilled(false);    // Remove o fundo
        Voltar.setBorderPainted(false);        // Remove a borda
        Voltar.setContentAreaFilled(false);    // Remove o fundo
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
        nomeForncedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefoneFornecedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Fornecedor = new javax.swing.JButton();
        Produtos = new javax.swing.JToggleButton();
        Categoria = new javax.swing.JToggleButton();
        Titulo = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 0, 204));

        Titulo3.setBackground(new java.awt.Color(255, 255, 255));
        Titulo3.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(255, 255, 255));
        Titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo3.setText("Cadastrar Fornecedor");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/entregador.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(Titulo3)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(96, 96, 96))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Telefone");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Endereço");

        jButton1.setBackground(new java.awt.Color(102, 0, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar\n");

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
                .addContainerGap(88, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeForncedor)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telefoneFornecedor)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nomeForncedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6))
                .addGap(76, 76, 76)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AdicionarFornecedor().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Categoria;
    private javax.swing.JButton Fornecedor;
    private javax.swing.JToggleButton Produtos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField nomeForncedor;
    private javax.swing.JTextField telefoneFornecedor;
    // End of variables declaration//GEN-END:variables
}