package modules.user.Model.classes;

import java.io.Serializable;

import javax.swing.JOptionPane;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import classes.Clase_Fecha;
import classes.Settings;
import modules.user.Model.Functions.Funciones_fecha;

@XStreamAlias("Persona")


public abstract class Persona implements Comparable<Persona>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Atributs
	@XStreamAlias("dni")
	private String dni;
	
	@XStreamAlias("nom")
	private String nom;
	
	@XStreamAlias("adreca")
	private String adreca;
	
	@XStreamAlias("edad")
	private int edad;
	
	@XStreamAlias("sexe")
	private String sexe;
	
	@XStreamAlias("fecha_naix")
	private String fecha_naix;
	
	@XStreamAlias("fechanac")
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
		this.edad=Funciones_fecha.Edad(getFechanac());
		return edad;
	}


	public String getsexe() {
		return sexe;
	}

	public void setsexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String getFechanaix() {
		this.fecha_naix=this.fechanac.toStringFecha(Settings.GetInstance().date_config);
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
		int i;
	if(this.getdni().compareTo(param.getdni())>0){
			i= 1;}
	else if(this.getdni().compareTo(param.getdni())<0){
			i= -1;}
	else{
		i= 0;}
	return i;
	  }
	
	public boolean equals(Object param){
		return getdni().equals(((Persona)param).getdni());
	}		
	public abstract String toString();
	

	
}
