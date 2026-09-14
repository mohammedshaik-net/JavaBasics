import java.util.*;
public class CALCULATOR{
    public static void main(String[]args){
        Scanner myObj = new Scanner (System.in);
        System.out.println("Enter NUmber 1: ");
        double A = myObj.nextDouble();
         System.out.println("Enter NUmber 2: ");
        double B = myObj.nextDouble();
        double sum = A+B;
        System.out.println("the Sum of the digits is: " +sum);
    }
}