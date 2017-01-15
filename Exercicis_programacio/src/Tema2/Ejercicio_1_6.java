package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_1_6 {

	public static void main(String[] args) {
		int num = 0, suma=0;
		String s="";
		boolean good=false;
		
		//primer numero per a evitar bucle
		do{
			try{
				s=JOptionPane.showInputDialog(null,"Give me a number to start the sum","Number", JOptionPane.QUESTION_MESSAGE);
				if (s==null){
					JOptionPane.showMessageDialog(null, "Exiting the app","Exit",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else{
					num=Integer.parseInt(s);
					good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Give me a number","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while(good==false);
		
		//Program execution
		while(num !=0){
			suma=suma+num;
			do{
				try{
					s=JOptionPane.showInputDialog(null,"Give me another number (Type 0 for end the sum)","Number", JOptionPane.QUESTION_MESSAGE);
					if (s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app","Exit",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
					else{
						num=Integer.parseInt(s);
						good=true;
					}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
		}//end while
		JOptionPane.showMessageDialog(null, "The sum of all numbers are " + suma, "Result", JOptionPane.INFORMATION_MESSAGE);
	}

}
