package classes;

import java.util.ArrayList;

public class Singleton_app {

	public static ArrayList<Settings> Setting;
	
	public static void create_settings(){
		Settings set=null;
		for(int i=0; i<Setting.size(); i++){
			set=Setting.get(i);
		}
		
		Singleton_app.Setting.add(set);
	}
}