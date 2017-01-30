package classes;

import java.io.Serializable;
import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import modules.user.classes.*;
import modules.user.classes.Singleton;
import modules.user.utils.Generics.Open;
import utils.funciones;

@XStreamAlias("Settings")
public class Settings implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@XStreamAlias("currency_config")
	public static String currency_config;
	@XStreamAlias("date_config")
	public static String date_config;
	@XStreamAlias("decimals_config")
	public static String decimals_config;
	@XStreamAlias("Formatfitx")
	public static String Formatfitx;
	@XStreamAlias("Lang")
	public static String Lang;
	@XStreamAlias("dummies")
	public static boolean dummies;
	@XStreamAlias("instance")
	public static Settings instance;
	
	
	public Settings() {
		super();
		Lang="Ingles";
		date_config = "dd/mm/yyyy";
		currency_config = "€";
		decimals_config = ".#";
		Formatfitx="xml";
	}
	public static Settings GetInstance(){
		if(instance==null){
			instance = new Settings();
			Lang=Languages.lenguajes.getIdioma();
			
			Singleton.useradmin = new ArrayList <Admin> ();
			Singleton.userclient = new ArrayList <Client> ();
			Singleton.usernormal = new ArrayList <Normal> ();
			
			Open.Open_auto();
			
			
		}
		return instance;
	}
	public static String getDate_config() {
		return date_config;
	}
	public static void setDate_config(String date_configs) {
		date_config = date_configs;
	}
	
	public static String getCurrency_config() {
		return currency_config;
	}
	public static void setCurrency_config(String currency_configs) {
		currency_config = currency_configs;
	}
	public static String getDecimals_config() {
		return decimals_config;
	}
	public static void setDecimals_config(String decimals_configs) {
		decimals_config = decimals_configs;
	}
	public static void setDummies(boolean dummies) {
		Settings.dummies = dummies;
	}
	public static String getLang() {
		return Lang;
	}
	public static void setLang(String lang) {
		Lang = lang;
	}
	public static void Formatfitx(){
		int menu=0;
    	String [] option={"xml", "json", "txt", "Exit"};
		menu=funciones.menu(option, "Formato",  "Formato");
		switch (menu){
		case 0:
			Formatfitx="xml";
			break;
		case 1:
			Formatfitx="json";
			break;
		case 2:
			Formatfitx="txt";
			break;
		case 3:
			break;
		}
	}
	@Override
	public String toString() {
		return "Config [date_config=" + date_config + " currency_config="
				+ currency_config + ", decimals_config=" + decimals_config + "]";
	}
	
}