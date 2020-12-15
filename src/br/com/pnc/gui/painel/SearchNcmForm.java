package br.com.pnc.gui.painel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.AbstractButton;
import javax.swing.JButton;

public class SearchNcmForm extends JPanel{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextField inptNcm;

    public SearchNcmForm() {
	setLayout(null);

	JLabel lblBuscar = new JLabel("Buscar");
	lblBuscar.setForeground(Color.BLUE);
	lblBuscar.setBounds(46, 46, 32, 14);
	add(lblBuscar);

	JSeparator separator = new JSeparator();
	separator.setBounds(88, 58, 306, 2);
	add(separator);

	JLabel lblCdigoNcm = new JLabel("C\u00F3digo NCM:");
	lblCdigoNcm.setBounds(88, 93, 71, 14);
	add(lblCdigoNcm);

	inptNcm = new JTextField();
	inptNcm.setBounds(169, 90, 86, 20);
	add(inptNcm);
	inptNcm.setColumns(10);

	JButton btnBuscarNcm = new JButton("Buscar");
	btnBuscarNcm.setBounds(303, 245, 91, 23);
	btnBuscarNcm.addActionListener(butaoActionListener);
	add(btnBuscarNcm);
    }

    /*
     * listener de acoes dos botoes
     */
    ActionListener butaoActionListener = new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	    AbstractButton absButton = (AbstractButton) e.getSource();

	    if ( absButton.getText() == "Buscar" ) {
		JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(SearchNcmForm.this), "Clicou Buscar", "Mensagen", JOptionPane.INFORMATION_MESSAGE);

	    }
	}
    };
}
