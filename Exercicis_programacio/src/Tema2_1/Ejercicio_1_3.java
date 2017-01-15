package Tema2_1;

import javax.swing.JOptionPane;

public class Ejercicio_1_3 {

	public static void main(String[] args) {
		int  N=0, aux=0, K=0, rest=0, cont=0, contin=0 , rest_1=0;
		String s=""; 
		boolean good=false, positive=false;
		
		do {
			do {
			do {
				try{
					s=JOptionPane.showInputDialog(null, "Give me a number ", "Number", JOptionPane.QUESTION_MESSAGE);
					if (s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
					else{
						N=Integer.parseInt(s);
						good=true;
						positive=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
			
			
			if (N<0){
				JOptionPane.showMessageDialog(null, "Error, give me a positive number", "Error", JOptionPane.ERROR_MESSAGE);
				positive=false;
			}
				
		}while (positive==false);
			do{
			do {
				try{
					s=JOptionPane.showInputDialog(null, "Give the number of digit you want to read ", "Number", JOptionPane.QUESTION_MESSAGE);
					if (s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
					else{
						K=Integer.parseInt(s);
						good=true;
						positive=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
			
			if (K<0){
				JOptionPane.showMessageDialog(null, "Error, give me a positive number", "Error", JOptionPane.ERROR_MESSAGE);
				positive=false;
			}
				
		}while (positive==false);
			aux=N;
			rest_1=0;
			cont=0;
			while(N>0){
				rest=N%10;
				N=N/10;
				cont++;
				if (cont==K){
					rest_1=rest;
				}
			}
			
			JOptionPane.showMessageDialog(null, "The number " + K + " of the number " + aux + " is " + rest_1);
			contin=JOptionPane.showConfirmDialog(null, "Do you want to continue?");
		}while (contin==JOptionPane.YES_OPTION);
	}

}
