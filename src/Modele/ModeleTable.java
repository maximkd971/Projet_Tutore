package Modele;

import java.util.*;

//import Vu.*;
//import Fichier.*;

import javax.swing.table.*;
public class ModeleTable extends DefaultTableModel
{
	/**
	 * Cr�e un type de table par d�faut
	 */
	public ModeleTable()
	{
		int An = Constantes.An.length;
		setColumnCount(An);
		setRowCount(4);
		String[] titre =  new String[An];
		
		for(int i=0;i<An;i++)
		{
			titre[i]=Constantes.An[i];
			System.out.println(titre[i]);

		}
		setColumnIdentifiers(titre);
		
				//ArrayList l =  PanelAffiche.agenda.getgetDate().toString();
		//setValueAt(evt.getTitre(),i,evt.getDate().getJour()-1);
		
	}
}
