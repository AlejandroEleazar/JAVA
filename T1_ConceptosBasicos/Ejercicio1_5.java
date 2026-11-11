package libro.T1_ConceptosBasicos;

import java.util.Scanner;

//Calcular media de dos notas enteras

public class Ejercicio1_5 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserte nota 1: ");
        
        int nota1 = num(sc) ;
        
        System.out.print("Inserte nota 2: ");
        
        int nota2 = num(sc) ;

        System.out.println("La nota media es: " + media(nota1, nota2));

        sc.close();

    }

    public static int num (Scanner sc){
        boolean condition = true;
        int num = 0;

        while (condition) {
            try {
                num = sc.nextInt();

                condition = false;

            } catch (Exception e) {
                System.out.println("ERROR: valor no valido");
            }
        }

        return num;
    }

    public static double media(int nota1, int nota2){
        
        return (nota1 + nota2) / 2;
    }
}
