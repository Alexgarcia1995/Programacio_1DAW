package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_5_6 {

	public static void main(String[] args) {
		int num=0, cont=0 , suma=0 ;
		String s="", cad="";
		boolean good=false;
		
		
		while( cont<5){
			do {
				try{
					s=JOptionPane.showInputDialog(null, "Give me a number ", "Number", JOptionPane.QUESTION_MESSAGE);
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
			
			if (((num%7)==0) || ((num%11)==0)){
				cont++;
				suma=suma + num;
				cad=cad + ("The number " + num + " is multiplier of 7 or 11 \n");
			}
		}//end while
		JOptionPane.showMessageDialog(null, cad + "and the sum of the numbers is " + suma, "Result",JOptionPane.INFORMATION_MESSAGE);
	}

}
