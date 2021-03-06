package modules.user.Model.Functions;


import classes.Singleton_Login;
import modules.user.Model.classes.*;
import utils.funciones;

public class Funciones_find {


		public static int find_admin(Admin admin) { 
			for (int i=0; i<=(Singleton.useradmin.size()-1);i++){
				if((Singleton.useradmin.get(i)).equals(admin))
					return i;
			}
			return -1;
		}
		 
		public static int find_client(Client client) { 
			for (int i = 0; i<=(Singleton.userclient.size()-1); i++){
				if((Singleton.userclient.get(i)).equals(client) )
					return i;
			}
			return -1;
		}
		
		public static int find_user(Normal normal) { 
			for (int i = 0; i<=(Singleton.usernormal.size()-1); i++){
				if((Singleton.usernormal.get(i)).equals(normal))
					return i;
			}
			return -1;
		}
		public static int find_dni_client(String dni) { 
			for (int i = 0; i<=(Singleton.userclient.size()-1); i++){
				if((Singleton.userclient.get(i)).getdni().equals(dni))
					return i;
			}
			return -1;
		}
		
		public static int find_dni_admin(String dni) { 
			for (int i=0; i<=(Singleton.useradmin.size()-1);i++){
				if((Singleton.useradmin.get(i)).getdni().equals(dni))
					return i;
			}
			return -1;
		}
		public static int find_dni_normal(String dni) { 
			for (int i = 0; i<=(Singleton.usernormal.size()-1); i++){
				if((Singleton.usernormal.get(i)).getdni().equals(dni))
					return i;
			}
			return -1;
		}
		public static int find_nom_user(){
			String valor="";
			switch(Singleton_Login.type_user){
			case "Client":
				for (int i=0; i<=(Singleton.userclient.size()-1);i++){
					valor=Singleton.userclient.get(i).getusername();
					if (valor.equals(Singleton_Login.nom_user)){
						Singleton.userclient.get(i);
						return i;
					}
				}
				break;
			case "Admin":
				for (int i=0; i<=(Singleton.useradmin.size()-1);i++){
					valor=Singleton.useradmin.get(i).getusername();
					if (valor.equals(Singleton_Login.nom_user)){
						Singleton.useradmin.get(i);
						return i;
					}
				}
				break;
			}
			
			return -1;
			
		}
		
		public static String[] vector_admin () {
			Admin a1 = null;
			String s = "";
			int arraylist =Singleton.useradmin.size();
			String [] user = new String[arraylist];
			for (int i = 0; i<arraylist; i++) {
				a1 = (Admin) Singleton.useradmin.get(i);
				s=a1.getdni()+"-----"+a1.getnom();
				user[i] = s;
			}
			
			return user;
		}
		
		public static String[] vector_client () {
			Client a1 = null;
			String s = "";
			int arraylist =Singleton.userclient.size();
			String [] user = new String[arraylist];
			for (int i = 0; i<arraylist; i++) {
				a1 = (Client) Singleton.userclient.get(i);
				s=a1.getdni()+"-----"+a1.getnom();
				user[i] = s;
			}
			
			return user;
		}
		
		public static String[] vector_normal () {
			Normal a1 = null;
			String s = "";
			int arraylist =Singleton.usernormal.size();
			String [] user = new String[arraylist];
			for (int i = 0; i<arraylist; i++) {
				a1 = (Normal) Singleton.usernormal.get(i);
				s=a1.getdni()+"-----"+a1.getnom();
				user[i] = s;
			}
			
			return user;
		}
		
		public static Admin IDadmin () {
			Admin a1 = null;
			String ID = "";
			String [] admin = vector_admin ();
			String search = funciones.combo_box(admin,"select_user","asktitle");
			if (search != ""){
				for (int i = 0; i<9; i++) {
					ID += search.charAt(i);
				}
				a1 = new Admin (ID);
			}
			return a1;		
		}
		
		public static Client IDClient () {
			Client c1 = null;
			String ID = "";
			String [] client = vector_client ();
			String search = funciones.combo_box(client,"select_user","asktitle");
			if (search != ""){
				for (int i = 0; i<9; i++) {
					ID += search.charAt(i);
				}
				c1 = new Client (ID);
			}
			return c1;		
		}
		
		public static Normal IDNormal () {
			Normal u1 = null;
			String ID = "";
			String [] normal = vector_normal ();
			String search = funciones.combo_box(normal,"select_user","asktitle");
			if (search != ""){
				for (int i = 0; i<9; i++) {
					ID += search.charAt(i);
				}
				u1 = new Normal (ID);
			}
			return u1;		
		}
	}