package modules.user.utils.CRUD_Dummies;

import java.util.Collections;

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.classes.*;
import utils.funciones;
import modules.user.classes.Order.*;
public class Funciones_order_dummies {
	public static void order_admin () {
		String [] options = { "A)" + Languages.lenguajes.getProperty("dni"), "B) "+ Languages.lenguajes.getProperty("dni"), 
				"C) " + Languages.lenguajes.getProperty("nom"), "D)" + Languages.lenguajes.getProperty("fecha_naix"), 
				"E) " + Languages.lenguajes.getProperty("edad"), "F) " + Languages.lenguajes.getProperty("fecha_cont"), 
				"G) " + Languages.lenguajes.getProperty("salario")};
		String menu = "";
		char order = ' ';
		
		if(Singleton.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error"),Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
		}else{
			menu = funciones.combo_box(options, "Orden", "Orden");
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
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error"),Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
		}else{
			menu = funciones.combo_box(options, "Orden", "Orden");
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
		}
	}
	public static void order_normal() {
		String [] options = { "A)" + Languages.lenguajes.getProperty("dni"), "B)"+ Languages.lenguajes.getProperty("username"), 
				"C) " + Languages.lenguajes.getProperty("nom"), "D)" + Languages.lenguajes.getProperty("fecha_naix"), 
				"E) " + Languages.lenguajes.getProperty("edad") };
		String menu = "";
		char order = ' ';
		
		if(Singleton.usernormal.isEmpty()){
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error"),Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
		}else{
			menu = funciones.combo_box(options, "Orden", "Orden");
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
