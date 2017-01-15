package PDF3_Funcions;

import javax.swing.JOptionPane;

import PDF3_Funcions.funciones;

public class Funciones_ejer {
	// exercici1
	public static String Ejer4() {
		int n = 0, cont_a = 0, cont_e = 0, cont_i = 0, cont_o = 0, cont_u = 0;
		char letter = 0;
		String cad = "";
		n = funciones.pednum("Give me the time of the exercise must repeat");
		for (int i = 0; i < n; i++) {
			letter=funciones.ped_char("Give me a char");
			switch (letter) {
			case 'a':
				cont_a++;
				break;
			case 'e':
				cont_e++;
				break;
			case 'i':
				cont_i++;
				break;
			case 'o':
				cont_o++;
				break;
			case 'u':
				cont_u++;
				break;
			}
		}
		cad = ("a appears " + cont_a + " times \n" + "e appears " + cont_e + " times \n" + "i appears " + cont_i
				+ " times \n" + "o appears " + cont_o + " times \n" + "u appears " + cont_u + " times");
		return cad;
	}

	// exercici2
	public static String Ejer6() {
		int num = 0, sum = 0, interruptor = 0;
		String cad = "";
		// empezar bucle
		while (interruptor == 0) {
			num=funciones.pednum("Give me a number (Type 0 to exit");
			if (num < 0) {
				interruptor = 1;
			} else {
				sum = sum + num;
			}
		} // end while
		cad= ("The sum of the numbers that you introduced is " + sum);
		return cad;
	}

	// exercici3
	public static String Ejer8() {
		int num=0, suma=0, confirm=0;
		String cad="";
		
		//demanar  primer numero
		num=funciones.pednum("Give me the first number to start the exercise");
		suma=suma+num; 
		do{
			//segon numero
			num=funciones.pednum("Give me another number to sum");
			suma=suma+num; 
			
			confirm=JOptionPane.showConfirmDialog(null, "Do you want to continue?");
			
		}while(confirm==JOptionPane.YES_OPTION);
		//resultat suma
			cad=("The result of the sum of numbers you introduce is " + suma);
			return cad;
	}

	// exercici4
	public static String Ejer9() {

		int num=0, product=1, n=0;
		String cad="";
		
		// pedir n
			n=funciones.pednum("Give me the number of times you want to do the activity");
		
		//realitzacio for
		
		for (int i =0; i<n; i++){
			num=funciones.pednum("Give me a number to multiply");
			product=product*num;
		}
		
		
		cad=("The product of the multiply is " + product);
		return cad;
	}

	// exercici5
	public static String Ejer10() {
		int num = 0, confirm=0, cont_pos = 0, cont_neg = 0;
		String cad = "";

		do{
			num=funciones.pednum("Give me a number");
			if (num < 0) {
				cont_neg++;
			} else {
				cont_pos++;
			}
			
			confirm=JOptionPane.showConfirmDialog(null, "Do you want to continue?");
			
		} while (confirm==JOptionPane.YES_OPTION);
				cad=("The number of positives are " + cont_pos + "\n" + "The number of negatives are " + cont_neg);
			return cad;

	}

	// exercici6
	public static String Ejer11() {
		int num=0, n=0 ,cont_par=0;
		String cad="";
		n=funciones.pednum("Give me the number of times you want to execute the app");
		for (int i=0; i<n;i++){
			num=funciones.pednum("Give me a number");
			if(((num%2)==0) && (num>0) ){
				cont_par++;
			}//end if
		}//end for
		cad=("The number of positives and even numbers is " + cont_par);
		return cad;
	}
	public static void Ejer12() {
		int num_1=0, num_2=0,confirm=0, sum=0;
		do{
			sum = 0;
			num_1=funciones.pednum("Give me the first number");
			num_2=funciones.pednum("Give me the second number");
			sum=num_1+num_2;
			JOptionPane.showMessageDialog(null, "The result of the sum is " +sum, "Result", JOptionPane.INFORMATION_MESSAGE);
			confirm=JOptionPane.showConfirmDialog(null, "You want to continue?");
		}while(confirm==JOptionPane.YES_OPTION);
	}
	public static String Ejer15() {
		int num=0 , product=1, cont=0;
		String cad="";
		
		
		while (cont<5){
			num=funciones.pednum("Give me a number");
			if ((num%2)!=0){
				cont++;
				product=product*num;
			}//end if
		}//end for
		cad=("The product of the first 5 odd numbers is " + product);
		return cad;
	}
}
