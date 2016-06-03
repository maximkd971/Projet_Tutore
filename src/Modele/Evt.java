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
	
	public Evt (Date parDate,String parTitre,String parLieu, String parImage ,String parDescription , String parFrise)
	{
		chDate = parDate;
		chTitre = parTitre;
		chLieu = parLieu;
		chImage = parImage;
		chDescription = parDescription;
		nomFrise= parFrise;
	}
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
	public void creeFichier(String parFichier){
		File fichier = new File("./FichierChrono/"+parFichier+".txt");
		if (fichier.exists())
		{
			try {
				fichier.createNewFile();
			}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
		try (PrintWriter texte = new PrintWriter(new FileOutputStream(fichier , true)))
		{
		
			texte.println(chDate);
			texte.println(chTitre);
			texte.println(chLieu);
			texte.println(chImage);
			texte.println(chDescription);
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}
}