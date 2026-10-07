import java.util.*;
public class  RoundOff{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter X: ");
    double X= myObj.nextDouble();
    System.out.println(Math.ceil(X));
    System.out.println(Math.floor(X));
    System.out.println(Math.round(X));
    
}
}