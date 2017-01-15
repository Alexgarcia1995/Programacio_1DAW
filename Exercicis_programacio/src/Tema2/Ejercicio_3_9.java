package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_3_9 {

	public static void main(String[] args) {
	
		int num=0, product=1, n=0;
		String s="";
		boolean good=false;
		
		
		
		
		// pedir n
		do {
			try {
				s = JOptionPane.showInputDialog(null, "Insert the numbers of multiply you want to realize", "Number",
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
			
		
		
		
		//realitzacio for
		
		for (int i =0; i<n; i++){
			do {
				try {
					s = JOptionPane.showInputDialog(null, "Give me a number for multiply", "Number",
							JOptionPane.QUESTION_MESSAGE);
					if (s == null) {
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					} else {
						num = Integer.parseInt(s);
						good = true;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Type a number", "Error", JOptionPane.ERROR_MESSAGE);
					good = false;
				}
			} while (good == false);
			product=product*num;
		}
		
		
		JOptionPane.showMessageDialog(null, "The product of the multiply is " + product, "Result", JOptionPane.INFORMATION_MESSAGE);

	}

}
