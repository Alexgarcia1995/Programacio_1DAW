package modules.user.Model.files_users.admin.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import modules.user.Model.classes.*;

public class save_auto {
public static void savexml() {
		
		String PATH=null;
        try {
			PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_users/admin/files/admin.xml";
		} catch (IOException e1) {
			e1.printStackTrace();
		}

        if(Singleton.useradmin.isEmpty()){
            Singleton.useradmin=new ArrayList<Admin>();
            try{
				OutputStream os= new ByteArrayOutputStream();
				OutputStreamWriter osw= new OutputStreamWriter(os);
				XStream xstream= new XStream();
				
				Annotations.configureAliases(xstream, Admin.class);
				
				  String header = "<?xml version=\"1.0\" encoding=\"" + "UTF-8" + "\"?>\n";
				  xstream.toXML(Singleton.useradmin,osw);
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
        else {
			try{
				OutputStream os= new ByteArrayOutputStream();
				OutputStreamWriter osw= new OutputStreamWriter(os);
				XStream xstream= new XStream();
				
				Annotations.configureAliases(xstream, Admin.class);
				
				  String header = "<?xml version=\"1.0\" encoding=\"" + "UTF-8" + "\"?>\n";
				  xstream.toXML(Singleton.useradmin,osw);
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


public static void savejson(){
	String PATH;
	  try {
    	  XStream xstream = new XStream(new JettisonMappedXmlDriver());
          xstream.setMode(XStream.NO_REFERENCES);
		  xstream.alias("Admin", Admin.class);
		 
          PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/utils/admin/files/admin.json";


            
                Gson gson = new Gson();
	            String json = gson.toJson(Singleton.useradmin.toString());
	            FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(json);
                fileXml.close(); 
                
                JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON", JOptionPane.INFORMATION_MESSAGE);
          
    } catch (Exception e) {
    	JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
    }


}



public static void savetxt(){
	 String PATH = null;
	 if(Singleton.useradmin.isEmpty()){
         Singleton.useradmin=new ArrayList<Admin>();
         try {
             File f;
            
                 PATH = new java.io.File(".").getCanonicalPath()+"/src/modules/user/Model/files_users/admin/files/admin.txt";
                 f = new File(PATH);
                 
                 FileOutputStream fo=new FileOutputStream(f);
    				ObjectOutputStream o=new ObjectOutputStream(fo);
    				o.writeObject(Singleton.useradmin);
    				o.close();             
         } catch (Exception e) {
         	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
         }
	 }
	 else{
     try {
         File f;
        
         PATH = new java.io.File(".").getCanonicalPath()+"/src/modules/user/Model/files_users/admin/files/admin.txt";

             f = new File(PATH);
             
             FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(Singleton.useradmin);
				o.close();
         
     } catch (Exception e) {
     	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
     }
}
}

}
