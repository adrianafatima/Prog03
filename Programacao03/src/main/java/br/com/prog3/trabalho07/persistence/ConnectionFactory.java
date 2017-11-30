package br.com.prog3.trabalho07.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection createConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/aluno";
		String user = "root";
		String password = "admin";
		
		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);
		
		return conexao;
	}
}
