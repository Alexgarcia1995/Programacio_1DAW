package Teoria_Orientacio;

import javax.swing.JOptionPane;

import Teoria_Orientacio.funciones;
public class Main {

	public static void main(String[] args) {

		Persona Persona1;
		Persona1= new Persona();
		Persona1.setdni(funciones.ped_string("DNI"));;
		Persona1.setnom(funciones.ped_string("Nombre"));
		Persona1.setadreca(funciones.ped_string("Direccion"));
		Persona1.setedad(funciones.pednum("Edad"));
		JOptionPane.showMessageDialog(null, Persona1.toString());
	}

}
