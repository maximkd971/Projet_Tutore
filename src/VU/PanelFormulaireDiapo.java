package VU;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.*;
/**
 * 
 * @author Kwadjo
 *
 */
public class PanelFormulaireDiapo extends JPanel implements ActionListener
{
	
	private static final long serialVersionUID = 1L;
	
	CardLayout gestionnaireDevenement = new CardLayout(10,10);
	private JButton precedent;
	private JButton suivant;
	JPanel panPrecedent = new JPanel();
	JPanel panSuivant = new JPanel();
	JPanel panDiapositive = new JPanel();
	JLabel evenement[] = new JLabel[10];
	String chNomFichier;
	//private JTextArea description;

	private BufferedReader reader;
	/**
	 * crée un panel contenant un cardLayout qui affiche les évènements d'une chronologie
	 * @param nomFichier
	 */
	public PanelFormulaireDiapo(String nomFichier)
	{
		chNomFichier = nomFichier;
		//transforme les fichiers en JLabel
		JLabel description = new JLabel(readFile(nomFichier));
		
		
		
		//définit un borderlayout pour l'affichage du diapo
		this.setLayout(new BorderLayout(8,8));
		
		precedent = new JButton("<");
		suivant = new JButton(">");
		
		precedent.addActionListener(this);
		suivant.addActionListener(this);
		
		//le panel au centre sera un cardlayout
		panDiapositive.setLayout(gestionnaireDevenement);
		//for (int i =0 ; i<nomFichier.length; i++)
		//{
			
		//}
		panDiapositive.add(description, BorderLayout.EAST);
		

		evenement [0] = description;
		
		//ajout des éléments à la fenêtre
		this.add(precedent, BorderLayout.WEST);
		this.add(panDiapositive, BorderLayout.CENTER);
		this.add(suivant, BorderLayout.EAST);
		this.setVisible(true);
	}	
		
	//lit le fichier et l'affiche dans le paneau au centre, en cas d'erreur envoie un message
	/**
	 * Lit le contenut d'un fichier ligne a ligne
	 * @param file
	 * @return les lignes du fichier
	 */
	public String readFile(String file)
	{
		String lines = "";
        String line;
        try
        {
            reader = new BufferedReader( new FileReader(file) );
             
            // LIS LIGNE A LIGNE
            while( (line = reader.readLine()) != null )
                lines += line+"\n";
        }
        
        catch( Exception e )
        {
            lines = "Une erreur s'est produite durant la lecture du flux : "+e.getMessage();
        }  
         
        return lines;
	}
	     
	//définition des actions sur les boutons
	public void actionPerformed(ActionEvent parEvt)
	{
		if (parEvt.getSource()== precedent)
			gestionnaireDevenement.previous(panDiapositive);
			
		if (parEvt.getSource()== suivant)
			gestionnaireDevenement.next(panDiapositive);
	}
}
