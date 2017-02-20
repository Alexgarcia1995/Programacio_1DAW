package modules.user.Model.BLL.BLL_user.CRUD;

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.Model.BLL.BLL_user.*;
import modules.user.Model.Functions.*;
import modules.user.Model.Functions.Generics.Save;
import modules.user.Model.classes.*;
import utils.funciones;

public class Funciones_update {
	public static void update_admin () {
		int location = -1;
		Persona a1;
		String [] menu={Languages.lenguajes.getProperty("update")+" "+Languages.lenguajes.getProperty("client"),
				Languages.lenguajes.getProperty("update")+" "+Languages.lenguajes.getProperty("admin"),Languages.lenguajes.getProperty("exit")};
		int menus = funciones.menu(menu, Languages.lenguajes.getProperty("crear"), Languages.lenguajes.getProperty("opciones"));
		
			switch(menus){
			case 0:
				Funciones_update.update_client2();
				break;
			case 1:
				if(Singleton.useradmin.isEmpty()){
					JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
				}else{
					location = -1;
					a1=Funciones_find.IDadmin();
					location=Funciones_find.find_admin((Admin) a1);
					if(location != -1){
						a1=Singleton.useradmin.get(location);
						Funciones_Ejer_Genericos.Update_Generic(a1);
						Singleton.useradmin.set(location, (Admin) a1);
					}
					else {
						JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_act"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
					}
					}
				break;
			}
		
}
	
	
	
	
	public static void update_client () {
		int location = -1;
		Persona a1;
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}else{
			location = Funciones_find.find_nom_user();
			if (location != -1) {
				a1=Singleton.userclient.get(location);
				Funciones_Ejer_Genericos.Update_Generic(a1);
				Singleton.userclient.set(location, (Client) a1);
			}
			else {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_act"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
			}
}
	
	public static void update_client2(){

		int location = -1;
		Persona a1;
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			a1=Funciones_find.IDClient();
			location=Funciones_find.find_client((Client) a1);
			if(location != -1){
				a1=Singleton.userclient.get(location);
				Funciones_Ejer_Genericos.Update_Generic(a1);
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
			a1=Funciones_find.IDNormal();
			location=Funciones_find.find_user((Normal) a1);
			if(location != -1){
				a1=Singleton.usernormal.get(location);
				Funciones_Ejer_Genericos.Update_Generic(a1);
				Singleton.usernormal.set(location, (Normal) a1);
				Save.save_auto_normal();
			}
			else {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_act"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
			}
			}
}
	
	public static String update_dni_client(){
		String valor="";
		int location=-1;
		do{
		valor=Funciones_data_user.PideDNI();
		location=Funciones_find.find_dni_client(valor);
		if (location!=-1){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_dni"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		}while(location!=-1);
		return valor;
	}
	public static String update_dni_admin(){
		String valor="";
		int location=-1;
		do{
		valor=Funciones_data_user.PideDNI();
		location=Funciones_find.find_dni_admin(valor);
		if (location!=-1){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_dni"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		}while(location!=-1);
		return valor;
	}
}