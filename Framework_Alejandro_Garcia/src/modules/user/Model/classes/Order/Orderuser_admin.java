package modules.user.Model.classes.Order;

import java.util.Comparator;

import modules.user.Model.classes.*;


public class Orderuser_admin implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2) {
		
		
		
		if(((Admin)u1).getusername().compareTo(((Admin)u2).getusername())>0){
			return 1;
		}
			
		else if(((Admin)u1).getusername().compareTo(((Admin)u2).getusername())<0){
			return -1;}
		
		else{
		return 0;}
	}


	}

