package libro.T2_Condicionales;

import java.util.Scanner;

/**
 * 
 * Ejercicio2_2
 * Pedir dos numeros enteros y decir si son iguales o no
 * 
 * @author ADRR
 * @version 1.0
 * 
 * 
 */
public class Ejercicio2_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[2];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Introduce el " + (i+1) + " º numero: ");
            nums[i] = leerNum(sc);
        }

        mostrarResultado(nums);

        sc.close();
    }

    /**
     * Leer los numeros introducidos por teclado
     * 
     * @param sc objeto Scanner utilizado para leer la entrada.
     * @return El numero introducido por el usuario
     */

    private static int leerNum(Scanner sc){
        while (!sc.hasNextInt()) {
            System.out.println("ERROR: El valor introducido no es valido, vuelve a introducirlo");
            sc.next();
        }

        return sc.nextInt();
    }

    /**
     * Funcion para comprobar si son iguales
     * 
     * @param num1 primer número entero que se va a comparar.
     * @param num2 segundo número entero que se va a comparar.
     * @return true si los números son iguales; false en caso contrario.
     */
    private static boolean sonIguales(int num1, int num2){
        return num1 == num2;
    }

    /**
     * Muestra por pantalla si los dos números del array son iguales o diferentes.
     * 
     * @param nums array que contiene los dos números enteros que se van a comparar.
     */
    private static void mostrarResultado(int [] nums){
        System.out.printf("Los numeros %d y %d son %s.%n", nums[0], nums[1], sonIguales(nums[0], nums[1])  ? "Iguales" : "Diferentes" );
    }
}
