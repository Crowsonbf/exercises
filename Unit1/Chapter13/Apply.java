import java.util.Scanner;
    public class Apply
    {
        public static void main(String[] args )
        {
            int k;
            int h;

            Scanner s = new Scanner( System.in );
            System.out.println("Cost per Kilo-watt hour in cents: ");
            k = s.nextInt();

            Scanner p = new Scanner( System.in );
            System.out.println("Kolowatt hours per year");
            h = p.nextInt();

            System.out.println("Annual cost: " + (h * k )/100.00 );
        }
    }