import java.util.*;
public class RandomNumberGeneration{
    public static void main (String args[]){
    
        double n=80;
        double m=70;
        double d= (Math.random()*5)+1;
        double f= (Math.random()*(n-m)+m);
        double e=((Math.random()*(12-5))+5);
        System.out.println((int)e);
                System.out.println((int)f);

        
    }
}