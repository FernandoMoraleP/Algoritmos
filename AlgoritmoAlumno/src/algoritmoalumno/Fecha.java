/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoalumno;

/**
 *
 * @author YANET
 */
class Fecha {

    int dia;
    int mes;
    int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        asignarFecha(dia, mes, anio);
    }

    public void asignarFecha(int idia, int imes, int ianio) {
        this.dia = idia;
        this.mes = imes;
        this.anio = ianio;
    }

    public int[] obtenerFecha(int[] fecha) {
        fecha[0] = this.dia;
        fecha[1] = this.mes;
        fecha[2] = this.anio;

        return fecha;
    }

    public static void verFecha(int[] fecha) {
        System.out.println("\t" + fecha[0] + "-" + fecha[1] + "-" + fecha[2]);
    }
}
