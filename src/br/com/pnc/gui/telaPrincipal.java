package br.com.pnc.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class telaPrincipal extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public telaPrincipal() {
    	setResizable(false);
	initComponents();
    }
    
    private void initComponents() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 600, 474);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	setTitle("Product NCM Check version 0.1.2");
	setFont(new Font("Tahoma", Font.PLAIN, 11));
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	JMenu mnArquivo = new JMenu("Arquivo");
	menuBar.add(mnArquivo);
	
	JMenuItem mntmAbrir = new JMenuItem("Abrir");
	mntmAbrir.addActionListener(menuActionListener);
	mnArquivo.add(mntmAbrir);
	
	JMenuItem mntmSair = new JMenuItem("Sair");
	mntmSair.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		System.exit(EXIT_ON_CLOSE);		
	    }
	});
	mnArquivo.add(mntmSair);
	
	JMenu mnFerramentas = new JMenu("Ferramentas");
	menuBar.add(mnFerramentas);
	
	JMenu mnSobre = new JMenu("Sobre");
	menuBar.add(mnSobre);

    }
    
	/*
	 * listener de acoes do menu
	 */
	ActionListener menuActionListener = new ActionListener() {
	    public void actionPerformed(ActionEvent actionEvent) {
		AbstractButton aButton = (AbstractButton) actionEvent.getSource();		
		
		switch (aButton.getText()) {
		case "Abrir":
		    showTelaTeste();
		    break;
		case "MP Layout":

		    break;
		case "AloeBaf Layout":

		    break;
		case "Ekologica Layout":

		    break;

		default:

		    break;
		}
	    }
	};
	
	/*
	 * listener de acoes dos botoes
	 */
	ActionListener butaoActionListener = new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		AbstractButton absButton = (AbstractButton) e.getSource();

		if ( absButton.getText() == "Arquivo" ) {

		}else if ( absButton.getText() == "Salvar" ) {

		}else if(absButton.getText() == "Config") {
		}
	    }
	};
	
	private void showTelaTeste() {
	    TelaTeste tt = new TelaTeste();
	    contentPane.add(tt);
	    tt.setVisible(true);
	}
}
