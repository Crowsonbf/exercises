import java.util.Scanner;
public class Discount
{
    public static void main(String[]args)
    {
        double b;
        double d;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the price: ");
        b = s.nextInt();
        d = b * 0.90;
        if ( b > 10.0 ) {
            System.out.println("The discounted price is: "+ d );
        }
        else {
            System.out.println("No discount recieved, price is: " + b);
        }
        

    }
}