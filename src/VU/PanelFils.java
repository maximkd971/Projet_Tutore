package VU;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFils extends JPanel implements ActionListener {

	
		PanelEvenement panEvt = new PanelEvenement();
		
		GridLayout layout = new GridLayout(2,10,2,2);
		public PanelFils(){
			this.setLayout(layout);
			this.add(panEvt);
			
	}

	@Override
	public void actionPerformed(ActionEvent parEvt) {
		String actionCommand = parEvt.getActionCommand();
		if (actionCommand.equals("kk"))
		{
			int saisi = JOptionPane.showConfirmDialog(this,"Êtes_vous sur de vouloir quitter ?", "QUITTER",JOptionPane.OK_CANCEL_OPTION,JOptionPane.CANCEL_OPTION, null);
		}
		
	}
		
	
}
