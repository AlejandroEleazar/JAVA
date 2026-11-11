package libro.T1_ConceptosBasicos;

import java.util.Scanner;

/**
 * 
 * EjercicioP1_6
 * 
 * @author ADRR
 * @version 1.0
 * 
 * app que solicite al usuario una cantidad de segundos  y la app muestre la equivalencia en horas, minutos, segundos hay en los segundos introducidos por el usuario
 */

public class EjercicioP1_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserte una candidad de segundos: ");
        int seg = pedirSegundos(sc);

        calculo(seg);

        sc.close();

    }

     static int pedirSegundos(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("ERROR: Dato no válido");
            sc.next();
        }

        return sc.nextInt();
    }

     static void calculo(int seg) {
        int horas = seg / 3600;
        int minutos = (seg % 3600) / 60;
        int segundos = seg % 60;

        System.out.println(
            horas + " h " + minutos + " mins " + segundos + " segs"
        );
    }
}


//1h 10 min 30 seg