package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import classes.Languages;
import classes.Settings;
import modules.user.Model.classes.*;


public class open_config {

	public static Settings openjson() {
		String PATH = null;
		Settings config = null;
    	
        try {
        	XStream xstream = new XStream(new JettisonMappedXmlDriver());
	        xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("Admin", Admin.class);
			
			PATH = new java.io.File(".").getCanonicalPath()
					+ "/src/utils/Files/config.json";
	        
	        JsonReader reader = new JsonReader(new FileReader(PATH));
	        JsonParser parser = new JsonParser();
	        JsonElement root = parser.parse(reader);
	        
	        Gson json = new Gson();
	        config = json.fromJson(root, Settings.class);
	        Settings.instance.setCurrency_config(config.currency_config);
	        Settings.instance.setDate_config(config.date_config);
	        Settings.instance.setDecimals_config(config.decimals_config);
	        Settings.instance.setFormatfitx(config.formatfitx);
	        Settings.instance.setDummies(config.dummies);
	        Settings.instance.setLang(config.lang);
	        Settings.instance.setTheme(config.theme);
	        Languages.lenguajes=new Languages(config.lang);
	        
	        
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el json", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Settings.instance;
	}


	public static Settings open_on_demand() {
		String PATH = null;
		Settings config = null;
    	
        try {
        	XStream xstream = new XStream(new JettisonMappedXmlDriver());
	        xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("Admin", Admin.class);
			
			JFileChooser fileChooser = new JFileChooser();
	          fileChooser.setAcceptAllFileFilterUsed(false);
	          fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JSON (*.json)", "json"));
	          
	          int seleccion = fileChooser.showOpenDialog(null);
	          if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	               
	          }
	          Settings.instance= new Settings();
	        JsonReader reader = new JsonReader(new FileReader(PATH));
	        JsonParser parser = new JsonParser();
	        JsonElement root = parser.parse(reader);
	        
	        Gson json = new Gson();
	        config = json.fromJson(root, Settings.class);
	        Settings.instance.setCurrency_config(config.currency_config);
	        Settings.instance.setDate_config(config.date_config);
	        Settings.instance.setDecimals_config(config.decimals_config);
	        Settings.instance.setFormatfitx(config.formatfitx);
	        Settings.instance.setDummies(config.dummies);
	        Settings.instance.setLang(config.lang);
	        Settings.instance.setTheme(config.theme);
	        Languages.lenguajes=new Languages(config.lang);
	        
	        
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el json", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Settings.instance;
	}


}
