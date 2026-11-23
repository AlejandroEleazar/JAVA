package libro.T2_Condicionales;

import java.util.Scanner;

/**
 * 
 * Ejercicio2_9
 * 
 * Aplicación que indica cuántas cifras tiene un número entero
 * introducido por teclado, comprendido entre 0 y 99.999.
 * 
 * @author ADRR
 * @version 1.0
 */

public class Ejercicio2_9 {
    
    final static  int MAX_RANGE_VALUE = 99999; //Valor máximo permitido.
    final static  int MIN_RANGE_VALUE = 0; //Valor mínimo permitido.

    public static void main(String[] args) {

        //Try-with-resources Cierra automaticamente el objeto Scanner cuando termina el programa.
        try (Scanner sc = new Scanner(System.in)) { 

            int num = readNumber(sc);

            System.out.printf("El numero que has introducido tiene %d cifras. %n", countDigits(num));
            
        } 


    }

    /**
     * Lee y valida el numero introducido por el usuario.
     * 
     * @param sc Objeto Scanner utilizado para leer la entrada por teclado.
     * @return El número entero valido introducido por el usuario.
     * 
     */
    private static int readNumber(Scanner sc){

        while (true) {
            while (true) {

            System.out.printf(
                "Introduce un número entero entre %d y %d: ",
                MIN_RANGE_VALUE,
                MAX_RANGE_VALUE
            );

            if (!sc.hasNextInt()) {
                System.out.println("ERROR: Debes introducir un número entero.");
                sc.next();
                continue;
            }

            int number = sc.nextInt();

            if (!isInRange(number)) {
                System.out.println("ERROR: El número está fuera del rango permitido.");
                continue;
            }

            return number;
        }

        }

    }

    /**
     * Comprueba que el numero esta dentro del rango establecido.
     * 
     * @param num Número entero que se va a comprobar.
     * @return {@code True} El número esta dentro del rango.
     *         {@code False} El número no esta dentro del rango.
     * 
     */
    private static boolean isInRange (int num){
        return MIN_RANGE_VALUE<= num && num <= MAX_RANGE_VALUE;
    }

    /**
     * Cuenta el número de dígitos que tiene el número introducido.
     * 
     * @param num Número entero del que se van a contar los dígitos.
     * @return Número de dígitos del número introducido.
     * 
     */
    private static int countDigits(int num){
        return String.valueOf(Math.abs(num)).length();
    }

}
