package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_4_1 {

	public static void main(String[] args) {
		int num=0;
		String s="", cad="";
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
		
		
		
		for (int i=1; i<=num; i++){
			if ((num%i)==0){
				cad=cad + ("The number " + i + " is divisor of " + num + "\n");
			}//end if
		}//end for
		
		JOptionPane.showMessageDialog(null, cad,"Result", JOptionPane.INFORMATION_MESSAGE);
	}

}
