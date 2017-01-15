package Tema2;
import javax.swing.JOptionPane;;
public class Ejercicio_1_1 {

	public static void main(String[] args) {
		int num_1 = 0, num_2 = 0, num_3 = 0;
		String s="";
		boolean bien=false;
		
		//Insertar num_1
		do {
			try{
				s=JOptionPane.showInputDialog(null, "Inserta el primer numero", "numero", JOptionPane.QUESTION_MESSAGE);
				if (s==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicacion", "Salida", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else {
				num_1=Integer.parseInt(s);
				bien=true;
				}	
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un numero", "ERROR", JOptionPane.ERROR_MESSAGE);
				bien=false;
			}
		}while (bien==false);
		
		//Insertar num_2
		do {
			try{
				s=JOptionPane.showInputDialog(null, "Inserta el segundo numero", "numero", JOptionPane.QUESTION_MESSAGE);
				if (s==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicacion", "Salida", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else {
				num_2=Integer.parseInt(s);
				bien=true;
				}	
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un numero", "ERROR", JOptionPane.ERROR_MESSAGE);
				bien=false;
			}
		}while (bien==false);
		
		//Insertar num_3
		do {
			try{
				s=JOptionPane.showInputDialog(null, "Inserta el tercer numero", "numero", JOptionPane.QUESTION_MESSAGE);
				if (s==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicacion", "Salida", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				else {
				num_3=Integer.parseInt(s);
				bien=true;
				}	
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un numero", "ERROR", JOptionPane.ERROR_MESSAGE);
				bien=false;
			}
		}while (bien==false);
		
		//
		JOptionPane.showMessageDialog(null, "La media de los tres numeros es " + ((num_1+num_2+num_3)/3), "Media", JOptionPane.INFORMATION_MESSAGE);
	}

}
