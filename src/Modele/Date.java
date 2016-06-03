package Modele;
//import Vu.*;
//import Fichier.*;


import java.util.*;
import java.util.GregorianCalendar;


public class Date {
	private int chJour;//declaration des champs
	 int chMois;
 int chAn;
 int chJourSemaine;

 public Date(int parJour, int parMois, int parAn)
	{
	    chJour=parJour;
	    chMois=parMois;
	    chAn=parAn;
	  
	}

	public String toString()
	{
	    return(chJour+"/"+chMois+"/"+chAn);
	}
	 
	public int dernierJourDuMois(int i,int an)
	{
	    switch(i)
	    {
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	            return 30;
	        default:
	            return 31;
	        case 2:
	            if((an%4==0 && an%100!=0)||(an%400==0))
	                return 29;
	            else return 28;
	    }

	}

	/*public boolean estValide()
	{
	    if(chAn<1582)
	        return false;
	    if(chMois<1 || chMois>12)
	        return  false;
	    if(chJour<1 || chJour>dernierJourDuMois())
	        return false;
	    return true;
	}*/


	public Date()
	{
	    GregorianCalendar today = new GregorianCalendar();
	    chJour = today.get(Calendar.DAY_OF_MONTH);
	    chMois = today.get(Calendar.MONTH)+1;
	    chAn = today.get(Calendar.YEAR);
	    chJourSemaine = today.get(Calendar.DAY_OF_WEEK);		
	}
	
	public int precede (Date parDate)
	{
		if (chJour==parDate.chJour)
			return 0;
			
		if (chJour<parDate.chJour)
		return +1;
		
		if (chJour>parDate.chJour)
		return -1;
		
		else
		{
			return 0;
		}
	}
	/*public static Date lire Date()
	{
		
	}*/

	public int getAn() {
		return chAn;
	}

	public int getMois() {
		return chMois;
	}
	public int getJour()
	{
		return chJour;
	}
	public int getJourSemaine()
	{
		return chJourSemaine;
	}

	

}
