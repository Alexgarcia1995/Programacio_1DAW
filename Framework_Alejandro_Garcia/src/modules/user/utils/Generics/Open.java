package modules.user.utils.Generics;

import javax.swing.JOptionPane;

import classes.Settings;
import modules.user.classes.Singleton;
import modules.user.utils.admin.utils.open_auto;
import modules.user.utils.admin.utils.open_on_demand;
import modules.user.utils.client.utils.open_auto_client;
import modules.user.utils.client.utils.open_on_demand_client;
import modules.user.utils.normal.utils.open_auto_normal;
import modules.user.utils.normal.utils.open_on_demand_normal;

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
	
}
