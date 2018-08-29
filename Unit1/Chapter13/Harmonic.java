import java.util.Scanner;
public class Harmonic 
{
    public static void main(String[]args)
    {
        float x;
        float y;
        double a;
        double b;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter X: ");
        x = s.nextFloat();
        Scanner p = new Scanner(System.in);
        System.out.println("Enter Y: ");
        y = p.nextFloat();

        a = 2.0 / ( ( 1.0 / x ) + (1.0 / y ) );
        b = (x+y)/2.0;

        System.out.println("Harmonic Mean: "+ a );
        System.out.println("Arithmetic Mean: "+ b);
    }
}