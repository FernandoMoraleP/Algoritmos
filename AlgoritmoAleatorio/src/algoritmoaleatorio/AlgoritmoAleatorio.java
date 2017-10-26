/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoaleatorio;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author YANET
 */
public class AlgoritmoAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner obtener = new Scanner(System.in);

        System.out.println("Cuantos numeros desea generar.");
        int cuantosNumeros = obtener.nextInt();

        int[] arregloAleatorio = new int[cuantosNumeros];
        System.out.println("longitud del arreglo \n" + arregloAleatorio.length);

        for (int i = 0; i < arregloAleatorio.length; i++){
            int numero = (rnd.nextInt() * 99 + 1);
            arregloAleatorio [i] = numero;
        }
        
        for (int i = 0; i < arregloAleatorio.length; i++){
            
            System.out.println("Datos en " + arregloAleatorio [i]);
        }
        
            
            /*double aleatorio = 0;
        for (int i = 1; i <= 10; i++) {
            aleatorio = Math.random() * (1 - 999) + 999;
            aleatorio = (int) aleatorio;
        }
        for (int j = 0; j <= 10; j++) {
            System.out.println(aleatorio);
        }*/ // TODO code application logic here
        {
            
        }
    }

}
