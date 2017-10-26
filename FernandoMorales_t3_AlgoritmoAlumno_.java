/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoalumno;

import java.util.*;

/**
 *
 * @author YANET
 */
public class AlgoritmoAlumno {

    /**
     * @param args the command line arguments
     */
    static Reader read = new Reader();
    static Fecha fcha = new Fecha();
    static Alumno al = new Alumno();
    static ArrayList<Alumno> alumnos = new <Alumno> ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here

        int dia;
        int mes;
        int anio;
        leeAlumnos();
        /*alumnos.add(al);
        
        

        //al.setFechaDeNacimiento(fcha.asignarFecha(dia, mes, anio));
        

         */

    }

    public static void leeAlumnos() {
        String nombre;
        Fecha fechaDeNacimiento;
        int numeroDeCuenta;
        int edad;

        String salir = "Si";
        String salida;

        do {
            Alumno auxiliar;
            System.out.println("Desea introducir otro alumno? Si/No");
            salida = read.leeString();
            System.out.println("Ingrese el nombre.");
            nombre = read.leeString();
            System.out.println("Ingrese la fecha de nacimieto. \n");
            System.out.println("Ingrese el dia");
            int dia = read.leeInt();

            System.out.println("Ingrese el mes");
            int mes = read.leeInt();

            System.out.println("Ingrese el anio");
            int anio = read.leeInt();

            fcha.asignarFecha(dia, mes, anio);

            System.out.println("Ingrese el numero de cuenta.");
            al.setNumeroDeCuenta(read.leeInt());
            System.out.println("Ingrese la edad.");
            al.setEdad(read.leeInt());
            
            

        } while (salir.equals(salida));

    }

}
