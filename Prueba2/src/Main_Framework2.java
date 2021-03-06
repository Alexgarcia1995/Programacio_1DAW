

import java.util.ArrayList;

import javax.swing.JOptionPane;

import classes.Languages;
import classes.Settings;
import modules.user.utils.*;
import modules.user.utils.CRUD.Funciones_create;
import modules.user.utils.CRUD.Funciones_delete;
import modules.user.utils.CRUD.Funciones_order;
import modules.user.utils.CRUD.Funciones_read;
import modules.user.utils.CRUD.Funciones_update;
import modules.user.classes.*;
import  utils.*;

public class Main_Framework2 {
	
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
			if(Settings.dummies==true){
				Main_Dummies.main(null);
			}
			String[] principal={lenguajes.getProperty("menu_p"),lenguajes.getProperty("opciones"),lenguajes.getProperty("exit")};
			String[] option = {lenguajes.getProperty("create"), lenguajes.getProperty("read"), lenguajes.getProperty("update"), lenguajes.getProperty("delete"),"Order",lenguajes.getProperty("exit") };
			String[] option1 = {lenguajes.getProperty("client"), lenguajes.getProperty("admin"), lenguajes.getProperty("normal"),lenguajes.getProperty("exit")};
			
		menprin= funciones.menu(principal,lenguajes.getProperty("menu"),lenguajes.getProperty("menu"));
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
						Funciones_create.create_client(p1);
						break;
					case 1:
						Funciones_read.read_client(p1);
						break;
					case 2:
						Funciones_update.update_client(p1);
						break;
					case 3:
						Funciones_delete.delete_client(p1);
						break;
					case 4:
						Funciones_order.order_client();
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
						Funciones_create.create_admin(p);
						break;
					case 1:
						Funciones_read.read_admin(p);
						break;
					case 2:
						Funciones_update.update_admin(p);
						break;
					case 3:
						Funciones_delete.delete_admin(p);
						break;
					case 4:
						Funciones_order.order_admin();
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
						Funciones_create.create_normal(p2);
						break;
					case 1:
						Funciones_read.read_normal(p2);
						break;
					case 2:
						Funciones_update.update_normal(p2);
						break;
					case 3:
						Funciones_delete.delete_normal(p2);
						break;
					case 4:
						Funciones_order.order_normal();
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
