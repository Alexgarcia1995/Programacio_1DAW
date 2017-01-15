package Tema2_1;

import javax.swing.JOptionPane;

public class Ejercicio_1_6 {

	public static void main(String[] args) {
		int n=0 , prod=0;
		String s = "", cad="";
		boolean good=false;
		
		do {
			try {
				s = JOptionPane.showInputDialog(null, "Give me the limit of the app", "Number",
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
		
		for (int i=1;i<=n;i++){
			prod=1;
			for (int j=1;j<=i;j++){
				if ((i%j)==0){
					prod=prod *j;
				}//end if
			}//end for
			if (prod>=10){
				cad=cad + (" The product of the divisors of " + i + " is higher or equal to 10 \n");
			}
			else {
					cad=cad + (" The product of the divisors of " + i + " is lower to 10 \n");
				}
		}//end for
		JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
	}
}


