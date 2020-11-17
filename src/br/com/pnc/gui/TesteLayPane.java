package br.com.pnc.gui;

import java.awt.CardLayout;

import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;

public class TesteLayPane extends JLayeredPane {
    
    public TesteLayPane() {
	initialize();
    }
    
    private void initialize() {
	setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	setBounds(10, 10, 572, 399);
	setLayout(new CardLayout(0, 0));
    }

}
