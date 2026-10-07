import java.util.*;
public class happyNumber
{
    public static void main (String args [])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter a number.");
        int n=sc.nextInt();
        int originalNumber=n;
        while(n!=1&&n!=4)
        {
            int totalSum=0;
            while(n>0)
            {
                int digit=n%10;
                totalSum+=digit*digit;
                n=n/10;
            }
            n=totalSum;
        }
        if (n==1)
        {
            System.out.println(originalNumber+"is a happy number.");
        }
        else
        {
            System.out.println(originalNumber+"is not a happy number.");
        }
    }
}