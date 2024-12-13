/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Conexao;
import javax.swing.JOptionPane;
import java.sql.*; // Para a execução dos comandos SQL 

/**
 *
 * @author Maria Eduarda
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
    public Connection conexao;
    
    // Variável para a execução dos comandos SQL
    public Statement statement;
    
    // Variável para armazenar o resultado de um comando SQL
    public ResultSet resultset;
   
    /* Início dos métodos de conexão */
    
    // Método de abertura
   public Connection conecta() {
    try {
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao; // Retorna a conexão
    } catch (ClassNotFoundException Driver) {
        JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        return null; // Retorna null em caso de erro
    } catch (SQLException Fonte) {
        JOptionPane.showMessageDialog(null, "Fontes de dados não localizadas: " + Fonte, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        return null; // Retorna null em caso de erro
        
        
    }
    
}

    
    // Método de fechamento
    public void desconecta () {
        try {
            conexao.close();
        } catch (SQLException fecha) {}
        
    }
    
    // Método de execução dos comandos SQL
    public void executaSQL (String sql) {
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException excecao) {
        }
    }

    public com.mysql.jdbc.PreparedStatement prepareStatement(String insert_sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
