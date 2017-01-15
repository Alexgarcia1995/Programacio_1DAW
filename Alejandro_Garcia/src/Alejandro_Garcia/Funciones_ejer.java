package Alejandro_Garcia;

import javax.swing.JOptionPane;

import Alejandro_Garcia.funciones;
public class Funciones_ejer {

	public static String Ejer1() {
	
		int num=0,sum=0,may=0;
		String cad="";
		boolean interr=false;
		
		do {
			num=funciones.pednum("Give me a number to show the sum of their pair divisors (Type -1 to exit)", "Divisors");
			if (num==-1){
				interr=true;
			}//end if
			else{
				sum=0;
				for (int i=1;i<=num;i++){
					if (((num%i)==0)&&((i%2)==0)){
						sum=sum+i;
					}
				}//end for
				cad=cad+("The sum of the pairs divisors of " + num + " is "+ sum +" \n");
				if (sum>may){
					may=sum;
				}
			}//end else
		}while (interr==false);
		cad=cad+("The bigger sum of the numbers is " + may);
		return cad;	
	}
	public static String Ejer2() {
	int num=0, confirm=0, rest=0,aux=0,cont=0;
	float media=0.0f,sum =0.0f; //creem estos dos floats, ja que pot ser que una divisio entre 3 tinga decimals
	String cad="";
	
	do {
		num=funciones.pednum("Give me a number to show if he has 3 pair digits or not", "Digits");
		aux=num;
		//en aquest cas, introduim un auxiliar perque com volem mostrar al usuari el numero introduit, aquest desapareix quan realitzem la operacio
		cont=0;
		sum=0.0f;
		while (num>0){
			rest=num%10;
			num=num/10;
			if ((rest%2)==0){
				cont++;
				sum=sum+rest;
			}//end if
		}//end while
		if (cont==3){
			media=sum/3;
			cad=cad+("The number " + aux + " has 3 pairs digits, the average of the 3 pairs digits is " + media +"\n" );
		}//end if
		else {
			cad=cad+("The number " + aux + " doesn't have 3 pairs digits \n");
		}//end else
		confirm=JOptionPane.showConfirmDialog(null, "Do you want to introduce another number?");
	} while (confirm==JOptionPane.YES_OPTION);
	return cad;
	}
}
