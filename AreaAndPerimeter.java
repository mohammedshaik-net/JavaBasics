import java.util.*;
public class AreaAndPerimeter{
    public static void main (String[]args){
        Scanner myObj = new Scanner (System.in);
        System.out.println("Enter the Length: ");
        double length = myObj.nextDouble();
                System.out.println("Enter the Breadth: ");
        double breadth = myObj.nextDouble();
        double Area = (length*breadth);
         System.out.println("The Area is "+Area);
         double perimeter= 2*(length*breadth);  
         System.out.println("The perimeter is: "+perimeter);
    }
}