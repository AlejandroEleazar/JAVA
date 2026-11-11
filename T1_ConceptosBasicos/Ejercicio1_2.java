package libro.T1_ConceptosBasicos;

import java.util.Scanner;

// Pedir edad al usuario y mostrar la que tendra el año que viene

public class Ejercicio1_2 {
    public static void main(String[] args) {
        
        boolean condition = true;
        while (condition) {
            try {
                
                System.out.print("Introduce tu edad: ");
                int num = number();
                System.out.println("Su edad actual es: " + num);
                System.out.println("El año que viene tendra: " + (num + 1));
                condition = false;
            } catch (Exception e) {
                System.out.println("ERROR: Edad no valida");
            }
        }
    }

    public static int number(){
    
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        return num;
    }
}
