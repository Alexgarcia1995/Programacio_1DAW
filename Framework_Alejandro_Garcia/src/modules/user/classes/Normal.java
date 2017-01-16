package modules.user.classes;

import classes.Languages;
import modules.user.utils.Funciones_data_user;

public class Normal extends Persona{
	private String email;
	private String username;
	private int comments;
	private int points;
	private String karma;
	
	
	public Normal(){
		super();
	}
	
	public Normal(String DNI){
		super(DNI);
	}
	
	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}


	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username =username ;
	}

	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}
	
	public int getPoints() {
		this.points=Funciones_data_user.Points(this.getKarma());
		return points;
	}
	
	public String getKarma() {
		this.karma=Funciones_data_user.Karma(this.comments);
		return karma;
	}

	
	public String toString() {
		String cad="";
		cad = cad + (Languages.lenguajes.getProperty("dni")+" = " + this.getdni() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("nom")+" = "+ this.getnom() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("direccion")+" = "+ this.getadreca() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("edad")+" = " + this.getedad() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("fecha_naix")+" = " + this.getFechanaix() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("sexe")+" = " + this.getsexe() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("email")+" = "+ this.getemail() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("username")+" = " + this.getusername() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("comments")+" = " + this.getComments() + "\n");
		cad = cad + ("Karma = " + this.getKarma() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("puntos")+" = " + this.getPoints() + "\n");
		return cad;
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

