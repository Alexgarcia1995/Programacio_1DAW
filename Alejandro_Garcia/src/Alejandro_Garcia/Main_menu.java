package Alejandro_Garcia;

import Alejandro_Garcia.funciones;

import javax.swing.JOptionPane;

import Alejandro_Garcia.Funciones_ejer;

public class Main_menu {

	public static void main(String[] args) {
		int men = 0, men1 = 0;
		String[] option = { "Divisors", "Digits", "Exit" };
		String[] option1 = { option[0], "Back", "Exit" };
		String[] option2 = { option[1], "Back", "Exit" };
		String cad = "";

		do {
			men = funciones.menu(option,"Choose an option", "Options");
			switch (men) {
			case 0:
				do{
					cad=Funciones_ejer.Ejer1();
					JOptionPane.showMessageDialog(null, cad, "Divisors", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1,"Divisors", "What do you want to do?");
				} while (men1 == 0);
				break;
			case 1:
				do{
					cad=Funciones_ejer.Ejer2();
					JOptionPane.showMessageDialog(null, cad, "Digits", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option2,"Digits", "What do you want to do?");
				} while (men1 == 0);
				break;
			}
		} while ((men != 2) && (men1 != 2));
	}

}
