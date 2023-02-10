import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        int input;

        System.out.println("Press 1 for spanish");
        System.out.println("Press 2 for french");
        System.out.println("Press 3 for russian");
        System.out.println("Press 4 for exit");

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the user input");
        input = scanner.nextInt();
        switch(input){
            case 1:
            System.out.println(" english");
            break;
            case 2:
                System.out.println(" french");
                break;
            case 3:
                System.out.println(" russian");
                break;
            case 4:
                System.out.println(" EXIT");
                break;

            default:
                System.out.println("Invalid");
        }







        }
}



