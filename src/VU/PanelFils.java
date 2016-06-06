package VU;

import javax.swing.*;

import Modele.Constantes;
import Modele.PanelFormulaireChrono;
import Modele.PanelFormulaireDiapo;
import Modele.PanelFormulaireEvt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Maxim
 *
 */

		
		
		

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
	 * Ajoute tout les panneaux interm�diares � la fenetre m�re.
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
		 * Ouvre une fenetre lorque l'on clique sur le bouton quitter pour confirmer ou annuler la fermeture de la fentre.
		 */
		if (actionCommand.equals("Quitter"))
		{
			int saisi = JOptionPane.showConfirmDialog(this,"�tes_vous sur de vouloir quitter ?", "QUITTER",JOptionPane.OK_CANCEL_OPTION,JOptionPane.CANCEL_OPTION, null);
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
		 * Cr�e un nouveau PanelFormulaireEvt() lorsque l'on veut ajouter un �v�nement.
		 */
		if (actionCommand.equals("Ajout"))
		{
			PanelFormulaireEvt panEvt = new PanelFormulaireEvt();
			
		}
		
		/**
		 *Cr�e un nouveau PAnelFormulaireChrono() lorsque l'on veut ajouter une nouvelle chronologie.
		 */
		if (actionCommand.equals("AjoutChrono"))
		{
			PanelFormulaireChrono panChrono = new PanelFormulaireChrono();
		}
		
		if (parEvt.getSource()==ok)
		{
			String choisis = fichier.getSelectedItem().toString();
			panDiapo = new PanelFormulaireDiapo(choisis);
			fichier.setVisible(false);
			ok.setVisible(false);
			this.add(panDiapo, BorderLayout.CENTER);
		}
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
