package modules.user.Model.classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import classes.Clase_Fecha;
import classes.Languages;
import classes.Settings;
import modules.user.Model.Functions.*;


@XStreamAlias("Client")
public class Client extends Persona {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XStreamAlias("tipo")
	private String tipo="Cliente";
	
	@XStreamAlias("email")
	private String email;
	
	@XStreamAlias("avatar")
	private String avatar;
	
	@XStreamAlias("username")
	private String username;
	
	@XStreamAlias("passwd")
	private String passwd;
	
	@XStreamAlias("fecha_alta")
	private String fecha_alta;
	
	@XStreamAlias("antig_alta")
	private int antig_alta;
	
	@XStreamAlias("compras")
	private int compras;
	
	@XStreamAlias("descuentos")
	private int descuentos;
	
	@XStreamAlias("fechaalta")
	private Clase_Fecha fechaalta;
	
	

	public Client(){
		super();
	}
	public Client(String dni){
		super(dni);
		
	}


	public String gettipo() {
		return tipo;
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
		this.username =username ;
	}
	public String getpasswd() {
		return passwd;
	}
	public void setpasswd(String passwd){
		this.passwd=passwd;
	}

	public String getFecha_alta() {
		this.fecha_alta=this.fechaalta.toStringFecha(Settings.GetInstance().date_config);
		return fecha_alta;
	}


	public void setFecha_alta(String fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	
	public int getAntig_alta() {
		this.antig_alta=Funciones_fecha.Antiguedad_alta(getFecha_alta());
		return antig_alta;
	}
	
	
	
	public int getCompras() {
		return compras;
	}


	public void setCompras(int compras) {
		this.compras = compras;
	}


	public int getDescuentos() {
		this.descuentos=Funciones_data_user.Descuentos(this.getCompras());
		return descuentos;
	}

	public Clase_Fecha getFechaalta() {
		return fechaalta;
	}


	public void setFechaalta(Clase_Fecha fechaalta) {
		this.fechaalta = fechaalta;
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
		cad = cad + (Languages.lenguajes.getProperty("contraseña")+" = " + this.getpasswd() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("fecha_alta")+" = " + this.getFecha_alta() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("antig_sis")+" = " + this.getAntig_alta() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("compras")+" = " + this.getCompras() + "\n");
		cad = cad + (Languages.lenguajes.getProperty("descuento")+" = " + this.getDescuentos() + "%\n");
		cad = cad + ("Tipo = " + this.gettipo() + "\n");
		cad = cad + ("Avatar = "+ this.getavatar() + "\n");
		return cad;
	}


}


