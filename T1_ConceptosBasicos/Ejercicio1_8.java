package libro.T1_ConceptosBasicos;

import java.util.Scanner;

/*
    Programa para calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
    solicita las ventas en kilos de cada trimestre para cada frut.
    la aplicacion mostrara el importe total sabiendo que el precio del kilo de manzanas esta fijado en 
    2.35 euros y el de peras 1.95 euros

*/
public class Ejercicio1_8 {
    public static void main(String[] args) {

        final double PMANZANAS = 2.35;
        final double PPERAS = 1.95;

        int [] trimestresManzanas = new int[4];
        int [] trimestresPeras = new int[4];

        Scanner sc = new  Scanner(System.in);

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

}
