import java.util.Scanner;

import java.lang.Math;

public class Interest
{
    public static void main(String[]args)
    {
    double p;
    double r;
    double n;
    double t;
   
    Scanner s = new Scanner(System.in);
    System.out.println("Enter  your initial deposit: ");
    p = s.nextFloat(); 
    System.out.println("Enter your interest rate in decimal: ");
    r = s.nextFloat();
    System.out.println("Number of times per year intrest is compounded: ");
    n = s.nextFloat();
    System.out.println("Number of years: ");
    t = s.nextFloat();

    double f = (1.0 +( r/n ));
    double g = (n * t);
    double result = Math.pow(f,g);
    double v = result * p;

    System.out.println("Initial Deposit: "+ p);
    System.out.println("Interest Rate: "+ r);
    System.out.println("Times per year: "+ n);
    System.out.println("Number of Years: " +t);
    System.out.println("Value: $"+ v );
    }
}