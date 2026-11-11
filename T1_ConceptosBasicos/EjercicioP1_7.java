package libro.T1_ConceptosBasicos;

import java.util.Scanner;

public class EjercicioP1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int milimetros, centimetros, metros;

        System.out.print("Introduce los milimetros: ");
        milimetros = pedirNum(sc);

        System.out.print("Introduce los centimetros: ");
        centimetros = pedirNum(sc);

        System.out.print("Introduce los metros: ");
        metros = pedirNum(sc);

        System.out.println("En total son : " + calculo(metros, milimetros, centimetros) + " Cm");

        sc.close();
    }

    static int pedirNum (Scanner sc){

        while (!sc.hasNextInt()) {

            System.out.println("ERROR: Dato no valido");
            sc.next();
        }

        return sc.nextInt();
    }

    static int calculo(int metros, int milimetros, int centimetros){
        return (metros * 100) + centimetros + (milimetros / 10);
    }
}
