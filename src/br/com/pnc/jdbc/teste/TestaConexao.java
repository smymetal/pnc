package br.com.pnc.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.pnc.jdbc.ConnectionFactory;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {
	Connection conn = new ConnectionFactory().getConnection();
	System.out.println("Conexão aberta!");
	conn.close();

    }

}
