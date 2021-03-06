package modules.user.classes;

import classes.Clase_Fecha;
import classes.Settings;
import modules.user.utils.Funciones_fecha;

public abstract class Persona implements Comparable<Persona> {
	// Atributs
	private String dni;
	private String nom;
	private String adreca;
	private int edad;
	private String sexe;
	private String fecha_naix;
	private Clase_Fecha fechanac;




	

	public Persona() {
	}
	
	public Persona(String dni){
		this.dni=dni;
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
		this.edad=Funciones_fecha.Edad(getFechanaix());
		return edad;
	}


	public String getsexe() {
		return sexe;
	}

	public void setsexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String getFechanaix() {
		this.fecha_naix=this.fechanac.toStringFecha(Settings.getDate_config());
		return fecha_naix;
	}

	public void setFechanaix(String edadnaix) {
		this.fecha_naix = edadnaix;
	}
	
	public Clase_Fecha getFechanac() {
		return fechanac;
	}

	public void setFechanac(Clase_Fecha fechanac) {
		this.fechanac = fechanac;
	}
	public int compareTo(Persona param) {
		if(this.getdni().compareTo(param.getdni())>0)
			return 1;
		if(this.getdni().compareTo(param.getdni())<0)
			return -1;
		return 0;
	  }
	
	public boolean equals(Object param){
		return getdni().equals(((Persona)param).getdni());
	}		
	public abstract String toString();
	

	
}
