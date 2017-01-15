package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_5_7 {

	public static void main(String[] args) {
	
		int num=0, num_1=0, cont=0, interr=1 , sum=0;
		String s=""; 
		boolean good=false;
		
		
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Give me a number ","Number", JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE );
						System.exit(0);
					}//end if
					else{
						num=Integer.parseInt(s);
						good=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
			
			while (interr==1){
				do{
					try{
						s=JOptionPane.showInputDialog(null, "Give me another number (to exit type 0) ","Number", JOptionPane.QUESTION_MESSAGE);
						if(s==null){
							JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE );
							System.exit(0);
						}//end if
						else{
							num_1=Integer.parseInt(s);
							good=true;
						}
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
						good=false;
					}
				}while(good==false);
				if (num_1==0){
					interr=0;
				}
				else{
					if (num_1>num){
						cont++;
					}
					if(num_1<num){
						sum=sum + num;
					}
				}//end else
			}//end while
			JOptionPane.showMessageDialog(null, "There are " + cont + " numbers greater than " + num + " and the sum of the lower numbers is " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);
	}

}
