package framework_v1_5.module.classes.order;

import java.util.Comparator;

import framework_v1_5.module.classes.User;

public class Ordersurname implements Comparator <User>{

	public int compare (User u1, User u2) {
		if(u1.getSurname().compareTo(u2.getSurname())>0)
			return 1;
		if(u1.getSurname().compareTo(u2.getSurname())<0)
			return -1;
		return 0;
	}
}
