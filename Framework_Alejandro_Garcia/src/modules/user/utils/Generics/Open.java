package modules.user.utils.Generics;

import classes.Settings;
import modules.user.classes.Singleton;
import modules.user.utils.admin.utils.open_auto;
import modules.user.utils.admin.utils.open_on_demand;
import modules.user.utils.client.utils.open_auto_client;
import modules.user.utils.client.utils.open_on_demand_client;
import modules.user.utils.normal.utils.open_auto_normal;
import modules.user.utils.normal.utils.open_on_demand_normal;

public class Open {

	public static void Open_auto(){
		if(Settings.Formatfitx=="xml"){
			Singleton.useradmin=open_auto.openxml();
			Singleton.userclient=open_auto_client.openxml();
			Singleton.usernormal=open_auto_normal.openxml_normal();
		}
		else if(Settings.Formatfitx=="json"){
			Singleton.useradmin=open_auto.openjson();
			Singleton.userclient=open_auto_client.openjson();
			Singleton.usernormal=open_auto_normal.openjson_normal();
		}
		else if(Settings.Formatfitx=="txt"){
			Singleton.useradmin=open_auto.opentxt();
			Singleton.userclient=open_auto_client.opentxt();
			Singleton.usernormal=open_auto_normal.opentxt_normal();
		}
	}
	

	public static void Open_admin(){
		if(Settings.Formatfitx=="xml"){
			Singleton.useradmin=open_on_demand.open_xml();
		}
		else if(Settings.Formatfitx=="json"){
			Singleton.useradmin=open_on_demand.open_json();;
		}
		else if(Settings.Formatfitx=="txt"){
			Singleton.useradmin=open_on_demand.open_txt();
		}
	}

	public static void Open_client(){
		if(Settings.Formatfitx=="xml"){
			Singleton.userclient=open_on_demand_client.open_xml();
		}
		else if(Settings.Formatfitx=="json"){
			Singleton.userclient=open_on_demand_client.open_json();;
		}
		else if(Settings.Formatfitx=="txt"){
			Singleton.userclient=open_on_demand_client.open_txt();
		}
	}
	
	public static void Open_normal(){
		if(Settings.Formatfitx=="xml"){
			Singleton.usernormal=open_on_demand_normal.open_xml_normal();
		}
		else if(Settings.Formatfitx=="json"){
			Singleton.usernormal=open_on_demand_normal.open_json_normal();
		}
		else if(Settings.Formatfitx=="txt"){
			Singleton.usernormal=open_on_demand_normal.open_txt_normal();
		}
	}
	
}
