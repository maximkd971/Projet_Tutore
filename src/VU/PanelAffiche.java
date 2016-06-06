package VU;
//import Modele.*;
//import Fichier.*;

import javax.swing.*;

import Modele.Agenda;
import Modele.Date;
import Modele.Evt;
import Modele.ModeleTable;

import java.io.*;
import java.awt.event.*;
import java.awt.*;

public class PanelAffiche extends JPanel
{
	/**
	 * Affiche la JTable
	 */
	
	private JTable chTable = new JTable();
	static Date date =new Date();
	public PanelAffiche()
	{
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.insets = new Insets(10,10,10,10);
		contrainte.fill = GridBagConstraints.BOTH;


		chTable.setModel(new ModeleTable());
		chTable.setRowHeight(50);
		chTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scroll = new JScrollPane(chTable);
		scroll.setPreferredSize(new Dimension(600,200));

		contrainte.gridx = 4;
		contrainte.gridy = 5;
		contrainte.ipadx = 50;
		contrainte.gridheight =50;
		contrainte.gridwidth=100;
		add(scroll,contrainte);
	}
	

}
