package modules.user.Model.files_users.client.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
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

import modules.user.Model.classes.*;

public class open_on_demand_client {

	public static ArrayList<Client> open_json() {
    	String PATH = null;
    	Client e1;
    	
        try {
        	  XStream xstream = new XStream(new JettisonMappedXmlDriver());
	          xstream.setMode(XStream.NO_REFERENCES);
			  xstream.alias("Client", Client.class);
			  
			  JFileChooser fileChooser = new JFileChooser();
			  fileChooser.setAcceptAllFileFilterUsed(false);
	          fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JSON (*.json)", "json"));
	           
	          int seleccion = fileChooser.showOpenDialog(null);
	          if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	               
	                Singleton.useradmin.clear();
	              
	                JsonReader lector = new JsonReader(new FileReader(PATH));
	                JsonParser parseador = new JsonParser();
	                JsonElement raiz = parseador.parse(lector);
	            		  
	            	Gson json = new Gson();
	            	JsonArray lista = raiz.getAsJsonArray();
	            	for (JsonElement elemento : lista) {
	            		e1 = json.fromJson(elemento, Client.class);
	            		Singleton.userclient.add(e1);
	            	}
	          } 
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "Error al leer el JSON", "Error", JOptionPane.ERROR_MESSAGE);
        }
       return Singleton.userclient;
    }

	 public static ArrayList<Client> open_txt() {
	    	String PATH = null;
	        try {
	            File f;
	            JFileChooser fileChooser = new JFileChooser();
	            fileChooser.setAcceptAllFileFilterUsed(false);
	            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Texto (*.txt)", "txt"));
	            int seleccion = fileChooser.showOpenDialog(null);
	            if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	                f = new File(PATH);
	                
	                FileInputStream fi=new FileInputStream(f);
	    			ObjectInputStream oi=new ObjectInputStream(fi);
	    			Singleton.userclient = (ArrayList<Client>)oi.readObject();
	    			oi.close();
	            }
	        } catch (Exception e) {
	        	JOptionPane.showMessageDialog(null, "Error al leer el TXT", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    	return Singleton.userclient;
	    }

	 public static ArrayList<Client> open_xml() {
	    	String PATH=null;
	    	try {
	            XStream xstream = new XStream();
	            Annotations.configureAliases(xstream, Admin.class);
	 
	            JFileChooser fileChooser = new JFileChooser();

	            fileChooser.setAcceptAllFileFilterUsed(false);
	            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));
	            
	            int seleccion = fileChooser.showOpenDialog(null);
	            if (seleccion == JFileChooser.APPROVE_OPTION) {
	            	File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	                Singleton.userclient= (ArrayList <Client>)xstream.fromXML(new FileReader(PATH));
	            }
	            
	        } catch (Exception e1) {
	        	JOptionPane.showMessageDialog(null, "Error al leer el XML", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	        return Singleton.userclient;
	    }




}

