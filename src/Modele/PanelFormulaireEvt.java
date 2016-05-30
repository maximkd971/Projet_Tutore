package Modele;
import javax.swing.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class PanelFormulaireEvt extends JDialog implements Serializable,ActionListener{
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
	private JTextField zoneJour = new JTextField(2);
	private JTextField zoneMois = new JTextField(2);
	private JTextField zoneAnnee = new JTextField(4);
	private JTextArea description = new JTextArea(10,10);
	private JScrollPane scrollPane = new JScrollPane(description);
	private JButton ajoutImg = new JButton ("+");
	public static Agenda agenda = new Agenda();
	static Date date =new Date();
	
	
	public PanelFormulaireEvt()
	{
	this.setBackground(new Color(100,200,240));
	this.setVisible(true);this.setSize(700,500);
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
	contrainte.gridwidth = 1;
	add(zoneJour,contrainte);
	contrainte.gridx = 2;	// 1e rang, date + btn+
	contrainte.gridy = 0;
	contrainte.gridwidth = 1;
	add(zoneMois,contrainte);
	contrainte.gridx = 3;	// 1e rang, date + btn+
	contrainte.gridy = 0;
	contrainte.gridwidth = 2;
	add(zoneAnnee,contrainte);
	contrainte.gridwidth = 1;
	contrainte.gridx = 5;
	add(ajoutImg,contrainte);
	
	// 2e rang : Titre
	labelTitre = new JLabel("Titre");
	contrainte.gridx = 0;
	contrainte.gridy = 1;
	contrainte.gridwidth = 1;
	add(labelTitre,contrainte);
	contrainte.gridx = 1;
	contrainte.gridy = 1;
	contrainte.gridwidth = 6;
	add(zoneTitre,contrainte);
	
	// 3e rang : lieu
	labelLieu = new JLabel("Lieu");
	contrainte.gridx = 0;
	contrainte.gridy = 2;
	contrainte.gridwidth = 1;
	add(labelLieu,contrainte);
	contrainte.gridx = 1;
	contrainte.gridy = 2;
	contrainte.gridwidth = 6;
	add(zoneLieu,contrainte);
	
	//4eme rang : description
	labelDescription = new JLabel("Description");
	contrainte.gridx = 0;
	contrainte.gridy = 5;
	contrainte.gridwidth = 1;
	add(labelDescription,contrainte);
	contrainte.gridx = 0;
	contrainte.gridy = 6;
	contrainte.gridwidth = 6;
	add(scrollPane,contrainte);
	
	ajoutImg.addActionListener(this);
	
	}


	public String importImage() {
		JFileChooser choix = new JFileChooser();
		int retour = choix.showOpenDialog(null); // Ouvre un PopUp
		if (retour == JFileChooser.APPROVE_OPTION) {
		// un fichier a été choisi
		// nom du fichier:
		String nom = choix.getSelectedFile().getName();
		// chemin absolu du fichier choisi
		String chemin = choix.getSelectedFile().getAbsolutePath();
		JLabel logo = new JLabel( new ImageIcon(chemin));
			if(chemin==null)
			{
				this.add(ajoutImg);
			}
			else
			{
				this.add(logo);
			}
		return chemin;
		}
		else {
		return null;// L'utilisateur ne veut finalement pas importer d'item
		}
	}

	@Override
	public void actionPerformed(ActionEvent parEvt) {
		if (parEvt.getSource()==ajoutImg)
		{
			File image = new File(importImage());
		}

	}
}
