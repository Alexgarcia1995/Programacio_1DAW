package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_6_2 {

	public static void main(String[] args) {
		int num=0, sum=0, cont=0, may=0, men=999999;
		String s="" ;
		boolean good=false, interr=false;
		
		
		while (interr==false){
			do {
				try{
					s=JOptionPane.showInputDialog(null, "Give me a number (Type -5 to exit)", "Number", JOptionPane.QUESTION_MESSAGE);
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
			
			if (num==-5){
				interr=true;
			}
			
			else {
				if (num>may){
					may=num;
				}
				if (num<men){
					men=num;
				}
				
				if ((num>=10) &&(num<=120)){
					cont++;
					sum=sum + num;
				}//end if
			}
		}//end while
		JOptionPane.showMessageDialog(null, "The bigger number is " + may + "\n"+ " The lower is " + men + "\n"
				+ " The numbers between 10 and 120 are " + cont + " and their sum is " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
