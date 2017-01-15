package Tema3;

import javax.swing.JOptionPane;
import Funciones_Java.*;
public class PDF1_Tema1 {

	public static void main(String[] args) {
		int men = 0, num = 1, men1 = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, aux = 0, sum = 0, prod = 1;
		String[] option = { "Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6",
				"Salir" };
		String[] option1 = { "Repeat", "Back", "Exit" };
		String cad = "";

		do {
			men = funciones.menu(option);
			if (men == -1) {
				System.exit(0);
			} else {
				switch (men) {

				case 0:
					do {
						num = funciones.pednum("Give me the first number");
						num1 = funciones.pednum("Give me the second number");
						num2 = funciones.pednum("Give me the third number");
						JOptionPane.showMessageDialog(null,
								" The media of the 3 numbers is " + ((num + num1 + num2) / 3), "Result",
								JOptionPane.INFORMATION_MESSAGE);
						men1 = funciones.menu_retro(option1);
					} while (men1 == 0);
					break;
				case 1:
					do {
						num = funciones.pednum("Give me the first number");
						num1 = funciones.pednum("Give me the second number");
						if (num > num1)
							JOptionPane.showMessageDialog(null, "The number " + num + " is bigger than " + num1,
									"Result", JOptionPane.INFORMATION_MESSAGE);
						else
							JOptionPane.showMessageDialog(null, "The number " + num + " is lower than " + num1,
									"Result", JOptionPane.INFORMATION_MESSAGE);
						men1 = funciones.menu_retro(option1);
					} while (men1 == 0);
					break;
				case 2:
					do {
						num = funciones.pednum("Give me the first number");
						num1 = funciones.pednum("Give me the second number");
						aux = num1;
						num1 = num;
						num = aux;
						JOptionPane.showMessageDialog(null, "The numbers inversed are " + num + " and " + num1,
								"Result", JOptionPane.INFORMATION_MESSAGE);
						men1 = funciones.menu_retro(option1);
					} while (men1 == 0);
					break;

				case 3:
					do {
						prod = 1;
						num = funciones.pednum("Give me the first number");
						for (int i = 1; i <= 10; i++) {
							prod = num * i;
							cad = cad + (num + "*" + i + "=" + prod + "\n");
						}
						JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
						men1 = funciones.menu_retro(option1);
					} while (men1 == 0);
					break;

				case 4:
					do {
						num = funciones.pednum("Give me the first number");
						num1 = funciones.pednum("Give me the second number");
						num2 = funciones.pednum("Give me the third number");
						num3 =funciones.pednum("Give me the fourth number");
						num4 = funciones.pednum("Give me the fifth number");
						JOptionPane.showMessageDialog(null,
								"The sum of all the numbers is " + (num + num1 + num2 + num3 + num4), "Result",
								JOptionPane.INFORMATION_MESSAGE);
						men1 = funciones.menu_retro(option1);
					} while (men1 == 0);
					break;

				case 5:
					do {
						while (num != 0) {
							num = funciones.pednum("Give me a number");
							sum = sum + num;
						}
						JOptionPane.showMessageDialog(null, "The sum of the numbers is " + sum, "Result",
								JOptionPane.INFORMATION_MESSAGE);
						men1 = funciones.menu_retro(option1);
					} while (men1 == 0);
					break;
				}
			}
		} while ((men != 6) && (men1 != 2));
		JOptionPane.showMessageDialog(null, "Exiting the app....", "Exit", JOptionPane.INFORMATION_MESSAGE);
	}
}
