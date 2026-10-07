import java.util.*;
public class SwitchCase{
    public static void main(String args[]){
        System.out.println("Choose Anyone- \n 1. Sunday \n 2. Monday \n 3. Tuesday \n 4. Wednesday \n 5. Thursday\n 6. Friday\n 7. Saturday");       
        System.out.println("Enter the Desired Day's Respective Number");

        Scanner myObj = new Scanner(System.in);
        int Choice = myObj.nextInt();
        switch(Choice){
            case 1:
                System.out.println("Sunday");
                break;
                case 2:
                System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wednesday");
                break;
                case 5:
                System.out.println("Thursday");
                break;
                case 6:
                System.out.println("Friday");
              break;
              case 7:
                System.out.println("Saturday");
                break;
                default:
                System.out.println("Invalid");
                break;
        }
    }
}