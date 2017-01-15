package modules.user.classes.Order;

import java.util.Comparator;

import modules.user.classes.*;

public class Ordershopping implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		if(((Client)u1).getCompras()>((Client)u2).getCompras())
			return 1;
		if(((Client)u1).getCompras()<((Client)u2).getCompras())
			return -1;
		return 0;
	}
}
