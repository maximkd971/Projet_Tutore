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
    setVisible(true);setLocation(400,10);
    pack();
    }
 
 
public static void main(String[] args)
    {new Fenetre_Mere("Fenetre Mere");
    }//main()
}//FenetreMere