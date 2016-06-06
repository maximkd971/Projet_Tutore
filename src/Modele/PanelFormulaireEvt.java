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
	private JLabel labelChoix;
	private String cheminTest;
	
	//les zones de saisie ou d'affichage 
	private JTextField zoneLieu = new JTextField(10);
	private JTextField zoneTitre = new JTextField(10);
	private JTextField zoneJour = new JTextField("JJ");
	private JTextField zoneMois = new JTextField("MM");
	private JTextField zoneAnnee = new JTextField("AAAA");
	private JTextArea description = new JTextArea(10,10);
	private JScrollPane scrollPane = new JScrollPane(description);
	private JButton ajoutImg = new JButton ("Image");
	private JButton ajoutEvt = new JButton ("+");
	public static Agenda agenda = new Agenda();
	static Date date =new Date();
	String[]nomFichier = Constantes.ListeFichier();
	private JComboBox <String> chrono = new JComboBox <String> (nomFichier);
	private String cheminCourant;
	
	/**
	 * Affiche le formulaire qui permet d'ajouter un �v�nement dans une chronologie.
	 */
	public PanelFormulaireEvt()
	{
	this.setBackground(new Color(100,200,240));
	this.setVisible(true);this.setSize(700,500);
	this.setTitle("ajouter un �v�nement"); 
	this.setLocationRelativeTo(null);//� modifier
	this.setResizable(false); // pas redimentionnable
	this.setVisible(true);
	this.setLayout(new GridBagLayout());
	GridBagConstraints contrainte = new GridBagConstraints();
	contrainte.insets = new Insets(10,10,10,10);
	contrainte.fill = GridBagConstraints.BOTH;
	
	// 1e rang
	contrainte.gridx = 3;	
	contrainte.gridy = 0;
	contrainte.gridwidth=2;
	add(chrono,contrainte);
	labelChoix = new JLabel("Choisir la chonologie :");
	contrainte.gridx=0;
	contrainte.gridy=0;
	contrainte.gridwidth=1;
	add(labelChoix , contrainte);
	
	//2eme rang
	contrainte.gridx = 0;	
	contrainte.gridy = 1;
	contrainte.gridwidth = 1;
	add(zoneJour,contrainte);
	contrainte.gridx = 1;	
	contrainte.gridy = 1;
	contrainte.gridwidth = 1;
	add(zoneMois,contrainte);
	contrainte.gridx = 2;	
	contrainte.gridy = 1;
	contrainte.gridwidth = 1;
	add(zoneAnnee,contrainte);
	contrainte.gridwidth = 1;
	contrainte.gridx = 4;
	add(ajoutImg,contrainte);
	
	// 3e rang : Titre
	labelTitre = new JLabel("Titre :");
	contrainte.gridx = 0;
	contrainte.gridy = 2;
	contrainte.gridwidth = 1;
	add(labelTitre,contrainte);
	contrainte.gridx = 1;
	contrainte.gridy = 2;
	contrainte.gridwidth = 6;
	add(zoneTitre,contrainte);
	
	// 4e rang : lieu
	labelLieu = new JLabel("Lieu :");
	contrainte.gridx = 0;
	contrainte.gridy = 3;
	contrainte.gridwidth = 1;
	add(labelLieu,contrainte);
	contrainte.gridx = 1;
	contrainte.gridy = 3;
	contrainte.gridwidth = 6;
	add(zoneLieu,contrainte);
	
	//5eme rang : description
	labelDescription = new JLabel("Description :");
	contrainte.gridx = 0;
	contrainte.gridy = 6;
	contrainte.gridwidth = 1;
	add(labelDescription,contrainte);
	contrainte.gridx = 0;
	contrainte.gridy = 7;
	contrainte.gridwidth = 6;
	add(scrollPane,contrainte);
	
	contrainte.gridx = 0;
	contrainte.gridy = 8;
	contrainte.gridwidth = 6;
	add(ajoutEvt,contrainte);
	
	ajoutImg.addActionListener(this);
	ajoutEvt.addActionListener(this);
	
	}

	/**
	 * Sert a r�cuperer le chemin d'une image que l'on veut associer a un �v�nement
	 * @return le chemin de l'image choisis
	 * @return null si on a pas choissi d'image
	 */
	public String importImage() {
		JFileChooser choix = new JFileChooser();
		int retour = choix.showOpenDialog(null); 
		if (retour == JFileChooser.APPROVE_OPTION) {
		String nom = choix.getSelectedFile().getName();
		String chemin = choix.getSelectedFile().getAbsolutePath();
		return chemin;
		}
		else {
		return null;// L'utilisateur ne veut finalement pas importer d'item
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent parEvt) {
		/**
		 * si on clique sur le bouton image on r�cup�re le chemin et on l'affiche a la place du texte de l'image
		 */
		if (parEvt.getSource()==ajoutImg)
		{
			cheminCourant=importImage();
			ajoutImg.setText(cheminCourant);
			
			
		}	
		
		/**
		 * Ajoute un �v�nement a un fichier contenant d�ja une chronologie.
		 */
		if (parEvt.getSource()==ajoutEvt)
		{
			String titre = zoneTitre.getText();
			String lieu = zoneLieu.getText();
			int jour = Integer.parseInt(zoneJour.getText());
			int mois = Integer.parseInt(zoneMois.getText());
			int annee = Integer.parseInt(zoneAnnee.getText());
			Date date = new Date(jour, mois, annee);
			String Textdescription = description.getText();
			String ch = chrono.getSelectedItem().toString();
			Frise evenement = new Frise (date ,titre, lieu, cheminCourant, Textdescription, ch);
			this.setVisible(false);
			zoneTitre.setText("");
			zoneLieu.setText("");
			zoneJour.setText("");
			zoneMois.setText("");
			zoneAnnee.setText("");
			description.setText("");
			
			
		}

	}
}
