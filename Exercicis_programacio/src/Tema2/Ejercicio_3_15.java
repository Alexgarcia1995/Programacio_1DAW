package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_3_15 {

	public static void main(String[] args) {
	
		int num=0 , product=1, cont=0;
		String s="";
		boolean good=false;
		
		while (cont<5){
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
			
			if ((num%2)!=0){
				cont++;
				product=product*num;
			}//end if
			
		}// end while
		
		JOptionPane.showMessageDialog(null, "The product of the first 5 odd numbers is " + product, "Result", JOptionPane.INFORMATION_MESSAGE);

	}

}
