
import javax.swing.JOptionPane;

import classes.Languages;
import classes.Settings;
import modules.user.classes.Persona;
import utils.formatos;
import utils.funciones;
import modules.user.utils.Funciones_Ejer_Dummies;
public class Main_Dummies {
	public static Settings settings=null;
	public static Languages lenguajes=Languages.lenguajes;
	
	public static void main(String[] args) {
		int men = 0, men1 = 0;
		String cad = "";
		Persona p=null;
		Persona p1=null;
		Persona p2=null;
		
		settings=new Settings();
		
		do {
			if(Settings.dummies==false){
				Main_Framework2.main(null);
			}
			String[] option = {lenguajes.getProperty("create"), lenguajes.getProperty("read"), lenguajes.getProperty("update"), lenguajes.getProperty("delete"), lenguajes.getProperty("exit") };
			String[] option1 = {lenguajes.getProperty("client"), lenguajes.getProperty("admin"), lenguajes.getProperty("normal"),lenguajes.getProperty("opciones"),lenguajes.getProperty("exit")};
			men1 = funciones.menu(option1, lenguajes.getProperty("crear") + " Dummies ", lenguajes.getProperty("opciones"));
			switch (men1) {
			// Cliente
			case 0:
				do {
					men = funciones.menu(option, lenguajes.getProperty("options"), lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						p=Funciones_Ejer_Dummies.Create_Generic(men1);
						break;
					case 1:
						if(p==null){
							JOptionPane.showMessageDialog(null, lenguajes.getProperty("error2"), lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
						}
						else{
							cad=Funciones_Ejer_Dummies.Read_Generic(p);
							JOptionPane.showMessageDialog(null, cad);
						}
						break;
					case 2:
						if(p==null){
							JOptionPane.showMessageDialog(null, lenguajes.getProperty("error2"), lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
						}
						else{
							p=Funciones_Ejer_Dummies.Update_Generic(p);
						}
						break;
					case 3:
						if(p==null){
							JOptionPane.showMessageDialog(null, lenguajes.getProperty("error2"), lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
						}
						else{
							p=Funciones_Ejer_Dummies.Delete_Generic(p);
						}
						break;
					}
				} while (men != 4);
				break;
			// Admins
			case 1:
				do {
					men = funciones.menu(option, lenguajes.getProperty("options"), lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						p1=Funciones_Ejer_Dummies.Create_Generic(men1);
						break;
					case 1:
						if(p1==null){
							JOptionPane.showMessageDialog(null, lenguajes.getProperty("error2"), lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
						}
						else{
							cad=Funciones_Ejer_Dummies.Read_Generic(p1);
							JOptionPane.showMessageDialog(null, cad);
						}
						break;
					case 2:
						if(p1==null){
							JOptionPane.showMessageDialog(null, lenguajes.getProperty("error2"), lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
						}
						else{
							p1=Funciones_Ejer_Dummies.Update_Generic(p1);
						}
						break;
					case 3:
						if(p1==null){
							JOptionPane.showMessageDialog(null, lenguajes.getProperty("error2"), lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
						}
						else{
							p1=Funciones_Ejer_Dummies.Delete_Generic(p1);
						}
						break;
						
					}
				} while (men != 4);
				break;
				//Normal
			case 2:
				do {
					men = funciones.menu(option, lenguajes.getProperty("options"), lenguajes.getProperty("opciones"));
					switch (men) {
					case 0:
						p2=Funciones_Ejer_Dummies.Create_Generic(men1);
						break;
					case 1:
						if(p2==null){
							JOptionPane.showMessageDialog(null, lenguajes.getProperty("error2"), lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
						}
						else{
							cad=Funciones_Ejer_Dummies.Read_Generic(p2);
							JOptionPane.showMessageDialog(null, cad);
						}
						break;
					case 2:
						if(p2==null){
							JOptionPane.showMessageDialog(null, lenguajes.getProperty("error2"), lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
						}
						else{
							p2=Funciones_Ejer_Dummies.Update_Generic(p2);
						}
						break;
					case 3:
						if(p2==null){
							JOptionPane.showMessageDialog(null, lenguajes.getProperty("error2"), lenguajes.getProperty("error"), JOptionPane.ERROR_MESSAGE);
						}
						else{
							p2=Funciones_Ejer_Dummies.Delete_Generic(p2);
						}
						break;
						
					}
				} while (men != 4);
				break;
			case 3:
				do {
					String[] option2= {lenguajes.getProperty("fecha"), lenguajes.getProperty("moneda"), lenguajes.getProperty("decimales"), lenguajes.getProperty("lenguajes"),"Dummies",lenguajes.getProperty("exit")};
					men = funciones.menu(option2, lenguajes.getProperty("formato"), lenguajes.getProperty("formato2"));
					switch (men) {
					case 0:
						formatos.Formatfecha();
						break;
					case 1:
						formatos.Formatomoneda();
						break;
					case 2:
						formatos.Formatdecimal();
						break;
					case 3:
						Languages.Lengua(lenguajes);
						break;
					case 4:
						formatos.Dummies();
						break;
					}
				} while (men != 5);
			}
			if (men1==4){
				System.exit(0);
			}
		} while (men1 != 4) ;

	}
}

