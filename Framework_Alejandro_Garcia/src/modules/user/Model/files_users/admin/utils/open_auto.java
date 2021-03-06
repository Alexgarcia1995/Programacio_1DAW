package modules.user.Model.files_users.admin.utils;

import java.awt.HeadlessException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.Annotation;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import modules.user.Model.classes.*;


public class open_auto {
	public static ArrayList<Admin> openxml() {
        String PATH;

        try {
            XStream xstream = new XStream();
            Annotations.configureAliases(xstream, Admin.class);

            PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_users/admin/files/admin.xml";


            File path = new File(PATH);

            if (path.exists()) {
                Singleton.useradmin = (ArrayList<Admin>) xstream.fromXML(new FileReader(PATH));
            }
            else {
            	JOptionPane.showMessageDialog(null, "Error al leer el XML",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el XML",
            "Error", JOptionPane.ERROR_MESSAGE);
        }

        return Singleton.useradmin;
    }

	public static ArrayList <Admin> openjson() {
		String PATH = null;
    	Admin e1=new Admin();
    	
        try {
        	  XStream xstream = new XStream(new JettisonMappedXmlDriver());
	          xstream.setMode(XStream.NO_REFERENCES);
			  xstream.alias("Admin", Admin.class);
			 
	            PATH = new java.io.File(".").getCanonicalPath()+ " /src/modules/user/Model/files_users/admin/files/admin.txt";
	            												
	               
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
        return Singleton.useradmin;
	}

	public static ArrayList <Admin> opentxt(){
		String PATH = null;
        try {
            File f;
            PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_users/admin/files/admin.txt";

                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			Singleton.useradmin = (ArrayList<Admin>)oi.readObject();
    			oi.close();
            
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	return Singleton.useradmin;
	}


	

}