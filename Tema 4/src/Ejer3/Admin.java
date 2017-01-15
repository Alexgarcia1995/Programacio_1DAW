package Ejer3;

public class Admin extends Persona {
	private String tipo = "Administrador";
	private String email;
	private String avatar;
	private String username;
	private String passwd;
	private String permiso = "Lectura, Escritura y Ejecucion";

	public Admin() {
		super();
	}

	public String gettipo() {
		return this.tipo;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getavatar() {
		return avatar;
	}

	public void setavatar(String avatar) {
		this.avatar = avatar;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getpasswd() {
		return passwd;
	}

	public void setpasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getpermiso() {
		return this.permiso;
	}

	public String toString() {
		String cad = "";
		cad = cad + ("DNI = " + this.getdni() + "\n");
		cad = cad + ("Nombre = " + this.getnom() + "\n");
		cad = cad + ("Direccion = " + this.getadreca() + "\n");
		cad = cad + ("Edad = " + this.getedad() + "\n");
		cad = cad + ("Sexo = " + this.getsexe() + "\n");
		cad = cad + ("Tipo = " + this.gettipo() + "\n");
		cad = cad + ("Email = " + this.getemail() + "\n");
		cad = cad + ("Avatar = " + this.getavatar() + "\n");
		cad = cad + ("Usuario = " + this.getusername() + "\n");
		cad = cad + ("Contrasenya = " + this.getpasswd() + "\n");
		cad = cad + ("Permisos del usuario = " + this.getpermiso() + "\n");
		return cad;
	}
}
