package Modele;
import javax.swing.*;

import java.io.*;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

public class PanelFormulaireEvt extends JDialog implements Serializable{
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
	
	//les zones de saisie ou d'affichage 
	private JTextField zoneLieu = new JTextField(10);
	private JTextField zoneTitre = new JTextField(10);
	private JTextArea description = new JTextArea(10,10);
	private JScrollPane scrollPane = new JScrollPane(description);
	private JButton ajout = new JButton ("+");
	public static Agenda agenda = new Agenda();
	static Date date =new Date();
	public PanelFormulaireEvt()
	{
	this.setBackground(new Color(100,200,240));
	this.setVisible(true);this.setSize(400,500);
	this.setTitle("ajouter un évènement"); 
	this.setLocationRelativeTo(null);//à modifier
	this.setResizable(false); // pas redimentionnable
	this.setVisible(true);
	this.setLayout(new GridBagLayout());
	
	this.setLayout(new GridBagLayout());
	GridBagConstraints contrainte = new GridBagConstraints();
	contrainte.insets = new Insets(10,10,10,10);
	contrainte.fill = GridBagConstraints.BOTH;
	contrainte.gridx = 0;	// 1e rang, date + btn+
	contrainte.gridy = 0;
	contrainte.gridwidth = 2;
	labelDate = new JLabel(date.toString());
	add(labelDate,contrainte);
	contrainte.gridwidth = 1;
	contrainte.gridx = 3;
	add(ajout,contrainte);
	
	// 2e rang : Titre
	labelTitre = new JLabel("Titre");
	contrainte.gridx = 0;
	contrainte.gridy = 1;
	contrainte.gridwidth = 1;
	add(labelTitre,contrainte);
	contrainte.gridx = 1;
	contrainte.gridy = 1;
	contrainte.gridwidth = 3;
	add(zoneTitre,contrainte);
	
	// 3e rang : lieu
	labelLieu = new JLabel("Lieu");
	contrainte.gridx = 0;
	contrainte.gridy = 2;
	contrainte.gridwidth = 1;
	add(labelLieu,contrainte);
	contrainte.gridx = 1;
	contrainte.gridy = 2;
	contrainte.gridwidth = 3;
	add(zoneLieu,contrainte);
	
	//4eme rang : description
	labelDescription = new JLabel("Description");
	contrainte.gridx = 0;
	contrainte.gridy = 5;
	contrainte.gridwidth = 1;
	add(labelDescription,contrainte);
	contrainte.gridx = 0;
	contrainte.gridy = 6;
	contrainte.gridwidth = 4;
	add(scrollPane,contrainte);
	
	//ajout.addActionListener(this);
	//@Override
	//public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	//}
	}
}
