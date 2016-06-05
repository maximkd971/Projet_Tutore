package VU;

import javax.swing.*;

import Modele.PanelFormulaireChrono;
import Modele.PanelFormulaireEvt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author Maxim
 *
 */
public class PanelFils extends JPanel implements ActionListener {

		JLabel chrono = new JLabel();
		PanelAffiche panEvt = new PanelAffiche();
		//PanelFormulaireEvt panForm = new PanelFormulaireEvt();
		BorderLayout layout = new BorderLayout();
		
		/**
		 * Ajoute tout les panneaux intermédiares à la fenetre mère.
		 */
		public PanelFils(){
			this.setLayout(layout);
			this.add(chrono, BorderLayout.NORTH);
			this.add(panEvt,BorderLayout.CENTER);
			
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
		 * Crée un nouveau PanelFormulaireEvt() lorsque l'on veut ajouter un évènement.
		 */
		if (actionCommand.equals("Ajout"))
		{
			PanelFormulaireEvt panEvt = new PanelFormulaireEvt();
			
		}
		
		/**
		 *Crée un nouveau PAnelFormulaireChrono() lorsque l'on veut ajouter une nouvelle chronologie.
		 */
		if (actionCommand.equals("AjoutChrono"))
		{
			PanelFormulaireChrono panChrono = new PanelFormulaireChrono();
		}
		
				
	}
		
		
}
