package modules.user.Model.BLL.BLL_user;

import modules.user.Model.Functions.Funciones_data_user;
import modules.user.Model.Functions.Funciones_fecha;

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.Model.classes.*;
import utils.funciones;

public class Funciones_Ejer_Genericos {
	public static String valor;
	public static Persona Create_Generic (int i){
		Persona Persona1=null;
		if(i==0){
			Persona1 = new Client();
			Persona1.setdni(valor);
			Persona1.setnom(Funciones_data_user.PideNom());
			Persona1.setadreca(Funciones_data_user.PideDireccion());
			Persona1.setFechanac(Funciones_fecha.fecha_naix());
			Persona1.setsexe(Funciones_data_user.Pidesexe());
			((Client) Persona1).setemail(Funciones_data_user.Pideemail());
			((Client) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
			((Client) Persona1).setusername(Funciones_data_user.Pideusername2());
			((Client) Persona1).setpasswd(Funciones_data_user.PidePassword());
			((Client) Persona1).setFechaalta(Funciones_fecha.fecha_alta(Persona1.getFechanaix(),Persona1.getedad()));
			((Client) Persona1).setCompras(Funciones_data_user.Pidecompras());
		}
		if (i==1){
			Persona1 = new Admin();
			Persona1.setdni(valor);
			Persona1.setnom(Funciones_data_user.PideNom());
			Persona1.setadreca(Funciones_data_user.PideDireccion());
			Persona1.setFechanac(Funciones_fecha.fecha_naix());
			Persona1.setsexe(Funciones_data_user.Pidesexe());
			((Admin) Persona1).setemail(Funciones_data_user.Pideemail());
			((Admin) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
			((Admin) Persona1).setusername(Funciones_data_user.Pideusername());
			((Admin) Persona1).setpasswd(Funciones_data_user.PidePassword());
			((Admin) Persona1).setAniocon(Funciones_fecha.fecha_cont(Persona1.getFechanaix(),Persona1.getedad()));
		}
		
		if (i==2){
			Persona1 = new Normal();
			Persona1.setdni(valor);
			Persona1.setnom(Funciones_data_user.PideNom());
			Persona1.setadreca(Funciones_data_user.PideDireccion());
			Persona1.setFechanac(Funciones_fecha.fecha_naix());
			Persona1.setsexe(Funciones_data_user.Pidesexe());
			((Normal) Persona1).setemail(Funciones_data_user.Pideemail());
			((Normal) Persona1).setusername(Funciones_data_user.Pideusername());
			((Normal) Persona1).setComments(Funciones_data_user.Pidecomments());
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
		char c;
		if (Persona1 instanceof Client){String[] opcion = {"A)" + Languages.lenguajes.getProperty("dni"), "B)"+ Languages.lenguajes.getProperty("direccion"), 
				"C) " + Languages.lenguajes.getProperty("nom"), "D)" + Languages.lenguajes.getProperty("fecha_naix"), 
				"E) " + Languages.lenguajes.getProperty("sexe"), "F) " + Languages.lenguajes.getProperty("username"),
				"G) " + Languages.lenguajes.getProperty("email"), "H) Avatar","I) " + Languages.lenguajes.getProperty("contraseña"),
				"J) " + Languages.lenguajes.getProperty("fecha_alta"), "K) " + Languages.lenguajes.getProperty("compras")};
		e = funciones.combo_box(opcion, Languages.lenguajes.getProperty("cambio"),Languages.lenguajes.getProperty("cambio2"));
		c=e.charAt(0);
		switch (c) {
		case 'A':
			Persona1.setdni(Funciones_data_user.PideDNI());
			break;
		case 'B':
			Persona1.setadreca(Funciones_data_user.PideDireccion());
			break;
		case 'C':
			Persona1.setnom(Funciones_data_user.PideNom());
			break;
		case 'D':
				boolean good=false;
				do{
				good=Funciones_fecha.update_fecha_naix(Persona1);
				}while(good==false);
			break;
		case 'E':
			Persona1.setsexe(Funciones_data_user.Pidesexe());
			break;
		case 'F':
			((Client) Persona1).setusername(Funciones_data_user.Pideusername2());
			break;
		case 'G':
			((Client) Persona1).setemail(Funciones_data_user.Pideemail());
			break;
		case 'H':
			((Client) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
			break;
		case 'I':
			((Client) Persona1).setpasswd(Funciones_data_user.PidePassword());
			break;
		case 'J':
			((Client) Persona1).setFechaalta(Funciones_fecha.fecha_alta(Persona1.getFechanaix(), Persona1.getedad()));
			break;
		case 'K':
			((Client) Persona1).setCompras(Funciones_data_user.Pidecompras());
			break;
		}
	}
		if (Persona1 instanceof Admin){
			String[] opcion = {"A)" + Languages.lenguajes.getProperty("dni"), "B)"+ Languages.lenguajes.getProperty("direccion"), 
					"C) " + Languages.lenguajes.getProperty("nom"), "D)" + Languages.lenguajes.getProperty("fecha_naix"), 
					"E) " + Languages.lenguajes.getProperty("sexe"), "F) " + Languages.lenguajes.getProperty("username"),
					"G) " + Languages.lenguajes.getProperty("email"), "H) Avatar","I) " + Languages.lenguajes.getProperty("contraseña"),
					"J) " + Languages.lenguajes.getProperty("fecha_cont")};
			e = funciones.combo_box(opcion, Languages.lenguajes.getProperty("cambio"),Languages.lenguajes.getProperty("cambio2"));
			c=e.charAt(0);
			switch (c) {
			case 'A':
				Persona1.setdni(Funciones_data_user.PideDNI());
				break;
			case 'B':
				Persona1.setadreca(Funciones_data_user.PideDireccion());
				break;
			case 'C':
				Persona1.setnom(Funciones_data_user.PideNom());
				break;
			case 'D':
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
			case 'E':
				Persona1.setsexe(Funciones_data_user.Pidesexe());
				break;
			case 'F':
				((Admin) Persona1).setusername(Funciones_data_user.Pideusername());
				break;
			case 'G':
				((Admin) Persona1).setemail(Funciones_data_user.Pideemail());
				break;
			case 'H':
				((Admin) Persona1).setavatar(funciones.ped_string("Introduce tu avatar", "Avatar"));
				break;
			case 'I':
				((Admin) Persona1).setpasswd(Funciones_data_user.PidePassword());
				break;
			case 'J':
				((Admin) Persona1).setAniocon(Funciones_fecha.fecha_cont(Persona1.getFechanaix(),Persona1.getedad()));
				break;
			}
		}
		if (Persona1 instanceof Normal){
			
			String[] opcion = {"A)" + Languages.lenguajes.getProperty("dni"), "B)"+ Languages.lenguajes.getProperty("direccion"), 
					"C) " + Languages.lenguajes.getProperty("nom"), "D)" + Languages.lenguajes.getProperty("fecha_naix"), 
					"E) " + Languages.lenguajes.getProperty("sexe"), "F) " + Languages.lenguajes.getProperty("username"),
					"G) " + Languages.lenguajes.getProperty("email"), "H) " + Languages.lenguajes.getProperty("comments")};
			
			e = funciones.combo_box(opcion, Languages.lenguajes.getProperty("cambio"),Languages.lenguajes.getProperty("cambio2"));
			c=e.charAt(0);
			switch (c) {
			case 'A':
				Persona1.setdni(Funciones_data_user.PideDNI());
				break;
			case 'B':
				Persona1.setadreca(Funciones_data_user.PideDireccion());
				break;
			case 'C':
				Persona1.setnom(Funciones_data_user.PideNom());
				break;
			case 'D':
				Persona1.setFechanac(Funciones_fecha.fecha_naix());
				break;
			case 'E':
				Persona1.setsexe(Funciones_data_user.Pidesexe());
				break;
			case 'F':
				((Normal) Persona1).setusername(Funciones_data_user.Pideusername());
				break;
			case 'G':
				((Normal) Persona1).setemail(Funciones_data_user.Pideemail());
				break;
			case 'H':
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

	public static Persona Create_DNI_Generic (int i){
		Persona Persona1=null;
		if(i==0){
			Persona1 = new Client();
			valor=Funciones_data_user.PideDNI();
			Persona1.setdni(valor);
		}
		if (i==1){
			Persona1 = new Admin();
			valor=Funciones_data_user.PideDNI();
			Persona1.setdni(valor);
		}
		
		if (i==2){
			Persona1 = new Normal();
			valor=Funciones_data_user.PideDNI();
			Persona1.setdni(valor);
		}
		return Persona1;

	}
}
