package libro.T2_Condicionales;

import java.util.Scanner;

/**
 * 
 * Ejercicio2_3
 * 
 * Solicita dos números enteros distintos y mostrar cúal es el mayor.
 * 
 * @author ADRR
 * @version 1.0
 */

public class Ejercicio2_3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) { //Try-with-resources para cerrar el Scanner al final del bloque
            int num1 = readNumber(sc, 1);
            int num2 = readNumberUntilDifferent(num1, sc);

            System.out.printf("El número mayor es: %d.%n", isGreater(num1, num2)? num1 : num2);
        }
        
    }

    /**
     * Solicita y valida la introducción de un número entero por teclado.
     * 
     * @param sc objeto Scanner utilizado para leer entrada.
     * @param orden posición del numero que se solicita.
     * @return El número introducido por el usuario.
     */
    private static int readNumber(Scanner sc, int orden){
        
        System.out.printf("Inserte el %dº número para la comparación: ", orden);

        while (!sc.hasNextInt()) {
            System.out.println("ERROR: Introduce un número entero válido: ");
            sc.next();
        }

        return sc.nextInt();
        
    }

    /**
     * Solicita un segundo número entero hasta que sea diferente del primero.
     * 
     * @param num1 primer número entero de referencia.
     * @param sc objeto Scanner utilizado para leer entrada.
     * @return segundo número entero, distinto de num1.
     */
    private static int readNumberUntilDifferent(int num1, Scanner sc){

        int num;

        do {
            num = readNumber(sc, 2);

            if (!areDifferent(num1, num)) {
                System.out.println("ERROR: Los numeros deben de ser distintos.");
            }

        } while (!areDifferent(num1, num));

        return num;
    }

    /**
     * Comprueba si dos números enteros son diferentes.
     * 
     * @param num1 Primer número entero que se va a comparar.
     * @param num2 Segundo número entero que se va a comparar.
     * @return {@code true} si ambos son distintos;
     *         {@code false} en caso contrario.
     */
    private static boolean areDifferent(int num1, int num2){
        return num1 != num2;
    }

    /**
     * Comprueba si el primer número es mayor que el segundo.
     * 
     * @param num1 primer número entero que se va a comparar.
     * @param num2 segundo número entero que se va a comparar.
     * @return {@code true} si el primer número es mayor; 
     *         {@code false} en caso contrario.
     */
    private static boolean isGreater(int num1, int num2){
        return num1 > num2;
    }

}
