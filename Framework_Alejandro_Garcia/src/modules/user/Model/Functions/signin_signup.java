package modules.user.Model.Functions;

import javax.swing.JOptionPane;

import classes.Languages;
import classes.Singleton_Login;
import modules.user.Model.BLL.BLL_user.Funciones_Ejer_Genericos;
import modules.user.Model.Functions.Funciones_data_user;
import modules.user.Model.classes.Admin;
import modules.user.Model.classes.Client;
import modules.user.Model.classes.Persona;
import modules.user.Model.classes.Singleton;
import utils.funciones;

public class signin_signup {

	public static boolean Login(){
		Client p1=null;
		Admin p2=null;
		boolean continuar=false;
		String result="";
		String s3="";
		switch(Singleton_Login.type_user){
		case "Client":
			Singleton_Login.nom_user=Funciones_data_user.Pideusername();
			Singleton_Login.password=Funciones_data_user.PidePassword();
			result=Singleton_Login.nom_user+Singleton_Login.password;
			
			for (int i=0;i<Singleton.userclient.size();i++){
				p1=Singleton.userclient.get(i);
				s3=p1.getusername()+p1.getpasswd();
				if(s3.equals(result)){
					i=Singleton.userclient.size();
					JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("welcome")+" "+p1.getusername());
					continuar=true;
				}
				else{
					continuar=false;
				}
			}
			break;
		case "Admin":
			Singleton_Login.nom_user=Funciones_data_user.Pideusername();
			Singleton_Login.password=Funciones_data_user.PidePassword();
			result=Singleton_Login.nom_user+Singleton_Login.password;
			for (int i=0;i<Singleton.useradmin.size();i++){
				p2=Singleton.useradmin.get(i);
				s3=p2.getusername()+p2.getpasswd();
				if(s3.equals(result)){
					i=Singleton.useradmin.size();
					JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("welcome")+" "+p2.getusername());
					continuar=true;
				}
				else{
					continuar=false;
				}
			}
			break;
		}
		if(continuar==false){
			JOptionPane.showMessageDialog(null,Languages.lenguajes.getProperty("error_login"), Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
		}
		return continuar;
	}
	
	
	public static void Register_client(){
		int location=-1;
		Persona p1;
		do{
		p1=Funciones_Ejer_Genericos.Create_DNI_Generic(0);
		location=Funciones_find.find_client((Client) p1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_dni"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {
			p1 = Funciones_Ejer_Genericos.Create_Generic(0);
			Singleton.userclient.add((Client) p1);
		}
	}while(location!=-1);
}
	
	
	public static void Register_admin(){
		Persona p1=null;
		int location=-1;
		String contraseña=funciones.ped_string(Languages.lenguajes.getProperty("contraseña"),Languages.lenguajes.getProperty("contraseña") );
		String valor="admin";
		if(valor.equals(contraseña)){
		p1=Funciones_Ejer_Genericos.Create_DNI_Generic(1);
		location=Funciones_find.find_admin((Admin) p1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_dni"),Languages.lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
		} else {
			p1 = Funciones_Ejer_Genericos.Create_Generic(1);
			Singleton.useradmin.add((Admin) p1);
	}
		}
		else {
			JOptionPane.showMessageDialog(null,Languages.lenguajes.getProperty("error"),Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
		}
	}
}
