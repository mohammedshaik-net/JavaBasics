import java.util.*;
public class  VelocityFinder{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a Initial Velocity: ");
    double InitialVelocity= myObj.nextDouble();
    System.out.println("Enter a Final Velocity: ");
    double FinalVelocity= myObj.nextDouble();
    double Acceleration = 9.8;
    System.out.println("Enter Displacement: ");
    double Displacement= myObj.nextDouble();
    double V=Math.sqrt((Math.pow(InitialVelocity, 2)+2*(Acceleration*Displacement)));
    System.out.print("The Velocity Is "+(V)+"m/s2");
    }
}