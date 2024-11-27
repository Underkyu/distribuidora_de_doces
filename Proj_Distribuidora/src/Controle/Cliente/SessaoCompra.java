/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle.Cliente;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aange
 */
public class SessaoCompra {
    private DefaultTableModel modeloTabela;
    private double totalCompra;

    public SessaoCompra() {
        this.modeloTabela = new DefaultTableModel(new Object[]{"Produto", "Preço", "Quantidade", "Total"}, 0);
        this.totalCompra = 0.0;
    }

    public DefaultTableModel getModeloTabela() {
        return modeloTabela;
    }

    public void adicionarProduto(String nomeProduto, double preco, int quantidade) {
        double total = preco * quantidade;
        modeloTabela.addRow(new Object[]{nomeProduto, preco, quantidade, total});
        totalCompra += total;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void limparCompra() {
        modeloTabela.setRowCount(0);
        totalCompra = 0.0;
    }
    
    public void removerProduto(int rowIndex) {
        double valorRemovido = (double) modeloTabela.getValueAt(rowIndex, 3); // Obtém o valor total da linha
        totalCompra -= valorRemovido; // Subtrai do total da compra
        modeloTabela.removeRow(rowIndex); // Remove a linha do modelo
    }

}

