/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controle;


import Conexao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Karinne Angelo dos Santos Ventura - 2° DS AMS (ETEC ZONA LESTE)
 */

public class Carrinho extends javax.swing.JFrame {

    public Carrinho() {
        // Inicialização dos componentes do JFrame
        initComponents();
        
        // Define o ícone da janela
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Controle/Imagens/icon.png")));

        // Config das propriedades da página
        setResizable(false);
        setLocationRelativeTo(null);
        
        // Mudar a cor do fundo
        getContentPane().setBackground(new Color(43, 0, 87));
        
    }
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menu = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(102, 0, 204));
        menu.setForeground(new java.awt.Color(102, 0, 204));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/icone.png"))); // NOI18N

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

        imagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/customer.png"))); // NOI18N

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
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/deletarBotao.png"))); // NOI18N
        botaoExcluir.setText("Excluir Produto");

        botaoVoltar.setBackground(new java.awt.Color(43, 0, 87));
        botaoVoltar.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/voltarBotao.png"))); // NOI18N
        botaoVoltar.setText("Voltar");

        botaoFinalizar2.setBackground(new java.awt.Color(43, 0, 87));
        botaoFinalizar2.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 14)); // NOI18N
        botaoFinalizar2.setForeground(new java.awt.Color(255, 255, 255));
        botaoFinalizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Controle/Imagens/finalizarBotao.png"))); // NOI18N
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

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(imagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(imagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método main
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoFinalizar2;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campOtELEFONE1;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel imagem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JTable tabelaCompra;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel tituloCPF;
    private javax.swing.JLabel tituloEndereco;
    private javax.swing.JLabel tituloNome;
    private javax.swing.JLabel tituloTelefone;
    private javax.swing.JLabel titulotELEFONE1;
    // End of variables declaration//GEN-END:variables
}
