package libro.T1_ConceptosBasicos;

import java.util.Locale;
import java.util.Scanner;

//Programa que calcule la longitud y el area de una circunferencia.
//El usuario debe introducir el Radio ( puede tener decimales)
//Longitud = 2π * radio
//Área = π * radio2

public class Ejercicio1_10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double radio = radio(sc);

        System.out.println("El area de la circunferencia es: " + area(radio));
        System.out.println("La longitud de la circunferencia es: " +longitud(radio));

        sc.close();
    }

    public static double radio(Scanner sc){
        
        boolean condition = true;
        double radio = 0;

        while (condition) {
            try {
                
                System.out.print("Introduce el radio de la circunferencia: ");
                radio = sc.nextDouble();

                condition = false;

            } catch (Exception e) {

                System.out.println("ERROR: Dato no valido");
                sc.next();

            }
        }

        return radio;
    }

    public static double longitud(double radio){

        return (2 * Math.PI * radio);
    }

    public static double area(double radio){

        return (Math.PI * Math.pow(radio, 2));
    }


}
