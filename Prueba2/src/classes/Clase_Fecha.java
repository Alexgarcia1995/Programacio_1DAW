package classes;

import java.text.SimpleDateFormat;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import modules.user.utils.Funciones_fecha;
import utils.formatos;
public class Clase_Fecha {
private String fecha;
private int dia;
private int mes;
private int anio;
private SimpleDateFormat format=new SimpleDateFormat(Funciones_fecha.formato);

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}
public int getAnio(){
	return this.anio;
}

public int getMes(){
	return this.mes;
}

public int getDia(){
	return this.dia;
}

public SimpleDateFormat getFormat(){
	this.format=new SimpleDateFormat(Funciones_fecha.formato);
	return format;
}

public Clase_Fecha(){
	
}

public Clase_Fecha(String introducefecha,String formato){

	String [] Splitarray=null;
	switch (formato){
	case "dd/mm/yyyy":
		Splitarray=introducefecha.split("/");
		this.dia=Integer.parseInt(Splitarray[0]);
		this.mes=Integer.parseInt(Splitarray[1]);
		this.anio=Integer.parseInt(Splitarray[2]);
		this.fecha=this.dia+"/"+this.mes+"/"+this.anio;
	break;
	case "dd-mm-yyyy":
		Splitarray=introducefecha.split("-");
		this.dia=Integer.parseInt(Splitarray[0]);
		this.mes=Integer.parseInt(Splitarray[1]);
		this.anio=Integer.parseInt(Splitarray[2]);
		this.fecha=this.dia+"-"+this.mes+"-"+this.anio;
		break;
	case "yyyy/mm/dd":
		Splitarray=introducefecha.split("/");
		this.dia=Integer.parseInt(Splitarray[2]);
		this.mes=Integer.parseInt(Splitarray[1]);
		this.anio=Integer.parseInt(Splitarray[0]);
		this.fecha=this.anio+"/"+this.mes+"/"+this.dia;
	break;
	case "yyyy-mm-dd":
		Splitarray=introducefecha.split("-");
		this.dia=Integer.parseInt(Splitarray[2]);
		this.mes=Integer.parseInt(Splitarray[1]);
		this.anio=Integer.parseInt(Splitarray[0]);
		this.fecha=this.anio+"-"+this.mes+"-"+this.dia;
	break;
	}
}

public Calendar StringToCalendar(String fecha){
	//Date fechadata= new Date();
	/*Calendar fechacalendario= Calendar.getInstance();
	
	try{
		fechacalendario.set(this.getAnio(),this.getMes(),this.getDia());
	}catch (Exception e){
		e.printStackTrace();
	}
	return fechacalendario;*/
	
	Date fechaDate = new Date();
	Calendar fechaCalendar=new GregorianCalendar();
	SimpleDateFormat format;
	
	try{
	format=this.getFormat();
	fechaDate = format.parse(fecha);
	fechaCalendar.setTime(fechaDate);
	}catch (ParseException e){
	e.printStackTrace();
	}
	return fechaCalendar;
	}
public Calendar StringToCalendar2(String fecha){
	//Date fechadata= new Date();
	/*Calendar fechacalendario= Calendar.getInstance();
	
	try{
		fechacalendario.set(this.getAnio(),this.getMes(),this.getDia());
	}catch (Exception e){
		e.printStackTrace();
	}
	return fechacalendario;*/
	
	Date fechaDate = new Date();
	Calendar fechaCalendar=new GregorianCalendar();
	SimpleDateFormat format;
	
	try{
	format=new SimpleDateFormat("dd/mm/yyyy");
	fechaDate = format.parse(fecha);
	fechaCalendar.setTime(fechaDate);
	}catch (ParseException e){
	e.printStackTrace();
	}
	return fechaCalendar;
	}
public String CalendartoString(Calendar calendario){
    calendario = Calendar.getInstance();
    return (calendario.getTime().toString());
 }


public int comparaFechas(String Fecha_naix){
	
	Calendar cal1 = this.StringToCalendar(fecha);
	Calendar cal2 = this.StringToCalendar(Fecha_naix);
	
	  if (cal1.before(cal2)) 
		  return 1;
	  else if (cal1.after(cal2)) 
		  return 2;
	  else if (cal1.equals(cal2))
		  return 3;
	  else {
		  return 0;
	  }
}

public int comparaFechas1(String Fecha_naix){
	
	Calendar cal1 = this.StringToCalendar(fecha);
	Calendar cal2 = this.StringToCalendar(Fecha_naix);
	
	  if (cal1.before(cal2)) 
		  return -1;
	  else if (cal1.after(cal2)) 
		  return 1;
	  else if (cal1.equals(cal2))
		  return 0;
	  else {
		  return 0;
	  }
}
public boolean ValidaFecha(){
	
	int dia;
	int mes;
	int anyo;
	boolean valido = false;
	//String[] fechaArray=null;
	
	//fechaArray=this.fecha.split("/");
	/*
	dia=Integer.parseInt(fechaArray[0]);
	mes=Integer.parseInt(fechaArray[1]);
	anyo=Integer.parseInt(fechaArray[2]);
	*/
	dia=this.dia;
	mes=this.mes;
	anyo=this.anio;
	
	if ((anyo>1930)&&(anyo<=this.anyoactual())) {
		if ((mes>=1)&&(mes<=12)) {
			switch(mes){
				case 1: //Enero
					if ((dia>0)&&(dia<=31))
						valido=true;
					break;
				case 2: //Febrero
					
					if ( (((anyo%100 == 0) && (anyo%400 == 0))||((anyo%100 != 0) && (anyo%  4 == 0)))&&(dia>0)&&(dia<=29)   )
						valido=true;  // A�o Bisiesto
					else if ((dia>0)&&(dia<=28))
						valido=true;
					break;	
				case 3: //Marzo
					if ((dia>0)&&(dia<=31))
						valido=true;
					break;
				case 4: //Abril
					if ((dia>0)&&(dia<=30))
						valido=true;
					break;
				case 5: //Mayo
					if ((dia>0)&&(dia<=31))
						valido=true;
					break;
				case 6: //Junio
					if ((dia>0)&&(dia<=30))
						valido=true;
					break;
				case 7: //Julio
					if ((dia>0)&&(dia<=31))
						valido=true;
					break;
				case 8: //Agosto 
					if ((dia>0)&&(dia<=31))
						valido=true;
					break;
				case 9: //Septiembre
					if ((dia>0)&&(dia<=30))
						valido=true;
					break;
				case 10: //Octubre
					if ((dia>0)&&(dia<=31))
						valido=true;
					break;
				case 11: //Noviembre
					if ((dia>0)&&(dia<=30))
						valido= true;
					break;
				case 12: //Diciembre
		
					if ((dia>0)&&(dia<=31))
						valido= true;
					break;

				default:
					valido= false;
			}		
		}else
			valido= false;
	}else
		valido= false;
	return valido;
}

	

public int RestaFechas(){
	int diferencia, any1, anyosistema;
	Calendar cal1=new GregorianCalendar();
	
	cal1=(StringToCalendar2(this.toString()));
	
	any1=cal1.get(Calendar.YEAR);

	anyosistema=this.anyoactual();
	
	diferencia=anyosistema-any1;

	return diferencia;
}

public int RestaFechas2(){
	int diferencia, any1, anyosistema;
	Calendar cal1=new GregorianCalendar();
	
	cal1=(StringToCalendar(this.toStringFecha(Funciones_fecha.formato)));
	
	any1=cal1.get(Calendar.YEAR);

	anyosistema=this.anyoactual();
	
	diferencia=anyosistema-any1;

	return diferencia;
}

public String fechaactual(){
	Calendar fecha = new GregorianCalendar();
	return CalendartoString(fecha);
}

	
public int diaactual(){
    Calendar fecha = new GregorianCalendar();
    int dia = fecha.get(Calendar.DAY_OF_MONTH);
    return dia;
}

public int anyoactual(){
    Calendar fecha = new GregorianCalendar();
    int anio = fecha.get(Calendar.YEAR);
    return anio;
}


public int mesactual(){
    Calendar fecha = new GregorianCalendar();
    int mes = fecha.get(Calendar.MONTH);
    return mes;
}

public int resta_anyoactual(int any){
	int anyoact, resto;
	
	anyoact=anyoactual();
	resto=anyoact-any;
	
	return resto;
}

public int resta_mesactual(int mes){
	int mesact, resto;
	
	mesact=mesactual();
	resto=mesact-mes;
	
	return resto;
}
public int resta_diactual(int dia){
	int diaact, resto;
	
	diaact=diaactual();
	resto=diaact-dia;
	
	return resto;
}


public String toStringFecha(String param){
	String fecha=null;
	switch(param){
	case "dd/mm/yyyy":
		fecha=this.dia+"/"+this.mes+"/"+this.anio;
		break;
	case "dd-mm-yyyy":
		fecha=this.dia+"-"+this.mes+"-"+this.anio;
		break;
	case "yyyy/mm/dd":
		fecha=this.anio+"/"+this.mes+"/"+this.dia;
		break;
	case "yyyy-mm-dd":
		fecha=this.anio+"-"+this.mes+"-"+this.dia;
		break;
}
	
		
	return fecha;
	   }

public String toString(){
	String fecha=null;
	
	fecha=this.getDia()+"/"+this.getMes()+"/"+this.getAnio();
		
	return fecha;
	   }

}
