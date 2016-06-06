package Modele;
import javax.swing.*;

import java.awt.event.*;

import java.io.*;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

import javax.swing.*;
public class PanelFormulaireChrono extends JDialog implements ActionListener
{

	private JLabel labelTitre; 
	private JLabel labelAnneeDebut;
	private JLabel labelAnneeFin;
	private static JTextField zoneTitre = new JTextField(10);
	private static  JTextField AnneeDebut = new JTextField(10);
	private static JTextField AnneeFin = new JTextField(10);
	private JButton Ajouter;
	
	public PanelFormulaireChrono()
	{
		
		this.setBackground(new Color(100,200,240));
		this.setVisible(true);this.setSize(400,500);
		this.setTitle("Ajouter une chronologie"); 
		this.setLocationRelativeTo(null);//� modifier
		this.setResizable(false); // pas redimentionnable
		this.setVisible(true);
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		contrainte.insets = new Insets(10,10,10,10);
		contrainte.fill = GridBagConstraints.BOTH;
		
		labelTitre = new JLabel("Titre");
		contrainte.gridx = 0;
		contrainte.gridy = 1;
		contrainte.gridwidth = 1;
		add(labelTitre,contrainte);
		contrainte.gridx = 1;
		contrainte.gridy = 1;
		contrainte.gridwidth = 3;
		add(zoneTitre,contrainte);
		
		labelAnneeDebut = new JLabel("Ann�e de d�but");
		contrainte.gridx = 0;
		contrainte.gridy = 2;
		contrainte.gridwidth = 1;
		add(labelAnneeDebut,contrainte);
		contrainte.gridx = 1;
		contrainte.gridy = 2;
		contrainte.gridwidth = 3;
		add(AnneeDebut,contrainte);
		
		labelAnneeFin = new JLabel("Ann�e de Fin");
		contrainte.gridx = 0;
		contrainte.gridy = 3;
		contrainte.gridwidth = 1;
		add(labelAnneeFin,contrainte);
		contrainte.gridx = 1;
		contrainte.gridy = 3;
		contrainte.gridwidth = 3;
		add(AnneeFin,contrainte);
		
		Ajouter = new JButton("+");
		contrainte.gridx = 0;
		contrainte.gridy = 4;
		contrainte.gridwidth = 4;
		add(Ajouter,contrainte);
		Ajouter.addActionListener(this);
	}
	@Override
	
	public void actionPerformed(ActionEvent parEvt) 
	{
		// TODO Auto-generated method stub
		
		if (parEvt.getSource()==Ajouter)
		{
			String titre = zoneTitre.getText();
			int anneeDebut = Integer.parseInt(AnneeDebut.getText());
			int anneeFin = Integer.parseInt(AnneeFin.getText());
			new Frise (titre,anneeDebut,anneeFin);
			this.setVisible(false);
			zoneTitre.setText("");
			AnneeDebut.setText("");
			AnneeFin.setText("");
		}
	}
	
	
}
