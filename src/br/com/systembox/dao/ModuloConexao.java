/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * importar o conjunto de bibliotecas
 */
package br.com.systembox.dao;

import java.sql.*;

/**
 * Módulo responsável por estabelecer conexao com o banco
 * @author Felipe Chagas
 */
public class ModuloConexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        //Informações referente ao banco de dados
        String url = "jdbc:mysql://localhost:3306/devboxdb";
        String user = "root";
        String password = "1234";
        //Estabelencendo conexão com o banco
        try {
            Class.forName(driver); //executa o arquivo do driver
            conexao = DriverManager.getConnection(url,user,password); //obtem a conexao pelos paramentros
            return conexao;
        } catch (Exception erro) {
            //System.out.println(erro);
            return null;
        }
    }
    
}
