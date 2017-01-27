package modules.user.utils.CRUD_Dummies;

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.classes.*;
import modules.user.utils.Funciones_Ejer_Dummies;
import modules.user.utils.Funciones_find;

public class Funciones_update_dummies {
	public static void update_admin () {
		int location = -1;
		Persona a1;
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			a1=Funciones_Ejer_Dummies.Create_DNI_Generic(1);
			location=Funciones_find.find_admin((Admin) a1);
			if(location != -1){
				a1=Singleton.useradmin.get(location);
				Funciones_Ejer_Dummies.Update_Generic(a1);
				Singleton.useradmin.set(location, (Admin) a1);
			}
			else {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_act"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
			}
}
	
	
	
	
	public static void update_client () {
		int location = -1;
		Persona a1;
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			a1=Funciones_Ejer_Dummies.Create_DNI_Generic(0);
			location=Funciones_find.find_client((Client) a1);
			if(location != -1){
				a1=Singleton.userclient.get(location);
				Funciones_Ejer_Dummies.Update_Generic(a1);
				Singleton.userclient.set(location, (Client) a1);
			}
			else {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_act"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
			}
}
	
	
	
	public static void update_normal () {
		int location = -1;
		Persona a1;
		if(Singleton.usernormal.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			a1=Funciones_Ejer_Dummies.Create_DNI_Generic(2);
			location=Funciones_find.find_user((Normal) a1);
			if(location != -1){
				a1=Singleton.usernormal.get(location);
				Funciones_Ejer_Dummies.Update_Generic(a1);
				Singleton.usernormal.set(location, (Normal) a1);
			}
			else {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_act"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
			}
}
}