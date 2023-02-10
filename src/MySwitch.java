import java.util.Scanner;

public class MySwitch {

    public static void main(String[] args){

        String value;
        System.out.println("press A if you  want to fly");
        System.out.println("press B if you want to drive");
        System.out.println("press C if you want to walk");
        System.out.println("press D if you want to take bus");

        Scanner scanner =new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR CHOICE");
        value= scanner.nextLine();
        char val2 =value.charAt(0);

        switch(value){
            case "A":
                System.out.println("You are going to FLY");
                break;
                case "b":
                System.out.println("You are going to DRIVe");
                break;
            case "c":
            System.out.println("You are going FOR a2" +
                    " WALK");
            break;
            case "d":
            System.out.println("You are going to take  TRANSIT");
            break;
            default:
                System.out.println("TRY AGAIN PLEASE");




        }






    }
}
