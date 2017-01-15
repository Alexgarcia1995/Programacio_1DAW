package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_1_2 {

	public static void main(String[] args) {
		int num_1=0 , num_2 = 0 ;
		String s="";
		boolean good=false;
		
		//Pedido num_1
		do{
			try{
			s=JOptionPane.showInputDialog(null, "Give me the first number", "Number", JOptionPane.QUESTION_MESSAGE);
				if (s==null){
				JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				}
				else{
					num_1=Integer.parseInt(s);
					good=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while(good==false);
		
		
		//Pedido num_2
		do{
			try{
			s=JOptionPane.showInputDialog(null, "Give me the second number", "Number", JOptionPane.QUESTION_MESSAGE);
				if (s==null){
				JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				}
				else{
					num_2=Integer.parseInt(s);
					good=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while(good==false);
		
		
		//Resultado ejercicio
		if(num_1>num_2){
			JOptionPane.showMessageDialog(null, "The number " + num_1 + " is bigger than "+ num_2, "Result", JOptionPane.INFORMATION_MESSAGE);
		}
		if(num_2>num_1){
			JOptionPane.showMessageDialog(null, "The number " + num_2 + " is bigger than "+ num_1, "Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Both numbers are equals", "Result", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
