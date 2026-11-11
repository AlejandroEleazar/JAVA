package libro.T1_ConceptosBasicos;

import java.util.Scanner;

//Aplicación que pida el año actual y el de nacimiento del usuario. debe calcular su edad suponiendo que en el año actual el usuario ya ha cumplido años

public class Ejercicio1_3 {
    public static void main(String[] args) {
       
        boolean condition = true;
        Scanner sc = new  Scanner(System.in);

        while (condition) {
            try {
                System.out.print("Introduzca el año actual: ");
                int aActual = year(sc);
                System.out.print("Inserte su año de nacimiento: ");
                int aNacimiento = year(sc);
                System.out.println("Tienes " + (aActual - aNacimiento ) + " años");
                condition = false;
            } catch (Exception e) {
                System.out.println("ERROR: numero no valido");
            }
        }

        sc.close();
    }

    public static int year(Scanner sc){
        int num = sc.nextInt();
        return num;
    }
}
