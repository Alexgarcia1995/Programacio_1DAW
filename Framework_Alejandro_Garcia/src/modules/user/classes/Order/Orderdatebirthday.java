package modules.user.classes.Order;

import java.util.Comparator;

import javax.swing.JOptionPane;

import modules.user.classes.Persona;

public class Orderdatebirthday implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		int n= u1.getFechanac().comparaFechas1(u2.getFechanac());
		JOptionPane.showMessageDialog(null, n + " " +u1.getFechanaix() + " "+ u2.getFechanaix() );
		return n;
	}
}
