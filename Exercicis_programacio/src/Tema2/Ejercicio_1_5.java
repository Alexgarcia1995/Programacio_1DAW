package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_1_5 {

	public static void main(String[] args) {
		int num= 0 , suma=0;
		String s="";
		boolean good=false;
		
		for(int i=0 ; i<=4; i++){
			
			do{
				s=JOptionPane.showInputDialog(null, "Give me a number to make a sum","Number", JOptionPane.QUESTION_MESSAGE);
				try{
					if (s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app","Exit",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
					else {
						num=Integer.parseInt(s);
						good=true;
					}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Give me a number","Error",JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
			
			suma=suma+num;
		}
		JOptionPane.showMessageDialog(null, "The sum of all numbers that did you introduce is "+ suma, "Result",JOptionPane.INFORMATION_MESSAGE);
	}

}
