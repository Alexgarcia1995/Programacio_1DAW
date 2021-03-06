package classes;

import java.io.IOException;
import java.util.Properties;

import utils.funciones;
import utils.save_config;

public class Languages extends Properties {
	private static final long serialVersionUID = 1L;
	static String idioma="Espanol";
	public static Languages lenguajes=null;
	
	public Languages (String idioma){
	    switch(idioma){
	    case "Ingles":
	        getProperties("english.properties");
	        break;
	    case "Espanol":
	        getProperties("Espanol.properties");
	        break;
	    case "Catala":
	        getProperties("catala.properties");
	        break;
	    }
	}
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idiomas) {
		idioma = idiomas;
		switch(idioma){
		case "Ingles":
	        getProperties("english.properties");
	        break;
	    case "Espanol":
	        getProperties("Espanol.properties");
	        break;
	    case "Catala":
	        getProperties("catala.properties");
	        break;
		}
	}

	public void getProperties(String idioma) {
        try {
            this.load( getClass().getResourceAsStream(idioma) );
        } catch (IOException ex) {
        }
    }
	
	public static void Lengua(Languages lang){
		int menu=0;
		String options[] ={lenguajes.getProperty("ingles"),lenguajes.getProperty("espanol"),lenguajes.getProperty("catala"), lenguajes.getProperty("exit")};
		menu=funciones.menu(options, "Idioma", "Idioma");
		
		switch (menu){
		case 0:
			lang.setIdioma("Ingles");
			Settings.GetInstance().setLang(idioma);
			break;
		case 1:
			lang.setIdioma("Espanol");
			Settings.GetInstance().setLang(idioma);
			break;
		case 2:
			lang.setIdioma("Catala");
			Settings.GetInstance().setLang(idioma);
			break;
		case 3:
			break;
		}
		save_config.savejson();
	}
	
}
