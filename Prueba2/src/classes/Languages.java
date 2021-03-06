package classes;

import java.io.IOException;
import java.util.Properties;

import utils.funciones;

public class Languages extends Properties {
	private static final long serialVersionUID = 1L;
	private String idioma;
	public static Languages lenguajes=new Languages("Espanol");
	
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

	public void setIdioma(String idioma) {
		this.idioma = idioma;
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
			break;
		case 1:
			lang.setIdioma("Espanol");
			break;
		case 2:
			lang.setIdioma("Catala");
			break;
		case 3:
			break;
		}
	}
	
}
