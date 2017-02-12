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


public class save_config {

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
	
public static void saveondemand(){
	String PATH = null;
    
  
    try {
	    XStream xstreamjson = new XStream(new JettisonMappedXmlDriver());
	    xstreamjson.setMode(XStream.NO_REFERENCES);
	    xstreamjson.alias("Settings", Settings.class);
	    JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("JSON (*.json)", "json"));
        
        int seleccion = fileChooser.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
              File JFC = fileChooser.getSelectedFile();
              PATH = JFC.getAbsolutePath();
        }
	    Gson gson = new Gson();
	    String json = gson.toJson(Settings.instance);
	    FileWriter fileXml = new FileWriter(PATH);
	    fileXml.write(json.toString());
	    fileXml.close();


	    
    } catch (Exception e) {
     	JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error"), Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
    }
}

}
