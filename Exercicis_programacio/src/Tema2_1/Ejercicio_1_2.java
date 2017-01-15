package Tema2_1;

import javax.swing.JOptionPane;

public class Ejercicio_1_2 {

	public static void main(String[] args) {
		int num=0, cont=0, may=0;
		String s="";
		boolean good=false, interr=false;
		
		while(interr==false){
			do {
				try{
					s=JOptionPane.showInputDialog(null, "Give me a number (Type 0 to exit) ", "Number", JOptionPane.QUESTION_MESSAGE);
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
			
			if (num==0){
				interr=true;
			}
			if (num>may){
				cont=0;
				may=num;
			}
			if (num==may){
				cont++;
			}
		}//end while
		JOptionPane.showMessageDialog(null, "The number " + may + " appears " + cont +" times" );
	}

}
