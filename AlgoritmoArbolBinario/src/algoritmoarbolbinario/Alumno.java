/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoarbolbinario;

/**
 *
 * @author YANET
 */
import java.util.Calendar;

public class Alumno {
    private  String nombre;
    private  String apellidoPaterno;
    private  Calendar fechaDeNacimiento;
    private  int numeroDeCuenta;
    private  int edad;

    public Alumno(String nombre, String apellidoPaterno, Calendar fechaDeNacimiento, int numeroDeCuenta, int edad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.numeroDeCuenta = numeroDeCuenta;
        this.edad = edad;
    }

    Alumno() {
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

    /**
     * @return the numeroDeCuenta
     */
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * @param numeroDeCuenta the numeroDeCuenta to set
     */
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the fechaDeNacimiento
     */
    public Calendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * @param fechaDeNacimiento the fechaDeNacimiento to set
     */
    public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    /**
     * @return the ApellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the ApellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    
}
