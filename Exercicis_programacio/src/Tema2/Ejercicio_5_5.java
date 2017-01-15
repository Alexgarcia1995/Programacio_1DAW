package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_5_5 {

	public static void main(String[] args) {
		int num=0, interr=1; 
		String s="", cad="";
		boolean good=false;
		
		while (interr==1){
			do {
				try{
					s=JOptionPane.showInputDialog(null, "Give me a number (Type 0 to exit)", "Number", JOptionPane.QUESTION_MESSAGE);
					if (s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}//end if
					else {
						num=Integer.parseInt(s);
						good=true;
					}
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
						good=false;
					}
			}while (good==false);
			if(num==0){
				interr=0;
			}
			else{
				cad="";
			for (int i=1; i<=num; i++){
				if ((num%i)==0){
					cad= cad + ("The number " + i + " is divisor of " + num + "\n" );
				}//end if
			}//end for
			JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);

			}
		}//end while
	}

}
