package V1;

import javax.swing.*;
import java.awt.*;
 
public class Fenetre_Mere extends JFrame
{public Fenetre_Mere(String parTitre)
    {super(parTitre);
    PanelFils contentPane=new PanelFils();
	setContentPane(contentPane);
	contentPane.setBackground(new Color(100,200,240));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);setLocation(10,10);setSize(1200,800);
    JMenuBar menuBar= new JMenuBar();
    this.setJMenuBar(menuBar);
    JMenu menuCréation = new JMenu("Création");
    menuCréation.setMnemonic('C');
    JMenu menuAfficher = new JMenu("Afficher");
    menuAfficher.setMnemonic('A');
    JMenu menuQuitter = new JMenu("Quitter");
    menuQuitter.setMnemonic('Q');
    JMenu menuInt = new JMenu("?");
    menuInt.setMnemonic('?');
    		
    for (int i=0; i<Constantes.Creation.length ; i++)
    {
    	JMenuItem menu = new JMenuItem(Constantes.Creation[i]);
    	menuCréation.add(menu);
    	
    }
    for(int i =0; i<Constantes.Afficher.length;i++)
    {
    	JMenuItem menu = new JMenuItem(Constantes.Afficher[i]);
    	menuAfficher.add(menu);
    }
    menuQuitter.addActionListener(contentPane);
    menuBar.add(menuCréation);
    menuBar.add(menuAfficher);
    menuBar.add(menuQuitter);
    menuBar.add(menuInt);
  
    
    }
 
 
public static void main(String[] args)
    {new Fenetre_Mere("Fenetre Mere");
    }//main()
}//FenetreMere