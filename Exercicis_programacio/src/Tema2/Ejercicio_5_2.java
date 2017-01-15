package Tema2;

import javax.swing.JOptionPane;

public class Ejercicio_5_2 {

	public static void main(String[] args) {
	
	String cad="";	
	
	for (int i=1; i<=10; i++){
		cad="";
		for (int j=1; j<=10; j++){
			cad=cad+(i + "*" + j + "=" + (i*j) + "\n");
		}//end for
		JOptionPane.showMessageDialog(null, cad, "Multiplication table", JOptionPane.INFORMATION_MESSAGE);
	}//end for

	}

}
