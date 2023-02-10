import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String args[])
    {
        int x, reverse=0, rem;
        Scanner scanner = new Scanner(System.in);

        System.out.print("PLEASE ENTER DIGITS ");
        x = scanner.nextInt();

        while(x!=0)
        {
            rem=x%10;



            reverse=reverse*10+rem;
            x/=10;
        }

        System.out.print("DIGITS HAVE BEEN REVERSED = "+reverse);

    }
}




