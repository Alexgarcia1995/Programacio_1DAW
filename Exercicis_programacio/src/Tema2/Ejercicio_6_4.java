package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_6_4 {

	public static void main(String[] args) {
		int n=0, num=0, rest=0 , aux=0, prod=1;
		String s="",cad="";
		boolean good=false;

			do {
				try{
					s=JOptionPane.showInputDialog(null, "Give me the number of times the app will work", "Number", JOptionPane.QUESTION_MESSAGE);
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
			
			for (int i=0; i<n; i++) {
				prod=1;
				do {
					try{
						s=JOptionPane.showInputDialog(null, "Give me a number", "Number", JOptionPane.QUESTION_MESSAGE);
						if (s==null){
							JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}
						else{
							num=Integer.parseInt(s);
							good=true;
						}
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
						good=false;
					}
				}while(good==false);
				aux=num;
				while(num>0){
					rest=num%10;
					num=num/10;
					if(((rest%2)==0) || ((rest%3)==0)){
						prod=prod*rest;
					}//end if
				}//end while
				cad=cad +("The product of digits of number " + aux + " which are multipliers of 2 or 3 is " + prod + "\n");
			}//end for
			JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
	}

}
