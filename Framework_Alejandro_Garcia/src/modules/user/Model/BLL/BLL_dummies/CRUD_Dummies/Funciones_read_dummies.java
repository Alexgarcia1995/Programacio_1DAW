package modules.user.Model.BLL.BLL_dummies.CRUD_Dummies;

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.Model.BLL.BLL_dummies.*;
import modules.user.Model.Functions.*;
import modules.user.Model.classes.*;

import utils.funciones;

public class Funciones_read_dummies {

	public static void read_admin(){
		int menu=0, location=-1;
		Persona p1;
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		else{
			String option[]={Languages.lenguajes.getProperty("usuarios"), Languages.lenguajes.getProperty("us_dni")};
			menu=funciones.menu(option, Languages.lenguajes.getProperty("read"), Languages.lenguajes.getProperty("read"));
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
				p1=Funciones_find.IDadmin();
				location=Funciones_find.find_admin((Admin) p1);
				if (location != -1){
					//p1=Singleton.useradmin.get(location);
					JOptionPane.showMessageDialog(null, Singleton.useradmin.get(location).toString());
				}
				else{
					JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_lec"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
		}
	}
	
	public static void read_client(){
		int menu=0, location=-1;
		Persona p1;
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		else{
			String option[]={Languages.lenguajes.getProperty("usuarios"), Languages.lenguajes.getProperty("us_dni")};
			menu=funciones.menu(option, Languages.lenguajes.getProperty("read"), Languages.lenguajes.getProperty("read"));
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
				p1=Funciones_find.IDClient();
				location=Funciones_find.find_client((Client) p1);
				if (location != -1){
					//p1=Singleton.useradmin.get(location);
					JOptionPane.showMessageDialog(null, Singleton.userclient.get(location).toString());
				}
				else{
					JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_lec"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
		}
	}
	
	public static void read_normal(){
		int menu=0, location=-1;
		Persona p1;
		if(Singleton.usernormal.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}
		else{
			String option[]={Languages.lenguajes.getProperty("usuarios"), Languages.lenguajes.getProperty("us_dni")};
			menu=funciones.menu(option, Languages.lenguajes.getProperty("read"), Languages.lenguajes.getProperty("read"));
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
				p1=Funciones_find.IDNormal();
				location=Funciones_find.find_user((Normal) p1);
				if (location != -1){
					//p1=Singleton.useradmin.get(location);
					JOptionPane.showMessageDialog(null, Singleton.usernormal.get(location).toString());
				}
				else{
					JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_lec"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
		}
	}
}
