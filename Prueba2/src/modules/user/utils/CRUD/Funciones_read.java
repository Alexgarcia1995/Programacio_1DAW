package modules.user.utils.CRUD;

import javax.swing.JOptionPane;

import modules.user.classes.*;
import modules.user.utils.Funciones_Ejer_Genericos;
import modules.user.utils.Funciones_find;
import utils.funciones;

public class Funciones_read {

	public static void read_admin(Persona p1){
		int menu=0, location=-1;
		
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay usuarios para eliminar");
		}
		else{
			String option[]={"Todos los usuarios", "Leer por DNI"};
			menu=funciones.menu(option, "Read", "Read");
			switch(menu){
			case 0:
				for (int i=0; i<Singleton.useradmin.size();i++){
					String cad="";
					cad=cad +(Singleton.useradmin.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				location=-1;
				p1=Funciones_Ejer_Genericos.Create_DNI_Generic(1);
				location=Funciones_find.find_admin((Admin) p1);
				if (location != -1){
					//p1=Singleton.useradmin.get(location);
					JOptionPane.showMessageDialog(null, Singleton.useradmin.get(location).toString());
				}
			}
		}
	}
	
	public static void read_client(Persona p1){
		int menu=0, location=-1;
		
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay usuarios para eliminar");
		}
		else{
			String option[]={"Todos los usuarios", "Leer por DNI"};
			menu=funciones.menu(option, "Read", "Read");
			switch(menu){
			case 0:
				for (int i=0; i<Singleton.userclient.size();i++){
					String cad="";
					cad=cad +(Singleton.userclient.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				location=-1;
				p1=Funciones_Ejer_Genericos.Create_DNI_Generic(1);
				location=Funciones_find.find_admin((Admin) p1);
				if (location != -1){
					//p1=Singleton.useradmin.get(location);
					JOptionPane.showMessageDialog(null, Singleton.userclient.get(location).toString());
				}
			}
		}
	}
	
	public static void read_normal(Persona p1){
		int menu=0, location=-1;
		
		if(Singleton.usernormal.isEmpty()){
			JOptionPane.showMessageDialog(null, "No hay usuarios para eliminar");
		}
		else{
			String option[]={"Todos los usuarios", "Leer por DNI"};
			menu=funciones.menu(option, "Read", "Read");
			switch(menu){
			case 0:
				for (int i=0; i<Singleton.usernormal.size();i++){
					String cad="";
					cad=cad +(Singleton.usernormal.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				location=-1;
				p1=Funciones_Ejer_Genericos.Create_DNI_Generic(2);
				location=Funciones_find.find_user((Normal) p1);
				if (location != -1){
					//p1=Singleton.useradmin.get(location);
					JOptionPane.showMessageDialog(null, Singleton.usernormal.get(location).toString());
				}
			}
		}
	}
}
