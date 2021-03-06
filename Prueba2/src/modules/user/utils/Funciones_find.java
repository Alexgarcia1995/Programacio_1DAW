package modules.user.utils;

import modules.user.classes.Admin;
import modules.user.classes.Client;
import modules.user.classes.Normal;
import modules.user.classes.Singleton;

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
				if((Singleton.usernormal.get(i)).equals(normal) )
					return i;
			}
			return -1;
		}
	}

