package utils;

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

import classes.Languages;
import classes.Settings;
import classes.Singleton_app;
import modules.user.classes.Admin;
import modules.user.classes.Singleton;

public class save_config {
public static void savexml() {
		
		String PATH=null;
        try {
			PATH = new java.io.File(".").getCanonicalPath()+ "/src/utils/Files/config.xml";
		} catch (IOException e1) {
			e1.printStackTrace();
		}

			try{
				OutputStream os= new ByteArrayOutputStream();
				OutputStreamWriter osw= new OutputStreamWriter(os);
				XStream xstream= new XStream();
				
				Annotations.configureAliases(xstream, Settings.class);
				
				  String header = "<?xml version=\"1.0\" encoding=\"" + "UTF-8" + "\"?>\n";
				  xstream.toXML(Singleton_app.Setting,osw);
				  StringBuffer xml= new StringBuffer();
				  xml.append(header);
	              xml.append(os.toString());
	             
	              FileWriter fileXml = new FileWriter(PATH);
	               fileXml.write(xml.toString());
	               fileXml.close();
	               osw.close();
	               os.close();
				  
			}catch (IOException e){
				JOptionPane.showMessageDialog(null, "Error al grabar el XML","Error", JOptionPane.ERROR_MESSAGE);
			}
		}


public static void savejson(){
	String PATH = null;
    
    try {
        PATH = new java.io.File(".").getCanonicalPath()
                + "/src/utils/Files/config.json";
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    try {
	    XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
	    xstreamjson.setMode(XStream.NO_REFERENCES);
	    xstreamjson.alias("Settings", Settings.class);
	    Gson gson = new Gson();
	    String json = gson.toJson(Settings.instance);
	    FileWriter fileXml = new FileWriter(PATH);
	    fileXml.write(json.toString());
	    fileXml.close();


	    
    } catch (Exception e) {
     	JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error"), Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
    }
}
	




public static void savetxt(){
	 String PATH = null;
     try {
         File f;
        
			PATH = new java.io.File(".").getCanonicalPath()+ "/src/utils/Files/config.txt";

             f = new File(PATH);
             
             FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(Singleton_app.Setting);
				o.close();
             JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT", JOptionPane.INFORMATION_MESSAGE);
         
     } catch (Exception e) {
     	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
     }
}


}
