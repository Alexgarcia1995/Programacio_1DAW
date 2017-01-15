package Tema2_1;

import javax.swing.JOptionPane;

public class Ejercicio_1_7 {

	public static void main(String[] args) {
		int n=0, num=0;
		String s="", cad="";
		boolean good=false;
		
		do {
			try {
				s = JOptionPane.showInputDialog(null, "Give me the number of numbers you want to count", "Number",
						JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					n = Integer.parseInt(s);
					good = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
				good = false;
			}
		} while (good == false);
		
		for (int i=0; i<n; i++){
			do {
				try {
					s = JOptionPane.showInputDialog(null, "Give me the number of numbers you want to count", "Number",
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
			
			if ((num>0) && ((num%2)==0)){
				cad=cad + ("The number " + num + " is an even and positive number \n");
			}
		
			if ((num%3)==0){
				cad=cad + ("The number "+ num + " is multiplier of 3 \n");
			}
		}//end for
		JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
	}

}
