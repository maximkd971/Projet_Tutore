package Modele;

import java.io.*;


import javax.swing.ImageIcon;

//import Vu.*;
//import Fichier.*;

public class Evt
{
	private Date chDate;
	private String chTitre;
	private String chLieu;
	private String chImage;
	private String chDescription;
	private String nomFrise;
	

	public String toString()
	{
		return(chDate.toString()+","+chTitre+","+chLieu+","+chDescription + chImage);
	}
	
	public void setTitre(String parTitre)
	{
		chTitre=parTitre;
	}
	public String getTitre() {
		return chTitre;
	}
	
	public void SetDate(Date parDate)
	{
		chDate=parDate;
	}
	
	public Date getDate() {
		return chDate;
	}
	
	
	public int precede(Evt parEvt)
	{
		if(chDate==parEvt.chDate)
		{
			if(chTitre.compareTo(parEvt.chTitre)<0)
				return 1;
			if(chTitre.compareTo(parEvt.chTitre)<0)
				return -1;
			return chDate.precede(parEvt.chDate);		
		}
		return 0;
	}

	
}