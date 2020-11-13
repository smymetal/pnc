package br.com.pnc.jdbc.teste;

import java.util.List;

import br.com.pnc.jdbc.dao.NcmDao;
import br.com.pnc.jdbc.model.Ncm;

public class TestaLista {

    public static void main(String[] args) {
	// cria o NcmDao
	NcmDao dao = new NcmDao();
	
	List<Ncm> listaNcm = dao.getLista("51");
	
	for(Ncm ncm: listaNcm) {
	    System.out.println("Código: " + ncm.getCodigo());
	    System.out.println("Descrição: " + ncm.getDescricao() + "\n\r");
	}

    }

}
