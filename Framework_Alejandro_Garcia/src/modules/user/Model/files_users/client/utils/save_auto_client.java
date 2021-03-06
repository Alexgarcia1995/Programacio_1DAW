package modules.user.Model.files_users.client.utils;

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

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import modules.user.Model.classes.*;

public class save_auto_client {
public static void savexml() {
		
		String PATH=null;
        try {
			PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_users/client/files/client.xml";
		} catch (IOException e1) {
			e1.printStackTrace();
		}

        if (Singleton.userclient.isEmpty()){
            Singleton.userclient=new ArrayList<Client>();
        	try{
				OutputStream os= new ByteArrayOutputStream();
				OutputStreamWriter osw= new OutputStreamWriter(os);
				XStream xstream= new XStream();
				
				Annotations.configureAliases(xstream, Client.class);
				
				  String header = "<?xml version=\"1.0\" encoding=\"" + "UTF-8" + "\"?>\n";
				  xstream.toXML(Singleton.userclient,osw);
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
				
				Annotations.configureAliases(xstream, Client.class);
				
				  String header = "<?xml version=\"1.0\" encoding=\"" + "UTF-8" + "\"?>\n";
				  xstream.toXML(Singleton.userclient,osw);
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
		  xstream.alias("Client", Client.class);
		 
          PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_user/client/files/client.json";


            
                Gson gson = new Gson();
	            String json = gson.toJson(Singleton.userclient.toString());
	            FileWriter fileXml = new FileWriter(PATH);
                fileXml.write(json.toString());
                fileXml.close(); 
                
                JOptionPane.showMessageDialog(null, "Archivo JSON guardado con exito", "Archivo JSON", JOptionPane.INFORMATION_MESSAGE);
          
    } catch (Exception e) {
    	JOptionPane.showMessageDialog(null, "Error al grabar el JSON", "Error", JOptionPane.ERROR_MESSAGE);
    }


}



public static void savetxt(){
	 String PATH = null;
    
	 if (Singleton.userclient.isEmpty()){

		 try {
	 
         File f;
         Singleton.userclient=new ArrayList<Client>();
         PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_users/client/files/client.txt";
             f = new File(PATH);
             
             FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(Singleton.userclient);
				o.close();         
     } catch (Exception e) {
     	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
     }
	 }
	 
	 else{
		 try {
	 
         File f;
        
         PATH = new java.io.File(".").getCanonicalPath()+ "/src/modules/user/Model/files_users/client/files/client.txt";
             f = new File(PATH);
             
             FileOutputStream fo=new FileOutputStream(f);
				ObjectOutputStream o=new ObjectOutputStream(fo);
				o.writeObject(Singleton.userclient);
				o.close();         
     } catch (Exception e) {
     	JOptionPane.showMessageDialog(null, "Error al grabar el TXT", "Error", JOptionPane.ERROR_MESSAGE);
     }
	 }
}
}
