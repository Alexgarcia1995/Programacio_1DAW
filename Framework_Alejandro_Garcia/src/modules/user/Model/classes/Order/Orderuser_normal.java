package modules.user.Model.classes.Order;

import java.util.Comparator;

import javax.swing.JOptionPane;

import modules.user.Model.classes.*;

public class Orderuser_normal implements Comparator <Persona> {
public int compare (Persona u1, Persona u2) {
				if (((Normal)u1).getusername().compareTo(((Normal)u2).getusername())>0){
				return 1;}
				else if(((Normal)u1).getusername().compareTo(((Normal)u2).getusername())<0){
				return -1;}
				else{
					return 0;}
	}
}
