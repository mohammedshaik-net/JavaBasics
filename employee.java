import java.util.*;
public class employee {
    public static void main (String args []) {
        double Basic_Salary;
        Scanner myObj = new Scanner(System.in);
                System.out.println("Enter Basic Salary- ");
         Basic_Salary= myObj.nextDouble();
        double Dearness_Allowance;
        Dearness_Allowance= (25.0/100*Basic_Salary);
        System.out.println("Dearness Allowance is "+ Dearness_Allowance);
        double House_Rent = (15.0/100*Basic_Salary);
                System.out.println("House Rent Allowance is- " + House_Rent);
        double ProvidentFund = (33.0/100*Basic_Salary);
                System.out.println("Provident Fund is- " + ProvidentFund);
        double Net_Pay = Basic_Salary+Dearness_Allowance+House_Rent;
                System.out.println("Net Pay is- " + Net_Pay);
        double GrossPay= Net_Pay - ProvidentFund;
                System.out.println("Gross Pay is- " + GrossPay);

        
    }
}