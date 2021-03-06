package modules.user.Model.files_users.normal.utils;

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

public class open_auto_normal {
	public static ArrayList<Normal> openxml_normal() {
        String PATH;

        try {
            XStream xstream = new XStream();
            Annotations.configureAliases(xstream, Normal.class);

            PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_users/normal/files/normal.xml";


            File path = new File(PATH);

            if (path.exists()) {
            	Singleton.usernormal = (ArrayList<Normal>) xstream.fromXML(new FileReader(PATH));
            }
            else {
            	JOptionPane.showMessageDialog(null, "Error al leer el XML",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el XML",
            "Error", JOptionPane.ERROR_MESSAGE);
        }

        return Singleton.usernormal;
    }

	public static ArrayList <Normal> openjson_normal() {
		String PATH = null;
    	Normal e1;
    	
        try {
        	  XStream xstream = new XStream(new JettisonMappedXmlDriver());
	          xstream.setMode(XStream.NO_REFERENCES);
			  xstream.alias("Normal", Normal.class);
			 
	            PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_users/files/normal.json";

	               
	                
	             
	                
	                JsonReader lector = new JsonReader(new FileReader(PATH));
	                JsonParser parseador = new JsonParser();
	                JsonElement raiz = parseador.parse(lector);
	            		  
	            	Gson json = new Gson();
	            	Boolean good = raiz.isJsonArray();
	            	if(good==true){
	            	JsonArray lista=raiz.getAsJsonArray();
	            	for (JsonElement elemento : lista) {
	            		e1 = json.fromJson(elemento, Normal.class);
	            		Singleton.usernormal.add(e1);
	            	}
	            	}
	            	else{
	                	JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
	            	}
	            	//Singleton.useradmin = (ArrayList <Admin>)xstream.fromXML(new FileReader(PATH));
	           
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el JSON", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Singleton.usernormal;
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

	public static ArrayList <Normal> opentxt_normal(){
		String PATH = null;
        try {
            File f;
            PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_users/normal/files/normal.txt";

                f = new File(PATH);
                
                FileInputStream fi=new FileInputStream(f);
    			ObjectInputStream oi=new ObjectInputStream(fi);
    			Singleton.usernormal= (ArrayList<Normal>)oi.readObject();
    			oi.close();
            
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
        }
    	return Singleton.usernormal;
	}




}