package utils;

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.Model.BLL.BLL_user.Funciones_Ejer_Genericos;
import modules.user.Model.Functions.Funciones_data_user;
import modules.user.Model.classes.*;

public class funciones {
	public static int pednum (String title , String message){
		int num=0;
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog(null, title , message, JOptionPane.INFORMATION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;	
				}
				else{
				num=Integer.parseInt(s);
				good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		return num;
	}// acaba pednum

	public static float pedfloat (String title , String message){
		float num=0.0f;
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog(null, title , message, JOptionPane.INFORMATION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;	
				}
				else{
				num=Float.parseFloat(s);
				good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		return num;
	}// acaba pednum
	
	public static char ped_char(String title, String message){
		char character = ' ';
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog (null, title , message , JOptionPane.INFORMATION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Error, give me a character","Error", JOptionPane.ERROR_MESSAGE);
					good=false;	
				}
				else{
					character=s.charAt(0);
					good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a character","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		return character;
	}// acaba ped_char
	
	public static String ped_string(String title, String message){
		String c="";
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog (null, title , message, JOptionPane.INFORMATION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Error, give me a phrase","Error", JOptionPane.ERROR_MESSAGE);
					good=false;	
				}
				else{
				c=s;
				good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a phrase","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		return c;
	}// acaba ped_string

	public static int menu(String[] option, String message, String title){
		int men=0;
		men=JOptionPane.showOptionDialog(null, title , message, 0 , JOptionPane.QUESTION_MESSAGE, null, option, option [0]);
		return men;
	}
	
	public static String combo_box(String[] opcion, String message, String title){
		String option="";
		
		option=(String) JOptionPane.showInputDialog(null,message,title,JOptionPane.QUESTION_MESSAGE,null,opcion,opcion[0]);
		
		return option;
	}

	public static String[] Menu1(){
		String[] principal={Languages.lenguajes.getProperty("menu_p"),Languages.lenguajes.getProperty("opciones"),
				Languages.lenguajes.getProperty("exit")};
		return principal;
	}
	
	public static String[] Menu2(){
		String[] option = {Languages.lenguajes.getProperty("create"), Languages.lenguajes.getProperty("read"), Languages.lenguajes.getProperty("update"), Languages.lenguajes.getProperty("delete"),
				Languages.lenguajes.getProperty("orden"),Languages.lenguajes.getProperty("open"),Languages.lenguajes.getProperty("save"),
				Languages.lenguajes.getProperty("exit") };
		return option;
	}
	
	public static String[] Menu3(){
		String[] option1 = {Languages.lenguajes.getProperty("client"), Languages.lenguajes.getProperty("admin"), Languages.lenguajes.getProperty("normal"),Languages.lenguajes.getProperty("exit")};
		return option1;
	}
	
	public static String[] Menu4(){
		String[] option2= {Languages.lenguajes.getProperty("fecha"), Languages.lenguajes.getProperty("moneda"), Languages.lenguajes.getProperty("decimales"), 
				Languages.lenguajes.getProperty("lenguajes"),"Dummies",Languages.lenguajes.getProperty("formato2"),
				Languages.lenguajes.getProperty("theme"),Languages.lenguajes.getProperty("exit")};
		return option2;
	}



	public static boolean Login(int opcion){
		Client p1=null;
		Admin p2=null;
		boolean continuar=false;
		String s1="", s2="",result="";
		String s3="";
		switch(opcion){
		case 0:
			s1=Funciones_data_user.Pideusername();
			s2=Funciones_data_user.PidePassword();
			result=s1+s2;
			
			for (int i=0;i<Singleton.userclient.size();i++){
				p1=Singleton.userclient.get(i);
				s3=p1.getusername()+p1.getpasswd();
				if(s3.equals(result)){
					i=Singleton.userclient.size();
					JOptionPane.showMessageDialog(null, "Bienvenido"+p1.getusername());
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
		case 1:

			s1=Funciones_data_user.Pideusername();
			s2=Funciones_data_user.PidePassword();
			result=s1+s2;
			for (int i=0;i<Singleton.useradmin.size();i++){
				p2=Singleton.useradmin.get(i);
				s3=p2.getusername()+p2.getpasswd();
				if(s3.equals(result)){
					i=Singleton.useradmin.size();
					JOptionPane.showMessageDialog(null, "Bienvenido"+p2.getusername());
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
	
	
	
	public static void Register_client(){
		Persona p1=null;
		p1=Funciones_Ejer_Genericos.Create_Generic(0);
		Singleton.userclient.add((Client) p1);
	}
	
	
	public static void Register_admin(){
		Persona p1=null;
		p1=Funciones_Ejer_Genericos.Create_Generic(1);
		Singleton.useradmin.add((Admin) p1);
	}
}
