package Ejer3;

import javax.swing.JOptionPane;

import Ejer3.Funciones_ejer;
import Ejer3.funciones;

public class Main_Ejer3 {

	public static void main(String[] args) {
		int men = 0, men1 = 0;
		String[] option = { "Create", "Read", "Update", "Delete", "Exit" };
		String[] option1 = { "Cliente", "Admin", "Normal", "Exit" };
		String cad = "";
		Client Usuario = null;
		Admin Administrador = null;
		Normal Normal=null;	
		do {
			men1 = funciones.menu(option1, "What do you want to create?", "Options");
			switch (men1) {
			// Cliente
			case 0:
				do {
					men = funciones.menu(option, "Choose an option", "Options");
					switch (men) {
					case 0:
						Usuario = Funciones_ejer.Create_Usuario(Usuario);

						break;
					case 1:
						if (Usuario == null) {
							JOptionPane.showMessageDialog(null, "Error, there isn't a user created!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							cad = Funciones_ejer.Read_Usuario(Usuario);
							JOptionPane.showMessageDialog(null, cad);
						}

						break;
					case 2:
						if (Usuario == null) {
							JOptionPane.showMessageDialog(null, "Error, there isn't a user created!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							Funciones_ejer.Edit_Usario(Usuario);
						}
						break;
					case 3:
						if (Usuario == null) {
							JOptionPane.showMessageDialog(null, "Error, there isn't a user created!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							Usuario = Funciones_ejer.Delete_user(Usuario);
						}
						break;
					}
				} while (men != 4);
				break;
			// Admins
			case 1:
				do {
					men = funciones.menu(option, "Choose an option", "Options");
					switch (men) {
					case 0:
						Administrador = Funciones_ejer.Create_Admin(Administrador);

						break;
					case 1:
						if (Administrador == null) {
							JOptionPane.showMessageDialog(null, "Error, there isn't a user created!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							cad = Funciones_ejer.Read_Admin(Administrador);
							JOptionPane.showMessageDialog(null, cad);
						}

						break;
					case 2:
						if (Administrador == null) {
							JOptionPane.showMessageDialog(null, "Error, there isn't a user created!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							Funciones_ejer.Edit_Admin(Administrador);
						}
						break;
					case 3:
						if (Administrador == null) {
							JOptionPane.showMessageDialog(null, "Error, there isn't a user created!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							Administrador = Funciones_ejer.Delete_Admin(Administrador);
						}
						break;
					}
				} while (men != 4);
				break;
				//Normal
			case 2:
				do {
					men = funciones.menu(option, "Choose an option", "Options");
					switch (men) {
					case 0:
						Normal = Funciones_ejer.Create_Normal(Normal);

						break;
					case 1:
						if (Normal == null) {
							JOptionPane.showMessageDialog(null, "Error, there isn't a user created!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							cad = Funciones_ejer.Read_Normal(Normal);
							JOptionPane.showMessageDialog(null, cad);
						}

						break;
					case 2:
						if (Normal == null) {
							JOptionPane.showMessageDialog(null, "Error, there isn't a user created!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							Funciones_ejer.Edit_Normal(Normal);
						}
						break;
					case 3:
						if (Normal == null) {
							JOptionPane.showMessageDialog(null, "Error, there isn't a user created!", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else {
							Normal = Funciones_ejer.Delete_Normal(Normal);
						}
						break;
					}
				} while (men != 4);
				break;
			}

		} while ((men1 != 3) && (men != 4));
	}

}
