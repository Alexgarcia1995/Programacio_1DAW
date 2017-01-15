package Ejer3;


public abstract class Persona {
	// Atributs
	private String dni;
	private String nom;
	private String adreca;
	private int edad;
	private char sexe;


	public Persona() {
	}

	public String getdni() {
		return dni;
	}

	public void setdni(String dni) {
		this.dni = dni;
	}

	public String getnom() {
		return nom;
	}

	public void setnom(String nom) {
		this.nom = nom;
	}

	public String getadreca() {
		return adreca;
	}

	public void setadreca(String adreca) {
		this.adreca = adreca;
	}

	public int getedad() {
		return edad;
	}

	public void setedad(int edad) {
		this.edad = edad;
	}
	public char getsexe() {
		return sexe;
	}

	public void setsexe(char sexe) {
		this.sexe = sexe;
	}
	public abstract String toString();
	
}
