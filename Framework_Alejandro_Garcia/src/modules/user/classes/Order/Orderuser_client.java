package modules.user.classes.Order;

import java.util.Comparator;

import modules.user.classes.*;

public class Orderuser_client implements Comparator <Persona> {
public int compare (Persona u1, Persona u2) {
		
	if (((Client)u1).getusername().compareTo(((Client)u2).getusername())>0){
		return 1;}
		else if(((Client)u1).getusername().compareTo(((Client)u2).getusername())<0){
			return -1;}
		else{
			return 0;}

	}
}
