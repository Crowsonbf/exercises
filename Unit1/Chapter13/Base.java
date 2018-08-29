import java.util.Scanner;
    public class Base 
    {
        public static void main(String[]args)
        {
            double x;
            
            Scanner s = new Scanner( System.in );
            System.out.println("Enter a double: ");
            x = s.nextInt();
            double a = (Math.log(x) / Math.log(2));
            System.out.println("Base 2 log of " + x + " is " + a);
        }
    }