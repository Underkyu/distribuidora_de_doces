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

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Produtos extends javax.swing.JFrame {
Conexao con_produtos;
Conexao con_fornecedor;
Conexao con_categoria;
    /**
     * Creates new form Clientes
     */
    public Produtos() {
        initComponents();
        con_produtos = new Conexao();
        con_produtos.conecta();
        con_produtos.executaSQL("select * from produto order by id_produto");
        con_fornecedor = new Conexao();
        con_fornecedor.conecta();
        con_fornecedor.executaSQL("select * from fornecedor order by id_fornecedor");
        con_categoria = new Conexao();
        con_categoria.conecta();
        con_categoria.executaSQL("select * from categoria order by id_categoria ");
        preenchaerTabela();
         getContentPane().setBackground(new Color(43,0,87));
        // Configurações da página
        setResizable(false);
        setLocationRelativeTo(null);
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
        Tabela_Produtos = new javax.swing.JTable();
        PesquisarProduto = new javax.swing.JTextField();
        Lupa = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabela_Forncedor = new javax.swing.JTable();
        PesquisarFornecedor = new javax.swing.JTextField();
        Lupa2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabela_Categoria = new javax.swing.JTable();
        PesquisarCategoria = new javax.swing.JTextField();
        Lupa3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Titulo3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Titulo14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AdicionarFornecedor = new javax.swing.JButton();
        Adicionarcategoria = new javax.swing.JButton();
        adicionarProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Clientes = new javax.swing.JButton();
        Produtos = new javax.swing.JToggleButton();
        Pedidos = new javax.swing.JToggleButton();
        Titulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(null);

        Tabela_Produtos.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        Tabela_Produtos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabela_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Id_fornecedor", "Id_categoria", "Nome", "Quantidade_estoque", "Quantidade_minima", "Valor"
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

        Lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/lupa.png"))); // NOI18N

        jScrollPane3.setBorder(null);

        Tabela_Forncedor.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        Tabela_Forncedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabela_Forncedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Forncedor.setRowHeight(50);
        jScrollPane3.setViewportView(Tabela_Forncedor);

        PesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarFornecedorActionPerformed(evt);
            }
        });
        PesquisarFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisarFornecedorKeyReleased(evt);
            }
        });

        Lupa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/lupa.png"))); // NOI18N

        jScrollPane4.setBorder(null);

        Tabela_Categoria.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        Tabela_Categoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tabela_Categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_Categoria.setRowHeight(50);
        Tabela_Categoria.setVerifyInputWhenFocusTarget(false);
        jScrollPane4.setViewportView(Tabela_Categoria);

        PesquisarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarCategoriaActionPerformed(evt);
            }
        });
        PesquisarCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisarCategoriaKeyReleased(evt);
            }
        });

        Lupa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/lupa.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(102, 0, 204));

        Titulo3.setBackground(new java.awt.Color(255, 255, 255));
        Titulo3.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(255, 255, 255));
        Titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo3.setText("Produtos");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/doce.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(Titulo3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Fornecedor");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/entregador.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(102, 0, 204));

        Titulo14.setBackground(new java.awt.Color(255, 255, 255));
        Titulo14.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        Titulo14.setForeground(new java.awt.Color(255, 255, 255));
        Titulo14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo14.setText("Categorias");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/categoria.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo14, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(67, 67, 67))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Titulo14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        AdicionarFornecedor.setBackground(new java.awt.Color(102, 0, 204));
        AdicionarFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        AdicionarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/mais (1).png"))); // NOI18N
        AdicionarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarFornecedorActionPerformed(evt);
            }
        });

        Adicionarcategoria.setBackground(new java.awt.Color(102, 0, 204));
        Adicionarcategoria.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Adicionarcategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/mais (1).png"))); // NOI18N
        Adicionarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarcategoriaActionPerformed(evt);
            }
        });

        adicionarProduto.setBackground(new java.awt.Color(102, 0, 204));
        adicionarProduto.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        adicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/mais (1).png"))); // NOI18N
        adicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarProdutoActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo2)
                .addGap(18, 18, 18)
                .addComponent(Clientes)
                .addGap(18, 18, 18)
                .addComponent(Produtos)
                .addGap(18, 18, 18)
                .addComponent(Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AdicionarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lupa2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
                                .addGap(18, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Adicionarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Lupa3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PesquisarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lupa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lupa))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Adicionarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PesquisarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lupa3))
                            .addGap(8, 8, 8)))
                    .addComponent(AdicionarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lupa2)
                            .addComponent(PesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarFornecedorActionPerformed

    private void PesquisarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarCategoriaActionPerformed

    private void AdicionarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarFornecedorActionPerformed
        AdicionarFornecedor tela = new AdicionarFornecedor();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AdicionarFornecedorActionPerformed

    private void AdicionarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarcategoriaActionPerformed
        AdicionarCategoria tela = new AdicionarCategoria();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AdicionarcategoriaActionPerformed

    private void PesquisarFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarFornecedorKeyReleased
        try{
            String pesquisa = "select * from fornecedor where nome_fornecedor like '"+ PesquisarFornecedor.getText()+"%'" ;
            con_fornecedor.executaSQL(pesquisa);
            
            if(con_fornecedor.resultset.first()){
                preenchaerTabela();
            }else{
                JOptionPane.showMessageDialog(null, "Não existem dados com esse parametro");
            }
        }catch(SQLException error){
                JOptionPane.showMessageDialog(null,"Dados não localizados");
        }
    }//GEN-LAST:event_PesquisarFornecedorKeyReleased

    private void PesquisarCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarCategoriaKeyReleased
        try{
            String pesquisa = "select * from categoria where nome_categoria like '"+ PesquisarCategoria.getText()+"%'" ;
            con_categoria.executaSQL(pesquisa);
            
            if(con_categoria.resultset.first()){
                preenchaerTabela();
            }else{
                JOptionPane.showMessageDialog(null, "Não existem dados com esse parametro");
            }
        }catch(SQLException error){
                JOptionPane.showMessageDialog(null,"Dados não localizados");
        }
    }//GEN-LAST:event_PesquisarCategoriaKeyReleased

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

    private void PesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarProdutoActionPerformed

    }//GEN-LAST:event_PesquisarProdutoActionPerformed

    private void adicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarProdutoActionPerformed
        AdicionarProduto tela = new AdicionarProduto();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_adicionarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
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
        
        
        
        DefaultTableModel modelo2 = (DefaultTableModel) Tabela_Forncedor.getModel();
        modelo2.setNumRows(0);
        
        try {
            con_fornecedor.resultset.beforeFirst();
            while(con_fornecedor.resultset.next()){
                modelo2.addRow(new Object[]{
                    con_fornecedor.resultset.getString("id_fornecedor"),con_fornecedor.resultset.getString("nome_fornecedor"),con_fornecedor.resultset.getString("endereco_fornecedor"), con_fornecedor.resultset.getString("telefone_fornecedor")
                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao listar a tabela");
        }
        
        DefaultTableModel modelo3 = (DefaultTableModel) Tabela_Categoria.getModel();
        modelo3.setNumRows(0);
        
        try {
            con_categoria.resultset.beforeFirst();
            while(con_categoria.resultset.next()){
                modelo3.addRow(new Object[]{
                    con_categoria.resultset.getString("id_categoria"),con_categoria.resultset.getString("nome_categoria")
                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao listar a tabela");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarFornecedor;
    private javax.swing.JButton Adicionarcategoria;
    private javax.swing.JButton Clientes;
    private javax.swing.JLabel Lupa;
    private javax.swing.JLabel Lupa2;
    private javax.swing.JLabel Lupa3;
    private javax.swing.JToggleButton Pedidos;
    private javax.swing.JTextField PesquisarCategoria;
    private javax.swing.JTextField PesquisarFornecedor;
    private javax.swing.JTextField PesquisarProduto;
    private javax.swing.JToggleButton Produtos;
    private javax.swing.JTable Tabela_Categoria;
    private javax.swing.JTable Tabela_Forncedor;
    private javax.swing.JTable Tabela_Produtos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo14;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JButton adicionarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
