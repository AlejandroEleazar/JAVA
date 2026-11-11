package libro.T1_ConceptosBasicos;

import java.util.Scanner;

/**
 * 
 * EjercicioP1_3
 * @author ADRR
 * @version 2.0
 * 
 * Modificar "EjercicioP1_2.java" para que pida dos numeros n y m,
 * y nos diga que cantidad le falta a n para ser multiplo de m.
*/

public class EjercicioP1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = num(sc);
        int m = num(sc);

        int canSumar = multiplo(n, m);

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

    static int multiplo (int n, int m){
        int multiplo = 0;
        int i = 1;

        while (true) {

            int res = m - n;
            

            if (res >= 0) {

                multiplo = res;
                break;

            }else{

                i++;
                m = m * i;
                
            }
        }

        return multiplo;
    }
}
