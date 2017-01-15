package modules.user.classes.Order;

import java.util.Comparator;
import modules.user.classes.*;

public class Orderdateup implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		return ((Client)u1).getFechaalta().comparaFechas(((Client)u2).getFecha_alta());
	}
}
