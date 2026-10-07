import java.util.*;
public class InternetUsage
{
    String customerName="";
    int dataUsed;
    double bill;
    public static void main (String args[])
    {
        InternetUsage ob=new InternetUsage();
        ob.input(); 
        
        ob.calculate();
        ob.print();
    }
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter your name.");
        customerName=sc.next();
        System.out.println("Please enter your data usage in GB.");
    dataUsed=sc.nextInt();
    }
    void calculate()
    {
        if(dataUsed<=10)
            bill=dataUsed*20;
        if(dataUsed>10 && dataUsed<=20)
            bill=10*20+(dataUsed-10)*15;
        if(dataUsed>20)
            bill=10*20+10*15+(dataUsed-20)*10;
            bill+=bill*18.0/100.0;
    }
    void print()
    {
        System.out.println("Customer's name:"+customerName);
        System.out.println("Final Bill:"+bill);
    }
}