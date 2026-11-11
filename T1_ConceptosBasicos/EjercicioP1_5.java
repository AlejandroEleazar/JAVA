package libro.T1_ConceptosBasicos;

import java.util.Scanner;

/**
 * 
 * EjercicioP1_5
 * 
 * @author ADRR
 * @version 1.0
 * 
 * dado un polinomio de segundo grado
 * 
 * y = ax^2 + bx + c
 * 
 * el programa pide los coeficientes para a, b, c, asi como el valor de x y calcule y
 */
public class EjercicioP1_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, x;

        System.out.println("Introduce el valor de a: " );
        a = nums(sc);

        System.out.println("Introduce el valor de b: " );
        b = nums(sc);

        System.out.println("Introduce el valor de c: " );
        c = nums(sc);

        System.out.println("Introduce el valor de x: " );
        x = nums(sc);

        System.out.println("Y es: " + calculoY(a, b, c, x));
    }


    static int nums (Scanner sc){

        int num;

        while (true) {
            try {

                num =sc.nextInt();
                break;

            } catch (Exception NumberFormatException) {

                System.out.println("ERROR: valor no valido");
                sc.next();
            }
        }

        return num;
    }

    static int calculoY (int a, int b, int c, int x){
        return (int) ((a*(Math.pow(x, 2))) + (b*x) + c);
    }
    
}
