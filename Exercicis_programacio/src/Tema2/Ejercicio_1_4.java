package Tema2;

import javax.swing.JOptionPane;

class Ejercicio_1_4 {

	public static void main(String[] args) {
		int num=0;
		String s="", cad="" ;
		boolean good=false;
		
		
		//introduccio number
		do{
			s=JOptionPane.showInputDialog(null,"Give me a number to show his multiplication table","Number",JOptionPane.QUESTION_MESSAGE);
			try{
				if (s==null){
					JOptionPane.showMessageDialog(null, "Exiting the app","Exit",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else{
					num=Integer.parseInt(s);
					good=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Give me a number","Error",JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);

		
		
		//realitzacio exercici
		for(int i=1; i<=10;i++){
			cad=cad + (num + "*" + i + "="+ (num*i) + "\n");
		}
		JOptionPane.showMessageDialog(null, cad, "Result", JOptionPane.INFORMATION_MESSAGE);
			
	}

}
