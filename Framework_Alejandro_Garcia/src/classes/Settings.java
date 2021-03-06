package classes;

import java.io.Serializable;
import java.util.ArrayList;

import org.apache.batik.apps.rasterizer.Main;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import modules.user.Model.Functions.Generics.*;
import utils.Themes;
import utils.formatos;
import utils.funciones;
import utils.open_config;

@XStreamAlias("Settings")
public class Settings implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@XStreamAlias("currency_config")
	public  String currency_config;
	@XStreamAlias("date_config")
	public  String date_config;
	@XStreamAlias("decimals_config")
	public  String decimals_config;
	@XStreamAlias("formatfitx")
	public  String formatfitx;
	@XStreamAlias("lang")
	public String lang;
	@XStreamAlias("dummies")
	public  boolean dummies;
	@XStreamAlias("theme")
	public String theme;
	@XStreamAlias("instance")
	public static Settings instance;
	
	public Settings() {
		lang=Languages.idioma;
		date_config = "dd/mm/yyyy";
		currency_config = "€";
		decimals_config = ".#";
		formatfitx="xml";
		theme="GTK";
	}
	

	public static Settings GetInstance(){
		if (instance == null){
			instance = new Settings();
		
		
			instance.setDate_config(formatos.formato);
			instance.setCurrency_config(formatos.moneda);
			instance.setDecimals_config(formatos.decimal);
			instance.setFormatfitx(formatos.Formatfitx);
			instance.setDummies(formatos.bool);
			instance.setLang(Languages.idioma);
			instance.setTheme(formatos.Theme);
			instance=open_config.openjson();
				
			Themes.theme();
		}
		else{
			instance=open_config.openjson();
			Themes.theme();
		}
		return instance;
	}
	public  String getDate_config() {
		return date_config;
	}
	public  void setDate_config(String date_configs) {
		date_config = date_configs;
	}
	
	public  String getCurrency_config() {
		return currency_config;
	}
	public  void setCurrency_config(String currency_configs) {
		currency_config = currency_configs;
	}
	public  String getDecimals_config() {
		return decimals_config;
	}
	public  void setDecimals_config(String decimals_configs) {
		decimals_config = decimals_configs;
	}
	public  void setDummies(boolean dummies) {
		this.dummies = dummies;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String langs) {
		lang = langs;
	}
	
	public String getFormatfitx() {
		return formatfitx;
	}
	public void setFormatfitx(String formatfitx1) {
		formatfitx = formatfitx1;
	}
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String toString () {
		String string = null;
		string= (getDate_config()+"\n");
		string= string+(getCurrency_config()+"\n");
		string= string+(getDecimals_config()+"\n");
		string= string+(getFormatfitx()+"\n");
		string= string+(dummies+"\n");
		string= string +(getLang()+"\n");
		//string= string + getLang().getIdioma();
		//string.append(Language_general.getInstance().getProperty("toStringfile")+this.getFile()+"\n");
		//string.append(Language_general.getInstance().getProperty("toStringtheme")+this.getTheme()+"\n");
		return string;
	}
	
	
}