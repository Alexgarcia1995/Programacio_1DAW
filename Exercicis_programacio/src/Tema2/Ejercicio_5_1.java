package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_5_1 {

	public static void main(String[] args) {
		int n=0 , num=0, sum=0, prod=1 , cuad=0,  cont_par=0, cont_impar=0;
		String s="" , cad="";
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
			
			cuad= num*num;
			cad=cad + ("The square of the number is "+ cuad + "\n");
			sum=sum+num;
			prod=prod*num;
			
			if((num<0) && ((num%2)!=0)){
				cont_impar++;
			}//end if
			
			if((num>0) && ((num%2)==0)){
				cont_par++;
			}//end if
			
		}//end for
		JOptionPane.showMessageDialog(null, cad + "\n" +"The sum of the numbers is " + sum + "\n" + 
		"The product of the numbers is " + prod + "\n" +
		"The number positives and even " + cont_par + "\n" +
		"The number of negatives and odd " + cont_impar + "\n", "Result", JOptionPane.INFORMATION_MESSAGE );
	}

}
