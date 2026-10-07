import java.util.*;
public class  ComputationOfExpression{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter X: ");
    double X= myObj.nextDouble();
    System.out.println("Enter a Y: ");
    double Y= myObj.nextDouble();
    System.out.println("Enter Z: ");
    double Z= myObj.nextDouble();
    double f= (1/Math.pow(X, 2)+1/Math.pow(Y, 3)+1/Math.pow(Z, 4));
    System.out.print(f);
}
}