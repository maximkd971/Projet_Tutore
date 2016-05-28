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
	 * Classe du panneau qui permet d'ajouter de nouveaux evenement à l'agenda et d'afficher l'agenda
	 */
	
	private JTable chTable = new JTable();
	
	
	
	
	
	static Date date =new Date();
	public PanelAffiche()
	{
		
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.insets = new Insets(10,10,10,10);
		contrainte.fill = GridBagConstraints.BOTH;
		//ajout.addActionListener(this);
		
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
	
//	public void actionPerformed(ActionEvent parE)
//	{
//		
//		if(parE.getSource()== ajout)
//		{
//			Evt evt = new Evt(date,zoneTitre.getText(),zoneLieu.getText());
//			agenda.ajout(zoneTitre.getText(),evt);
//			
//			chTable.setModel(new ModeleTable());
//		}
//	}
//	/**
//	 * Modifie le champ date
//	 * @param parDate
//	 */
//	public static void setDate (Date parDate)
//	{
//		date = parDate;
//		labelDate.setText(date.toString());
//	}
//	
//	public Agenda getAgenda() {
//		return agenda;
//	}
//
//	public void setAgenda(Agenda agenda) {
//		this.agenda = agenda;
//	}
}
