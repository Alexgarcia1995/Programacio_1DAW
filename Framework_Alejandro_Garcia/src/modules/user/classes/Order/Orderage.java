package modules.user.classes.Order;

import java.util.Comparator;

import javax.swing.JOptionPane;

import modules.user.classes.Persona;

public class Orderage implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		int n=0;
		if(u1.getedad()>u2.getedad())
			n=1;
		else if(u1.getedad()<u2.getedad())
			n= -1;
		else {
			n=0;
		}
		JOptionPane.showMessageDialog(null, n +" "+ u1.getedad() + " " + u2.getedad());
		return n;
	}
}
