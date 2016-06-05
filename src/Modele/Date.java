package Modele;
//import Vu.*;
//import Fichier.*;


import java.util.*;
import java.util.GregorianCalendar;

/**
 * 
 * @author Maxim
 *
 */
public class Date {
	private int chJour;//declaration des champs
	 int chMois;
	 int chAn;
	 int chJourSemaine;
/**
 * Cr�e un date
 * @param parJour
 * @param parMois
 * @param parAn
 */
 public Date(int parJour, int parMois, int parAn)
	{
	    chJour=parJour;
	    chMois=parMois;
	    chAn=parAn;
	  
	}
/**
 * Change les int en String
 */
	public String toString()
	{
	    return(chJour+"/"+chMois+"/"+chAn);
	}
	 
	

	
	/**
	 * Cr�e un date
	 */
	public Date()
	{
	    GregorianCalendar today = new GregorianCalendar();
	    chJour = today.get(Calendar.DAY_OF_MONTH);
	    chMois = today.get(Calendar.MONTH)+1;
	    chAn = today.get(Calendar.YEAR);
	    chJourSemaine = today.get(Calendar.DAY_OF_WEEK);		
	}
	
	/**
	 * r�cup�rer l'ann�e
	 * @return chAn
	 */
	public int getAn() {
		return chAn;
	}

	/**
	 * R�cuperer le mois
	 * @return chMois
	 */
	public int getMois() {
		return chMois;
	}
	
	/**
	 * R�cuperer le jour
	 * @return chJour
	 */
	public int getJour()
	{
		return chJour;
	}
	
	/**
	 * R�cuperer le jour de la  semaine
	 * @return chJourSemaine
	 */
	public int getJourSemaine()
	{
		return chJourSemaine;
	}

	

}
