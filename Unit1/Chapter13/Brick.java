import java.util.Scanner;

    public class Brick 
    {
        public static void main(String[]args)
        {
            double t;
            double g = 32.174;
            
            Scanner s = new Scanner( System.in );


            System.out.println(" Time falling in seconds: ");
            t = s.nextInt();

            double ts = t * t;

            double d = ( ( 1.0/2.0 ) * g * ts );

            System.out.println(" Distance: " + d );
        }
    }