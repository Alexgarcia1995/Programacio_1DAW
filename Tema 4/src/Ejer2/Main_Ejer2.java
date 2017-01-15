package Ejer2;

import javax.swing.JOptionPane;

import Ejer2.funciones;

public class Main_Ejer2 {

	public static void main(String[] args) {
		int men = 0, men1 = 0;
		String[] option = { "Create", "Read", "Update", "Delete", "Exit"};
		String cad = "";
		Persona Persona1=null;
		do {
			men = funciones.menu(option,"Choose an option", "Options");
			switch (men) {
			case 0:
					Persona1=Funciones_ejer.Create_user(Persona1);
					
				break;
			case 1:
				if (Persona1==null){
					JOptionPane.showMessageDialog(null, "Error, there isn't a user created!","Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					cad=Funciones_ejer.Read_user(Persona1);
					JOptionPane.showMessageDialog(null, cad);
				}
					
				break;
			case 2:
				if (Persona1==null){
					JOptionPane.showMessageDialog(null, "Error, there isn't a user created!","Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					Funciones_ejer.Edit_User(Persona1);
				}
				break;
			case 3:
				if (Persona1==null){
					JOptionPane.showMessageDialog(null, "Error, there isn't a user created!","Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					Persona1=Funciones_ejer.Delete_user(Persona1);
				}
				break;
		
			}
		} while (men != 4);
	}

}
