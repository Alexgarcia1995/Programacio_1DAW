package modules.user.utils.CRUD;

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.classes.*;
import modules.user.utils.Funciones_Ejer_Genericos;
import modules.user.utils.Funciones_find;
import modules.user.utils.Generics.Save;

public class Funciones_delete {

	public static void delete_admin(){
		int location=-1;
		Persona p1;
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		else{
			location=-1;
			p1=Funciones_Ejer_Genericos.Create_DNI_Generic(1);
			location=Funciones_find.find_admin((Admin) p1);
			if(location != -1){
				Singleton.useradmin.remove(location);
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("us_delete"));
			}
			else{
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_eliminar"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void delete_client(){
		int location=-1;
		Persona p1;
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		else{
			location=-1;
			p1=Funciones_Ejer_Genericos.Create_DNI_Generic(0);
			location=Funciones_find.find_client((Client) p1);
			if(location != -1){
				Singleton.userclient.remove(location);
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("us_delete"));
			}
			else{
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_eliminar"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	
	public static void delete_normal(){
		int location=-1;
		Persona p1;
		if(Singleton.usernormal.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		else{
			location=-1;
			p1=Funciones_Ejer_Genericos.Create_DNI_Generic(2);
			location=Funciones_find.find_user((Normal) p1);
			if(location != -1){
				Singleton.usernormal.remove(location);
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("us_delete"));
			}
			else{
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_eliminar"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
