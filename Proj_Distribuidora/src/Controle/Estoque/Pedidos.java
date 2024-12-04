/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle.Estoque;

import Conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Pedidos extends javax.swing.JFrame {
    Conexao con_pedidos;
    Conexao con_produto_vendido;
    /**
     * Creates new form Clientes
     */
    public Pedidos() {
        initComponents();
        con_pedidos = new Conexao();
        con_pedidos.conecta();
        con_pedidos.executaSQL("select * from pedido order by id_pedido");
        con_produto_vendido = new Conexao();
        con_produto_vendido.conecta();
        con_produto_vendido.executaSQL("select * from item_pedido order by id_prod_vendido");
        preenchaerTabela();
         getContentPane().setBackground(new Color(43,0,87));
         setLocationRelativeTo(null);
         Codigo.setVisible(false);
         Clientes.setBorderPainted(false);        // Remove a borda
        Clientes.setContentAreaFilled(false);    // Remove o fundo
        Produtos.setBorderPainted(false);        // Remove a borda
        Produtos.setContentAreaFilled(false);    // Remove o fundo
        Pedidos.setBorderPainted(false);        // Remove a borda
        Pedidos.setContentAreaFilled(false);    // Remove o fundo
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Pedidos = new javax.swing.JTable();
        PesquisarPedidos = new javax.swing.JTextField();
        Lupa = new javax.swing.JLabel();
        PesquisarProdutoVendido = new javax.swing.JTextField();
        Lupa2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Titulo3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabela_Produtos_Pedidos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Clientes = new javax.swing.JButton();
        Produtos = new javax.swing.JToggleButton();
        Pedidos = new javax.swing.JToggleButton();
        Titulo2 = new javax.swing.JLabel();
        Status_Pedido = new javax.swing.JComboBox<>();
        Codigo = new javax.swing.JTextField();
        Atualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(null);

        Tabela_Pedidos.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        Tabela_Pedidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        Tabela_Pedidos.setRowHeight(50);
        Tabela_Pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_PedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Pedidos);

        PesquisarPedidos.setText(" ");
        PesquisarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarPedidosActionPerformed(evt);
            }
        });
        PesquisarPedidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisarPedidosKeyReleased(evt);
            }
        });

        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/lupa.png"))); // NOI18N

        PesquisarProdutoVendido.setText(" ");
        PesquisarProdutoVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarProdutoVendidoActionPerformed(evt);
            }
        });
        PesquisarProdutoVendido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisarProdutoVendidoKeyReleased(evt);
            }
        });

        Lupa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/lupa.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Pedidos");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/carrinho-carrinho (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 204));

        Titulo3.setBackground(new java.awt.Color(255, 255, 255));
        Titulo3.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(255, 255, 255));
        Titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo3.setText("Produto vendido");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/moedas-de-dolar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane3.setBorder(null);

        Tabela_Produtos_Pedidos.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        Tabela_Produtos_Pedidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabela_Produtos_Pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Id_pedido", "Nome_produto", "Preco", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Produtos_Pedidos.setRowHeight(50);
        jScrollPane3.setViewportView(Tabela_Produtos_Pedidos);

        jPanel2.setBackground(new java.awt.Color(102, 0, 204));

        Clientes.setBackground(new java.awt.Color(102, 0, 204));
        Clientes.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Clientes.setText("Clientes");
        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
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

        Pedidos.setBackground(new java.awt.Color(102, 0, 204));
        Pedidos.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        Pedidos.setForeground(new java.awt.Color(255, 255, 255));
        Pedidos.setText("Pedidos");
        Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidosActionPerformed(evt);
            }
        });

        Titulo2.setBackground(new java.awt.Color(255, 255, 255));
        Titulo2.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/icone.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addComponent(Titulo2)
                .addGap(18, 18, 18)
                .addComponent(Clientes)
                .addGap(18, 18, 18)
                .addComponent(Produtos)
                .addGap(18, 18, 18)
                .addComponent(Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(436, 436, 436))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clientes)
                            .addComponent(Produtos)
                            .addComponent(Pedidos))))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        Status_Pedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Concluído", "Pendente" }));
        Status_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Status_PedidoActionPerformed(evt);
            }
        });

        Atualizar.setBackground(new java.awt.Color(102, 0, 204));
        Atualizar.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 18)); // NOI18N
        Atualizar.setForeground(new java.awt.Color(255, 255, 255));
        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lupa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PesquisarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Status_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Atualizar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lupa2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PesquisarProdutoVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lupa)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PesquisarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Status_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Atualizar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PesquisarProdutoVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lupa2))))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarPedidosActionPerformed

    private void PesquisarProdutoVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarProdutoVendidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarProdutoVendidoActionPerformed

    private void PesquisarPedidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarPedidosKeyReleased
        try{
            String pesquisa = "select * from pedido where id_pedido  like "+ PesquisarPedidos.getText() ;
            con_pedidos.executaSQL(pesquisa);
            
            if(con_pedidos.resultset.first()){
                preenchaerTabela();
            }else{
                JOptionPane.showMessageDialog(null, "Não existem dados com esse parametro");
            }
        }catch(SQLException error){
                JOptionPane.showMessageDialog(null,"Dados não localizados");
        }
    }//GEN-LAST:event_PesquisarPedidosKeyReleased

    private void PesquisarProdutoVendidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarProdutoVendidoKeyReleased
      try{
            String pesquisa = "select * from item_pedido where id_prod_vendido  like "+ PesquisarProdutoVendido.getText() ;
            con_produto_vendido.executaSQL(pesquisa);
            
            if(con_produto_vendido.resultset.first()){
                preenchaerTabela();
            }else{
                JOptionPane.showMessageDialog(null, "Não existem dados com esse parametro");
            }
        }catch(SQLException error){
                JOptionPane.showMessageDialog(null,"Dados não localizados");
        }
    }//GEN-LAST:event_PesquisarProdutoVendidoKeyReleased

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        Clientes tela = new Clientes();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ClientesActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        Produtos tela = new Produtos();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ProdutosActionPerformed

    private void PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidosActionPerformed
        Pedidos tela = new Pedidos();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_PedidosActionPerformed

    private void Status_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Status_PedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Status_PedidoActionPerformed

    private void Tabela_PedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_PedidosMouseClicked
        int linha_selecionada = Tabela_Pedidos.getSelectedRow();
        Codigo.setText(Tabela_Pedidos.getValueAt(linha_selecionada, 0).toString());
    }//GEN-LAST:event_Tabela_PedidosMouseClicked

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
       String status = Status_Pedido.getSelectedItem().toString();
       
       try{
          String insert_sql="update pedido set status_pedido='"+status+"' where id_pedido = "+Codigo.getText();
                System.out.println(insert_sql);
                con_pedidos.executaSQL("select * from pedido order by id_pedido");
                con_pedidos.statement.executeUpdate(insert_sql);
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
                Pedidos tela =  new Pedidos();
                tela.setVisible(true);
                setVisible(false);
       }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
            System.out.println(erro);
        }
    }//GEN-LAST:event_AtualizarActionPerformed

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
    
        public void preenchaerTabela(){
        /*Tabela_Pedidos.getColumnModel().getColumn(1).setPreferredWidth(150);
        Tabela_Pedidos.getColumnModel().getColumn(2).setPreferredWidth(150);
        Tabela_Pedidos.getColumnModel().getColumn(3).setPreferredWidth(150);
        Tabela_Pedidos.getColumnModel().getColumn(4).setPreferredWidth(200);
        Tabela_Pedidos.getColumnModel().getColumn(5).setPreferredWidth(150);
        Tabela_Pedidos.getColumnModel().getColumn(6).setPreferredWidth(125);*/
        
        DefaultTableModel modelo = (DefaultTableModel) Tabela_Pedidos.getModel();
        modelo.setNumRows(0);
        
        try {
            con_pedidos.resultset.beforeFirst();
            while(con_pedidos.resultset.next()){
                modelo.addRow(new Object[]{
                    con_pedidos.resultset.getString("id_pedido"),con_pedidos.resultset.getString("id_cliente"),con_pedidos.resultset.getString("data"), con_pedidos.resultset.getString("valor_total"), con_pedidos.resultset.getString("status_pedido")
                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao listar a tabela");
        }
        
        
        
        DefaultTableModel modelo2 = (DefaultTableModel) Tabela_Produtos_Pedidos.getModel();
        modelo2.setNumRows(0);
        
        try {
            con_produto_vendido.resultset.beforeFirst();
            while(con_produto_vendido.resultset.next()){
                modelo2.addRow(new Object[]{
                    con_produto_vendido.resultset.getString("id_prod_vendido"),con_produto_vendido.resultset.getString("id_pedido"),con_produto_vendido.resultset.getString("nome_produto"),con_produto_vendido.resultset.getString("preco"), con_produto_vendido.resultset.getString("quantidade"), con_produto_vendido.resultset.getString("total")
                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao listar a tabela");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Clientes;
    private javax.swing.JTextField Codigo;
    private javax.swing.JLabel Lupa;
    private javax.swing.JLabel Lupa2;
    private javax.swing.JToggleButton Pedidos;
    private javax.swing.JTextField PesquisarPedidos;
    private javax.swing.JTextField PesquisarProdutoVendido;
    private javax.swing.JToggleButton Produtos;
    private javax.swing.JComboBox<String> Status_Pedido;
    private javax.swing.JTable Tabela_Pedidos;
    private javax.swing.JTable Tabela_Produtos_Pedidos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
