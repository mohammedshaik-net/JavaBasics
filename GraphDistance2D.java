import java.util.*;
public class GraphDistance2D{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter X Coordinates of Point A");
       double X1 = myObj.nextInt();
        System.out.println("Enter Y Coordinates of Point A");
        double Y1 = myObj.nextInt();
            System.out.println("Enter X Coordinates of Point B");
        double X2 = myObj.nextInt();
        System.out.println("Enter Y Coordinates of Point B");
        double Y2 = myObj.nextInt();
        double d = Math.sqrt(Math.pow((X2-X1),2)+Math.pow((Y2-Y1),2));
        System.out.println("The Distance: " + d);
    
            
        
    }
}