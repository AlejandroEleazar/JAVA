import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int n = number();

        System.out.print("You enter: " + n + "\n");

    }

    private static int number(){
       while(true){
           try{
               System.out.print("Enter a number: ");
               Scanner sc = new Scanner(System.in);
               return sc.nextInt();
           }catch (Exception e){
               System.out.println("You entered an invalid number");
           }
       }
    }
}


