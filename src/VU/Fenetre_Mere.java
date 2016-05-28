package VU;

import javax.swing.*;

import Modele.Constantes;

import java.awt.*;
import java.awt.event.KeyEvent;
 
public class Fenetre_Mere extends JFrame
{public Fenetre_Mere(String parTitre)
    {super(parTitre);
    PanelFils contentPane=new PanelFils();
	setContentPane(contentPane);
	contentPane.setBackground(new Color(100,200,240));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);setLocation(10,10);setSize(1200,800);
    
    JMenuBar menuBar= new JMenuBar();
    this.setJMenuBar(menuBar);
    JMenu menuCreation = new JMenu("Création");
    menuCreation.setMnemonic('C');
    JMenu menuCreation2 = new JMenu("Modifier Evenement");
    JMenu menuAfficher = new JMenu("Afficher");
    menuAfficher.setMnemonic('A');
    JMenu menuQuitter = new JMenu("Quitter");
    menuQuitter.setMnemonic('Q');
    JMenu menuInt = new JMenu("?");
    menuInt.setMnemonic('?');
    JMenuItem Ajouter = new JMenuItem("Ajouter un évènement");
    menuCreation2.add(Ajouter);
    Ajouter.addActionListener(contentPane);
    Ajouter.setActionCommand("Ajout");
    JMenuItem Modifier = new JMenuItem("Modifier un évènement");
    menuCreation2.add(Modifier);
    Modifier.addActionListener(contentPane);
    Modifier.setActionCommand("MOodifier");
    for (int i=0; i<Constantes.Creation.length ; i++)
    {
    	JMenuItem menuC = new JMenuItem(Constantes.Creation[i]);
    	menuCreation.add(menuC);
    	
    }
    for(int i =0; i<Constantes.Afficher.length;i++)
    {
    	JMenuItem menuA = new JMenuItem(Constantes.Afficher[i]);
    	menuAfficher.add(menuA);
    }
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
  
    
    }
 
 
public static void main(String[] args)
    {new Fenetre_Mere("Fenetre Mere");
   
    }//main()
}//FenetreMere