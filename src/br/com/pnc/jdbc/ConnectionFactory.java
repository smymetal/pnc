package br.com.pnc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
	try {
	    return DriverManager.getConnection("jdbc:sqlite:pnc.db");
	} catch (SQLException e) {
	    // TODO: handle exception
	    throw new RuntimeException(e);
	}
    }

}
