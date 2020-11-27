package br.com.pnc.gui.painel;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestePainel extends JPanel{
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

	public TestePainel() {
		//setLayout(null);
		//setSize(300, 200);
		//setBounds(0, 0, 380, 240);
		JLabel lblTeste = new JLabel("Teste");
		lblTeste.setBounds(199, 138, 27, 14);
		add(lblTeste);
	}
}
