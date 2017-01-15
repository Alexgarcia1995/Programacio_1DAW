package utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import classes.Languages;

public class Validate {
	private static final String noms="^[a-zA-Z\\s]*$";
	private static final String lletres_nums="^[A-Za-z0-9-\\s]*$";
	private static final String codi_postal="^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";
	private static final String telefono="^[0-9]{2,3}-? ?[0-9]{6,7}$";
	private static final String email=("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	private static final String pattern_date1="[0-9]{2}[-/][0-9]{2}[-/][0-9]{4}";
	private static final String pattern_date2="^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-(19|20)\\d{2}$";
	private static final String pattern_date3="^(19|20)\\d{2}/(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])$";
	private static final String pattern_date4="^(19|20)\\d{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
	private static final String edad="^[0-9]{1,2}$";
	private static final String comments="^[0-9]{1,3}$";
	private static final String passwd="(?=[!-~]*[0-9!-/:-@[-`{-~]])(?=[!-~]*[a-zA-Z])[!-~]{4,}";
	private static final String sexe="([H,M]|[h,m])";
	
	public static boolean Validanom(String string){
		Pattern pattern=Pattern.compile(noms);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_nom"), Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	public static boolean Validalletrnum(String string){
		Pattern pattern=Pattern.compile(lletres_nums);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_direccio"), Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	public static boolean Validausername(String string){
		Pattern pattern=Pattern.compile(lletres_nums);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_username"), Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	public static boolean Validacodipost(String string){
		Pattern pattern=Pattern.compile(codi_postal);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_nom"), Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	public static boolean Validatel(String string){
		Pattern pattern=Pattern.compile(telefono);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_nom"), Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	public static boolean Validadni(String string){
		boolean val = true;
		String dni2 = "", caracteres="TRWAGMYFPDXBNJZSQVHLCKET";
		int dni1 = 0, modulo = 0;
			for(int i=0; i<8; i++)
				dni2 += string.charAt(i);			
			char letra = string.charAt(8);			
				dni1 = Integer.parseInt(dni2);
			    	modulo= dni1 % 23;
			    		char let = caracteres.charAt(modulo);
					    	if(let == letra)
					    		val = true;
					    	else{
								JOptionPane.showMessageDialog(null, "Error, dame una combinacion de DNI valida","Error",JOptionPane.ERROR_MESSAGE);
					    		val = false;	
					    	}
		return val;
	}
	
	public static boolean Validaemail(String string){
		Pattern pattern=Pattern.compile(email);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_email"), Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	public static boolean Validafecha(String string,String format){
		boolean good=false;
		switch (format){
		case "dd/mm/yyyy":
			Pattern pattern=Pattern.compile(pattern_date1);
			Matcher matcher=pattern.matcher(string); 
			if (matcher.matches()){
				good=true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Error, dame una fecha valida","Error",JOptionPane.ERROR_MESSAGE);
				good=false;
			}
			break;
		case "dd-mm-yyyy":
			pattern=Pattern.compile(pattern_date1);
			matcher=pattern.matcher(string); 
			if (matcher.matches()){
				good=true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Error, dame una fecha valida","Error",JOptionPane.ERROR_MESSAGE);
				good=false;
			}
			break;
		case "yyyy/mm/dd":
			pattern=Pattern.compile(pattern_date3);
			matcher=pattern.matcher(string); 
			if (matcher.matches()){
				good=true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Error, dame una fecha valida","Error",JOptionPane.ERROR_MESSAGE);
				good=false;
			}
			break;
		case "yyyy-mm-dd":
			pattern=Pattern.compile(pattern_date4);
			matcher=pattern.matcher(string); 
			if (matcher.matches()){
				good=true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Error, dame una fecha valida","Error",JOptionPane.ERROR_MESSAGE);
				good=false;
			}
			break;
		}
		return good;
	}
	
	public static boolean Validaedad(String string){
		Pattern pattern=Pattern.compile(edad);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Error, dame una edad valida","Error",JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	public static boolean Validapasswd(String string){
		Pattern pattern=Pattern.compile(passwd);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Error, dame una contrasena valida","Error",JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
	
	public static boolean Validasexe(String string){
		Pattern pattern=Pattern.compile(sexe);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_sexe"), Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	public static boolean Validacomments(String string){
		Pattern pattern=Pattern.compile(comments);
		Matcher matcher=pattern.matcher(string); 
		if (matcher.matches()){
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, Languages.lenguajes.getProperty("error_comments"), Languages.lenguajes.getProperty("error"),JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
}


