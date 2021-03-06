package modules.user.Model.BLL.BLL_user.CRUD;

import java.util.Collections;

import javax.swing.JOptionPane;

import classes.Languages;
import utils.funciones;
import modules.user.Model.Functions.Generics.Open;
import modules.user.Model.Functions.Generics.Save;
import modules.user.Model.classes.*;
import modules.user.Model.classes.Order.*;
public class Funciones_order {
	public static void order_admin () {
		String [] options = { "A)" + Languages.lenguajes.getProperty("dni"), "B) "+ Languages.lenguajes.getProperty("dni"), 
				"C) " + Languages.lenguajes.getProperty("nom"), "D)" + Languages.lenguajes.getProperty("fecha_naix"), 
				"E) " + Languages.lenguajes.getProperty("edad"), "F) " + Languages.lenguajes.getProperty("fecha_cont"), 
				"G) " + Languages.lenguajes.getProperty("salario")};
		String menu = "";
		char order = ' ';
		
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}else{
			menu = funciones.combo_box(options, Languages.lenguajes.getProperty("orden2"),Languages.lenguajes.getProperty("orden"));
			order = menu.charAt(0);
			switch (order) {
				case 'A':
					Collections.sort(Singleton.useradmin);
					break;
				case 'B':
					Collections.sort(Singleton.useradmin, new Orderuser_admin());
					break;
				case 'C':
					Collections.sort(Singleton.useradmin, new Ordername());
					break;
				case 'D':
					Collections.sort(Singleton.useradmin, new Orderdatebirthday());
					break;
				case 'E':
					Collections.sort(Singleton.useradmin, new Orderage());
					break;
				case 'F':
					Collections.sort(Singleton.useradmin, new Orderdatecontract());
					break;
				case 'G':
					Collections.sort(Singleton.useradmin, new Ordersalary());
					break;
			}
		}
	}
	public static void order_client() {
		String [] options = { "A)" + Languages.lenguajes.getProperty("dni"), "B) "+ Languages.lenguajes.getProperty("username"), 
				"C) " + Languages.lenguajes.getProperty("nom"), "D)" + Languages.lenguajes.getProperty("fecha_naix"), 
				"E) " + Languages.lenguajes.getProperty("edad") , "F) " + Languages.lenguajes.getProperty("fecha_alta"), 
				"G) " + Languages.lenguajes.getProperty("compras") };
		String menu = "";
		char order = ' ';
		
		if(Singleton.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}else{
			menu = funciones.combo_box(options, Languages.lenguajes.getProperty("orden2"),Languages.lenguajes.getProperty("orden"));
			order = menu.charAt(0);
			switch (order) {
				case 'A':
					Collections.sort(Singleton.userclient);
					break;
				case 'B':
					Collections.sort(Singleton.userclient, new Orderuser_client());
					break;
				case 'C':
					Collections.sort(Singleton.userclient, new Ordername());
					break;
				case 'D':
					Collections.sort(Singleton.userclient, new Orderdatebirthday());
					break;
				case 'E':
					Collections.sort(Singleton.userclient, new Orderage());
					break;
				case 'F':
					Collections.sort(Singleton.userclient, new Orderdateup());
					break;
				case 'G':
					Collections.sort(Singleton.userclient, new Ordershopping());
					break;
			}
			Save.save_auto_client();
		}
	}
	
	public static void order_superadmin(){
		int menu=0;
		String[] menus={Languages.lenguajes.getProperty("orden")+" "+Languages.lenguajes.getProperty("client"),
				Languages.lenguajes.getProperty("orden")+" "+Languages.lenguajes.getProperty("admin"),Languages.lenguajes.getProperty("exit")};
		menu=funciones.menu(menus, Languages.lenguajes.getProperty("open"), Languages.lenguajes.getProperty("open"));
		switch (menu){
		case 0:
			Funciones_order.order_client();
			break;
		case 1:
			Funciones_order.order_admin();
			break;
		case 2:
			break;
		}
	}
	public static void order_normal() {
		String [] options = { "A)" + Languages.lenguajes.getProperty("dni"), "B)"+ Languages.lenguajes.getProperty("username"), 
				"C) " + Languages.lenguajes.getProperty("nom"), "D)" + Languages.lenguajes.getProperty("fecha_naix"), 
				"E) " + Languages.lenguajes.getProperty("edad") };
		String menu = "";
		char order = ' ';
		
		if(Singleton.usernormal.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_vac"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		}else{
			menu = funciones.combo_box(options, Languages.lenguajes.getProperty("orden2"),Languages.lenguajes.getProperty("orden"));
			order = menu.charAt(0);
			switch (order) {
				case 'A':
					Collections.sort(Singleton.usernormal);
					break;
				case 'B':
					Collections.sort(Singleton.usernormal, new Orderuser_normal());
					break;
				case 'C':
					Collections.sort(Singleton.usernormal, new Ordername());
					break;
				case 'D':
					Collections.sort(Singleton.usernormal, new Orderdatebirthday());
					break;
				case 'E':
					Collections.sort(Singleton.usernormal, new Orderage());
					break;
				
			}
		}
	}
}
