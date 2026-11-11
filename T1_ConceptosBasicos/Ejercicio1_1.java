package libro.T1_ConceptosBasicos;

import java.util.Scanner;

//Pedir numero al usuario y mostrarlo por pantalla

class Main {

    public static void main(String[] args) {

       boolean condition = true; 
       while (condition) {
            try {

                System.out.print("Introduce tu edad: ");

                int num = number();

                System.out.println("tu edad es: " + num);

                condition = false;

            } catch (Exception e) {
 
                System.out.println("Error en la edad");
            }
       }
        
    }

    public static  int number(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        return  num;
    }
    
}