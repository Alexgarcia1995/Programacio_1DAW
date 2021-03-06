package modules.user.utils.CRUD;

import javax.swing.JOptionPane;

import modules.user.classes.*;
import modules.user.utils.Funciones_Ejer_Genericos;
import modules.user.utils.Funciones_find;

public class Funciones_delete {

	public static void delete_admin(Persona p1){
		int location=-1;
		
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay usuarios para eliminar");
		}
		else{
			location=-1;
			p1=Funciones_Ejer_Genericos.Create_DNI_Generic(1);
			location=Funciones_find.find_admin((Admin) p1);
			if(location != -1){
				Singleton.useradmin.remove(location);
				JOptionPane.showMessageDialog(null, "Usuario eliminado");
			}
			else{
				JOptionPane.showMessageDialog(null, "No hay un usuario con ese DNI");
			}
		}
	}
	
	public static void delete_client(Persona p1){
		int location=-1;
		
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay usuarios para eliminar");
		}
		else{
			location=-1;
			p1=Funciones_Ejer_Genericos.Create_DNI_Generic(0);
			location=Funciones_find.find_client((Client) p1);
			if(location != -1){
				Singleton.userclient.remove(location);
				JOptionPane.showMessageDialog(null, "Usuario eliminado");
			}
			else{
				JOptionPane.showMessageDialog(null, "No hay un usuario con ese DNI");
			}
		}
	}
	
	
	public static void delete_normal(Persona p1){
		int location=-1;
		
		if(Singleton.usernormal.isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay usuarios para eliminar");
		}
		else{
			location=-1;
			p1=Funciones_Ejer_Genericos.Create_DNI_Generic(2);
			location=Funciones_find.find_user((Normal) p1);
			if(location != -1){
				Singleton.usernormal.remove(location);
				JOptionPane.showMessageDialog(null, "Usuario eliminado");
			}
			else{
				JOptionPane.showMessageDialog(null, "No hay un usuario con ese DNI");
			}
		}
	}
}
