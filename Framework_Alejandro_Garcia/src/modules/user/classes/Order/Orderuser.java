package modules.user.classes.Order;

import java.util.Comparator;

import modules.user.classes.*;


public class Orderuser implements Comparator <Persona>{

	public int compare (Persona u1, Persona u2,int i) {
		if(i==0){
		if(((Admin)u1).getusername().compareTo(((Admin)u1).getusername())>0)
			return 1;
		if(((Admin)u1).getusername().compareTo(((Admin)u1).getusername())<0)
			return -1;
		}
		if(i==1){
			if(((Client)u1).getusername().compareTo(((Client)u1).getusername())>0)
				return 1;
			if(((Client)u1).getusername().compareTo(((Client)u1).getusername())<0)
				return -1;
			}
		if(i==2){
			if(((Normal)u1).getusername().compareTo(((Normal)u1).getusername())>0)
				return 1;
			if(((Normal)u1).getusername().compareTo(((Normal)u1).getusername())<0)
				return -1;
			}
		return 0;
	}

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	}

