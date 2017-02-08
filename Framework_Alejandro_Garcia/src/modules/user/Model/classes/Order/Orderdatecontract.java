package modules.user.Model.classes.Order;

import java.util.Comparator;
import modules.user.Model.classes.*;

public class Orderdatecontract implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		return ((Admin)u1).getAniocon().comparaFechas1(((Admin)u2).getAniocon());
	}
}
