package Tema3_Ejer3;

public class Funciones_ejer {

	public static String Ejer1() {
	int num=0, cont=0, suma=0, media=0;
	String cad="";
	do{
		num=funciones.pednum("Give me a number", "Number");
		if ((num>20) && (num<80)){
			cont++;
			cad=cad+("Numbers before " + num + ": \n");
			for (int i=num+1; i<num+10; i++){
				if ((i%2)!=0){
					suma=suma+i;
					cad=cad+( "The number " + i + " is an odd number \n");
				}
			}//end for
			media=suma/10;
			cad=cad+ ("The average of the 10 next odd numbers of the number " + num + " is " + media + "\n");
		}//end if
	}while (cont!=4);
	return cad;
	}
	public static String Ejer2() {
		int num=0, sum=0, prod=1, rest=0, aux=0;
		String cad="";
		boolean interr=false;
		do{
			num=funciones.pednum("Give me a number (Type -1 to exit)", "Number");
				if (num==-1){
					interr=true;
				}//end else
				else{
					aux=num;
					prod=1;
					sum=0;
					while (num>0){
						rest=num%10;
						num=num/10;
						if ((rest%2)==0){
							prod=prod*rest;
						}//end if
						else{
							sum=sum+rest;
						}//end else
					}//end while
					cad = cad +("The product of odd digits of the number " + aux + " is " + prod + " and the sum of the even digits is " + sum + "\n");
				}//end else
			
		}while(interr==false);
		return cad;
	}
	public static String Ejer3() {
		int n=0, prod=1, media=0 ,cont=0 ,sum=0;
		String cad="";
		
		int previo=funciones.pednum("Give me a number", "Number");
		n=funciones.pednum("Give me the number of the end of the app", "Limit");
		for (int i=1; i<=n; i++){
			prod=1;
			cont=0;
			sum=0;
			for (int j=1; j<=i; j++){
				if (((i%j)==0) && ((j%2)!=0)){
					prod=prod*j;
					cont++;
					sum=sum+j;
				}//end if
			}//end for
			if (prod==previo){
				cad=cad+ ("The product of the even divisors of  " + i + " is equal to " + previo + "\n" );
			}//end if
			else{
					cad=cad+ ("The product of the even divisors of  " + i + " is diferent to " + previo + "\n" );
			}
			if (cont==3){
				media=sum/cont;
				cad=cad+ ("The media of the 3 even divisor of  " + i + " is " + media + "\n" );
			}
		}//end for
		return cad;
	}
	public static String Ejer4() {
		
	}
	public static String Ejer5() {
		
	}
	public static String Ejer6() {
		
	}
	public static String Ejer7() {
		
	}
}
