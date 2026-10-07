import java.util.*;
public class CalculatorSwitchCase{
    public static void main(String args[]){
        System.out.println(" A-Addition \n B-Subtraction \n C- Multiplication \n D- Division");
    
        Scanner myObj = new Scanner(System.in);
    char choice= myObj.next().charAt(0);
    switch(choice)
    {
        case 'A':
            case 'a':
            System.out.println("Enter First Number- ");
            double A= myObj.nextDouble();
                        System.out.println("Enter Second Number- ");
                                    double B= myObj.nextDouble();
                                    System.out.println("Addition "+(A+B));
                                    break;
        case 'B':
                        case 'b':

            System.out.println("Enter First Number- ");
            double C= myObj.nextDouble();
                        System.out.println("Enter Second Number- ");
                                    double D= myObj.nextDouble();
                                    System.out.println("Subtraction "+(C-D));
                                    break;
        case 'C':
                        case 'c':

            System.out.println("Enter First Number- ");
            double E= myObj.nextDouble();
                        System.out.println("Enter Second Number- ");
                                    double F= myObj.nextDouble();
                                    System.out.println("Product "+(E*F));
                                    break;
        case 'D':
                        case 'd':

            System.out.println("Enter First Number- ");
            double G= myObj.nextDouble();
                        System.out.println("Enter Second Number- ");
                                    double H= myObj.nextDouble();
                                    System.out.println("Quotient "+(G/H));
                                    break;


            
            
    }
    
        
    

    
    
    
    
    
}
}