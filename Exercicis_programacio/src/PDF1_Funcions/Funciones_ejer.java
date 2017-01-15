package PDF1_Funcions;

import PDF1_Funcions.funciones;

public class Funciones_ejer {
	//exercici1
	public static String Ejer1() {
		String cad = "";
		int num = 0, num1 = 0, num2 = 0;
		num = funciones.pednum("Give me the first number","Number");
		num1 = funciones.pednum("Give me the second number","Number");
		num2 = funciones.pednum("Give me the third number","Number");
		cad = (" The media of the 3 numbers is " + ((num + num1 + num2) / 3));

		return cad;
	}
	//exercici2
	public static String Ejer2() {
		String cad = "";
		int num = 0, num1 = 0;
		num = funciones.pednum("Give me the first number","Number");
		num1 = funciones.pednum("Give me the second number","Number");
		if (num > num1)
			cad = ("The number " + num + " is bigger than " + num1);
		else
			cad = ("The number " + num + " is lower than " + num1);
		return cad;
	}
	//exercici3
	public static String Ejer3() {
		String cad = "";
		int num = 0, num1 = 0, aux = 0;
		num = funciones.pednum("Give me the first number","Number");
		num1 = funciones.pednum("Give me the second number","Number");
		aux = num1;
		num1 = num;
		num = aux;
		cad = ("The numbers inversed are " + num + " and " + num1);
		return cad;
	}
	//exercici4
	public static String Ejer4() {
		String cad = "";
		int num = 0, prod = 1;
		prod = 1;
		num = funciones.pednum("Give me a number to show his multiplication number","Number");
		for (int i = 1; i <= 10; i++) {
			prod = num * i;
			cad = cad + (num + "*" + i + "=" + prod + "\n");
		}
		
		return cad;
		
	}
	//exercici5
	public static String Ejer5() {
		String cad = "";
		int num = 0, num1 = 0, num2 = 0, num3=0, num4=0;
		num = funciones.pednum("Give me the first number","Number");
		num1 = funciones.pednum("Give me the second number","Number");
		num2 = funciones.pednum("Give me the third number","Number");
		num3 =funciones.pednum("Give me the fourth number","Number");
		num4 = funciones.pednum("Give me the fifth number","Number");
		cad= "The sum of all the numbers is " + (num + num1 + num2 + num3 + num4);
		
		return cad;
		}
	//exercici6
	public static String Ejer6() {
		String cad = "";
		int num = 1, sum=0;
			while (num != 0) {
				num = funciones.pednum("Give me a number (Type 0 to exit)","Number");
				sum = sum + num;
			}
			cad= ("The sum of the numbers is " + sum);
		
		return cad;
		}
}
