package Modele;
import java.io.*;
public class Constantes {
	
	public static final String[] Creation={"Cr�er Chronologie","Modifier Chronologie"};
	public static final String[] Modif ={"Ajouter �v�nement","Modifier �v�nement"};
	public static final String [] An = {"1900","","","","","1905","","","","","1910","","","","","1915","","","","","1920","","","","","1925","","","","","1930","","","","","1935","","","","","1940","","","","","1945","","","","","1950","","","","","1955","","","","","1960","","","","","1965","","","","","1970","","","","","1975","","","","","1980","","","","","1985","","","","","1990","","","","","1995","","","","","2000","","","","","2005","","","","","2010","","","","","2015",""};
	/**
	 * r�cup�re le nom des fichiers cr�es
	 * @return un liste des noms de ces fichiers
	 */
	public static String[] ListeFichier()
	{
		File fichiers = new File("./");
		File[] listFiles = fichiers.listFiles();
		String[] nomFichier = new String[listFiles.length];
		nomFichier[0]=null;
		for (int i=1 ; i<listFiles.length; i++)
		{
			if(listFiles[i].isFile())
			{
				nomFichier[i]= listFiles[i].getName();
			} 
		}
		return nomFichier;
	}
	
	
} 
