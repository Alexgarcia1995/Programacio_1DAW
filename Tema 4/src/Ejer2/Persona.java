package Ejer2;


public class Persona {
	// Atributs
	String dni;
	String nom;
	String adreca;
	int edad;
	char sexe;
	String tipo; // admin/user/cliente
	String email;
	String avatar;
	String username;
	String passwd;

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

	public String toString() {
		String cad="";
		cad = cad + ("DNI = " + this.dni + "\n");
		cad = cad + ("Nombre = "+ this.nom + "\n");
		cad = cad + ("Direccion = "+ this.adreca + "\n");
		cad = cad + ("Edad = " + this.edad + "\n");
		return cad;
	}
}
