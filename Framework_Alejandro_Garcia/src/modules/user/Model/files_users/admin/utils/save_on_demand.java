package modules.user.Model.files_users.admin.utils;

import java.awt.HeadlessException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import modules.user.Model.classes.*;

public class save_on_demand {
	 public static void save_xml() {
	        String PATH=null;
			try {
				OutputStream os = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				XStream xstream = new XStream();
				Annotations.configureAliases(xstream, Admin.class);

	            String header = "<?xml version=\"1.0\" encoding=\"UTF-8" + "\"?>\n";
	            xstream.toXML(Singleton.useradmin, osw);
	            StringBuffer xml = new StringBuffer();
	            xml.append(header);
	            xml.append(os.toString());
		    
	            JFileChooser fileChooser = new JFileChooser();
	            fileChooser.setAcceptAllFileFilterUsed(false);
	            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("XML (*.xml)", "xml"));
	            
	            int seleccion = fileChooser.showSaveDialog(null);
	            if (seleccion == JFileChooser.APPROVE_OPTION) {
	            	File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	                
	                FileWriter fileXml = new FileWriter(PATH);
	                fileXml.write(xml.toString());
	                fileXml.close();
	                osw.close();
	                os.close();
	                }
		    }catch (Exception e1){
		    	JOptionPane.showMessageDialog(null, "Error al grabar el XML", "Error", JOptionPane.ERROR_MESSAGE);
		    } 
	    }

	 public static void save_json() {
	        String PATH = null;
		      try {
		          XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
		          xstreamjson.setMode(XStream.NO_REFERENCES);
		          xstreamjson.alias("Admin", Admin.class);
		          
		          JFileChooser fileChooser = new JFileChooser();
		          fileChooser.setAcceptAllFileFilterUsed(false);
		          fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JSON (*.json)", "json"));
		          
		          int seleccion = fileChooser.showSaveDialog(null);
		          if (seleccion == JFileChooser.APPROVE_OPTION) {
		                File JFC = fileChooser.getSelectedFile();
		                PATH = JFC.getAbsolutePath();
		          
		                
		                Gson gson = new Gson();
			            String json = gson.toJson(Singleton.useradmin.toString());
			            FileWriter fileXml = new FileWriter(PATH);
		                fileXml.write(json.toString());
		                fileXml.close(); 
		                
		                JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON", JOptionPane.INFORMATION_MESSAGE);
		          }
	        } catch (Exception e) {
	        	JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }

	 public static void save_txt() {
	        String PATH = null;
	        try {
	            File f;
	            JFileChooser fileChooser = new JFileChooser();
	            fileChooser.setAcceptAllFileFilterUsed(false);
	            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Texto (*.txt)", "txt"));
	            int seleccion = fileChooser.showSaveDialog(null);
	            if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();
	                f = new File(PATH);
	                
	                FileOutputStream fo=new FileOutputStream(f);
					ObjectOutputStream o=new ObjectOutputStream(fo);
					o.writeObject(Singleton.useradmin);
					o.close();
	            }
	        } catch (Exception e) {
	        	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    }
	 
	 public static void save_json2(Admin usu){
		 String PATH;

	        try {
	            XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
	            xstreamjson.setMode(XStream.NO_REFERENCES);
	            xstreamjson.alias("Admin", Admin.class);

	            JFileChooser fileChooser = new JFileChooser();

	            fileChooser.setAcceptAllFileFilterUsed(false);
	            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JSON (*.json)", "json"));

	            int seleccion = fileChooser.showSaveDialog(null);

	            if (seleccion == JFileChooser.APPROVE_OPTION) {
	                File JFC = fileChooser.getSelectedFile();
	                PATH = JFC.getAbsolutePath();

	                if (!PATH.endsWith(".json")) {
	                    PATH = PATH + ".json";
	                }

	                Gson gson = new Gson();
	                String json;
	                FileWriter fileXml;

	                if (usu == null) {
	                    json = gson.toJson(Singleton.useradmin);
	                } else {
	                    json = gson.toJson(usu);
	                }

	                fileXml = new FileWriter(PATH);
	                fileXml.write(json.toString());
	                fileXml.close();

	                JOptionPane.showMessageDialog(null,
	                        "Archivo JSON guardado con éxito", "Archivo JSON",
	                        JOptionPane.INFORMATION_MESSAGE);
	            }
	        } catch (HeadlessException | IOException e) {
	            JOptionPane.showMessageDialog(null, "Error al grabar el JSON",
	                    "Error", JOptionPane.ERROR_MESSAGE);
	        }
	 }
	 
	
}
