package modules.user.utils.Generics;

import classes.Settings;
import modules.user.utils.admin.utils.*;
import modules.user.utils.client.utils.*;
import modules.user.utils.normal.utils.*;


public class Save {
	public static void save_on_demand_admin(){
		if(Settings.Formatfitx=="xml"){
			save_on_demand.save_xml();
		}
		else if(Settings.Formatfitx=="json"){
			save_on_demand.save_json();
		}
		else if(Settings.Formatfitx=="txt"){
			save_on_demand.save_xml();
		}
	}
	
	public static void save_auto_admin(){
		if(Settings.Formatfitx=="xml"){
			save_auto.savexml();
		}
		else if(Settings.Formatfitx=="json"){
			save_auto.savejson();
			}
		else if(Settings.Formatfitx=="txt"){
			save_auto.savetxt();
			}
	}
	
	
	public static void save_on_demand_client(){
		if(Settings.Formatfitx=="xml"){
			save_on_demand_client.save_xml();
		}
		else if(Settings.Formatfitx=="json"){
			save_on_demand_client.save_json();
		}
		else if(Settings.Formatfitx=="txt"){
			save_on_demand_client.save_txt();
		}
	}
	
	public static void save_auto_client(){
		if(Settings.Formatfitx=="xml"){
			save_auto_client.savexml();
		}
		else if(Settings.Formatfitx=="json"){
			save_auto_client.savejson();
			}
		else if(Settings.Formatfitx=="txt"){
			save_auto_client.savetxt();
			}
	}
	
	
	
	
	public static void save_on_demand_normal(){
		if(Settings.Formatfitx=="xml"){
			save_on_demand_normal.save_xml_normal();
		}
		else if(Settings.Formatfitx=="json"){
			save_on_demand_normal.save_json_normal();
		}
		else if(Settings.Formatfitx=="txt"){
			save_on_demand_normal.save_txt_normal();
		}
	}
	
	public static void save_auto_normal(){
		if(Settings.Formatfitx=="xml"){
			save_auto_normal.savexml_normal();
		}
		else if(Settings.Formatfitx=="json"){
			save_auto_normal.savejson_normal();
			}
		else if(Settings.Formatfitx=="txt"){
			save_auto_normal.savetxt_normal();
			}
	}
	
	
}
