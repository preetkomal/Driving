import java.util.Scanner;

public class Factorial {

    public static void main(String args[]){


        int number = 0;
        long factorial = 1;
        int i;


        Scanner scanner= new Scanner(System.in);

        System.out.println("PLEASE ENTER THE VALUE: ");

        number = scanner.nextInt();

        for ( i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}








