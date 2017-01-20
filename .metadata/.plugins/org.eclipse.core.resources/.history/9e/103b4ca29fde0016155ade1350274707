package modules.user.classes.Order;

import java.util.Comparator;

import javax.swing.JOptionPane;

import modules.user.classes.Admin;
import modules.user.classes.Client;
import modules.user.classes.Normal;
import modules.user.classes.Persona;

public class Orderuser_normal implements Comparator <Persona> {
public int compare (Persona u1, Persona u2) {
	int i;
				if (((Normal)u1).getusername().compareTo(((Normal)u2).getusername())>0){
				i= 1;}
				else if(((Normal)u1).getusername().compareTo(((Normal)u2).getusername())<0){
				i= -1;}
				else{
					i= 0;}
		
		JOptionPane.showMessageDialog(null, i);
		return i;
		
	}
}
