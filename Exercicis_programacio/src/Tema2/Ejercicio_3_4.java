package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_3_4 {

	public static void main(String[] args) {
		int n = 0, cont_a = 0, cont_e = 0, cont_i = 0, cont_o = 0, cont_u = 0;
		char letter = 0;
		String s = "";
		boolean good = false;

		// introducir numero de letras que desea leer
		do {
			try {
				s = JOptionPane.showInputDialog(null, "Insert the numbers of letters you want to count", "Number",
						JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					n = Integer.parseInt(s);
					good = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Type a number", "Error", JOptionPane.ERROR_MESSAGE);
				good = false;
			}
		} while (good == false);

		// lectura de caracteres
		for (int i = 0; i < n; i++) {
			do {
				try {
					s = JOptionPane.showInputDialog(null, "Insert a letter", "Letter", JOptionPane.QUESTION_MESSAGE);
					if (s == null) {
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						letter = s.charAt(0);
						good = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Type me one letter", "Error", JOptionPane.ERROR_MESSAGE);
					good = false;
				}
			} while (good == false);
			switch(letter){
			case 'a': cont_a++; break;
			case 'e': cont_e++; break;
			case 'i': cont_i++; break;
			case 'o': cont_o++; break;
			case 'u': cont_u++; break;
			default: JOptionPane.showMessageDialog(null, "The character is not a vowel","Information", JOptionPane.INFORMATION_MESSAGE);
			}//end switch
		}//end for
		JOptionPane.showMessageDialog(null, "The number of 'a' is " + cont_a + "\n" + "The number of 'e' is" + cont_e + "\n" + "The number of 'i' is " + cont_i + "\n" +"The number of 'o' is " + cont_o + "\n"+"The number of 'u' is " + cont_u + "\n", "result", JOptionPane.INFORMATION_MESSAGE);
	}

}
