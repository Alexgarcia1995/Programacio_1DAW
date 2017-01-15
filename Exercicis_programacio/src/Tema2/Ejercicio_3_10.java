package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_3_10 {

	public static void main(String[] args) {
		int num = 0, confirm=0, cont_pos = 0, cont_neg = 0;
		String s = "";
		boolean good = true;

		

		do {
			do {
				try {
					s = JOptionPane.showInputDialog(null, "Give me a number", "Number", JOptionPane.QUESTION_MESSAGE);
					if (s == null) {
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						num = Integer.parseInt(s);
						good = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
					good = false;
				}
			} while (good == false);

			if (num < 0) {
				cont_neg++;
			} else {
				cont_pos++;
			}
			
			confirm=JOptionPane.showConfirmDialog(null, "Do you want to continue?");
			
		} while (confirm==JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null,
				"The number of positives are " + cont_pos + "\n" + "The number of negatives are " + cont_neg, "Result",
				JOptionPane.INFORMATION_MESSAGE);

	}
}