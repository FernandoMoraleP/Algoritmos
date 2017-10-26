/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoarbolbinario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author YANET
 */
public class AlgoritmoArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String salir = "NO";
        String salida;
        Alumno alumno = new Alumno();

        Nodo raiz = new Nodo(alumno);
        do {
            Scanner in = new Scanner(System.in);

            Calendar fechaDeNacimiento = new GregorianCalendar();
            //Nodo nodo;

            System.out.println("Ingrese el nombre del alumno");
            String nombre = in.nextLine();
            alumno.setNombre(nombre);

            System.out.println("Ingrese el apellido paterno");
            String apellido = in.nextLine();
            alumno.setApellidoPaterno(apellido);

            System.out.println("Ingrese la fecha de nacimiento");
            int anio, mes, dia;
            dia = in.nextInt();
            mes = in.nextInt();
            anio = in.nextInt();
            fechaDeNacimiento.set(anio, mes, dia);

            System.out.println("Ingrese el numero de cuenta");
            int cuenta = in.nextInt();
            alumno.setNumeroDeCuenta(cuenta);
            System.out.println("Ingrese la edad");
            int edad = in.nextInt();
            alumno.setNumeroDeCuenta(edad);

            //alumno = new Alumno(nombre, apellido, fechaDeNacimiento, cuenta, edad);

            /*SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            
             System.out.println(alumno.getNombre());
             System.out.println(alumno.getApellidoPaterno());
             System.out.println(sdf.format(alumno.getFechaDeNacimiento().getTime()));
             System.out.println(alumno.getNumeroDeCuenta());
             System.out.println(alumno.getEdad());*/
            addNodo(new Alumno( nombre, apellido, fechaDeNacimiento,  cuenta, edad), new Nodo());
            
            
            System.out.println("Desea agregar un alumno nuevo SI/NO");
            salida = in.nextLine();
            //addNodo(alumno, raiz);

        } while (salida.equals(salir));

    }

    private static void addNodo(Alumno alumno, Nodo raiz) {

        //Nodo nodo = null;
        Nodo izq = null;
        Nodo der = null;
        if (raiz == null) {
            raiz.setAlumno(alumno);
        } else if (0 <= ((raiz.getAlumno().getApellidoPaterno()).compareTo(alumno.getApellidoPaterno()))) {
            addNodo(alumno, der);
        } else {
            addNodo(alumno, izq);
        }

    }

    /* private static void BuscaAlumno(Alumno alumno, Nodo raiz) {

        Nodo nodo = new Nodo(alumno);
        Nodo izq = izq;
        Nodo der = der;
        if (raiz != null) {
            nodo.getAlumno();
        } else if (alumno.getApellidoPaterno().compareTo(nodo.getAlumno().getApellidoPaterno()) <= 0) {
            BuscaAlumno(alumno, izq);
        } else {
            addNodo(alumno, der);
        }
    }*/
}
