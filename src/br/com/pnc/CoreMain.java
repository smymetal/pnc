package br.com.pnc;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.com.pnc.gui.TelaPrincipal;

/**
 * Classe principal que inicia a aplicacao
 *
 * @author Smylei Charles
 */

public class CoreMain {

    /*
     * Metodo principal que inicia a aplicacao
     */
    public static void main(String[] args) {	
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    lookAndFeel();
		    TelaPrincipal tela = new TelaPrincipal();
		    tela.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});

    }

    private static void lookAndFeel() {
	try {
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    JDialog.setDefaultLookAndFeelDecorated(true);
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | UnsupportedLookAndFeelException e) {
	    JOptionPane.showMessageDialog(null, e, "ERRO", JOptionPane.ERROR_MESSAGE);
	    System.out.println(e.getMessage());
	}
    }

}
