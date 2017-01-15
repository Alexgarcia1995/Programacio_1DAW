package Ejer3;

import Ejer3.Client;
import Ejer3.Admin;
import Ejer3.funciones;

public class Funciones_ejer {
	//Client
	public static Client Create_Usuario(Client Persona1) {
		Persona1 = new Client();
		Persona1.setdni(funciones.ped_string("Introduce tu DNI", "DNI"));
		Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
		Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
		Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
		Persona1.setsexe(funciones.ped_char("Sexo (H o M)", "Sexo"));
		Persona1.setemail(funciones.ped_string("Introduce tu correo", "Correo"));
		Persona1.setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
		Persona1.setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nombre Usuario"));
		Persona1.setpasswd(funciones.ped_string("Introduce tu contrasenya", "Contrasenya"));
		return Persona1;
	}

	public static String Read_Usuario(Client Persona1) {

		return Persona1.toString();

	}

	public static void Edit_Usario(Client Persona1) {
		String u = "";
		u = funciones.ped_string("What do you want to change?", "Change");
		switch (u) {
		case "DNI":
			Persona1.setdni(funciones.ped_string("Introduce tu nombre", "Nombre"));
			break;
		case "nombre":
			Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
			break;
		case "direccion":
			Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
			break;
		case "edad":
			Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
			break;
		case "email":	
			Persona1.setemail(funciones.ped_string("Introduce tu edad", "Edad"));
			break;
		case "avatar":
			Persona1.setavatar(funciones.ped_string("Introduce tu edad", "Edad"));
			break;
		case "Nombre usuario":
			Persona1.setusername(funciones.ped_string("Introduce tu edad", "Edad"));
			break;
		case "contrase�a":
			Persona1.setpasswd(funciones.ped_string("Introduce tu edad", "Edad"));
			break;
		}
	}

	public static Client Delete_user(Client Persona1) {
		Persona1 = null;
		return Persona1;
	}

	//Administradores
	public static Admin Create_Admin(Admin Persona1) {

		Persona1 = new Admin();
		Persona1.setdni(funciones.ped_string("Introduce tu DNI", "DNI"));
		Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
		Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
		Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
		Persona1.setsexe(funciones.ped_char("Sexo (H o M)", "Sexo"));
		Persona1.setemail(funciones.ped_string("Introduce tu correo", "Correo"));
		Persona1.setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
		Persona1.setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nombre Usuario"));
		Persona1.setpasswd(funciones.ped_string("Introduce tu contrasenya", "Contrase�a"));
		return Persona1;
	}

	public static String Read_Admin(Admin Persona1) {

		return Persona1.toString();

	}

	public static void Edit_Admin(Admin Persona1) {
		String u = "";
		u = funciones.ped_string("What do you want to change?", "Change");
		switch (u) {
		case "DNI":
			Persona1.setdni(funciones.ped_string("Introduce tu nombre", "Nombre"));
			break;
		case "nombre":
			Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
			break;
		case "direccion":
			Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
			break;
		case "edad":
			Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
			break;
		case "email":	
			Persona1.setemail(funciones.ped_string("Introduce tu email", "Email"));
			break;
		case "avatar":
			Persona1.setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
			break;
		case "Nombre usuario":
			Persona1.setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nom_Usu"));
			break;
		case "contrasenya":
			Persona1.setpasswd(funciones.ped_string("Introduce tu contrasenya", "Edad"));
			break;
		}
	}

	public static Admin Delete_Admin(Admin Persona1) {
		Persona1 = null;
		return Persona1;
	}

	// Normal
	public static Normal Create_Normal(Normal Persona1) {

		Persona1 = new Normal();
		Persona1.setdni(funciones.ped_string("Introduce tu DNI", "DNI"));
		Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
		Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
		Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
		Persona1.setsexe(funciones.ped_char("Sexo (H o M)", "Sexo"));
		Persona1.setemail(funciones.ped_string("Introduce tu correo", "Correo"));
		Persona1.setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nombre Usuario"));
		Persona1.setpasswd(funciones.ped_string("Introduce tu contrasenya", "Contrase�a"));
		return Persona1;
	}

	public static String Read_Normal(Normal Persona1) {

		return Persona1.toString();

	}

	public static void Edit_Normal(Normal Persona1) {
		String u = "";
		u = funciones.ped_string("What do you want to change?", "Change");
		switch (u) {
		case "DNI":
			Persona1.setdni(funciones.ped_string("Introduce tu nombre", "Nombre"));
			break;
		case "nombre":
			Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
			break;
		case "direccion":
			Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
			break;
		case "edad":
			Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
			break;
		case "email":	
			Persona1.setemail(funciones.ped_string("Introduce tu email", "Email"));
			break;
		case "Nombre usuario":
			Persona1.setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nom_Usu"));
			break;
		case "contrasenya":
			Persona1.setpasswd(funciones.ped_string("Introduce tu contrasenya", "Edad"));
			break;
		}
	}

	public static Normal Delete_Normal(Normal Persona1) {
		Persona1 = null;
		return Persona1;
	}

	//---------------------------------------------------
	
	
	
	public static Persona Create_Generic (int i){
		Persona Persona1=null;
		if(i==0){
			Persona1 = new Client();
			Persona1.setdni(funciones.ped_string("Introduce tu DNI", "DNI"));
			Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
			Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
			Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
			Persona1.setsexe(funciones.ped_char("Sexo (H o M)", "Sexo"));
			((Client) Persona1).setemail(funciones.ped_string("Introduce tu correo", "Correo"));
			((Client) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
			((Client) Persona1).setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nombre Usuario"));
			((Client) Persona1).setpasswd(funciones.ped_string("Introduce tu contrasenya", "Contrasenya"));
		}
		if (i==1){
			Persona1 = new Admin();
			Persona1.setdni(funciones.ped_string("Introduce tu DNI", "DNI"));
			Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
			Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
			Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
			Persona1.setsexe(funciones.ped_char("Sexo (H o M)", "Sexo"));
			((Admin) Persona1).setemail(funciones.ped_string("Introduce tu correo", "Correo"));
			((Admin) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
			((Admin) Persona1).setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nombre Usuario"));
			((Admin) Persona1).setpasswd(funciones.ped_string("Introduce tu contrasenya", "Contrasenya"));
		}
		
		if (i==2){
			Persona1 = new Normal();
			Persona1.setdni(funciones.ped_string("Introduce tu DNI", "DNI"));
			Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
			Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
			Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
			Persona1.setsexe(funciones.ped_char("Sexo (H o M)", "Sexo"));
			((Normal) Persona1).setemail(funciones.ped_string("Introduce tu correo", "Correo"));
			((Normal) Persona1).setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nombre Usuario"));
			((Normal) Persona1).setpasswd(funciones.ped_string("Introduce tu contrasenya", "Contrasenya"));
		}
		return Persona1;
	}

	public static String Read_Generic(Persona Persona1){
		String cad="";
		if (Persona1 instanceof Client){
			cad=((Client)Persona1).toString();
		}
		if (Persona1 instanceof Admin){
			cad=((Admin)Persona1).toString();
		}
		if (Persona1 instanceof Normal){
			cad=((Normal)Persona1).toString();
		}
		return cad;
	}
	public static Persona Update_Generic(Persona Persona1){
		String u = "";
		if (Persona1 instanceof Client){
		u = funciones.ped_string("What do you want to change?", "Change");
		switch (u) {
		case "DNI":
			Persona1.setdni(funciones.ped_string("Introduce tu nombre", "Nombre"));
			break;
		case "nombre":
			Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
			break;
		case "direccion":
			Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
			break;
		case "edad":
			Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
			break;
		case "email":	
			((Client) Persona1).setemail(funciones.ped_string("Introduce tu email", "Email"));
			break;
		case "avatar":
			((Client) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
		case "Nombre usuario":
			((Client) Persona1).setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nom_Usu"));
			break;
		case "contrasenya":
			((Client) Persona1).setpasswd(funciones.ped_string("Introduce tu contrasenya", "Edad"));
			break;
		}
		
	}
		if (Persona1 instanceof Admin){
			u = funciones.ped_string("What do you want to change?", "Change");
			switch (u) {
			case "DNI":
				Persona1.setdni(funciones.ped_string("Introduce tu nombre", "Nombre"));
				break;
			case "nombre":
				Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
				break;
			case "direccion":
				Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
				break;
			case "edad":
				Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
				break;
			case "email":	
				((Admin) Persona1).setemail(funciones.ped_string("Introduce tu email", "Email"));
				break;
			case "avatar":
				((Admin) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
			case "Nombre usuario":
				((Admin) Persona1).setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nom_Usu"));
				break;
			case "contrasenya":
				((Admin) Persona1).setpasswd(funciones.ped_string("Introduce tu contrasenya", "Edad"));
				break;
			}
			
		}
		if (Persona1 instanceof Normal){
			u = funciones.ped_string("What do you want to change?", "Change");
			switch (u) {
			case "DNI":
				Persona1.setdni(funciones.ped_string("Introduce tu nombre", "Nombre"));
				break;
			case "nombre":
				Persona1.setnom(funciones.ped_string("Introduce tu nombre", "Nombre"));
				break;
			case "direccion":
				Persona1.setadreca(funciones.ped_string("Introduce tu direccion", "Direccion"));
				break;
			case "edad":
				Persona1.setedad(funciones.pednum("Introduce tu edad", "Edad"));
				break;
			case "email":	
				((Normal) Persona1).setemail(funciones.ped_string("Introduce tu email", "Email"));
				break;
			case "Nombre usuario":
				((Normal) Persona1).setusername(funciones.ped_string("Introduce tu nombre de usuario", "Nom_Usu"));
				break;
			case "contrasenya":
				((Normal) Persona1).setpasswd(funciones.ped_string("Introduce tu contrasenya", "Edad"));
				break;
			}
			
		}
		return Persona1;
	}

	public static Persona Delete_Generic(Persona Persona1){
		Persona1=null;
		return Persona1;
	}
}

