

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
import modules.user.utils.Generics.Open;
import modules.user.utils.Generics.Save;
import modules.user.utils.admin.utils.open_auto;
import modules.user.classes.*;
import  utils.*;

public class Main_Framework2 {
	

	public static void main(String[] args) {
		int men = 0, men1 = 0;
		int menprin=0;
		
		
		
		
		do{
			Settings.GetInstance();
			if (Settings.GetInstance().dummies==true){
				Main_Dummies.main(null);
			}
			String[] principal={Languages.lenguajes.getProperty("menu_p"),Languages.lenguajes.getProperty("opciones"),Languages.lenguajes.getProperty("exit")};
			String[] option = {Languages.lenguajes.getProperty("create"), Languages.lenguajes.getProperty("read"), Languages.lenguajes.getProperty("update"), Languages.lenguajes.getProperty("delete"),"Order"
					,"Open","Save",Languages.lenguajes.getProperty("exit") };
			String[] option1 = {Languages.lenguajes.getProperty("client"), Languages.lenguajes.getProperty("admin"), Languages.lenguajes.getProperty("normal"),Languages.lenguajes.getProperty("exit")};
			
		menprin= funciones.menu(principal,Languages.lenguajes.getProperty("menu"),Languages.lenguajes.getProperty("menu"));
		switch(menprin){
		case 0:
		do{
			Open.Open_auto();
			men1 = funciones.menu(option1, Languages.lenguajes.getProperty("crear"), Languages.lenguajes.getProperty("opciones"));
			switch (men1) {
			// Cliente
			case 0:
				do {
					men = funciones.menu(option, Languages.lenguajes.getProperty("options"), Languages.lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						Funciones_create.create_client();
						break;
					case 1:
						Funciones_read.read_client();
						break;
					case 2:
						Funciones_update.update_client();
						break;
					case 3:
						Funciones_delete.delete_client();
						break;
					case 4:
						Funciones_order.order_client();
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
						Funciones_create.create_admin();
						break;
					case 1:
						Funciones_read.read_admin();
						break;
					case 2:
						Funciones_update.update_admin();
						break;
					case 3:
						Funciones_delete.delete_admin();
						break;
					case 4:
						Funciones_order.order_admin();
						break;
					case 5:
						Open.Open_admin();
						break;
					case 6:
						Save.save_on_demand_admin();;
						break;
					}
				} while (men != 7);
	
				Save.save_auto_admin();
				break;
				//Normal
			case 2:
				do {
					men = funciones.menu(option, Languages.lenguajes.getProperty("options"), Languages.lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						Funciones_create.create_normal();
						break;
					case 1:
						Funciones_read.read_normal();
						break;
					case 2:
						Funciones_update.update_normal();
						break;
					case 3:
						Funciones_delete.delete_normal();
						break;
					case 4:
						Funciones_order.order_normal();
						break;
					case 5:
						Open.Open_normal();
						break;
					case 6:
						Save.save_on_demand_normal();
						break;
					}
				} while (men != 7);
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
