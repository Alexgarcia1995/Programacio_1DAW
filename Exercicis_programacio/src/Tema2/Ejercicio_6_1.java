package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_6_1 {

	public static void main(String[] args) {
		int n=0, sum=0;
		String s="", cad="";
		boolean good=false;
		
		do {
			try{
				s=JOptionPane.showInputDialog(null, "Give me the limit of the program", "Number", JOptionPane.QUESTION_MESSAGE);
				if (s==null){
					JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else{
					n=Integer.parseInt(s);
					good=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while(good==false);
		
		for (int i=1; i<=n; i++){
			sum=0;
			for (int j=1; j<=i; j++){
				if ((i%j)==0){
					sum=sum + j;
				}
			}//end for
			if(sum>=20){
				cad=cad + ("The sum of the divisors of " + i + " is equal or bigger than 20 \n");
			}
			else {
				cad=cad + ("The sum of the divisors of " + i + " is lower than 20 \n");
			}
		}//end for
		JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
	}

}
