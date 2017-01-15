package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_5_4 {

	public static void main(String[] args) {
		int interruptor=0, num=0, num_1=0, may=0, men=999999 ;
		String s="";
		boolean good=false;
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Give me a number ","Number", JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE );
						System.exit(0);
					}//end if
					else{
						num_1=Integer.parseInt(s);
						good=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
		while (interruptor==0){
			do{
				try{
					s=JOptionPane.showInputDialog(null, "Give me another number (if you decide to exit, type -1)","Number", JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE );
						System.exit(0);
					}//end if
					else{
						num=Integer.parseInt(s);
						good=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Error, give me a number", "Error", JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while(good==false);
			
		
			if (num==-1){
				interruptor=1;
			}// end if 
			
			
			else {
				if (num>num_1){
				may=num;
				}//end if
				if (num<num_1){
				men=num;
				}//end if
			}
		}//end while
		JOptionPane.showMessageDialog(null, "The higher number was " + may + " and the lower was "+ men, "Result", JOptionPane.INFORMATION_MESSAGE );
	}

}
