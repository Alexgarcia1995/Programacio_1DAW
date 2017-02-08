package modules.user.Model.BLL.BLL_user.CRUD;

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.Model.BLL.BLL_user.*;
import modules.user.Model.Functions.*;
import modules.user.Model.Functions.Generics.Save;
import modules.user.Model.classes.*;


public class Funciones_create {
public static void create_admin(){
	int location=-1;
	Persona p1;
	p1=Funciones_Ejer_Genericos.Create_DNI_Generic(1);
	location=Funciones_find.find_admin((Admin) p1);
	if (location != -1) {
		JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_dni"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
	} else {
		p1 = Funciones_Ejer_Genericos.Create_Generic(1);
		Singleton.useradmin.add((Admin) p1);
}
}
public static void create_client(){
	int location=-1;
	Persona p1;
	p1=Funciones_Ejer_Genericos.Create_DNI_Generic(0);
	location=Funciones_find.find_client((Client) p1);
	if (location != -1) {
		JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_dni"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
	} else {
		p1 = Funciones_Ejer_Genericos.Create_Generic(0);
		Singleton.userclient.add((Client) p1);
		
}
}
public static void create_normal(){
	int location=-1;
	Persona p1;
	p1=Funciones_Ejer_Genericos.Create_DNI_Generic(2);
	location=Funciones_find.find_user((Normal) p1);
	if (location != -1) {
		JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_dni"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
	} else {
		p1 = Funciones_Ejer_Genericos.Create_Generic(2);
		Singleton.usernormal.add((Normal) p1);
		Save.save_auto_normal();
}
}
}
