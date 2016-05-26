package Modele;

import java.util.*;

//import Vu.*;
//import Fichier.*;

import javax.swing.table.*;
public class ModeleTable extends DefaultTableModel
{
	public ModeleTable(Agenda parAgenda,Date parDate)
	{
		int dernierJour = parDate.dernierJourDuMois(parDate.getMois(),parDate.getAn());
		setColumnCount(dernierJour);
		setRowCount(4);
		String[] titre =  new String[dernierJour];
		for(int i=0;i<dernierJour;i++)
		{
			titre[i]=Integer.toString(i+1);
		}
		setColumnIdentifiers(titre);
		//ArrayList l =  PanelEvenement.agenda.getgetDate().toString();
		//setValueAt(evt.getTitre(),i,evt.getDate().getJour()-1);
		
	}
}
