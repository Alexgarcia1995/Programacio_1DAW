package utils;

import javax.swing.JOptionPane;

import classes.Singleton_Login;
import modules.user.Model.Functions.Funciones_data_user;
import modules.user.Model.classes.Admin;
import modules.user.Model.classes.Client;
import modules.user.Model.classes.Singleton;

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
					JOptionPane.showMessageDialog(null, "Bienvenido "+p1.getusername());
					continuar=true;
				}
				else{
					continuar=false;
				}
			}
			if(continuar==false){
				JOptionPane.showMessageDialog(null, "No hay ningun usuario con ese nombre", "Error",JOptionPane.ERROR_MESSAGE);
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
					JOptionPane.showMessageDialog(null, "Bienvenido "+ p2.getusername());
					continuar=true;
				}
				else{
					JOptionPane.showMessageDialog(null, "No existe ningun usuario con ese nombre en el sistema","Error",JOptionPane.ERROR_MESSAGE);
					continuar=false;
				}
			}
			break;
		}
		return continuar;
	}
}
