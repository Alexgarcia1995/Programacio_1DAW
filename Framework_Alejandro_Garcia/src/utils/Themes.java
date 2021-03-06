package utils;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import classes.Settings;

public class Themes {

	public static void theme (){
		
		try {
			switch (Settings.instance.theme){
			case "METAL":
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
				break;

			case "GTK":
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				break;

			case "MOTIF":
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				break;
				
			case "WINDOWS95":
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
				break;
				
			}
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, "errortheme" ,"errortitle", JOptionPane.ERROR_MESSAGE);
		}
	}
}
