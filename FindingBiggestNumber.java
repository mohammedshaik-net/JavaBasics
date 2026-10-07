import java.util.*;
public class FindingBiggestNumber{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter A Number1: ");
        int a = myObj.nextInt();
        System.out.println("Enter A Number2: ");
         int b = myObj.nextInt();
        System.out.println("Enter A Number3: ");
        int n = myObj.nextInt();                          
       System.out.println((a>b)?(n>a)?"The Biggest No. is "+n:"The Biggest No. is "+a:(b>a)?"The Biggest No. is "+b:"The Biggest No. is "+a);
       
    }
}
