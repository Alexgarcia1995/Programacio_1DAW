package Tema2_1;

import javax.swing.JOptionPane;

public class Ejercicio_1_4 {

	public static void main(String[] args) {
		int n=0,suma=0;
		String s="",cad="";
		boolean good=false;
		
		do {
			try{
				s=JOptionPane.showInputDialog(null, "Give me a number ", "Number", JOptionPane.QUESTION_MESSAGE);
				if (s==null){
					JOptionPane.showMessageDialog(null, "Exiting the app", "Exit", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else{
					n=Integer.parseInt(s);
					good=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while(good==false);
		
		for (int i=1;i<=n; i++){
			suma=0;
			for (int j=1; j<i; j++){
				if ((i%j)==0){
					suma=suma + j;
				}//end if
			}//end for

			if( suma == i ){
				cad=cad + ( "The number " + i + " is perfect \n");
			}
			else {
				cad=cad + ( "The number " + i + " is not perfect \n");
			}
		}//end for
		
		JOptionPane.showMessageDialog(null, cad , "Result", JOptionPane.INFORMATION_MESSAGE);

	}

}
