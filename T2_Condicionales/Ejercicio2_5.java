package libro.T2_Condicionales;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio2_5
 * 
 * Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero.
 * Se considera casi-cero cualquier número comprendido entre -1 y 1,
 * excluyendo el 0.
 * 
 * @author ADRR
 * @version 1.0
 */

public class Ejercicio2_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        isNearZero(readNumber(sc));

        sc.close();
        
    }


    /**
     * solicita y valida la entrada de un numero por teclado.
     * 
     * @param sc objeto Scanner utilizado para leer entrada.
     * @return el número introducido por el usuario.
     */
    private  static double readNumber(Scanner sc){

        System.out.print("Inserte el numero: ");

        while (!sc.hasNextDouble()) {
            System.out.println("ERROR: Introduce un número válido: ");

            sc.next();
        }

        return sc.nextDouble();
    }

    /**
     * Comprueba si el numero es casi-cero y muestra un mensaje.
     * 
     * @param num numero de referencia.
     */
    private static void isNearZero(double num){
        if (-1< num && num != 0 && num < 1) {
            System.out.println("El número introducido es casi-cero");
        }else{
            System.out.println("El número no es casi-cero");
        }
    }
}
