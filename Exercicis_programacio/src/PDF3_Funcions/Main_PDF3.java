package PDF3_Funcions;

import PDF3_Funcions.funciones;

import javax.swing.JOptionPane;

import PDF3_Funcions.Funciones_ejer;

public class Main_PDF3 {

	public static void main(String[] args) {
		int men = 0, men1 = 0;
		String[] option = { "Ejercicio 4", "Ejercicio 6", "Ejercicio 8", "Ejercicio 9", "Ejercicio 10", "Ejercicio 11",
				"Ejercicio 12", "Ejercicio 15", "Salir" };
		String[] option1 = { "Repeat", "Back", "Exit" };
		String cad = "";

		do {
			men = funciones.menu(option);
			switch (men) {
			case 0:
				do {
					cad = Funciones_ejer.Ejer4();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1);
				} while (men1 == 0);
				break;
			case 1:
				do {
					cad = Funciones_ejer.Ejer6();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1);
				} while (men1 == 0);
				break;
			case 2:
				do {
					cad = Funciones_ejer.Ejer8();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1);
				} while (men1 == 0);
				break;
			case 3:
				do {
					cad = Funciones_ejer.Ejer9();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1);
				} while (men1 == 0);
				break;
			case 4:
				do {
					cad = Funciones_ejer.Ejer10();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1);
				} while (men1 == 0);
				break;
			case 5:
				do {
					cad = Funciones_ejer.Ejer11();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1);
				} while (men1 == 0);
				break;
			case 6:
				do {
					Funciones_ejer.Ejer12();
					men1 = funciones.menu(option1);
				} while (men1 == 0);
				break;
			case 7:
				do {
					cad = Funciones_ejer.Ejer15();
					JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
					men1 = funciones.menu(option1);
				} while (men1 == 0);
			}
		} while ((men != 8) && (men1 != 2));
	}

}
