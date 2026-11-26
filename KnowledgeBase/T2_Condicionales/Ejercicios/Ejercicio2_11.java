package libro.KnowledgeBase.T2_Condicionales.Ejercicios;

import java.util.Scanner;

/**
 * 
 * Ejercicio2_11
 * 
 * Pedir una nota de 0 a 10 y mostrarla de la forma: 
 *  - Insuficiente (0-4).
 *  - Suficiente (5).
 *  - Bien (6).
 *  - Notable (7-8).
 *  - Sobresaliente (9-10).
 * 
 * @author ADRR
 * @version 1.0
 */
public class Ejercicio2_11 {

    private static final int MIN_RANGE_VALUE = 0; //Valor máximo permitido.
    private static final int MAX_RANGE_VALUE = 10; //Valor mínimo permitido.
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) { //Try-with-resources Cierra el objeto Scanner automaticamente.
            
            int num = readNumber(sc);
            System.out.printf("Has sacado un %s%n", grade(num));

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
                "Introduce una nota del %d - %d: ", 
                MIN_RANGE_VALUE, 
                MAX_RANGE_VALUE
            );

            if (!sc.hasNextInt()) {
                System.out.println("ERROR: Introduce un valor valido.");
                sc.next();
                continue;
            }

            int num = sc.nextInt();

            if (num >= MIN_RANGE_VALUE && num <= MAX_RANGE_VALUE) {
                return num;
            }

            System.out.printf(
                "ERROR: valor fuera de rango %n"
            );

        }

    }

   /**
    * Valor escrito para cada rango de notas.
    * 
    * @param num Número entero del que se le va a asignar un valor escrito.
    * @return El valor escrito para cada rango.
    */
    private static String grade(int num){
        switch (num) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return "Insuficiente.";
            case 5:
                return"Suficiente.";
            case 6:
                return"Bien.";
            case 7:
            case 8:
                return"Notable.";
            default:
                return"Sobresaliente.";
        }
    }
    
}
