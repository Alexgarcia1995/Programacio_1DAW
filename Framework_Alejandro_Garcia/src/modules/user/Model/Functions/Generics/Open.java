package modules.user.Model.Functions.Generics;

import javax.swing.JOptionPane;

import classes.Languages;
import classes.Settings;
import modules.user.Model.classes.Singleton;
import modules.user.Model.files_users.admin.utils.*;
import modules.user.Model.files_users.normal.utils.*;
import utils.funciones;
import modules.user.Model.files_users.client.utils.*;

public class Open {
	//public static 
	public static void Open_auto(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			Singleton.useradmin=open_auto.openxml();
			Singleton.userclient=open_auto_client.openxml();
			Singleton.usernormal=open_auto_normal.openxml_normal();
			break;
		case "json":
			Singleton.useradmin=open_auto.openjson();
			Singleton.userclient=open_auto_client.openjson();
			Singleton.usernormal=open_auto_normal.openjson_normal();
			break;
		case "txt":
			Singleton.useradmin=open_auto.opentxt();
			Singleton.userclient=open_auto_client.opentxt();
			Singleton.usernormal=open_auto_normal.opentxt_normal();
			break;
		}

	}
		

	
	

	public static void Open_admin(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			Singleton.useradmin=open_on_demand.open_xml();
			break;
		case "json":
			Singleton.useradmin=open_on_demand.open_json();
			break;
		case "txt":
			Singleton.useradmin=open_on_demand.open_txt();
			break;
		}

	}

	public static void Open_client(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			Singleton.userclient=open_on_demand_client.open_xml();
			break;
		case "json":
			Singleton.userclient=open_on_demand_client.open_json();
			break;
		case "txt":
			Singleton.userclient=open_on_demand_client.open_txt();
			break;
		}

	
	}
	
	public static void Open_normal(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			Singleton.usernormal=open_on_demand_normal.open_xml_normal();
			break;
		case "json":
			Singleton.usernormal=open_on_demand_normal.open_json_normal();
			break;
		case "txt":
			Singleton.usernormal=open_on_demand_normal.open_txt_normal();
			break;
		}

	}
	public static void open_on_demand_superadmin(){
		int menu=0;
		String[] menus={Languages.lenguajes.getProperty("open")+" "+Languages.lenguajes.getProperty("client"),
				Languages.lenguajes.getProperty("open")+" "+Languages.lenguajes.getProperty("admin"),Languages.lenguajes.getProperty("exit")};
		menu=funciones.menu(menus, Languages.lenguajes.getProperty("open"), Languages.lenguajes.getProperty("open"));
		switch (menu){
		case 0:
			Open.Open_client();
			break;
		case 1:
			Open.Open_admin();
			break;
		case 2:
			break;
		}
	}
	
}
