/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexao;
import javax.swing.JOptionPane;
import java.sql.*; // Para a execução dos comandos SQL 

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Conexao {
    
    // Definição do driver MySQL para acessar aos dados
    final private String driver = "com.mysql.jdbc.Driver";
    
    // Acesso ao "bd_clientes" no servidor
    final private String url = "jdbc:mysql://localhost/distribuidoradoces";
    
    // Usuário do MySQL - usbwebserver
    final private String usuario = "root";
    
    // Senha do MySQL - usbwebserver
    final private String senha = "";
    
    // Variável que armazena a conexão aberta
    private Connection conexao;
    
    // Variável para a execução dos comandos SQL
    public Statement statement;
    
    // Variável para armazenar o resultado de um comando SQL
    public ResultSet resultset;
   
    /* Início dos métodos de conexão */
    
    // Método de abertura
    public boolean conecta() {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não localizado." +Driver, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Fontes de dados não localizadas." +Fonte, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return result;
    }
    
    // Método de fechamento
    public void desconecta() {
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão com o banco fechada.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException fecha) {}
        
    }
    
    // Método de execução dos comandos SQL
    public void executaSQL(String sql) {
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException excecao) {
        JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro:" +excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
