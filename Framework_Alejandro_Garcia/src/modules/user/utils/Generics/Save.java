package modules.user.utils.Generics;

import classes.Settings;
import modules.user.utils.admin.utils.*;
import modules.user.utils.client.utils.*;
import modules.user.utils.normal.utils.*;


public class Save {

	public static void save_on_demand_admin(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			save_on_demand.save_xml();
			break;
		case "json":
			save_on_demand.save_json();
			break;
		case "txt":
			save_on_demand.save_txt();
			break;
		}
		
	}
	
	public static void save_auto_admin(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			save_auto.savexml();
			break;
		case "json":
			save_auto.savejson();
			break;
		case "txt":
			save_auto.savetxt();
			break;
		}
	}
	
	
	public static void save_on_demand_client(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			save_on_demand_client.save_xml();
			break;
		case "json":
			save_on_demand_client.save_json();
			break;
		case "txt":
			save_on_demand_client.save_txt();
			break;
		}
	}
	
	public static void save_auto_client(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			save_auto_client.savexml();
			break;
		case "json":
			save_auto_client.savejson();
			break;
		case "txt":
			save_auto_client.savetxt();
			break;
		}
	}
	
	
	
	
	public static void save_on_demand_normal(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			save_on_demand_normal.save_xml_normal();
			break;
		case "json":
			save_on_demand_normal.save_json_normal();
			break;
		case "txt":
			save_on_demand_normal.save_txt_normal();
			break;
		}
	}
	
	public static void save_auto_normal(){
		String formato=Settings.instance.getFormatfitx();
		switch(formato){
		case "xml":
			save_auto_normal.savexml_normal();
			break;
		case "json":
			save_auto_normal.savejson_normal();
			break;
		case "txt":
			save_auto_normal.savetxt_normal();
			break;
		}
	}
	
	
}
