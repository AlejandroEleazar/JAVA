package libro.T1_ConceptosBasicos;

import java.util.Scanner;

//Media entera de 3 notas

public class Ejercicio1_6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int [] nota = new int[3];
      

        for(int i = 0; i < n; i++ ){
            System.out.print("Escribe la nota" + (i+1) + ": ");
            nota[i] = nota(sc);
        }

        System.out.println("la media es: " + media(nota));

        sc.close();
    }

    public static int nota(Scanner sc){
        boolean condition = true;
        int num = 0;

        while (condition) {
            try {

                num = sc.nextInt();
                condition = false;

            } catch (Exception e) {

                System.out.println("ERROR: Valor no valido. Vuelva a introducir el valor");
                sc.next();
            }
        }

        return num;
    }
    
    public static int media(int [] nota){
        
        return (int) (nota[0] + nota[1] + nota[2])/3;
    }
}
