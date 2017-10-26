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

    static ArrayList<Alumno> alumnos = new <Alumno> ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
       leeAlumnos();     

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

            //fechaDeNacimiento = fcha.obtenerFecha(fecha);

            System.out.println("Ingrese el numero de cuenta.");
            numeroDeCuenta = read.leeInt();
            System.out.println("Ingrese la edad.");
            edad = read.leeInt();

            auxiliar = new Alumno();

            auxiliar.setNombre(nombre);
            //auxiliar.setFechaDeNacimiento(fechaDeNacimiento);
            auxiliar.setNumeroDeCuenta(numeroDeCuenta);
            auxiliar.setEdad(edad);
            
            alumnos.add(auxiliar);

        } while (salir.equals(salida));
        
        mostrarAlumnos();

    }
     public static void mostrarAlumnos(){      
        for(int i = 0; i < alumnos.size(); i++)
            System.out.println(alumnos.get(i));  
    }

}
