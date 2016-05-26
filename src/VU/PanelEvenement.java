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

public class PanelEvenement extends JPanel implements ActionListener,Serializable
{
	/**
	 * Classe du panneau qui permet d'ajouter de nouveaux evenement à l'agenda et d'afficher l'agenda
	 */
	private static final long serialVersionUID = 1L;
	static JLabel labelDate;
	
	//Les differentes etiquettes 
	private JLabel labelLieu; 
	private JLabel labelTitre;
	private JLabel labelDebut;
	private JLabel labelFin;
	private JLabel labelDescription;
	private JLabel separation = new JLabel(":");
	private JLabel separation1 = new JLabel(":");
	
	// les tableaux des heures et des minutes  
	private String[] heures = {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
	private String[]minutes = {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"};
	
	//les zones de saisie ou d'affichage 
	private JTextField zoneLieu = new JTextField(10);
	private JTextField zoneTitre = new JTextField(10);
	private JTextArea description = new JTextArea(10,10);
	private JTextArea zoneAffichage = new JTextArea(2,2);
	private JScrollPane scrollPane = new JScrollPane(description);
	private JComboBox heureDebut = new JComboBox(heures);
	private JComboBox minutesDebut = new JComboBox(minutes);
	private JComboBox heureFin = new JComboBox(heures);
	private JComboBox minutesFin = new JComboBox(minutes);
	private JButton ajout = new JButton ("+");
	private JTable chTable = new JTable();
	public static Agenda agenda = new Agenda();
	
	
	
	
	static Date date =new Date();
	public PanelEvenement()
	{
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.insets = new Insets(10,10,10,10);
		contrainte.fill = GridBagConstraints.BOTH;
//		contrainte.gridx = 0;	// 1e rang, date + btn+
//		contrainte.gridy = 0;
//		contrainte.gridwidth = 2;
//		labelDate = new JLabel(date.toString());
//		add(labelDate,contrainte);
//		contrainte.gridwidth = 1;
//		contrainte.gridx = 3;
//		add(ajout,contrainte);
//		
//		// 2e rang : Titre
//		labelTitre = new JLabel("Titre");
//		contrainte.gridx = 0;
//		contrainte.gridy = 1;
//		contrainte.gridwidth = 1;
//		add(labelTitre,contrainte);
//		contrainte.gridx = 1;
//		contrainte.gridy = 1;
//		contrainte.gridwidth = 3;
//		add(zoneTitre,contrainte);
//		
//		// 3e rang : lieu
//		labelLieu = new JLabel("Lieu");
//		contrainte.gridx = 0;
//		contrainte.gridy = 2;
//		contrainte.gridwidth = 1;
//		add(labelLieu,contrainte);
//		contrainte.gridx = 1;
//		contrainte.gridy = 2;
//		contrainte.gridwidth = 3;
//		add(zoneLieu,contrainte);
//		
//		//4eme rang : Debut
//		labelDebut = new JLabel("Debut");
//		contrainte.gridx = 0;
//		contrainte.gridy = 3;
//		contrainte.gridwidth = 1;
//		add(labelDebut,contrainte);
//		contrainte.gridx = 1;
//		contrainte.gridy = 3;
//		contrainte.gridwidth = 1;
//		add(heureDebut,contrainte);
//		contrainte.gridx = 2;
//		contrainte.gridy = 3;
//		contrainte.gridwidth = 1;
//		add(separation,contrainte);
//		contrainte.gridx = 3;
//		contrainte.gridy = 3;
//		contrainte.gridwidth = 1;
//		add(minutesDebut,contrainte);
		
//		//5eme rang : Fin
//		labelFin = new JLabel("Fin");
//		contrainte.gridx = 0;
//		contrainte.gridy = 4;
//		contrainte.gridwidth = 1;
//		add(labelFin,contrainte);
//		contrainte.gridx = 1;
//		contrainte.gridy = 4;
//		contrainte.gridwidth = 1;
//		add(heureFin,contrainte);
//		contrainte.gridx = 2;
//		contrainte.gridy = 4;
//		contrainte.gridwidth = 1;
//		add(separation1,contrainte);
//		contrainte.gridx = 3;
//		contrainte.gridy = 4;
//		contrainte.gridwidth = 1;
//		add(minutesFin,contrainte);
		
//		//6eme rang : description
//		labelDescription = new JLabel("Description");
//		contrainte.gridx = 0;
//		contrainte.gridy = 5;
//		contrainte.gridwidth = 1;
//		add(labelDescription,contrainte);
//		contrainte.gridx = 0;
//		contrainte.gridy = 6;
//		contrainte.gridwidth = 4;
		//add(scrollPane,contrainte);
		
		
		ajout.addActionListener(this);
		
		chTable.setModel(new ModeleTable(agenda,date));
		chTable.setRowHeight(50);
		chTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scroll = new JScrollPane(chTable);
		scroll.setPreferredSize(new Dimension(600,200));
		
		contrainte.gridx = 4;
		contrainte.gridy = 0;
		contrainte.ipadx = 50;
		contrainte.gridheight =200;
		contrainte.gridwidth=100;
		add(scroll,contrainte);
		
		
	}
	
	public void actionPerformed(ActionEvent parE)
	{
		
		if(parE.getSource()== ajout)
		{
			Evt evt = new Evt(date,zoneTitre.getText(),zoneLieu.getText(),(String)heureDebut.getSelectedItem(),(String)minutesDebut.getSelectedItem(),(String)heureFin.getSelectedItem(),(String)minutesFin.getSelectedItem());
			agenda.ajout(zoneTitre.getText(),evt);
			
			chTable.setModel(new ModeleTable(agenda, date));
		}
	}
	/**
	 * Modifie le champ date
	 * @param parDate
	 */
	public static void setDate (Date parDate)
	{
		date = parDate;
		labelDate.setText(date.toString());
	}
	
	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
}
