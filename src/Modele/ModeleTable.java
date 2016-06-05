package Modele;

import java.util.*;


//import Vu.*;
//import Fichier.*;

import javax.swing.table.*;

/**
 * 
 * @author Maxim
 *
 */
public class ModeleTable extends DefaultTableModel
{
	int chAnneeDebut;
	int chAnneeFin;
/**
 * Crée un modèle de table par défaut à partir du tableau de String An
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
			

		}
		setColumnIdentifiers(titre);
		
				//ArrayList l =  PanelAffiche.agenda.getgetDate().toString();
		//setValueAt(evt.getTitre(),i,evt.getDate().getJour()-1);
		
	}
	

}
