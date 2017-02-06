
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.google.gson.JsonArray;

import classes.Languages;
import classes.Settings;
import classes.Singleton_app;
import modules.user.classes.Admin;
import modules.user.classes.Client;
import modules.user.classes.Normal;
import modules.user.classes.Persona;
import modules.user.classes.Singleton;
import utils.formatos;
import utils.funciones;
import utils.open_config;
import utils.save_config;
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
	
	
	public static void main(String[] args) {
		int men = 0, men1 = 0;
		int menprin=0;
		
		do{
			Settings.GetInstance();
			if (Settings.GetInstance().dummies==false){
				Main_Framework2.main(null);
			}
			String[] principal={Languages.lenguajes.getProperty("menu_p"),Languages.lenguajes.getProperty("opciones"),Languages.lenguajes.getProperty("exit")};
			String[] option = {Languages.lenguajes.getProperty("create"), Languages.lenguajes.getProperty("read"), Languages.lenguajes.getProperty("update"), Languages.lenguajes.getProperty("delete"),"Order"
					,"Open","Save",Languages.lenguajes.getProperty("exit") };
			String[] option1 = {Languages.lenguajes.getProperty("client"), Languages.lenguajes.getProperty("admin"), Languages.lenguajes.getProperty("normal"),Languages.lenguajes.getProperty("exit")};
			
		menprin= funciones.menu(principal, Languages.lenguajes.getProperty("menu") + "("+ Languages.lenguajes.getProperty("dummies")+")",Languages.lenguajes.getProperty("menu_p"));
		switch(menprin){
		case 0:
		do{
			men1 = funciones.menu(option1, Languages.lenguajes.getProperty("crear"), Languages.lenguajes.getProperty("opciones"));
			switch (men1) {
			// Cliente
			case 0:
				do {
					men = funciones.menu(option, Languages.lenguajes.getProperty("options"), Languages.lenguajes.getProperty("opciones"));
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
				Save.save_auto_client();
				break;
			// Admins
			case 1:
				do {
					
					men = funciones.menu(option, Languages.lenguajes.getProperty("options"), Languages.lenguajes.getProperty("opciones"));
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
						Save.save_on_demand_admin();
						break;
					}
				} while (men != 7);
				//save_auto.savejson2();
				Save.save_auto_admin();
				break;
				//Normal
			case 2:
				do {
					men = funciones.menu(option, Languages.lenguajes.getProperty("options"), Languages.lenguajes.getProperty("opciones"));
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
				Save.save_auto_normal();
				break;
			}
		} while (men1 != 3) ;
		break;
		
		case 1:
			do {
				String[] option2= {Languages.lenguajes.getProperty("fecha"), Languages.lenguajes.getProperty("moneda"), Languages.lenguajes.getProperty("decimales"), 
						Languages.lenguajes.getProperty("lenguajes"),"Dummies","Formato",Languages.lenguajes.getProperty("exit")};
				men = funciones.menu(option2, Languages.lenguajes.getProperty("formato"), Languages.lenguajes.getProperty("formato2"));
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
					Languages.Lengua(Languages.lenguajes);
					break;
				case 4:
					formatos.Dummies();
					break;
				case 5:
					formatos.Formatfitx();
					break;
				}
			} while (men != 6);
			save_config.savejson();
			break;
			
			
		case 2:
			System.exit(0);
		}
		
		
}while(menprin != 2);
	}
}

