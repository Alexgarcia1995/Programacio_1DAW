package Ejer3;

public class Funciones_Ejer_Genericos {
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
