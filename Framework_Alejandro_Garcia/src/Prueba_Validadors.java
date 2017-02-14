

import javax.swing.JOptionPane;

import classes.Languages;
import modules.user.Model.BLL.BLL_dummies.Funciones_data_dummies;
import utils.formatos;
import utils.funciones;

public class Prueba_Validadors {
	public static void main(String[] args) {
		boolean good=funciones.Login(0);
		
		JOptionPane.showMessageDialog(null, good);
	}
}
		
