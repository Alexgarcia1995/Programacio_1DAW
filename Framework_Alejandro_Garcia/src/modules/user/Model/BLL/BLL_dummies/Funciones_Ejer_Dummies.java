package modules.user.Model.BLL.BLL_dummies;

import javax.swing.JOptionPane;

import classes.Clase_Fecha;
import classes.Languages;
import modules.user.Model.Functions.*;
import modules.user.Model.classes.*;
import utils.funciones;

public class Funciones_Ejer_Dummies {
	public static Persona Create_Generic (int i){
		Clase_Fecha Fecha=null, Fecha2=null;
		Persona Persona1=null;
		if(i==0){
			Persona1= new Client();
			Persona1.setdni(Funciones_data_dummies.DNI());
			Persona1.setnom(Funciones_data_dummies.name());
			Persona1.setadreca(Funciones_data_dummies.Direccio());
			Persona1.setFechanac(Fecha=new Clase_Fecha(Funciones_data_dummies.datebirthday(),"dd/mm/yyyy"));
			Persona1.setsexe("H");
			((Client) Persona1).setemail(Funciones_data_dummies.email());
			((Client) Persona1).setavatar(Funciones_data_dummies.avatar());
			((Client) Persona1).setusername(Funciones_data_dummies.user());
			((Client) Persona1).setpasswd(Funciones_data_dummies.pass());
			((Client) Persona1).setFechaalta(Fecha2=new Clase_Fecha(Funciones_data_dummies.datecontract(),"dd/mm/yyyy"));
			((Client) Persona1).setCompras(20);
		}
		if (i==1){
			Persona1 = new Admin();
			Persona1.setdni(Funciones_data_dummies.DNI());
			Persona1.setnom(Funciones_data_dummies.name());
			Persona1.setadreca(Funciones_data_dummies.Direccio());
			Persona1.setFechanac(Fecha=new Clase_Fecha(Funciones_data_dummies.datebirthday(),"dd/mm/yyyy"));
			Persona1.setsexe("H");
			((Admin) Persona1).setemail(Funciones_data_dummies.email());
			((Admin) Persona1).setavatar(Funciones_data_dummies.avatar());
			((Admin) Persona1).setusername(Funciones_data_dummies.user());
			((Admin) Persona1).setpasswd(Funciones_data_dummies.pass());
			((Admin) Persona1).setAniocon(Fecha2=new Clase_Fecha(Funciones_data_dummies.datecontract(),"dd/mm/yyyy"));
		}
		
		if (i==2){
			Persona1 = new Normal();
			Persona1.setdni(Funciones_data_dummies.DNI());
			Persona1.setnom(Funciones_data_dummies.name());
			Persona1.setadreca(Funciones_data_dummies.Direccio());
			Persona1.setFechanac(Fecha=new Clase_Fecha(Funciones_data_dummies.datebirthday(),"dd/mm/yyyy"));
			Persona1.setsexe("H");
			((Normal) Persona1).setemail(Funciones_data_dummies.email());
			((Normal) Persona1).setusername(Funciones_data_dummies.user());
			((Normal) Persona1).setComments(20);
		}
		return Persona1;
	}
	
public static Persona Create_Generic_1(int i){
		Clase_Fecha Fecha=null, Fecha2=null;
		Persona Persona1=null;
		if(i==0){
			Persona1 = new Client("12345678Z");
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
			Persona1.setdni("12345678Z");
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
			Persona1.setdni("12345678Z");
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
			((Client) Persona1).setusername(Funciones_data_user.Pideusername());
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
			Persona1.setdni(Funciones_data_user.PideDNI());
		}
		if (i==1){
			Persona1 = new Admin();
			Persona1.setdni(Funciones_data_user.PideDNI());
		}
		
		if (i==2){
			Persona1 = new Normal();
			Persona1.setdni(Funciones_data_user.PideDNI());
		}
		return Persona1;

	}
	
	public static Persona Create_DNI_Generic1 (int i){
		Persona Persona1=null;
		if(i==0){
			Persona1 = new Client(Funciones_data_dummies.DNI());
		}
		if (i==1){
			Persona1 = new Admin(Funciones_data_dummies.DNI());
		}
		
		if (i==2){
			Persona1 = new Normal(Funciones_data_dummies.DNI());
		}
		return Persona1;

	}
}
