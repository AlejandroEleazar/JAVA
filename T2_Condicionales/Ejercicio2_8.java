package libro.T2_Condicionales;

import java.util.Scanner;

/**
 * 
 * Ejercicio2_8
 * 
 * Pedir los coeficientes de una ecuación de 2º grado y mostrar sus soluciones reales.
 * Si no exiten, debe indicarlo. 
 * 
 * 
 * La formula de una ecuación de segundo grado es: 
 * x = (-b +- √ b² - 4*a*c) / 2 * a
 * 
 * @author ADRR
 * @version 1.0
 */

public class Ejercicio2_8 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) { //Try-With-resources, cierra automaticamente el Scanner.
            int a = readNumber(sc, 'a');
            int b = readNumber(sc, 'b');
            int c = readNumber(sc, 'c');
            
            calculatingQuadraticEquation(a, b, c);
        } 
    }


    /**
     * Leer y validar los números introducidos por teclado.
     * 
     * @param sc Objeto Scanner utilizado para leer la entrada.
     * @param letra Letra del coeficiente que se solicita (a, b, o c).
     * @return El número introducido por el usuario.
     */
    private static int readNumber(Scanner sc, char letra){

        System.out.printf("Introduce el coeficiente de %c: ", letra);

        while (!sc.hasNextInt()) {
            System.out.print("ERROR: introduzca un coeficiente valido: ");
            sc.next();
        }

        return sc.nextInt();
    }


    /**
     * Calcula las soluciones reales de una ecuación de segundo grado
     * y muestra el resultado por pantalla.
     * 
     * @param a Coeficiente de a de la ecuación.
     * @param b Coeficiente de b de la ecuación.
     * @param c Coeficiente de C de la ecuación.
     */
    private static void calculatingQuadraticEquation(int a, int b, int c){

        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado.");
           
        }

        double discriminante = (Math.pow(b, 2) - (4*a*c));

        if (discriminante > 0) {
            double x1 = ((-b + Math.sqrt(discriminante)) / (2*a));
            double x2 = ((-b - Math.sqrt(discriminante)) / (2*a));

            System.out.printf("Esta ecuación tiene dos soluciones reales:%n X1 = %.2f%n X2 = %.2f%n", x1, x2);
        } else if(discriminante == 0) {
            double x = -b / (2 * a);

            System.out.printf("Esta ecuación tiene solo una solución real:%n X = %.2f%n", x);
        }else{
            System.out.println("La ecuacion no tiene soluciones reales.");
        }
    }
}
