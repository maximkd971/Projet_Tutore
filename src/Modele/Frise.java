package Modele;

import javax.swing.JOptionPane;

import java.io.*;

/**
 * 
 * @author Maxim
 *
 */
public class Frise {
	String chTitre;
	int chAnneeDebut;
	int chAnneeFin;
	Date chDate;
	String chTitreEvt;
	String chLieu;
	String chImage;
	String chDescription;
	String nomFrise;
	
	
	/**
	 * Constructeur de la m�thode creeFichier().
	 * @param titre 
	 * @param anneeDebut 
	 * @param anneeFin de 
	 */
	public Frise (String titre, int anneeDebut, int anneeFin)
	{
		chTitre= titre;
		chAnneeDebut = anneeDebut;
		chAnneeFin = anneeFin;
		creeFichier();
		
	}
	
	/**
	 * Le constructeur de la m�thode creeFichierEvt().
	 * @param parDate
	 * @param parTitre
	 * @param parLieu
	 * @param parImage
	 * @param parDescription
	 * @param parFrise
	 */
	public  Frise (Date parDate,String parTitre,String parLieu, String parImage ,String parDescription , String parFrise)
	{
		chDate = parDate;
		chTitreEvt = parTitre;
		chLieu = parLieu;
		chImage = parImage;
		chDescription = parDescription;
		nomFrise= parFrise;
		creeFichierEvt();
	}
	
	/**
	 * Permet de cr�er le fichier contenant les infos de la chronologie.
	 */
	public void creeFichier(){
		File fichier = new File("./"+chTitre+".txt");
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
			texte.println("");
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
	
	}
	

	/**
	 * Permet d'ajouter les �v�nements � la chronologie choisie.
	 */
	

	public void creeFichierEvt()
	{

		File fichier = new File("./FichierChrono/"+nomFrise);
		try (PrintWriter texte = new PrintWriter(new FileOutputStream(fichier , true)))
		{
		
			texte.println(chDate);
			texte.println(chTitreEvt);
			texte.println(chLieu);
			texte.println(chImage);
			texte.println(chDescription);
			texte.println(""); 
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
	}
	}
