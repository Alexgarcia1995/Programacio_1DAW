
import java.util.ArrayList;

import javax.swing.JOptionPane;

import classes.Languages;
import classes.Settings;
import classes.Singleton_Login;
import modules.user.Model.Functions.Generics.*;
import modules.user.Model.BLL.BLL_user.CRUD.*;
import  utils.*;

public class Main_Framework2 {
	

	public static void main(String[] args) {
		int men = 0, men1 = 0;
		int menprin=0;
		int menlog=0;
		
		
		
		do{
			Settings.GetInstance();
			if (Settings.GetInstance().dummies==true){
				Main_Dummies.main(null);
			}
			String[] principal=funciones.Menu1();
			String[] option = funciones.Menu2();
			String[] option1 = funciones.Menu3();
			String[] login = {"Login","Register","Exit"};
			boolean good=false;
		menprin= funciones.menu(principal,Languages.lenguajes.getProperty("menu"),Languages.lenguajes.getProperty("menu"));
		switch(menprin){
		case 0:
		do{
			Open.Open_auto();
			men1 = funciones.menu(option1, Languages.lenguajes.getProperty("crear"), Languages.lenguajes.getProperty("opciones"));
			switch (men1) {
			// Cliente
			case 0:
				Singleton_Login.type_user="Client";
				do{	
				menlog=funciones.menu(login, Languages.lenguajes.getProperty("crear"), Languages.lenguajes.getProperty("opciones"));
				switch(menlog){
				case 0:
					good=signin_signup.Login();
					if (good!=false){
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
					}
					break;
				case 1:
					funciones.Register_client();
					Save.save_auto_client();
					break;
				}
				}while(menlog!=2);
				break;
			// Admins
			case 1:
				Singleton_Login.type_user="Admin";
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
				String[] option2= funciones.Menu4();
				men = funciones.menu(option2, Languages.lenguajes.getProperty("formato2"), Languages.lenguajes.getProperty("formato"));
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
				case 6:
					formatos.FormatTheme();
					break;
				}
			} while (men != 7);
			save_config.savejson();
			break;
			
		case 2:
			System.exit(0);
		}
		
		
}while(menprin != 2);
	}
}
