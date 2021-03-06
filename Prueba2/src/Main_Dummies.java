
import java.util.ArrayList;

import javax.swing.JOptionPane;

import classes.Languages;
import classes.Settings;
import modules.user.classes.Admin;
import modules.user.classes.Client;
import modules.user.classes.Normal;
import modules.user.classes.Persona;
import modules.user.classes.Singleton;
import utils.formatos;
import utils.funciones;
import modules.user.utils.CRUD_Dummies.*;
public class Main_Dummies {
	public static Settings settings=null;
	public static Languages lenguajes=Languages.lenguajes;
	
	public static void main(String[] args) {
		int men = 0, men1 = 0;
		String cad = "";
		Persona p=null;
		Persona p1=null;
		Persona p2=null;
		
		settings=new Settings();
		Singleton.useradmin = new ArrayList <Admin> ();
		Singleton.userclient = new ArrayList <Client> ();
		Singleton.usernormal = new ArrayList <Normal> ();
	

		int menprin=0;
		
		
		
		
		do{
			if(Settings.dummies==false){
				Main_Framework2.main(null);
			}
			String[] principal={lenguajes.getProperty("menu_p"),lenguajes.getProperty("opciones"),lenguajes.getProperty("exit")};
			String[] option = {lenguajes.getProperty("create"), lenguajes.getProperty("read"), lenguajes.getProperty("update"), lenguajes.getProperty("delete"),"Order",lenguajes.getProperty("exit") };
			String[] option1 = {lenguajes.getProperty("client"), lenguajes.getProperty("admin"), lenguajes.getProperty("normal"),lenguajes.getProperty("exit")};
			
		menprin= funciones.menu(principal, lenguajes.getProperty("menu") + "("+ lenguajes.getProperty("dummies")+")",lenguajes.getProperty("menu_p"));
		switch(menprin){
		case 0:
		do{
			
			men1 = funciones.menu(option1, lenguajes.getProperty("crear"), lenguajes.getProperty("opciones"));
			switch (men1) {
			// Cliente
			case 0:
				do {
					men = funciones.menu(option, lenguajes.getProperty("options"), lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						Funciones_create_dummies.create_client(p1);
						break;
					case 1:
						Funciones_read_dummies.read_client(p1);
						break;
					case 2:
						Funciones_update_dummies.update_client(p1);
						break;
					case 3:
						Funciones_delete_dummies.delete_client(p1);
						break;
					case 4:
						Funciones_order_dummies.order_client();
						break;
					}
					
				} while (men != 5);
				break;
			// Admins
			case 1:
				do {
					men = funciones.menu(option, lenguajes.getProperty("options"), lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						Funciones_create_dummies.create_admin(p);
						break;
					case 1:
						Funciones_read_dummies.read_admin(p);
						break;
					case 2:
						Funciones_update_dummies.update_admin(p);
						break;
					case 3:
						Funciones_delete_dummies.delete_admin(p);
						break;
					case 4:
						Funciones_order_dummies.order_admin();
						break;
					}
				} while (men != 5);
				break;
				//Normal
			case 2:
				do {
					men = funciones.menu(option, lenguajes.getProperty("options"), lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						Funciones_create_dummies.create_normal(p2);
						break;
					case 1:
						Funciones_read_dummies.read_normal(p2);
						break;
					case 2:
						Funciones_update_dummies.update_normal(p2);
						break;
					case 3:
						Funciones_delete_dummies.delete_normal(p2);
						break;
					case 4:
						Funciones_order_dummies.order_normal();
						break;
					}
				} while (men != 5);
				break;
				
			}
		} while (men1 != 3) ;
		break;
		
		
		case 1:
			do {
				String[] option2= {lenguajes.getProperty("fecha"), lenguajes.getProperty("moneda"), lenguajes.getProperty("decimales"), lenguajes.getProperty("lenguajes"),"Dummies",lenguajes.getProperty("exit")};
				men = funciones.menu(option2, lenguajes.getProperty("formato"), lenguajes.getProperty("formato2"));
				switch (men) {
				case 0:
					formatos.Formatfecha();
					break;
				case 1:
					formatos.Formatomoneda();
					break;
				case 2:
					formatos.Formatdecimal();
					break;
				case 3:
					Languages.Lengua(lenguajes);
					break;
				case 4:
					formatos.Dummies();
					break;
				}
			} while (men != 5);
			break;
			
			
		case 2:
			System.exit(0);
		}
		
		
}while(menprin != 2);
	}
}

