import java.util.Scanner;
public class ImportScanner
{
 public static void main(String args[]){
    Scanner myObj = new Scanner(System.in);
    char character;
    int integer;
    String name;
    double amount;
    System.out.println("Enter a character: ");
    character = myObj.next().charAt(0);
    System.out.println("Enter a number: ");
    integer= myObj.nextInt();
    System.out.println("Enter a amount: ");
    amount= myObj.nextDouble();
    System.out.println("Enter a Name: ");
    name= myObj.next();
    System.out.println("Character entered: " +character);
    System.out.println("Integer entered: " +integer);
    System.out.println("Amount entered: " +amount);
    System.out.println("Name entered: " + name);
   
    
    
    
    
    
    
    
    
    }

}