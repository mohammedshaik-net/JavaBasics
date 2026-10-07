import java.util.*;
public class SimpleTaxation{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Your Gender: ");
        char Gender = myObj.next().charAt(0);
        System.out.println("Enter Your Age: ");
        int Age = myObj.nextInt();
        System.out.println("Enter Your Amount: ");
        double Amount = myObj.nextDouble();
         double Tax1= 25/100*Amount;
                  double Tax2= 15/100*Amount;
                   double Tax3= 5/100*Amount;
                  double Tax4= 3/100*Amount;

    if(Age<60){
        switch(Gender){
        
                case 'M':
                 
                    System.out.println("The Tax is " + (Tax1));
                    case 'F':
                    System.out.println("The Tax is"+(Tax2));
                    
                    
                
            
            
        }
        
            
        }
        else{
            switch(Gender){
                
                case 'M':
                 
                    System.out.println("The Tax is " + (Tax3));
                    case 'F':
                    System.out.println("The Tax is"+(Tax4));
                    
                
            }
        }
    }
        
        
    
}