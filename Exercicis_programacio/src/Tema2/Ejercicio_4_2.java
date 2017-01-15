package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_4_2 {

	public static void main(String[] args) {
		int rest=0, num =0 , suma=0;
		String s="";
		boolean good=false;
		
		do{
			try{
				s=JOptionPane.showInputDialog(null,"Give me a number", "Number", JOptionPane.QUESTION_MESSAGE);
				if (s==null){
					JOptionPane.showMessageDialog(null, "Exiting the app","Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else{
					num=Integer.parseInt(s);
					good=true;
				}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Error, give me a number", "Error",JOptionPane.ERROR_MESSAGE);
					good=false;
			}
		}while (good==false);

		while (num>0){
			rest=num%10;
			num=num/10;
			
			if ((rest%2)==0){
				
				suma=suma+rest;
			}
		}//end while
		
		JOptionPane.showMessageDialog(null, "The sum of even numbers of the dividers of the number is " + suma,"Result", JOptionPane.INFORMATION_MESSAGE );
		}

}
