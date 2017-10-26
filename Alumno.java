package T4.ex;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alumno {
    private int numCta;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    //private Date fechaNac;
    private String rfc;
    private Calendar fNac;
    
    public Alumno(int numCta, String nombre, String apPaterno, String apMaterno, Calendar fNac){
        this.numCta = numCta;
        this.nombre = nombre.trim();
        this.apPaterno = apPaterno.trim();
        this.apMaterno = apMaterno.trim();
        //this.fechaNac = fechaNac;
        this.fNac = fNac;
        ArmaRFC();
    }
    
    private void ArmaRFC(){
        String RFC = getApPaterno().substring(0, 2);
        RFC += getApMaterno().substring(0, 1);
        RFC += getNombre().substring(0, 1);
        
        //int anio = getFechaNac().getYear();
        int anio = fNac.get(Calendar.YEAR);
        String sAnio = String.valueOf(anio);
        RFC += sAnio.substring(2, 4);
        
        //int mes = getFechaNac().getMonth();
        int mes = fNac.get(Calendar.MONTH)+1;
        if( mes < 10 )
            RFC += "0";
        RFC += mes;
        
        //int dia = getFechaNac().getDate();
        int dia = fNac.get(Calendar.DAY_OF_MONTH);
        if( dia < 10 )
            RFC += "0";
        RFC += dia;
        
        setRfc( RFC.toUpperCase() );
    }
    /**
     * @return the numCta
     */
    public int getNumCta() {
        return numCta;
    }

    /**
     * @param numCta the numCta to set
     */
    public void setNumCta(int numCta) {
        this.numCta = numCta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    public Date getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }*/

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the apPaterno
     */
    public String getApPaterno() {
        return apPaterno;
    }

    /**
     * @param apPaterno the apPaterno to set
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    /**
     * @return the apMaterno
     */
    public String getApMaterno() {
        return apMaterno;
    }

    /**
     * @param apMaterno the apMaterno to set
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    /**
     * @return the fNac
     */
    public Calendar getfNac() {
        return fNac;
    }

    /**
     * @param fNac the fNac to set
     */
    public void setfNac(Calendar fNac) {
        this.fNac = fNac;
    }
}
