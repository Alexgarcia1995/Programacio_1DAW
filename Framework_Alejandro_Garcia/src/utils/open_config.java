package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
import classes.Singleton_app;
import modules.user.Model.classes.*;


public class open_config {

	public static void openxml() {
        String PATH;
        try {
            XStream xstream = new XStream();
            Annotations.configureAliases(xstream, Settings.class);

            PATH = new java.io.File(".").getCanonicalPath()+ "/src/utils/Files/config.xml";


            File path = new File(PATH);

            if (path.exists()) {
            	Singleton_app.Setting=(ArrayList<Settings>)xstream.fromXML(new FileReader(PATH));
            }
            else {
            	JOptionPane.showMessageDialog(null, "Error al leer el XML",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el XML",
            "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

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
	        Languages.lenguajes=new Languages(config.lang);
	        
	        
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el json", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Settings.instance;
		/*
		String PATH = null;
    	Admin e1=new Admin();
    	
        try {
        	  XStream xstream = new XStream(new JettisonMappedXmlDriver());
	          xstream.setMode(XStream.NO_REFERENCES);
			  xstream.alias("Admin", Admin.class);
			 
	            PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/utils/admin/files/admin.json";

	               
	                Singleton.useradmin.clear();
	             
	                
	                JsonReader lector = new JsonReader(new FileReader(PATH));
	                JsonParser parseador = new JsonParser();
	                JsonElement raiz = parseador.parse(lector);
	            		  
	            	Gson json = new Gson();
	            	JsonArray lista=raiz.getAsJsonArray();
	            	for (JsonElement elemento : lista) {
	            		e1 = json.fromJson(elemento, Admin.class);
	            		Singleton.useradmin.add(e1);
	            	}
	            	//Singleton.useradmin = (ArrayList <Admin>)xstream.fromXML(new FileReader(PATH));
	           
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el JSON", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Singleton.useradmin;*/
		/*String PATH;
		 try {
	            XStream xstream = new XStream(new JettisonMappedXmlDriver());
	            xstream.setMode(XStream.NO_REFERENCES);
	            xstream.alias("Admin", Admin.class);
	            
	            PATH = new java.io.File("C:/Users/Alejandro/Documents/Programacio/workspace/Framework_Alejandro_Garcia/src/modules/user/utils/admin/files/admin.xml" 
	            		).getAbsolutePath();
	            
	            JsonReader lector = new JsonReader(new FileReader(PATH));
                JsonParser parseador = new JsonParser();
                JsonElement raiz = parseador.parse(lector);
                
                Gson json = new Gson();
                JsonArray lista = raiz.getAsJsonArray();

                for (JsonElement elemento : lista) {
                    Singleton.useradmin= (ArrayList<Admin>) json.fromJson(elemento, Admin.class);
                }

                JOptionPane.showMessageDialog(null,
                        "Archivo JSON abierto con éxito", "Archivo JSON",
                        JOptionPane.INFORMATION_MESSAGE);
              
		 }catch (HeadlessException | JsonIOException | JsonSyntaxException | FileNotFoundException e) {
	            JOptionPane.showMessageDialog(null, "Error al leer el JSON",
	                    "Error", JOptionPane.ERROR_MESSAGE);
		 }
		 return Singleton.useradmin;*/
}

	public static void opentxt(){
		String PATH = null;
        try {
            File f;
            PATH = new java.io.File(".").getCanonicalPath()+ "/src/utils/Files/config.txt";

                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			Singleton_app.Setting=(ArrayList<Settings>)oi.readObject();
    			oi.close();
            
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	
	}


	


}
