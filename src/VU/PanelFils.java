package VU;

import javax.swing.*;

import Modele.Constantes;
import Modele.PanelFormulaireChrono;
import Modele.PanelFormulaireDiapo;
import Modele.PanelFormulaireEvt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFils extends JPanel implements ActionListener 
	{

	//JLabel chrono = new JLabel();
	PanelAffiche panEvt = new PanelAffiche();
	private JButton ok = new JButton("ok");
	private String[]nomFichier = Constantes.ListeFichier();
 	private JComboBox <String> fichier = new JComboBox <String> (nomFichier);
 	
	//PanelFormulaireEvt panForm = new PanelFormulaireEvt();
	BorderLayout layout = new BorderLayout();
	
	PanelFormulaireDiapo panDiapo; 
	//PanelFormulaireDiapo panDiapo = new PanelFormulaireDiapo();
	private String bouton;
	/**
	 * Ajoute a la fenetre mère les panneau intermédiaire et les fenetre de dialogue
	 */
	public PanelFils()
		{
			this.setLayout(layout);
			//this.add(chrono, BorderLayout.NORTH);
			this.add(panEvt,BorderLayout.SOUTH);
			//this.add(panDiapo, BorderLayout.CENTER);
		
		//this.add(panForm, BorderLayout.NORTH);
		}

	
	@Override
	public void actionPerformed(ActionEvent parEvt)
	{
		String actionCommand = parEvt.getActionCommand();
		/**
		 * Fermer la fenetre avec le bouton quitter
		 */
		if (actionCommand.equals("quitter"))
		{
			int saisi = JOptionPane.showConfirmDialog(this,"Êtes_vous sur de vouloir quitter ?", "QUITTER",JOptionPane.OK_CANCEL_OPTION,JOptionPane.CANCEL_OPTION, null);
			switch(saisi)
			{
			case JOptionPane.CLOSED_OPTION:
					break;
			case JOptionPane.OK_OPTION:
					System.exit(0);break;
			case JOptionPane.CANCEL_OPTION:
					break;
			}
		}
		
		/**
		 * ouvrir un formulaire pour l'ajout d'un évènement
		 */
		if (actionCommand.equals("Ajout"))
		{
			PanelFormulaireEvt panEvt = new PanelFormulaireEvt();
			
		}
		
		/**
		 * ouvre le formulaire permettant d'ajouter une chronologie
		 */
		if (actionCommand.equals("AjoutChrono"))
		{
			PanelFormulaireChrono panChrono = new PanelFormulaireChrono();
		}
		
		/**
		 * ajoute le cardLayout
		 */
		if (parEvt.getSource()==ok)
		{
			String choisis = fichier.getSelectedItem().toString();
			panDiapo = new PanelFormulaireDiapo(choisis);
			fichier.setVisible(false);
			ok.setVisible(false);
			this.add(panDiapo, BorderLayout.CENTER);
		}
		
		/**
		 * choisir la chronologie a afficher
		 */
		if(actionCommand.equals("afficher"))
		{
			
		 	this.add(fichier, BorderLayout.NORTH);
		 	this.add(ok, BorderLayout.CENTER);
		 	ok.addActionListener(this);
		 	fichier.setVisible(true);
			ok.setVisible(true);
		 	panDiapo.setVisible(false);
		 	
		}
		
				
	}
		
		
}
