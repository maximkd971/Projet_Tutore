package VU;


import javax.swing.*;

import Modele.Constantes;

import java.awt.*;
import java.awt.event.KeyEvent;
 
public class Fenetre_Mere extends JFrame
{
	private static String[]nomFichier = Constantes.ListeFichier();
	static JComboBox <String> Bouton =new JComboBox<String>(nomFichier);
	public Fenetre_Mere(String parTitre)
    {
		super(parTitre);
	    PanelFils contentPane=new PanelFils();
		setContentPane(contentPane);
		contentPane.setBackground(new Color(100,200,240));
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocation(10,10);setSize(1200,700);
	   
	    JMenuBar menuBar= new JMenuBar();
	    this.setJMenuBar(menuBar);
	    
	    JMenu menuCreation = new JMenu("Cr�ation");
	    menuCreation.setMnemonic('C');
	    
	    JMenu menuCreation2 = new JMenu("Modifier Evenement");
	    
	    JMenu menuAfficher = new JMenu("Afficher");
	    menuAfficher.setMnemonic('A');
	   
	    JMenuItem Affiche = new JMenuItem("Fichier Existant");
	    menuAfficher.add(Affiche);
	    Affiche.addActionListener(contentPane);
	    Affiche.setActionCommand("afficher");
	   
	  
	   

	    JMenu menuQuitter = new JMenu("Quitter");
	    menuQuitter.setMnemonic('Q');
	    
	    JMenu menuInt = new JMenu("?");
	    menuInt.setMnemonic('?');
	    
	    JMenuItem Ajouter = new JMenuItem("Ajouter un �v�nement");
	    menuCreation2.add(Ajouter);
	    Ajouter.addActionListener(contentPane);
	    Ajouter.setActionCommand("Ajout");
	    
	    JMenuItem Modifier = new JMenuItem("Modifier un �v�nement");
	    menuCreation2.add(Modifier);
	    Modifier.addActionListener(contentPane);
	    Modifier.setActionCommand("Modifier");
	    
	    JMenuItem AjoutChrono = new JMenuItem("Cr�er une Chronologie");
	    menuCreation.add(AjoutChrono);
	    AjoutChrono.addActionListener(contentPane);
	    AjoutChrono.setActionCommand("AjoutChrono");
	    
	    JMenuItem ModifierChrono = new JMenuItem("Modifier la Chonologie");
	    menuCreation.add(ModifierChrono);
	    ModifierChrono.addActionListener(contentPane);
	    ModifierChrono.setActionCommand("ModifChrono");
	    
	    for (int i=0; i<Constantes.Modif.length;i++)
	    {
	    	JMenuItem menuModif = new JMenuItem(Constantes.Modif[i]);
	    	
	    }
	    
	    menuCreation.add(menuCreation2);
	    JMenuItem Quitter = new JMenuItem("Quitter");
	    menuQuitter.add(Quitter);
	    Quitter.addActionListener(contentPane);
	    Quitter.setActionCommand("kk");
	    Quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
	    menuBar.add(menuCreation);
	    menuBar.add(menuAfficher);
	    menuBar.add(menuQuitter);
	    menuBar.add(menuInt);
	    
	    setVisible(true);
    
    }
 
 
public static void main(String[] args)
    {
	  new Fenetre_Mere("Fenetre Mere");
    }//main()

}//FenetreMere