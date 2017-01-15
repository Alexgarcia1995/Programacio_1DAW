package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_3_8 {

	public static void main(String[] args) {
		
		int num=0, suma=0, confirm=0;
		String s="";
		boolean good=false;
		
		//demanar  primer numero
		
		do{
			try{
		
			s=JOptionPane.showInputDialog(null,"Give me a number ", "number",JOptionPane.QUESTION_MESSAGE);
			if(s==null){
				JOptionPane.showMessageDialog(null, "Exiting the app","Exit", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			else{
				num=Integer.parseInt(s);
				good=true;
			}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
			good=false;
		}
		}while(good==false);
		
		suma=suma+num; 
		do{
			//segon numero
			do{
				try{
			
				s=JOptionPane.showInputDialog(null,"Give me another number to make the sum", "number",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Exiting the app","Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else{
					num=Integer.parseInt(s);
					good=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
			}while(good==false);
			
			suma=suma+num; 
			
			confirm=JOptionPane.showConfirmDialog(null, "Do you want to continue?");
			
		}while(confirm==JOptionPane.YES_OPTION);
		//resultat suma
		JOptionPane.showMessageDialog(null, "The result of the sum of numbers you introduce is " + suma, "Result",JOptionPane.INFORMATION_MESSAGE);
	}

}
