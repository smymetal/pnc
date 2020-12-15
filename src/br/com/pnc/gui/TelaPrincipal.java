package br.com.pnc.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.pnc.gui.painel.SearchNcmForm;
import br.com.pnc.gui.painel.TestePainel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 * GUI principal da aplicacao
 *
 * @author Smylei Charles
 */

public class TelaPrincipal extends JFrame {
    
    /**
     * Auto gen serialUID
     */
    private static final long serialVersionUID = -6759198433135382698L;

    private JPanel contentPane;
    private LayPanel paineis;

    /**
     * Create the frame.
     */
    public TelaPrincipal() {
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
	setTitle("Product NCM Check version 0.1.6");
	setFont(new Font("Tahoma", Font.PLAIN, 11));
	
	paineis = new LayPanel();
	getContentPane().add(paineis);
	
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
	
	JMenuItem mntmSearchNcm = new JMenuItem("Pesquisa por NCM");
	mntmSearchNcm.addActionListener(menuActionListener);
	mnFerramentas.add(mntmSearchNcm);
	
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
		    TestePainel p1 = new TestePainel();
		    showPainelWin(TelaPrincipal.this ,p1 , "Teste Outra janela", new Dimension(480, 200));
		    //showTelaTeste();
		    break;
		case "Pesquisa por NCM":
		    
		    SearchNcmForm ncmForm = new SearchNcmForm();
		    paineis.mudaPainel(ncmForm);

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
	
	private void showPainelWin(JFrame parentFrame, JPanel painel, String tittle, Dimension size) {	    
	    
	    final JDialog df = new JDialog(parentFrame, tittle, true);
	    df.setBounds(10, 10, 480, 240);
	    df.setPreferredSize(size);
	    df.setLocationRelativeTo(parentFrame);
	    df.getContentPane().add(painel);
	    df.pack();
	    df.setVisible(true);
	}
	
	private void showTelaTeste() {
	    TelaTeste tt = new TelaTeste();
	    contentPane.add(tt);
	    tt.setVisible(true);
	    try {
		tt.setMaximum(true);
		
	    } catch (Exception e) {
		// TODO: handle exception
	    }
	    
	}
}
