package modules.user.classes.Order;

import java.util.Comparator;

import modules.user.classes.Persona;

public class Orderdatebirthday implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		return u1.getFechanac().comparaFechas(u2.getFechanaix());
	}
}
