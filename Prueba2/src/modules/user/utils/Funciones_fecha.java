package modules.user.utils;

import javax.swing.JOptionPane;

import classes.Clase_Fecha;
import classes.Languages;
import classes.Settings;
import modules.user.classes.*;
import utils.Validate;
import utils.funciones;

public class Funciones_fecha {
public static String formato="dd/mm/yyyy";




	public static Clase_Fecha fecha_naix() {
		String fecha_naixe;
		int edad;
		Clase_Fecha fnac=null;
		boolean result = false;

		do {
			fecha_naixe = funciones.ped_string(Languages.lenguajes.getProperty("fecha_naix")+"("+Settings.getDate_config()+")", Languages.lenguajes.getProperty("fecha_naix"));
			fnac = new Clase_Fecha(fecha_naixe,Settings.getDate_config());
			result = fnac.ValidaFecha();
			edad = fnac.RestaFechas2();
			if (edad < 18) {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_edad"));
				result = false;
			}
		} while (result == false);
		return fnac;

	}

	public static int Edad(String fecha_naix) {
		int edad;
		Clase_Fecha edad1=null;

		edad1 = new Clase_Fecha(fecha_naix,Settings.getDate_config());
		edad = edad1.RestaFechas2();
		return edad;
	}

	public static int Antiguedad(String fcont) {
		int edad;
		Clase_Fecha edad1=null;
		edad1 = new Clase_Fecha(fcont,Settings.getDate_config());
		edad = edad1.RestaFechas();
		return edad;
	}

	public static Clase_Fecha fecha_cont(String fnac, int edad) {
		String fecha_cont;
		Clase_Fecha fcont=null;
		int antig;
		int diferencia;
		int actual,dia,mes;
		boolean result = false;
		boolean result1 = false;

		do {
			fecha_cont = funciones.ped_string(Languages.lenguajes.getProperty("fecha_cont")+"("+Settings.getDate_config()+")", Languages.lenguajes.getProperty("fecha_cont"));
			fcont = new Clase_Fecha(fecha_cont,Settings.getDate_config());
			result = Validate.Validafecha(fecha_cont,Settings.getDate_config());
			antig = fcont.RestaFechas();
			diferencia = fcont.comparaFechas(fnac);
			actual=fcont.resta_anyoactual(fcont.getAnio());
			dia=fcont.resta_diactual(fcont.getDia());
			mes=fcont.resta_mesactual(fcont.getMes());
			if (diferencia == 1) {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_fecha1"));
				result1 = false;
			}
			if (diferencia == 2) {
				if ((edad - antig) < 18) {
					JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_fecha2"));
					result1 = false;
			 	}
				else if ((actual<0)&&(mes<0)&&(dia<0)){
					JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_fecha3"));
					result1 = false;
				}
				else {
					result1 = true;
				} 
			}
			if (diferencia == 3) {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_fecha4"));
				result1 = false;
			}
		} while ((result == false) || (result1 == false));

		return fcont;
	}

	/*
	 * public static int Antiguedad (String fcont){ int edad; Clase_Fecha edad1;
	 * edad1=new Clase_Fecha(fcont); edad=edad1.RestaFechas(); return edad; }
	 */
	public static int Antiguedad_alta(String falta) {
		int edad;
		Clase_Fecha edad1=null;
		edad1 = new Clase_Fecha(falta,Settings.getDate_config());
		edad = edad1.RestaFechas();
		return edad;
	}

	public static Clase_Fecha fecha_alta(String fnac, int edad) {
		String fecha_alta;
		Clase_Fecha falta=null;
		int antig;
		int diferencia;
		int actual,dia,mes;
		boolean result = false;
		boolean result1 = false;

		do {
			fecha_alta = funciones.ped_string(Languages.lenguajes.getProperty("fecha_alta")+"("+Settings.getDate_config()+")", Languages.lenguajes.getProperty("fecha_alta"));
			falta = new Clase_Fecha(fecha_alta,Settings.getDate_config());
			result = Validate.Validafecha(fecha_alta,Settings.getDate_config());
			antig = falta.RestaFechas();
			diferencia = falta.comparaFechas(fnac);
			actual=falta.resta_anyoactual(falta.getAnio());
			dia=falta.resta_diactual(falta.getDia());
			mes=falta.resta_mesactual(falta.getMes());
			if (diferencia == 1) {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_fecha1"));
				result1 = false;
			}
			if (diferencia == 2) {
				if (diferencia == 2) {
					if ((edad - antig) < 18) {
						JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_fecha2"));
						result1 = false;
				 	}
					else if ((actual<0)&&(mes<0)&&(dia<0)){
						JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_fecha3"));
						result1 = false;
					}
					else {
						result1 = true;
					} 
				}
			}
			if (diferencia == 3) {
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_fecha4"));
				result1 = false;
			}
		} while ((result == false) || (result1 == false));

		return falta;
	}

	
	public static boolean update_fecha_naix(Persona persona1){
		
		boolean good=false;
		do{
			persona1.setFechanac(Funciones_fecha.fecha_naix());
			if((persona1.getedad()-((Client)persona1).getAntig_alta())<18){
				JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_fecha5"));
				good=false;
			}
			else{
				good=true;
			}
			}while(good==false);
		return good;
	}
	
	
	
	}
	/*
	 * public static int Antiguedad_alta (String falta){ int edad; Clase_Fecha
	 * edad1; edad1=new Clase_Fecha(falta); edad=edad1.RestaFechas(); return
	 * edad; }
	 */

