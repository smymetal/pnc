package br.com.pnc.jdbc.teste;

import br.com.pnc.jdbc.dao.NcmDao;
import br.com.pnc.jdbc.model.Ncm;

public class TestaGetNcmPorId {

    public static void main(String[] args) {
	// cria o NcmDao
	NcmDao dao = new NcmDao();
	
	Ncm ncm = dao.getNcm("0202");
	
	System.out.println("Código: " + ncm.getCodigo());
	System.out.println("Descrição: " + ncm.getDescricao() + "\n\r");
    }

}
