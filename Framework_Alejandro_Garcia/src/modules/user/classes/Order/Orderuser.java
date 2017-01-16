package modules.user.classes.Order;

import java.util.Comparator;

import modules.user.classes.*;


public class Orderuser implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		
		
		if((u1 instanceof Admin)&&(u2 instanceof Admin)){
		if(((Admin)u1).getusername().compareTo(((Admin)u1).getusername())>0)
			return 1;
		if(((Admin)u1).getusername().compareTo(((Admin)u1).getusername())<0)
			return -1;
		}
		
		
		
		if((u1 instanceof Client)&&(u2 instanceof Client)){
			if(((Client)u1).getusername().compareTo(((Client)u1).getusername())>0)
				return 1;
			if(((Client)u1).getusername().compareTo(((Client)u1).getusername())<0)
				return -1;
			}
		
		
		
		
		if((u1 instanceof Normal)&&(u2 instanceof Normal)){
			if(((Normal)u1).getusername().compareTo(((Normal)u1).getusername())>0)
				return 1;
			if(((Normal)u1).getusername().compareTo(((Normal)u1).getusername())<0)
				return -1;
			}
		return 0;
	}


	}

