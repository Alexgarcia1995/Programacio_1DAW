package Tema2;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		int option=0;
		float num_1=0.0f, num_2=0.0f,result=0.0f;
		String s ="";
		boolean good=false;
		
		//seleccionar opcion
	
		
		JOptionPane.showMessageDialog(null, "The options are \n1 sum \n2 rest \n3 multiply \n4 divide \n8 Exit", "Option", JOptionPane.INFORMATION_MESSAGE);
		while (option !=8){
		do{
			try{
				s=JOptionPane.showInputDialog(null,"Choose an option","Option", JOptionPane.QUESTION_MESSAGE);
			
				if (s==null){
				JOptionPane.showMessageDialog(null, "Exit the app","Exit",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				}
				else {
					option=Integer.parseInt(s);
					good=true;
				}
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "Give me a number","Error",JOptionPane.ERROR_MESSAGE);
				good=false;
			}
		}while (good==false);
		
		
		//calculadora
		if (option !=0){
			
			//num_1
			do{
				try{
					s=JOptionPane.showInputDialog(null,"Give me the first number","Number", JOptionPane.QUESTION_MESSAGE);
				
					if (s==null){
					JOptionPane.showMessageDialog(null, "Exit the app","Exit",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					}
					else {
						num_1=Integer.parseInt(s);
						good=true;
					}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Give me a number","Error",JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while (good==false);
			
			//num2
			do{
				try{
					s=JOptionPane.showInputDialog(null,"Give me the second number","Number", JOptionPane.QUESTION_MESSAGE);
				
					if (s==null){
					JOptionPane.showMessageDialog(null, "Exit the app","Exit",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					}
					else {
						num_2=Integer.parseInt(s);
						good=true;
					}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Give me a number","Error",JOptionPane.ERROR_MESSAGE);
					good=false;
				}
			}while (good==false);
		}//end if
		switch(option){
			case 1: 
			result= num_1 + num_2;
			JOptionPane.showMessageDialog(null, "The sum of the numbers is "+ result, "Result", JOptionPane.INFORMATION_MESSAGE);		
			break;
			case 2:
				result= num_1 - num_2;
				JOptionPane.showMessageDialog(null, "The rest of the numbers is "+ result, "Result", JOptionPane.INFORMATION_MESSAGE);		
				break;
			case 3:
				result= num_1 * num_2;
				JOptionPane.showMessageDialog(null, "The multiply of the numbers is "+ result, "Result", JOptionPane.INFORMATION_MESSAGE);		
				break;
			case 4:
				if (num_2==0){
					JOptionPane.showMessageDialog(null, "Error, a number can't be divided by 0", "Error",JOptionPane.ERROR_MESSAGE);
				}
				else{
					result= num_1 / num_2;
					JOptionPane.showMessageDialog(null, "The result of the numbers is"+ result, "Result", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
		
			case 8:
				JOptionPane.showMessageDialog(null, "Thanks for use this calculator", "Exit", JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Not a valid option, choose other one","Option",JOptionPane.INFORMATION_MESSAGE);
		}//end switch
		}
	}

}
