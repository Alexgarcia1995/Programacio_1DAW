package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_1_3 {

	public static void main(String[] args) {
		int num_1 = 0 , num_2 = 0 , aux = 0;
		String s="";
		boolean good=false;
		
		
		// insertar numero uno
		do {
			s=JOptionPane.showInputDialog(null, "Give me a number", "Number", JOptionPane.QUESTION_MESSAGE);
			try{
				if (s==null){
				JOptionPane.showMessageDialog(null, "Exiting the app", "EXIT", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				}
				else{
					num_1=Integer.parseInt(s);
					good=true;
				}
			
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Give me a number","Error", JOptionPane.ERROR_MESSAGE);
			good=false;
		}
		
		}while (good==false);
		
		
		
		// insertar numero dos
				do {
					s=JOptionPane.showInputDialog(null, "Give me a number", "Number", JOptionPane.QUESTION_MESSAGE);
					try{
						if (s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app", "EXIT", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						}
						else{
							num_2=Integer.parseInt(s);
							good=true;
						}
					
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
				
				}while (good==false);

				
				
				// realitzacio del programa
				aux=num_1;
				num_1=num_2;
				num_2=aux;
				JOptionPane.showMessageDialog(null, "The changed value of the numbers that you introduce are " + num_1 + " and " + num_2, "Result",JOptionPane.INFORMATION_MESSAGE);
	}

}
