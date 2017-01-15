package Tema2_1;

import javax.swing.JOptionPane;

/**
 * Menu Ejercicio 1
 * Tema 2 
 * Prueba ejer Javadoc de Entornos de desarrollo 
 * @author Alex
 * @version 1.0
 */
public class Ejercicio_1_1 {
	 /** 
     * Crea un círculo a partir de su origen su radio.
     * @param x La coordenada x del centro del círculo.
     * @param y La coordenada y del centro del círculo.
     * @param r El radio del círculo. Debe ser mayor o igual a 0.
     */
	
	public static void main(String[] args) {
		int num=0, rest=0, sum=0, cont=0, aux=0;
		String s="";
		boolean good=false, positive=false;

		
		do {
			do {
				try{
					s=JOptionPane.showInputDialog(null, "Give me a number ", "Number", JOptionPane.QUESTION_MESSAGE);
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
			
			if (num<0){
				JOptionPane.showMessageDialog(null, "Error, give me a positive number", "Error", JOptionPane.ERROR_MESSAGE);
				positive=false;
			}
			
			else{
				aux=num;
				while (num>0){
					rest=num%10;
					num=num/10;
					if((rest%2)==0){
						cont++;
						sum=sum+rest;
					}
				}
				positive=true;
			}
		}while (positive==false);
		JOptionPane.showMessageDialog(null, "The digits of number " + aux + " which are even numbers " + cont +" and their sum is " + sum, "Result", JOptionPane.INFORMATION_MESSAGE);
	}

}
