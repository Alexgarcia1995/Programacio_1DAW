package Tema3;

import javax.swing.JOptionPane;

import Funciones_Java.funciones;

public class PDF_Tema3 {

	public static void main(String[] args) {
		
		int men=0, men1=0;
		String[] opt= {"Exercise 4","Exercise 6","Exercise 8", "Exercise 9", "Exercise 10", "Exercise 11", "Exercise 12", "Exercise 15", "Exit"};
		String[] opt1= {"Repeat","Back", "Exit"};
		do{
			men=funciones.menu(opt);
			switch (men){
			case 0:
				do{
					int n =funciones.pednum("Give me the number of times you want to count"), conta=0, conte=0, conti=0,conto=0, contu=0;
					for (int i=0;i<n;i++){
					char c=funciones.ped_char("Give me a character");
					switch(c){
					case 'a':
						conta++;
						break;
					case 'e':
						conte++;
						break;
					case 'i':
						conti++;
						break;
					case 'o':
						conto++;
						break;
					case 'u':
						contu++;
						break;
					default:
					JOptionPane.showMessageDialog(null, "The character " + c + " is not a vowel ");
					}
					}
					JOptionPane.showMessageDialog(null, "a appears " + conta + " times \n" + "e appears " + conte + " times \n" + "i appears " + conti + " times \n" + "o appears " + conto + " times \n" + "u appears " + contu + " times", "Result", JOptionPane.INFORMATION_MESSAGE);
					men1=funciones.menu_retro(opt1);
				}while(men1==0);
				break;
			case 1:
				do{
					men1=funciones.menu_retro(opt1);
				}while(men1==0);
				break;
			case 2:
				do{
					men1=funciones.menu_retro(opt1);
				}while(men1==0);
				break;
			case 3:
				do{
					men1=funciones.menu_retro(opt1);
				}while(men1==0);
				break;
			case 4:
				do{
					men1=funciones.menu_retro(opt1);
				}while(men1==0);
				break;
			case 5:
				do{
					men1=funciones.menu_retro(opt1);
				}while(men1==0);
				break;
			case 6:
				do{
					men1=funciones.menu_retro(opt1);
				}while(men1==0);
				break;
			case 7:
				do{
					men1=funciones.menu_retro(opt1);
				}while(men1==0);
				break;
			}
		}while ((men!=8)&&(men1!=2));
	}

}
