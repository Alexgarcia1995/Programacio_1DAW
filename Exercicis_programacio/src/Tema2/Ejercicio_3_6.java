package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_3_6 {

	public static void main(String[] args) {
		int num = 0, sum = 0, interruptor = 0;
		String s = "";
		boolean good = false;

		// empezar bucle
		while (interruptor == 0) {
			do {
				try {
					s = JOptionPane.showInputDialog(null,
							"Give me a number to sum \n(To realize the sum, put a negative number)", "Num",
							JOptionPane.QUESTION_MESSAGE);
					if (s == null) {
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						num = Integer.parseInt(s);
						good = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Give me a number", "Error", JOptionPane.ERROR_MESSAGE);
					good = false;
				}
			} while (good == false);
			if (num < 0) {
				interruptor = 1;
			} else {
				sum = sum + num;
			}
		} // end while
		JOptionPane.showMessageDialog(null, "The sum of the numbers that you introduced is " + sum, "Result",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
