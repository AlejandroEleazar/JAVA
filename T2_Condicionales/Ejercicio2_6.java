package libro.T2_Condicionales;

import java.util.Scanner;

/**
 * 
 * Ejercicio2_6
 * 
 * Pedir  dos números y mostrarlos ordenados de forma decreciente.
 * 
 * @author ADRR
 * @version 1.0
 */

public class Ejercicio2_6 {
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) { // Try-with-resources para cerrar el Scanner al final del bloque.
            
            int num1 = readNumber(sc, 1);
            int num2 = readNumber(sc, 2);

            System.out.printf("Orden decreciente: %d, %d%n",
                Math.max(num1, num2),
                Math.min(num1, num2));

        }

    }

    /**
     * Solicita y valida la introduccion de un número entero por teclado.
     * 
     * @param sc objeto Scanner utilizado para leer la entrada.
     * @param orden posición de los números.
     * @return el número entero introducido.
     */
    private static int readNumber(Scanner sc, int orden){

        System.out.printf("Introduce el %dº numero: ", orden);

        while (!sc.hasNextInt()) {
            System.out.println("ERROR: Introduce un número valido");
            sc.next();
        }

        return sc.nextInt();
    }

}
