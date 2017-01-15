package Tema2_1;

import javax.swing.JOptionPane;

public class Ejercicio_1_5 {

	public static void main(String[] args) {
		int num = 0, cont= 0, cont_1=0, cont_media=0, sum_med=0, media=0, sum_par=0, prod_impar=1 ;
		String s = "";
		boolean good = false, interr = false;

		do {
			do {
				try {
					s = JOptionPane.showInputDialog(null, "Give me a number (Type 0 to exit) ", "Number",
							JOptionPane.QUESTION_MESSAGE);
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

			if (num == 0) {
				interr = true;
			}

			else {
				sum_med=sum_med+num;
				cont_media++;
				cont++;
				if ((num%2)==0){
					sum_par=sum_par+num;
				
				}
				if ((num%2)!=0){
					prod_impar=prod_impar*num;
				}
				if (((num%2)==0) || ((num%2)!=0)){
					cont_1++;
				}
				interr=false;
			}
		} while (interr == false);
		media=sum_med/cont_media;
		JOptionPane.showMessageDialog(null, 
				" The media of numbers is " + media + "\n" +
				" The number of times you introduce a number is " + cont + "\n" +
				" The sum of even numbers is " + sum_par + "\n" + 
				" The prod of odd numbers is " + prod_impar + "\n" + 
				" The odd and even numbers that appears are " + cont_1, "Result", JOptionPane.INFORMATION_MESSAGE);
	}

}
