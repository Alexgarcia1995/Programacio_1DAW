package Ejer3;

import javax.swing.JOptionPane;

public class funciones {
	public static int pednum (String title , String message){
		int num=0;
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog(null, title , message, JOptionPane.INFORMATION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;	
				}
				else{
				num=Integer.parseInt(s);
				good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		return num;
	}// acaba pednum

	public static float pedfloat (String title , String message){
		float num=0.0f;
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog(null, title , message, JOptionPane.INFORMATION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
					good=false;	
				}
				else{
				num=Float.parseFloat(s);
				good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a number","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		return num;
	}// acaba pednum
	
	public static char ped_char(String title, String message){
		char character = ' ';
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog (null, title , message , JOptionPane.INFORMATION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Error, give me a character","Error", JOptionPane.ERROR_MESSAGE);
					good=false;	
				}
				else{
					character=s.charAt(0);
					good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a character","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		return character;
	}// acaba ped_char
	
	public static String ped_string(String title, String message){
		String c="";
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog (null, title , message, JOptionPane.INFORMATION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Error, give me a phrase","Error", JOptionPane.ERROR_MESSAGE);
					good=false;	
				}
				else{
				c=s;
				good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a phrase","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		return c;
	}// acaba ped_string

	public static int menu(String[] option, String message, String title){
		int men=0;
		men=JOptionPane.showOptionDialog(null, title , message, 0 , JOptionPane.QUESTION_MESSAGE, null, option, option [0]);
		return men;
	}

}
