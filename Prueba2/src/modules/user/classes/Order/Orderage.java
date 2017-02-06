package modules.user.classes.Order;

import java.util.Comparator;

import modules.user.classes.Persona;

public class Orderage implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		if(u1.getedad()>u2.getedad())
			return 1;
		if(u1.getedad()<u2.getedad())
			return -1;
		return 0;
	}
}