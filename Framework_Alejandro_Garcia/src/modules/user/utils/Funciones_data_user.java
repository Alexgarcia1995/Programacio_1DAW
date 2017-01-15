package modules.user.utils;

import utils.funciones;
import classes.Languages;
import utils.Validate;
import utils.formatos;

public class Funciones_data_user {

	public static String PideFecha() {
		String cad = "";
		boolean good = false;
		do {
			cad = funciones.ped_string("Fecha Nacimiento", "Fecha Nacimiento");
			good = Validate.Validafecha(cad, Funciones_fecha.formato);
		} while (good == false);
		return cad;
	}

	public static String PideNom() {
		String cad = "";
		boolean good = false;
		do {
			cad = funciones.ped_string(Languages.lenguajes.getProperty("pidenom"),Languages.lenguajes.getProperty("nom"));
			good = Validate.Validanom(cad);
		} while (good == false);
		return cad;
	}

	public static String PideDNI() {
		String cad = "";
		boolean good = false;
		do {
			cad = funciones.ped_string(Languages.lenguajes.getProperty("pidedni"),Languages.lenguajes.getProperty("dni"));
			good = Validate.Validadni(cad);
		} while (good == false);
		return cad;
	}

	public static String PideDireccion() {
		String cad = "";
		boolean good = false;
		do {
			cad = funciones.ped_string(Languages.lenguajes.getProperty("pidedireccion"),Languages.lenguajes.getProperty("direccion"));
			good = Validate.Validalletrnum(cad);
		} while (good == false);
		return cad;
	}

	public static String Pideemail() {
		String cad = "";
		boolean good = false;
		do {
			cad = funciones.ped_string(Languages.lenguajes.getProperty("pideemail"),Languages.lenguajes.getProperty("email"));
			good = Validate.Validaemail(cad);
		} while (good == false);
		return cad;
	}

	public static String Pideusername() {
		String cad = "";
		boolean good = false;
		do {
			cad = funciones.ped_string(Languages.lenguajes.getProperty("pideusername"),Languages.lenguajes.getProperty("username"));
			good = Validate.Validausername(cad);
		} while (good == false);
		return cad;
	}

	public static String PidePassword() {
		String cad = "";
		boolean good = false;
		do {
			cad = funciones.ped_string(Languages.lenguajes.getProperty("contraseña"), Languages.lenguajes.getProperty("contraseña"));
			good = Validate.Validapasswd(cad);
		} while (good == false);
		return cad;
	}

	public static String Pidesexe() {
		String cad = "";
		boolean good = false;
		do {
			cad = funciones.ped_string(Languages.lenguajes.getProperty("pidesexe"),Languages.lenguajes.getProperty("sexe"));
			good = Validate.Validasexe(cad);
		} while (good == false);
		return cad;
	}

	public static int Pidecomments() {
		int cad;
		cad = funciones.pednum(Languages.lenguajes.getProperty("pidecomments"),Languages.lenguajes.getProperty("comments"));
		return cad;
	}

	public static int Pidecompras() {
		int cad;
		cad = funciones.pednum(Languages.lenguajes.getProperty("compras"), Languages.lenguajes.getProperty("compras"));
		return cad;
	}

	public static int Descuentos(int compras) {
		int desc = 0;
		if (compras < 2) {
			desc = 0;
		}
		if ((compras >= 2) && (compras < 10)) {
			desc = 10;
		}
		if (compras >= 10) {
			desc = 20;
		}
		return desc;
	}

	public static String Salario(int antig, String formato,String decimal){
		double resultado = 0f;
		String decimales="";
		switch (formato){
		case "€":
			if(antig<2){
				resultado=900.55;
			}
			else if((antig>=2)&&(antig<=5)){
				resultado=1150.55;
			}
			else if(antig>5){
				resultado=1300.55;
			}
			switch (decimal){
			case ".#":
				decimales=formatos.format1d(resultado);
				break;
			case ".##":
				decimales=formatos.format2d(resultado);
				break;
			case ".###":
				decimales=formatos.format3d(resultado);
				break;
			}
		break;
		case "$":
			if(antig<2){
				resultado=900.55*1.07;
			}
			else if((antig>=2)&&(antig<=5)){
				resultado=1150.55*1.07;
			}
			else if(antig>5){
				resultado=1300.55*1.07;
			}
			switch (decimal){
			case ".#":
				decimales=formatos.format1d(resultado);
				break;
			case ".##":
				decimales=formatos.format2d(resultado);
				break;
			case ".###":
				decimales=formatos.format3d(resultado);
				break;
			}
			break;
		case "£":
			if(antig<2){
				resultado=900.55*0.85;
			}
			else if((antig>=2)&&(antig<=5)){
				resultado=1150.55*0.85;
			}
			else if(antig>5){
				resultado=1300.55*0.85;
			}
			switch (decimal){
			case ".#":
				decimales=formatos.format1d(resultado);
				break;
			case ".##":
				decimales=formatos.format2d(resultado);
				break;
			case ".###":
				decimales=formatos.format3d(resultado);
				break;
			}
			break;
		
		}return decimales;

	}

	public static String Karma(int comments) {
		String resultado = "";

		if (comments < 20) {
			resultado = "Low";
		} else if ((comments >= 20) && (comments <= 40)) {
			resultado = "Medium";
		} else if (comments > 40) {
			resultado = "High";
		}

		return resultado;
	}

	public static int Points(String karma) {
		int resultado = 0;
		switch (karma) {
		case "Low":
			resultado = 60;
			break;
		case "Medium":
			resultado = 100;
			break;
		case "High":
			resultado = 150;
			break;
		}

		return resultado;
	}
}
