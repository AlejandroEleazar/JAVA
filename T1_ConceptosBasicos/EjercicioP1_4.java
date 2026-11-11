package libro.T1_ConceptosBasicos;

import java.util.Scanner;

/**
 * 
 * EjercicioP1_4
 * 
 * @author ADRR
 * @version 1.0
 * 
 * Programa que pida la base y la altura de un triángulo y muestre su área
 * area = base * altura / 2
 * 
 */

public class EjercicioP1_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del triangulo: ");
        int altura = num(sc);

        System.out.print("Introduce la base del triangulo: ");
        int base = num(sc);

        System.out.println("El area del triangulo es: " + area(altura, base));

    }

    static int num(Scanner sc){
        int num;

        while (true) {
            try {
                
                num = sc.nextInt();

                break;
                
            } catch (Exception NumberFormatException) {
                System.out.println("ERROR: Valor no valido. Vuelva a introducirlo");
                sc.next();
            }
        }

        return num;
    }

    static int area(int altura, int base){
        return (base * altura / 2);
    }
}
