
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.google.gson.JsonArray;

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
import modules.user.utils.Generics.Open;
import modules.user.utils.Generics.Save;
import modules.user.utils.admin.utils.open_auto;
import modules.user.utils.admin.utils.open_on_demand;
import modules.user.utils.admin.utils.save_auto;
import modules.user.utils.admin.utils.save_on_demand;
import modules.user.utils.client.utils.open_auto_client;
import modules.user.utils.client.utils.open_on_demand_client;
import modules.user.utils.client.utils.save_auto_client;
import modules.user.utils.client.utils.save_on_demand_client;
import modules.user.utils.normal.utils.open_auto_normal;
import modules.user.utils.normal.utils.open_on_demand_normal;
import modules.user.utils.normal.utils.save_auto_normal;
import modules.user.utils.normal.utils.save_on_demand_normal;
public class Main_Dummies {
	public static Settings settings=null;
	public static Languages lenguajes=Languages.lenguajes;
	
	public static void main(String[] args) {
		int men = 0, men1 = 0;
		String cad = "";
		
		settings=new Settings();
		Singleton.useradmin = new ArrayList <Admin> ();
		Singleton.userclient = new ArrayList <Client> ();
		Singleton.usernormal = new ArrayList <Normal> ();

		Persona p1=null;
		int menprin=0;
		
		//Singleton.useradmin = open_auto.openjson();
		do{
			
			/*if(Settings.dummies==false){
				Main_Framework2.main(null);
			}
			*/
			//Open.Open_auto();
			String[] principal={lenguajes.getProperty("menu_p"),lenguajes.getProperty("opciones"),lenguajes.getProperty("exit")};
			String[] option = {lenguajes.getProperty("create"), lenguajes.getProperty("read"), lenguajes.getProperty("update"), lenguajes.getProperty("delete"),"Order"
					,"Open","Save",lenguajes.getProperty("exit") };
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
						Funciones_create_dummies.create_client();
						break;
					case 1:
						Funciones_read_dummies.read_client();
						break;
					case 2:
						Funciones_update_dummies.update_client();
						break;
					case 3:
						Funciones_delete_dummies.delete_client();
						break;
					case 4:
						Funciones_order_dummies.order_client();
						break;
					case 5:
						Open.Open_client();
						break;
					case 6:
						Save.save_on_demand_client();
						break;
					}
				} while (men != 7);
			//	Save.save_auto_client();
				break;
			// Admins
			case 1:
				do {
					
					men = funciones.menu(option, lenguajes.getProperty("options"), lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						Funciones_create_dummies.create_admin();
						break;
					case 1:
						Funciones_read_dummies.read_admin();
						break;
					case 2:
						Funciones_update_dummies.update_admin();
						break;
					case 3:
						Funciones_delete_dummies.delete_admin();
						break;
					case 4:
						Funciones_order_dummies.order_admin();
						break;
					case 5:
						Open.Open_admin();
						break;
					case 6:
						save_on_demand.save_json2((Admin) p1);
						break;
					}
				} while (men != 7);
				//save_auto.savejson2();
				//Save.save_auto_admin();
				break;
				//Normal
			case 2:
				do {
					men = funciones.menu(option, lenguajes.getProperty("options"), lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						Funciones_create_dummies.create_normal();
						break;
					case 1:
						Funciones_read_dummies.read_normal();
						break;
					case 2:
						Funciones_update_dummies.update_normal();
						break;
					case 3:
						Funciones_delete_dummies.delete_normal();
						break;
					case 4:
						Funciones_order_dummies.order_normal();
						break;
					case 5:
						Open.Open_normal();
						break;
					case 6:
						Save.save_on_demand_normal();
					}
				} while (men != 7);
				//Save.save_auto_normal();
				break;
			}
		} while (men1 != 3) ;
		break;
		
		
		case 1:
			do {
				String[] option2= {lenguajes.getProperty("fecha"), lenguajes.getProperty("moneda"), lenguajes.getProperty("decimales"), 
						lenguajes.getProperty("lenguajes"),"Dummies","Formato",lenguajes.getProperty("exit")};
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
				case 5:
					Settings.Formatfitx();
					break;
				}
			} while (men != 6);
			break;
			
			
		case 2:
			System.exit(0);
		}
		
		
}while(menprin != 2);
	}
}

