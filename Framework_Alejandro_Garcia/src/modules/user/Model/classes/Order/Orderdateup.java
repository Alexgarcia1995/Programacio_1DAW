package modules.user.Model.classes.Order;

import java.util.Comparator;
import modules.user.Model.classes.*;

public class Orderdateup implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		return ((Client)u1).getFechaalta().comparaFechas1(((Client)u2).getFechaalta());
	}
}
