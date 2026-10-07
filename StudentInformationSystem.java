import java.util.*;
public class StudentInformationSystem{
    public static void main(String args []){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = myObj.next();
        
        System.out.println("Enter Roll No.: ");
        int RollNum = myObj.nextInt();
        
        System.out.println("Enter Class: ");
        int ClassN = myObj.nextInt();
        
        System.out.println("Enter Marks: ");
        int Marks = myObj.nextInt();
        
        System.out.println("Name: "+name);
                
        System.out.println("Roll Number: " + RollNum);
                
        System.out.println("ClasS: "+ ClassN);
        
        System.out.println("Marks : " +Marks);
        
        if (Marks>40)
        System.out.println("Pass");
        else
        System.out.println("Fail");

        
        
        
        
        
    }
}
