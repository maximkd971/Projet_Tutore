package VU;

import javax.swing.*;

import Modele.PanelFormulaireChrono;
import Modele.PanelFormulaireDiapo;
import Modele.PanelFormulaireEvt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFils extends JPanel implements ActionListener 
	{

	JLabel chrono = new JLabel();
	PanelAffiche panEvt = new PanelAffiche();
	//PanelFormulaireEvt panForm = new PanelFormulaireEvt();
	BorderLayout layout = new BorderLayout();
	PanelFormulaireDiapo panDiapo = new PanelFormulaireDiapo();
	
	public PanelFils()
		{
			this.setLayout(layout);
			this.add(chrono, BorderLayout.NORTH);
			this.add(panEvt,BorderLayout.SOUTH);
			this.add(panDiapo, BorderLayout.CENTER);
		
		//this.add(panForm, BorderLayout.NORTH);
		}

	@Override
	public void actionPerformed(ActionEvent parEvt)
	{
		String actionCommand = parEvt.getActionCommand();
		if (actionCommand.equals("kk"))
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
		if (actionCommand.equals("Ajout"))
		{
			PanelFormulaireEvt panEvt = new PanelFormulaireEvt();
			
		}
		if (actionCommand.equals("AjoutChrono"))
		{
			PanelFormulaireChrono panChrono = new PanelFormulaireChrono();
		}
		
				
	}
		
		
}
