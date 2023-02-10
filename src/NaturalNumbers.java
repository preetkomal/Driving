import java.util.Scanner;
public class NaturalNumbers {

    public static void main(String args[]){


        int x;
        int i = 1 ;
        int sum = 0;

        System.out.println("ENTER THE VALUE :");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        while(i <= x)
        {
            sum= sum +i;
            i++;
        }
        System.out.println("Sum of "+x+" numbers is :"+ sum);
    }

}
