package exemplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class OuvidoDoMenuItemOpen implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent evento) {
		JOptionPane.showMessageDialog(null, "Cliquei no menu item open");
		
	}

}
