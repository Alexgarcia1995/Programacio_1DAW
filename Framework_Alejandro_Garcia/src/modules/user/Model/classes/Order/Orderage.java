package modules.user.Model.classes.Order;

import java.util.Comparator;

import javax.swing.JOptionPane;

import modules.user.Model.classes.Persona;

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
		return n;
	}
}
