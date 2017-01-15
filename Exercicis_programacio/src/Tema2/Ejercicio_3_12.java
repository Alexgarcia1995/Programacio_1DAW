package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_3_12 {

	public static void main(String[] args) {
		int num_1=0, num_2=0,confirm=0, sum=0;
		String s="";
		boolean good=false;

		
		
		do{
			sum = 0;
			//numero1
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Give me the first number", "Number",JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app","Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
					else {
						num_1=Integer.parseInt(s);
						good=true;
					}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
			
			//numero2
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Give the second number", "Number",JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app","Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
					else {
						num_2=Integer.parseInt(s);
						good=true;
					}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
			
			sum=num_1+num_2;
			JOptionPane.showMessageDialog(null, "The result of the sum is " +sum, "Result", JOptionPane.INFORMATION_MESSAGE);
			confirm=JOptionPane.showConfirmDialog(null, "You want to continue?");
		}while(confirm==JOptionPane.YES_OPTION);
	}

}
