package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_5_3 {

	public static void main(String[] args) {
		int n=0 , num=0, sum=0 , cont=0;
		String s="" , cad="", cad_1="";
		boolean good=false;
		
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Give me the number of numbers you want to introduce","Repeat", JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE );
					System.exit(0);
				}//end if
				else{
					n=Integer.parseInt(s);
					good=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while(good==false);
		
		for (int i=0; i<n; i++){
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
			
			if (((num%2)==0)&& ((num%3)==0)){
				cad = cad +(num+ " is multiplier of 2 and 3 \n"); 
			}//end if
			
			if ((num>=35) && (num<=75)){
				cad_1 = cad_1 + (num + " is between 35 and 75 \n");
				cont++;
				sum = sum + num; 
			}//end if
		}//end for
		JOptionPane.showMessageDialog(null, cad + cad_1  + "The numbers between 35 & 75 are " + cont + " and their sum is " + sum, "Result", JOptionPane.QUESTION_MESSAGE);
	}

}
