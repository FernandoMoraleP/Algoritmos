
package T4.ex;


public class factorial {

    static int factorial (int numero) {
        if (numero == 0) 
            return 1;
        else 
            return numero * factorial(numero-1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial de 3 es: " + factorial(3));
    }
    
}
