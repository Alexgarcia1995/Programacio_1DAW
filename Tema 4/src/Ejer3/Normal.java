package Ejer3;

public class Normal extends Persona{
	private String email;
	private String username;
	private String passwd;
	
	public Normal(){
		super();
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
	public String getpasswd() {
		return passwd;
	}
	public void setpasswd(String passwd){
		this.passwd=passwd;
	}
	public String toString() {
		String cad="";
		cad = cad + ("DNI = " + this.getdni() + "\n");
		cad = cad + ("Nombre = "+ this.getnom() + "\n");
		cad = cad + ("Direccion = "+ this.getadreca() + "\n");
		cad = cad + ("Edad = " + this.getedad() + "\n");
		cad = cad + ("Sexo = " + this.getsexe() + "\n");
		cad = cad + ("Email = "+ this.getemail() + "\n");
		cad = cad + ("Usuario = " + this.getusername() + "\n");
		cad = cad + ("Contrasenya = " + this.getpasswd() + "\n");
		return cad;
	}
}

