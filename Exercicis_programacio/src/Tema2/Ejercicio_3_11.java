package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_3_11 {

	public static void main(String[] args) {
		int n=0, num=0 ,cont_par=0;
		String s="";
		boolean good=false;
		
		
		
		//usuario nos da n
		
		
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Give the numbers you want to read", "Number",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Exiting the app","Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else {
					n=Integer.parseInt(s);
					good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while(good==false);
		
		
		
		//realizacion ejercicio
		
		for (int i=0; i<n;i++){
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Give me a number", "Number",JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app","Exit", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
					else {
						num=Integer.parseInt(s);
						good=true;
					}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
			
			if(((num%2)==0) && (num>0) ){
				cont_par++;
			}//end if
		}//end for
		JOptionPane.showMessageDialog(null, "The number of positives and even numbers is " + cont_par, "Result", JOptionPane.INFORMATION_MESSAGE );
	}

}
