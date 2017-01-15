package Ejer4_Validate;

import javax.swing.JOptionPane;
import Ejer4_Validate.Funciones_Ejer_Genericos;

public class Main_Ejer4_Genericos {

	public static void main(String[] args) {
		int men = 0, men1 = 0;
		String[] option = { "Create", "Read", "Update", "Delete", "Exit" };
		String[] option1 = { "Cliente", "Admin", "Normal", "Exit" };
		String cad = "";
		Persona p=null;
		Persona p1=null;
		Persona p2=null;
		do {
			men1 = funciones.menu(option1, "What do you want to create?", "Options");
			switch (men1) {
			// Cliente
			case 0:
				do {
					men = funciones.menu(option, "Choose an option", "Options");
					switch (men) {
					case 0:
						p=Funciones_Ejer_Genericos.Create_Generic(men1);
						break;
					case 1:
						if(p==null){
							JOptionPane.showMessageDialog(null, "Error, no hay objeto para leer", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else{
							cad=Funciones_Ejer_Genericos.Read_Generic(p);
							JOptionPane.showMessageDialog(null, cad);
						}
						break;
					case 2:
						if(p==null){
							JOptionPane.showMessageDialog(null, "Error, no hay objeto para leer", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else{
							p=Funciones_Ejer_Genericos.Update_Generic(p);
						}
						break;
					case 3:
						if(p==null){
							JOptionPane.showMessageDialog(null, "Error, no hay objeto para leer", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else{
							p=Funciones_Ejer_Genericos.Delete_Generic(p);
						}
						break;
					}
				} while (men != 4);
				break;
			// Admins
			case 1:
				do {
					men = funciones.menu(option, "Choose an option", "Options");
					switch (men) {
					case 0:
						p1=Funciones_Ejer_Genericos.Create_Generic(men1);
						break;
					case 1:
						if(p1==null){
							JOptionPane.showMessageDialog(null, "Error, no hay objeto para leer", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else{
							cad=Funciones_Ejer_Genericos.Read_Generic(p1);
							JOptionPane.showMessageDialog(null, cad);
						}
						break;
					case 2:
						if(p1==null){
							JOptionPane.showMessageDialog(null, "Error, no hay objeto para leer", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else{
							p1=Funciones_Ejer_Genericos.Update_Generic(p1);
						}
						break;
					case 3:
						if(p1==null){
							JOptionPane.showMessageDialog(null, "Error, no hay objeto para leer", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else{
							p1=Funciones_Ejer_Genericos.Delete_Generic(p1);
						}
						break;
						
					}
				} while (men != 4);
				break;
				//Normal
			case 2:
				do {
					men = funciones.menu(option, "Choose an option", "Options");
					switch (men) {
					case 0:
						p2=Funciones_Ejer_Genericos.Create_Generic(men1);
						break;
					case 1:
						if(p2==null){
							JOptionPane.showMessageDialog(null, "Error, no hay objeto para leer", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else{
							cad=Funciones_Ejer_Genericos.Read_Generic(p2);
							JOptionPane.showMessageDialog(null, cad);
						}
						break;
					case 2:
						if(p2==null){
							JOptionPane.showMessageDialog(null, "Error, no hay objeto para leer", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else{
							p2=Funciones_Ejer_Genericos.Update_Generic(p2);
						}
						break;
					case 3:
						if(p2==null){
							JOptionPane.showMessageDialog(null, "Error, no hay objeto para leer", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else{
							p2=Funciones_Ejer_Genericos.Delete_Generic(p2);
						}
						break;
						
					}
				} while (men != 4);
				break;
			}

		} while (men1 != 3) ;

	}

}
