package modules.user.Model.classes.Order;

import java.util.Comparator;
import modules.user.Model.classes.*;

public class Ordersalary implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		if(((Admin)u1).getSalario().compareTo(((Admin)u2).getSalario())>0)
			return 1;
		if(((Admin)u1).getSalario().compareTo(((Admin)u2).getSalario())<0)
			return -1;
		return 0;
	}
}