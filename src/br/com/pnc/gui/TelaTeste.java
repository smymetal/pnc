package br.com.pnc.gui;

import java.awt.FlowLayout;

import javax.swing.JInternalFrame;

public class TelaTeste extends JInternalFrame {

    /**
     * Create the frame.
     */
    public TelaTeste() {
		
	//setBounds(10, 10, 450, 250);
        setClosable(true);
        setTitle("Tela de Teste");
        setLayout(new FlowLayout());
        pack();

    }

}
