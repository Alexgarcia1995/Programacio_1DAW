package modules.user.utils.CRUD;

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.classes.Admin;
import modules.user.classes.Client;
import modules.user.classes.Normal;
import modules.user.classes.Persona;
import modules.user.classes.Singleton;
import modules.user.utils.Funciones_Ejer_Genericos;
import modules.user.utils.Funciones_find;

public class Funciones_create {
public static void create_admin(Persona p1){
	int location=-1;
	
	p1=Funciones_Ejer_Genericos.Create_DNI_Generic(1);
	location=Funciones_find.find_admin((Admin) p1);
	if (location != -1) {
		JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("usererror2"),Languages.lenguajes.getProperty("usererror2"), JOptionPane.ERROR_MESSAGE);
	} else {
		p1 = Funciones_Ejer_Genericos.Create_Generic(1);
		Singleton.useradmin.add((Admin) p1);
}
}
public static void create_client(Persona p1){
	int location=-1;
	
	p1=Funciones_Ejer_Genericos.Create_DNI_Generic(0);
	location=Funciones_find.find_client((Client) p1);
	if (location != -1) {
		JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("usererror2"),Languages.lenguajes.getProperty("usererror2"), JOptionPane.ERROR_MESSAGE);
	} else {
		p1 = Funciones_Ejer_Genericos.Create_Generic(0);
		Singleton.userclient.add((Client) p1);
}
}
public static void create_normal(Persona p1){
	int location=-1;
	
	p1=Funciones_Ejer_Genericos.Create_DNI_Generic(2);
	location=Funciones_find.find_user((Normal) p1);
	if (location != -1) {
		JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("usererror2"),Languages.lenguajes.getProperty("usererror2"), JOptionPane.ERROR_MESSAGE);
	} else {
		p1 = Funciones_Ejer_Genericos.Create_Generic(2);
		Singleton.usernormal.add((Normal) p1);
}
}
}
