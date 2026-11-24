package libro.KnowledgeBase.T2_Condicionales.Ejercicios;

import java.util.Scanner;

/**
 * 
 * Ejercicio2_10
 * 
 * Pedir un número entre 0 y 99999 y decir si es capicua.
 * 
 * @author ADRR
 * @version 1.0
 */
public class Ejercicio2_10 {

    final static int MAX_RANGE_VALUE = 99999; //Valor máximo permitido.
    final static int MIN_RANGE_VALUE = 0; // Valor mínimo permitido.
    
    public static void main(String[] args) {
        
        // Try-with-resources Cierra el objeto Scanner automaticamente.
        try (Scanner sc = new Scanner(System.in)) { 
        
            int num = readNumber(sc);

            System.out.printf(
                "El número %d %s", 
                num, 
                isPalindrome(num)? "es capicua" : "no es capicua"
            );
        }
    }

    /**
     * Lee y valida el número entero introducido por el usuario.
     * 
     * @param sc Objeto Scanner utilizado para leer la entrada por teclado.
     * @return El número entero valido introducido por el usuario.
     */
    private static int readNumber(Scanner sc){
        while (true) {
            
            System.out.printf(
                "Introduce un número entero entre %d-%d: ", 
                MIN_RANGE_VALUE, 
                MAX_RANGE_VALUE
            );

            if (!sc.hasNextInt()) {
                System.out.println("ERROR: Introduce un número entero");
                sc.next();
                continue;
            }

            int num = sc.nextInt();

            if (!isInRange(num)) {
                System.out.printf(
                    "ERROR: El número no esta entre %d-%d%n", 
                    MIN_RANGE_VALUE, 
                    MAX_RANGE_VALUE
                );

                continue;
            }

            return num;
        }
    }

    /**
     * Comprueba que el valor esta dentro del rango establecido.
     * 
     * @param num Número entero que se va a comprobar.
     * @return {@code true} número dentro del rango.
     *         {@code false} número fuera del rango.
     */
    private static boolean isInRange(int num){
        return num >= MIN_RANGE_VALUE && num <= MAX_RANGE_VALUE;
    }


    /**
     * Comprueba si un número es capicúa comparándolo con su inverso.
     * 
     * @param num1 Número que se desea comprobar.
     * @return {@code true} son iguales.
     *         {@code false} son diferentes.
     */
    private static boolean isPalindrome(int num1){
        int original = num1;
        int reversed = 0;

        while (num1 > 0) {
            reversed = reversed * 10 + num1 % 10;
            num1 /= 10;
        }

        return original == reversed;
    }

}
