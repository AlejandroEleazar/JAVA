package libro.T1_ConceptosBasicos;

import java.util.Locale;
import java.util.Scanner;

// pedir numero decimal y lo muestre redondeado al entero mas proximo

public class Ejercicio1_7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Inserte un numero decimal: ");

        double num = num(sc);

        System.out.println("El numero redondeado es: " + redondeo(num));

        sc.close();
    }
    
    public static double num(Scanner sc){
        boolean condition = true;

        double num = 0;

        while (condition) {
            try {
                num = sc.nextDouble();

                condition = false;

            } catch (Exception e) {
                System.out.println("ERROR: valor no valido. Vuelva a introducirlo");
                sc.next();
            }
        }

        return num;

    }

    public static int redondeo(double num){
        return (int) Math.round(num);
    }
}
