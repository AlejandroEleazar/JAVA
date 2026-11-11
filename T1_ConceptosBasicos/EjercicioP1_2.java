package libro.T1_ConceptosBasicos;

import java.util.Scanner;

/**
 * Programa que tome como entrada un número entero y nos indique que cantidad hay que sumarle
 * para que el resultado sea múltiplo de 7.
*/

public class EjercicioP1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = num(sc);

        int canSumar = multiploSiete(num);

        System.out.println("Hay que sumar : " + canSumar);

        sc.close();
    }

    static int num (Scanner sc){
        
        int num;

        while (true) {
            try {
                
                System.out.print("Introduce un numero entero: ");
                num = sc.nextInt();

                break;
            } catch (Exception NumberFormatException) {
                System.out.println("ERROR: Valor no valido. Vuelva a introducirlo");
                sc.next();
            }
        }

        return num;
    }

    static int multiploSiete (int num){
        int multiplo = 0;
        int siete = 7;
        int i = 1;

        while (true) {

            int res = siete - num;
            

            if (res >= 0) {

                multiplo = res;
                break;

            }else{

                i++;
                siete = siete * i;
                
            }
        }

        return multiplo;
    }
}
