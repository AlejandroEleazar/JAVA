package libro.T2_Condicionales;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * Ejercicio2_7
 * 
 * Pedir 3 números y mostrarlos ordenados de mayor a menor.
 * 
 * @author ADRR
 * @version 1.0
 */

public class Ejercicio2_7 {
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            Integer [] listNums = readNumber(sc);
            

           for (int i : listNums) {
            System.out.printf("%d ", i);
           }
        }
    }

    /**
     *  Solicita y valida la introducción de tres números enteros por teclado
     * y los ordena de mayor a menor.
     * 
     * @param sc objeto Scanner utilizado para leer la entrada.
     * @return array con los tres números enteros ordenados de mayor a menor.
     */
    private static Integer[] readNumber (Scanner sc){

        Integer [] listNums = new Integer[3];

        for(int i = 0; i < 3; i++){
            System.out.printf("Inserte el %dº número: ", (i+1));

            while (!sc.hasNextInt()) {
                System.out.println("ERROR: introduce un número entero: ");
                sc.next();
            }

            listNums[i] = sc.nextInt();
        }

        // Ordena el array de forma decreciente.
        Arrays.sort(listNums,  Collections.reverseOrder());

        return listNums;

    }
}
