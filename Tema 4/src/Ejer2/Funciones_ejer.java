package Ejer2;

import javax.swing.JOptionPane;

import Ejer2.Persona;
import Ejer2.funciones;

public class Funciones_ejer {

	public static Persona Create_user(Persona Persona1){
		Persona1= new Persona();
		Persona1.setdni(funciones.ped_string("Introduce tu DNI","DNI"));;
		Persona1.setnom(funciones.ped_string("Introduce tu nombre","Nombre"));
		Persona1.setadreca(funciones.ped_string("Introduce tu direccion","Direccion"));
		Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
		return Persona1;
	}
	public static String Read_user(Persona Persona1){

		return Persona1.toString();
	
	}
	
	public static void Edit_User (Persona Persona1){
		String u="";
		u=funciones.ped_string("What do you want to change?", "Change");
		switch (u){
		case "DNI":
			Persona1.setdni(funciones.ped_string("Introduce tu nombre","Nombre"));
			break;
		case "nombre":
			Persona1.setnom(funciones.ped_string("Introduce tu nombre","Nombre"));
			break;
		case "direccion":
			Persona1.setadreca(funciones.ped_string("Introduce tu direccion","Direccion"));
			break;
		case "edad":
			Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
			break;
		}
	}
	public static Persona Delete_user(Persona Persona1){
		Persona1=null;
		return Persona1;
	}
	
	
}
