package Teoria_Orientacio;

import javax.swing.JOptionPane;

public class funciones {
	public static int pednum (String title){
		int num=0;
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog(null, title , "Number", JOptionPane.INFORMATION_MESSAGE);
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

	public static float pedfloat (String title){
		float num=0.0f;
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog(null, title , "Number", JOptionPane.INFORMATION_MESSAGE);
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
	
	public static char ped_char(String title){
		char c = 0;
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog (null, title , "Character", JOptionPane.INFORMATION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Error, give me a character","Error", JOptionPane.ERROR_MESSAGE);
					good=false;	
				}
				else{
				c=s.charAt(0);
				good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Error, give me a character","Error", JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		return c;
	}// acaba ped_char
	
	public static String ped_string(String title){
		String c="";
		boolean good=false;
		String s="";
		do {
			try{
				s=JOptionPane.showInputDialog (null, title , "String", JOptionPane.INFORMATION_MESSAGE);
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

	public static int menu(String[] option ){
		int men=0;
		men=JOptionPane.showOptionDialog(null, "Choose an option", "Option", 0 , JOptionPane.QUESTION_MESSAGE, null, option, option [0]);
		return men;
	}

	public static int menu_retro(String [] option1 ){
		int men1=0;
		men1=JOptionPane.showOptionDialog(null, "What do you want to do?", "Option", 0 , JOptionPane.QUESTION_MESSAGE, null, option1, option1[0]);
		return men1;
	}

}
