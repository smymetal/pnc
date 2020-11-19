package br.com.pnc.gui;

import java.awt.CardLayout;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 * Painel para conteudo divido em camadas
 *
 * @author Smylei Charles
 */

public class LayPanel extends JLayeredPane {
    
    public LayPanel() {
	initialize();
    }
    
    private void initialize() {
	setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	setBounds(5, 5, 585, 419);
	setLayout(new CardLayout(0, 0));
    }
    
    /**
     * switch the panels
     */
    public void mudaPainel(JPanel painel) {

	removeAll();
	add(painel);
	repaint();
	revalidate();
    }

}
