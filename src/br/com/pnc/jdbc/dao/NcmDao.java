package br.com.pnc.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.pnc.jdbc.ConnectionFactory;
import br.com.pnc.jdbc.model.Ncm;

public class NcmDao {
    
    // conexao com o bd
    private Connection conn;
    
    public NcmDao() {
	this.conn = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Ncm ncm) {
	
	String sql = "INSERT INTO tb_ncm" +
	"(codigo,descricao)" +
		"VALUES(?,?)";
	
	try {
	    // prepare statment para insecao
	    PreparedStatement stmt = conn.prepareStatement(sql);
	    
	    // seta valores
	    stmt.setString(1, ncm.getCodigo());
	    stmt.setString(2, ncm.getDescricao());
	    
	    // executa
	    stmt.execute();
	    stmt.close();
	    
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
    public Ncm getNcm(String codigo){
	
	try {
	    Ncm ncm = new Ncm();
	    PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM tb_ncm WHERE codigo = ?");
	    stmt.setString(1, codigo);
	    ResultSet rs = stmt.executeQuery();
	    
	    while(rs.next()) {
		// criando o objeto ncm		
		ncm.setId(rs.getLong("id"));
		ncm.setCodigo(rs.getString("codigo"));
		ncm.setDescricao(rs.getString("descricao"));		
	    }
	    
	    rs.close();
	    stmt.close();
	    
	    return ncm;
	    
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
    public List<Ncm> getLista(){
	
	try {
	    List<Ncm> listNcm = new ArrayList<Ncm>();
	    PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM tb_ncm");
	    ResultSet rs = stmt.executeQuery();
	    
	    while(rs.next()) {
		// criando o objeto ncm
		Ncm ncm = new Ncm();
		ncm.setId(rs.getLong("id"));
		ncm.setCodigo(rs.getString("codigo"));
		ncm.setDescricao(rs.getString("descricao"));
		
		// adiciona a lista
		listNcm.add(ncm);
	    }
	    
	    rs.close();
	    stmt.close();
	    
	    return listNcm;
	    
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
    public List<Ncm> getLista(String codigo){
	
	try {
	    List<Ncm> listNcm = new ArrayList<Ncm>();
	    PreparedStatement stmt = this.conn.prepareStatement("SELECT * FROM tb_ncm WHERE codigo LIKE ?");
	    stmt.setString(1, codigo + '%');
	    ResultSet rs = stmt.executeQuery();
	    
	    while(rs.next()) {
		// criando o objeto ncm
		Ncm ncm = new Ncm();
		ncm.setId(rs.getLong("id"));
		ncm.setCodigo(rs.getString("codigo"));
		ncm.setDescricao(rs.getString("descricao"));
		
		// adiciona a lista
		listNcm.add(ncm);
	    }
	    
	    rs.close();
	    stmt.close();
	    
	    return listNcm;
	    
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
    public void altera (Ncm ncm) {
	String sql = "UPDATE tb_ncm SET codigo=?,descricao=? WHERE id=?";
	
	try {
	    PreparedStatement stmt = conn.prepareStatement(sql);
	    stmt.setString(1, ncm.getCodigo());
	    stmt.setString(2, ncm.getDescricao());
	    stmt.setLong(3, ncm.getId());
	    
	    stmt.execute();
	    stmt.close();
	    
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }
    
    public void remove (Ncm ncm) {
	try {
	    PreparedStatement stmt = conn
		    .prepareStatement("DELETE FROM tb_ncm WHERE id = ?");
	    stmt.setLong(1, ncm.getId());
	    stmt.execute();
	    stmt.close();
	} catch (SQLException e) {
	    throw new RuntimeException(e);
	}
    }

}
