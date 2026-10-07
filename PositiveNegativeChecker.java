import java.util.*;
public class PositiveNegativeChecker{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int N = myObj.nextInt();
        if (N>0){
            System.out.println("The Number Entered is Positive");
                
            }
            else if(N<0){
                  System.out.println("The Number Entered is Negative");
            }
            else{
                  System.out.println("The Number Entered is 0");
            }
        }
    }
