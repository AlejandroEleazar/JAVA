package libro.T1_ConceptosBasicos;

import java.util.Locale;
import java.util.Scanner;

/*
Programa para realizar calculos con el IVA. Debe solicitar la base imponible y el IVA.
Mostrar en pantalla el importe correspondiente al IVA y el total.
*/

public class EjercicioP1_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double bImponible = bImponible(sc);
        int iva = iva(sc);

        double pIva = pIva(bImponible, iva);

        System.out.println("El importe correspondiente del IVA es: " + pIva + " Euros");
        System.out.println("El total es: " + (bImponible + pIva) + " Euros");

        sc.close();
    }

    static double bImponible(Scanner sc){
        
        boolean condition = true;
        double bImponible = 0;

        while (condition) {
            try {
                
                System.out.print("Introduce la base imponible: ");
                bImponible = sc.nextDouble();

                condition = false;

            } catch (Exception e) {

                System.out.println("ERROR: Dato no valido");
                sc.next();

            }
        }

        return bImponible;
    }

    static int iva(Scanner sc){
        boolean condition = true;
        int iva = 0;

        while (condition) {
            try {
                
                System.out.print("Introduce el iva: ");
                iva = sc.nextInt();

                condition = false;

            } catch (Exception e) {

                System.out.println("ERROR: Dato no valido");
                sc.next();

            }
        }

        return iva;
    }

    static double pIva(double bImponible, int iva){
        return (bImponible * ((double) iva / 100));
    }
}
