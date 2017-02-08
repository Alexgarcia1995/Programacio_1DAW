package modules.user.Model.classes.Order;

import java.util.Comparator;

import modules.user.Model.classes.*;

public class Ordername implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		if(u1.getnom().compareTo(u2.getnom())>0)
			return 1;
		if(u1.getnom().compareTo(u2.getnom())<0)
			return -1;
		return 0;
	}
}
