package libro.T2_Condicionales;

import java.util.Scanner;

/**
 * 
 * Ejercicio2_1
 * 
 * @author ADRR
 * @version 1.0
 * 
 * Diseñar una aplicacion que solicite un numero entero e indique si es par o impar
 * 
 */

public class Ejercicio2_1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero para ver si es par o impar: ");
        int num = leerNum(sc);

        System.out.println("El numero introducido es: " + comprobarPar(num));

        sc.close();

    }

    static int leerNum (Scanner sc){

        while (!sc.hasNextInt()) {
            System.out.println("ERROR: Dato no valido");
            sc.next();
        }

        return sc.nextInt();
    }

    static String comprobarPar(int num){
        return ( num % 2 == 0) ? "par" : "impar";
    }

}
