package Modele;
import java.io.*;
public class Constantes {
	
	public static final String[] Creation={"Créer Chronologie","Modifier Chronologie"};
	public static final String[] Modif ={"Ajouter évènement","Modifier évènement"};
	public static final String [] An = {"1900","","","","","1905","","","","","1910","","","","","1915","","","","","1920","","","","","1925","","","","","1930","","","","","1935","","","","","1940","","","","","1945","","","","","1950","","","","","1955","","","","","1960","","","","","1965","","","","","1970","","","","","1975","","","","","1980","","","","","1985","","","","","1990","","","","","1995","","","","","2000","","","","","2005","","","","","2010","","","","","2015",""};
	
	public static String[] ListeFichier()
	{
		File fichiers = new File("./");
		File[] listFiles = fichiers.listFiles();
		String[] nomFichier = new String[listFiles.length];
		
		for (int i=0 ; i<listFiles.length; i++)
		{
			if(listFiles[i].isFile())
			{
				nomFichier[i]= listFiles[i].getName();
			} 
		}
		return nomFichier;
	}
	
	
} 
