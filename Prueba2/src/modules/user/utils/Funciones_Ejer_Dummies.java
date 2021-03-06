package modules.user.utils;

import javax.swing.JOptionPane;

import classes.Clase_Fecha;
import classes.Languages;
import modules.user.classes.Admin;
import modules.user.classes.Client;
import modules.user.classes.Normal;
import modules.user.classes.Persona;
import utils.funciones;

public class Funciones_Ejer_Dummies {
	public static Persona Create_Generic (int i){
		Clase_Fecha Fecha=null, Fecha2=null;
		Persona Persona1=null;
		if(i==0){
			Persona1 = new Client();
			Persona1.setdni("73099940Y");
			Persona1.setnom("Pepe");
			Persona1.setadreca("Avda. Diputacion 68B");
			Persona1.setFechanac(Fecha=new Clase_Fecha("14/09/1995","dd/mm/yyyy"));
			Persona1.setsexe("H");
			((Client) Persona1).setemail("pepe@gmail.com");
			((Client) Persona1).setavatar("asdasdas");
			((Client) Persona1).setusername("pepe1995");
			((Client) Persona1).setpasswd("pepe123@");
			((Client) Persona1).setFechaalta(Fecha2=new Clase_Fecha("01/02/2014","dd/mm/yyyy"));
			((Client) Persona1).setCompras(20);
		}
		if (i==1){
			Persona1 = new Admin();
			Persona1.setdni("73099940Y");
			Persona1.setnom("Pepe");
			Persona1.setadreca("Avda. Diputacion 68B");
			Persona1.setFechanac(Fecha=new Clase_Fecha("14/09/1995","dd/mm/yyyy"));
			Persona1.setsexe("H");
			((Admin) Persona1).setemail("pepe@gmail.com");
			((Admin) Persona1).setavatar("asdasdas");
			((Admin) Persona1).setusername("pepe1995");
			((Admin) Persona1).setpasswd("pepe123@");
			((Admin) Persona1).setAniocon(Fecha2=new Clase_Fecha("01/02/2014","dd/mm/yyyy"));
		}
		
		if (i==2){
			Persona1 = new Normal();
			Persona1.setdni("73099940Y");
			Persona1.setnom("Pepe");
			Persona1.setadreca("Avda. Diputacion 68B");
			Persona1.setFechanac(Fecha=new Clase_Fecha("14/09/1995","dd/mm/yyyy"));
			Persona1.setsexe("H");
			((Normal) Persona1).setemail("pepe@gmail.com");
			((Normal) Persona1).setusername("pepe1995");
			((Normal) Persona1).setComments(20);
		}
		return Persona1;
	}
	public static Persona Create_Generic_1(int i){
		Clase_Fecha Fecha=null, Fecha2=null;
		Persona Persona1=null;
		if(i==0){
			Persona1 = new Client();
			Persona1.setdni("123456789Z");
			Persona1.setnom("Alex");
			Persona1.setadreca("Avda. Diputacion 68B");
			Persona1.setFechanac(Fecha=new Clase_Fecha("14/09/1970","dd/mm/yyyy"));
			Persona1.setsexe("H");
			((Client) Persona1).setemail("alex@gmail.com");
			((Client) Persona1).setavatar("asdasdas");
			((Client) Persona1).setusername("alex");
			((Client) Persona1).setpasswd("alex123@");
			((Client) Persona1).setFechaalta(Fecha2=new Clase_Fecha("01/02/2000","dd/mm/yyyy"));
			((Client) Persona1).setCompras(20);
		}
		if (i==1){
			Persona1 = new Admin();
			Persona1.setdni("123456789Z");
			Persona1.setnom("Alex");
			Persona1.setadreca("Avda. Diputacion 68B");
			Persona1.setFechanac(Fecha=new Clase_Fecha("14/09/1970","dd/mm/yyyy"));
			Persona1.setsexe("H");
			((Admin) Persona1).setemail("alex@gmail.com");
			((Admin) Persona1).setavatar("asdasdas");
			((Admin) Persona1).setusername("alex");
			((Admin) Persona1).setpasswd("alex123@");
			((Admin) Persona1).setAniocon(Fecha2=new Clase_Fecha("01/02/2014","dd/mm/yyyy"));
		}
		
		if (i==2){
			Persona1 = new Normal();
			Persona1.setdni("123456789Z");
			Persona1.setnom("Alex");
			Persona1.setadreca("Avda. Diputacion 68B");
			Persona1.setFechanac(Fecha=new Clase_Fecha("14/09/1970","dd/mm/yyyy"));
			Persona1.setsexe("H");
			((Normal) Persona1).setemail("alex@gmail.com");
			((Normal) Persona1).setusername("alex");
			((Normal) Persona1).setComments(20);
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
		String e;
		if (Persona1 instanceof Client){
		String[] opcion = { Languages.lenguajes.getProperty("dni"), Languages.lenguajes.getProperty("nom"), Languages.lenguajes.getProperty("direccion"),Languages.lenguajes.getProperty("Sexo"),Languages.lenguajes.getProperty("fecha_naix"), Languages.lenguajes.getProperty("email"),
				"Avatar", Languages.lenguajes.getProperty("username"), "Contrasena", "Fecha alta", "N compras"};
		e = funciones.combo_box(opcion, "What do you want to change?", "Change");
		switch (e) {
		case "DNI":
			Persona1.setdni(Funciones_data_user.PideDNI());
			break;
		case "Nombre":
			Persona1.setnom(Funciones_data_user.PideNom());
			break;
		case "Direccion":
			Persona1.setadreca(Funciones_data_user.PideDireccion());
			break;
		case "Sexo":
			Persona1.setsexe(Funciones_data_user.Pidesexe());
			break;
		case "Fecha nacimiento":
			boolean good=false;
			do{
			good=Funciones_fecha.update_fecha_naix(Persona1);
			}while(good==false);
			break;
		case "Email":	
			((Client) Persona1).setemail(Funciones_data_user.Pideemail());
			break;
		case  "Avatar":
			((Client) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
		case "Nombre usuario":
			((Client) Persona1).setusername(Funciones_data_user.Pideusername());
			break;
		case "Contrasena":
			((Client) Persona1).setpasswd(Funciones_data_user.PidePassword());
			break;
		case "Fecha alta":
			((Client) Persona1).setFechaalta(Funciones_fecha.fecha_alta(Persona1.getFechanaix(), Persona1.getedad()));
			break;
		case "N compras":
			((Client) Persona1).setCompras(Funciones_data_user.Pidecompras());
			break;
		}
		
	}
		if (Persona1 instanceof Admin){
			String[] opcion = { "DNI", "Nombre", "Direccion","Sexo","Fecha nacimiento", "Email", "Avatar", "Nombre usuario", "Contrasena", "Fecha contratacion"};
			e = funciones.combo_box(opcion, "What do you want to change?", "Change");
			switch (e) {
			case "DNI":
				Persona1.setdni(Funciones_data_user.PideDNI());
				break;
			case "Nombre":
				Persona1.setnom(Funciones_data_user.PideNom());
				break;
			case "Direccion":
				Persona1.setadreca(Funciones_data_user.PideDireccion());
				break;
			case "Sexo":
				Persona1.setsexe(Funciones_data_user.Pidesexe());
				break;
			case "Fecha nacimiento":
				boolean good=false;
				do{
				Persona1.setFechanac(Funciones_fecha.fecha_naix());
				if((Persona1.getedad()-((Admin)Persona1).getAntiguedad())<18){
					JOptionPane.showMessageDialog(null, "No puedes cambiar tu fecha de nacimiento a una anterior a los 18 anos");
					good=false;
				}
				else{
					good=true;
				}
				}while(good==false);
				break;
			case "Email":	
				((Admin) Persona1).setemail(Funciones_data_user.Pideemail());
				break;
			case "Avatar":
				((Admin) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
			case "Nombre usuario":
				((Admin) Persona1).setusername(Funciones_data_user.Pideusername());
				break;
			case "Contrasena":
				((Admin) Persona1).setpasswd(Funciones_data_user.PidePassword());
				break;
			case "Fecha contratacion":
				((Admin) Persona1).setAniocon(Funciones_fecha.fecha_cont(Persona1.getFechanaix(),Persona1.getedad()));
				break;
			}
			
		}
		if (Persona1 instanceof Normal){
			
			String[] opcion = { Languages.lenguajes.getProperty("dni"), Languages.lenguajes.getProperty("nom"), Languages.lenguajes.getProperty("direccion"),Languages.lenguajes.getProperty("sexe"),
					Languages.lenguajes.getProperty("fecha_naix"), Languages.lenguajes.getProperty("email"), Languages.lenguajes.getProperty("username"), Languages.lenguajes.getProperty("comments")};
			e = funciones.combo_box(opcion, Languages.lenguajes.getProperty("cambio"),Languages.lenguajes.getProperty("cambio2") );
			switch (e) {
			case "DNI":
				Persona1.setdni(Funciones_data_user.PideDNI());
				break;
				//Nombres 3 idiomas
			case "Nombre":
				Persona1.setnom(Funciones_data_user.PideNom());
				break;
			case "Name":
				Persona1.setnom(Funciones_data_user.PideNom());
				break;
			case "Nom":
				Persona1.setnom(Funciones_data_user.PideNom());
				break;
				//Direccion 3 idiomas
			case "Direccion":
				Persona1.setadreca(Funciones_data_user.PideDireccion());
				break;
			case "Address":
				Persona1.setadreca(Funciones_data_user.PideDireccion());
				break;
			case "Direccio":
				Persona1.setadreca(Funciones_data_user.PideDireccion());
				break;
				//Sexo 3 idiomas
			case "Sexo":
				Persona1.setsexe(Funciones_data_user.Pidesexe());
				break;
			case "Sexe":
				Persona1.setsexe(Funciones_data_user.Pidesexe());
				break;
			case "Gender":
				Persona1.setsexe(Funciones_data_user.Pidesexe());
				break;
				//Fecha 3 idiomas
			case "Fecha nacimiento":
				Persona1.setFechanac(Funciones_fecha.fecha_naix());
				break;
			case "Data naiximent":
				Persona1.setFechanac(Funciones_fecha.fecha_naix());
				break;
			case "Date of birth":
				Persona1.setFechanac(Funciones_fecha.fecha_naix());
				break;
				//Email 3 idiomas
			case "Email":	
				((Normal) Persona1).setemail(Funciones_data_user.Pideemail());
				break;
			case "Correu electronic":	
				((Normal) Persona1).setemail(Funciones_data_user.Pideemail());
				break;
			case "Correo electronico":	
				((Normal) Persona1).setemail(Funciones_data_user.Pideemail());
				break;
				//Nombre usuario 3 idiomas
			case "Nombre usuario":
				((Normal) Persona1).setusername(Funciones_data_user.Pideusername());
				break;
			case "Nom usuari":
				((Normal) Persona1).setusername(Funciones_data_user.Pideusername());
				break;
			case "User name":
				((Normal) Persona1).setusername(Funciones_data_user.Pideusername());
				break;
				//Comentarios 3 idiomas
			case "Numero comentarios":
				((Normal) Persona1).setComments(Funciones_data_user.Pidecomments());
				break;
			case "Nombre comentaris":
				((Normal) Persona1).setComments(Funciones_data_user.Pidecomments());
				break;
			case "Number of comments":
				((Normal) Persona1).setComments(Funciones_data_user.Pidecomments());
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
