package Tema3_Ejer3;

import Tema3_Ejer3.funciones;

import javax.swing.JOptionPane;

import Tema3_Ejer3.Funciones_ejer;;

public class Main_Ejer3 {

	public static void main(String[] args) {
		int men = 0, men1 = 0;
		String[] option = { "Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6",
				"Salir" };
		String[] option1 = { "Repeat", "Back", "Exit" };
		String cad = "";

		do {
			men = funciones.menu(option,"Choose an option", "Options");
			switch (men) {
			case 0:
				do{
					cad=Funciones_ejer.Ejer1();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1,"Choose an option", "Options");
				} while (men1 == 0);
				break;
			case 1:
				do{
					cad=Funciones_ejer.Ejer2();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1,"Choose an option", "Options");
				} while (men1 == 0);
				break;
			case 2:
				do{
					cad=Funciones_ejer.Ejer3();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1,"Choose an option", "Options");
				} while (men1 == 0);
				break;
			case 3:
				do{
					men1 = funciones.menu(option1,"Choose an option", "Options");
				} while (men1 == 0);
				break;
			case 4:
				do{
					men1 = funciones.menu(option1,"Choose an option", "Options");
				} while (men1 == 0);
				break;
			case 5:
				do {
					men1 = funciones.menu(option1,"Choose an option", "Options");
				} while (men1 == 0);
				break;
			}
		} while ((men != 6) && (men1 != 2));
	}

}
