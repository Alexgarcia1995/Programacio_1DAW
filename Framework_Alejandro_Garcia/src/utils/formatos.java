package utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import classes.Languages;
import classes.Settings;
import modules.user.utils.Funciones_fecha;


public class formatos {
	public static String moneda="€";
	public static String decimal=".#";
	public static String formato="dd/mm/yyyy";
	public static boolean bool=true;
	public static String Formatfitx="xml";
	
	
	
	public static String format1d(double number){
		DecimalFormat format1 = new DecimalFormat(".#");
		return format1.format(number);
	}
	
	public static String format2d(double number){
		DecimalFormat format1 = new DecimalFormat(".##");
		return format1.format(number);
	}
	
	public static String format3d(double number){
		DecimalFormat format1 = new DecimalFormat(".###");
		return format1.format(number);
	}

	public static void Formatomoneda(){
		int menu=0;
    	String [] option={"Dolar", "Libra", "Euros", "Exit"};
		menu=funciones.menu(option, Languages.lenguajes.getProperty("moneda"),  Languages.lenguajes.getProperty("moneda"));
		switch (menu){
		case 0:
			moneda="$";
			Settings.GetInstance().setCurrency_config(moneda);
			break;
		case 1:
			moneda="£";
			Settings.GetInstance().setCurrency_config(moneda);
			break;
		case 2:
			moneda="€";
			Settings.GetInstance().setCurrency_config(moneda);
			break;
		case 3:
			break;
		}
		}
		public static void Formatdecimal(){
			int menu=0;
	    	String [] option={".#", ".##", ".###", "Exit"};
			menu=funciones.menu(option, Languages.lenguajes.getProperty("decimales"),  Languages.lenguajes.getProperty("decimales"));
			switch (menu){
			case 0:
				decimal=".#";
				Settings.GetInstance().setDecimals_config(decimal);
				break;
			case 1:
				decimal=".##";
				Settings.GetInstance().setDecimals_config(decimal);
				break;
			case 2:
				decimal=".###";
				Settings.GetInstance().setDecimals_config(decimal);
				break;
			case 3:
				break;
			}
	}
		public static String ValorDecimal(String format,double moneda){
			String decimales="";
			switch (format){
			case ".#":
				decimales=formatos.format1d(moneda);
				break;
			case ".##":
				decimales=formatos.format2d(moneda);
				break;
			case ".###":
				decimales=formatos.format3d(moneda);
				break;
			}
			return decimales;
	}
		public static void Formatfecha(){
			int menu=0;
	    	String [] option={"dd/mm/yyyy", "dd-mm-yyyy", "yyyy/mm/dd", "yyyy-mm-dd" };
			menu=funciones.menu(option, Languages.lenguajes.getProperty("fecha"),Languages.lenguajes.getProperty("fecha"));
			switch (menu){
			case 0:
				formato="dd/mm/yyyy";
				Settings.GetInstance().setDate_config(formato);
				break;
			case 1:
				formato="dd-mm-yyyy";
				Settings.GetInstance().setDate_config(formato);
				break;
			case 2:
				formato="yyyy/mm/dd";
				Settings.GetInstance().setDate_config(formato);
				break;
			case 3:
				formato="yyyy-mm-dd";
				Settings.GetInstance().setDate_config(formato);
				break;
			}
		}
		public static void Dummies(){
			int menu=0;
    	String [] option={"Modo Normal","Modo Dummies"};
		menu=funciones.menu(option, Languages.lenguajes.getProperty("fecha"),Languages.lenguajes.getProperty("fecha"));
		switch (menu){
		case 0:
			bool=false;
			Settings.GetInstance().setDummies(false);
			break;
		case 1:
			bool=true;
			Settings.GetInstance().setDummies(true);
			break;
		}
		}
		public static void Formatfitx(){
			int menu=0;
	    	String [] option={"xml", "json", "txt", "Exit"};
			menu=funciones.menu(option, "Formato",  "Formato");
			switch (menu){
			case 0:
				Formatfitx="xml";
				Settings.instance.setFormatfitx(Formatfitx);
				break;
			case 1:
				Formatfitx="json";
				Settings.instance.setFormatfitx(Formatfitx);
				break;
			case 2:
				Formatfitx="txt";
				Settings.instance.setFormatfitx(Formatfitx);
				break;
			case 3:
				break;
			}
	}
}
