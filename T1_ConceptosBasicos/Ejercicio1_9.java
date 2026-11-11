package libro.T1_ConceptosBasicos;

import java.util.Locale;
import java.util.Scanner;

//Modificar ejercicio 1_8 para que los precios de la fruta los introduzca el usuario

public class Ejercicio1_9 {
    public static void main(String[] args) {
    
       
        double PMANZANAS, PPERAS;

        int [] trimestresManzanas = new int[4];
        int [] trimestresPeras = new int[4];

        Scanner sc = new  Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce precio manzanas: ");
        PMANZANAS = precios(sc);
        System.out.print("Introduce precio peras: ");
        PPERAS = precios(sc);

        for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 4; j++) {
                if (i == 0) {
                    System.out.print("Inserte los KG de manzanas del " + (j+1) + "º trimestre: ");
                    trimestresManzanas[j] = trimestres(sc);
                } else {
                    System.out.print("Inserte los KG de Peras del " + (j+1) + "º trimestre: ");
                    trimestresPeras[j] = trimestres(sc);
                }
           }
        }

        System.out.println("Beneficios Manzanas: " + (trimestresManzanas[0] + trimestresManzanas[1] + trimestresManzanas[2] + trimestresManzanas[3]) * PMANZANAS + " Euros");
        System.out.println("Beneficios Peras: " + (trimestresPeras[0] + trimestresPeras[1] + trimestresPeras[2] + trimestresPeras[3]) * PPERAS + " Euros");

        sc.close();
    }

    public static int trimestres(Scanner sc){
        
        boolean condition = true;
        int num = 0;
        
        while (condition) {
            try {

                num = sc.nextInt();
                condition = false;

            } catch (Exception e) {

                System.out.println("ERROR: Dato no valido");
                sc.next();

            }    
        }
        
        return num;
    }

    public static double precios(Scanner sc){
        
        boolean condition = true;
        double num = 0;
        
        while (condition) {
            try {

                num = sc.nextDouble();
                condition = false;

            } catch (Exception e) {

                System.out.println("ERROR: Dato no valido");
                sc.next();

            }    
        }
        
        return num;
    }
}
