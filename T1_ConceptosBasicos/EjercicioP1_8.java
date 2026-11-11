package libro.T1_ConceptosBasicos;

import java.util.Scanner;

/**
 * 
 * EjercicioP1_8
 * 
 * @author ADRR
 * @version 1.0
 * 
 * Aplicacion que ayude a contabilizar el numero de patas que tienen en total todos los animales capturadors durante
 * una jornada de trabajo. Pedira el numero total de hormigas (6 patas), arañas (8 patas), cochinillas (14 patas). 
 * La aplicacion tendra que mostrar el numero total de patas.
 */

public class EjercicioP1_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] numAnimales = new int[3];

        System.out.print("Introduce el numero de hormigas capturadas: ");
        numAnimales[0] = pedirNum(sc);

        System.out.print("Introduce el numero de arañas capturadas: ");
        numAnimales[1] = pedirNum(sc);

        System.out.print("Introduce el numero de cochinillas capturadas: ");
        numAnimales[2] = pedirNum(sc);

        System.out.println("El total de patas es: " + totalPatas(numAnimales));
    }

    static int pedirNum(Scanner sc){

       while (true) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();

                if (num >= 0) {
                    return num;
                }
            } else {
                sc.next();
            }

            System.out.println("ERROR: Introduce un número entero no negativo.");
        }
    }

    static int totalPatas(int [] numAnimales){
        return ( numAnimales[0] * 6 ) + ( numAnimales[1] * 8 ) + ( numAnimales[2] * 14 );
    }
}
