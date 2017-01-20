package modules.user.classes;

import javax.swing.JOptionPane;

import classes.Clase_Fecha;
import classes.Languages;
import classes.Settings;
import modules.user.utils.Funciones_data_user;
import modules.user.utils.Funciones_fecha;
import utils.formatos;

public class Admin extends Persona {
	//private String tipo = "Administrador";
	private String email;
	private String avatar;
	private String username;
	private String passwd;
	private String permiso = "Lectura, Escritura y Ejecucion";
	private String aniocont;
	private int antiguedad;
	private String salario;
	private Clase_Fecha aniocon;


	public Admin() {
		super();
	}
	public Admin(String dni) {
		super(dni);
	
	}
	/*public String gettipo() {
		return this.tipo;
	}
*/
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
	
	public String getAniocont() {
		this.aniocont=this.aniocon.toStringFecha(Settings.getDate_config());
		return aniocont;
	}

	public void setAniocont(String aniocont) {
		this.aniocont = aniocont;
	}

	public int getAntiguedad() {
		this.antiguedad=Funciones_fecha.Antiguedad(getAniocont());
		return antiguedad;
	}

	public String getSalario() {
		this.salario=Funciones_data_user.Salario(this.getAntiguedad(),Settings.getCurrency_config(),Settings.getDecimals_config());
		return salario;
}
	public Clase_Fecha getAniocon() {
		return aniocon;
	}

	public void setAniocon(Clase_Fecha aniocon) {
		this.aniocon = aniocon;
	}


	public String toString() {
		String cad = "";
		cad = cad + (Languages.lenguajes.getProperty("dni")+" = " + this.getdni() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("nom")+" = "+ this.getnom() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("direccion")+" = "+ this.getadreca() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("edad")+" = " + this.getedad() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("fecha_naix")+" = " + this.getFechanaix() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("sexe")+" = " + this.getsexe() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("email")+" = "+ this.getemail() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("username")+" = " + this.getusername() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("contraseña")+" = " + this.getpasswd() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("fecha_cont")+" = " + this.getAniocont() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("antig")+" = " + this.getAntiguedad() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("salario")+" = " + this.getSalario() + Settings.getCurrency_config()+ "\n");
		cad = cad + ("Permisos del usuario = " + this.getpermiso() + "\n");
		//cad = cad + ("Tipo = " + this.gettipo() + "\n");
		//cad = cad + ("Avatar = " + this.getavatar() + "\n");
		return cad;
	}

}
