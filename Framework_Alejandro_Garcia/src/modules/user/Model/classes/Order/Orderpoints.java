package modules.user.Model.classes.Order;
import java.util.Comparator;

import modules.user.Model.classes.*;


public class Orderpoints implements Comparator <Persona>{
	
	public int compare(Persona u1, Persona u2) {
		
		if(((Normal)u1).getPoints() > ((Normal)u2).getPoints())
			return 1;
		if(((Normal)u1).getPoints() < ((Normal)u2).getPoints())
			return -1;
		return 0;
	}
}




