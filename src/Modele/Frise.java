package Modele;

import java.io.File;
import java.io.*;


public class Frise {
	String chTitre;
	int chAnneeDebut;
	int chAnneeFin;
	public Frise (String titre, int anneeDebut, int anneeFin)
	{
		chTitre= titre;
		chAnneeDebut = anneeDebut;
		chAnneeFin = anneeFin;
		creeFichier();
		
	}
	
	public void creeFichier(){
		File fichier = new File("./FichierChrono/"+chTitre+".txt");
		if (fichier.exists())
		{
			try {
				fichier.createNewFile();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		try (PrintWriter texte = new PrintWriter(new FileOutputStream(fichier,true)))
		{
			texte.println(chTitre);
			texte.println(chAnneeDebut);
			texte.println(chAnneeFin);
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}
	}
