package modules.user.utils.normal.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import modules.user.classes.Admin;
import modules.user.classes.Singleton;

public class save_auto_normal {
public static void savexml_normal() {
		
		String PATH=null;
        try {
			PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/utils/normal/files/normal.xml";
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		
		if (Singleton.usernormal.size()>0){
			try{
				OutputStream os= new ByteArrayOutputStream();
				OutputStreamWriter osw= new OutputStreamWriter(os);
				XStream xstream= new XStream();
				
				Annotations.configureAliases(xstream, Admin.class);
				
				  String header = "<?xml version=\"1.0\" encoding=\"" + "UTF-8" + "\"?>\n";
				  xstream.toXML(Singleton.usernormal,osw);
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
		
	}


public static void savejson_normal(){
	String PATH;
	  try {
    	  XStream xstream = new XStream(new JettisonMappedXmlDriver());
          xstream.setMode(XStream.NO_REFERENCES);
		  xstream.alias("Admin", Admin.class);
		 
          PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/utils/normal/files/normal.json";


            
                Gson gson = new Gson();
	            String json = gson.toJson(Singleton.usernormal.toString());
	            FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(json.toString());
                fileXml.close(); 
                
                JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON", JOptionPane.INFORMATION_MESSAGE);
          
    } catch (Exception e) {
    	JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
    }


}



public static void savetxt_normal(){
	 String PATH = null;
     try {
         File f;
        
         PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/utils/normal/files/normal.txt";
             f = new File(PATH);
             
             FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(Singleton.usernormal);
				o.close();
             JOptionPane.showMessageDialog(null, "Archivo TXT guardado con exito", "Archivo TXT", JOptionPane.INFORMATION_MESSAGE);
         
     } catch (Exception e) {
     	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
     }
}
}