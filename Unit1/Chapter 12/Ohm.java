import java.util.Scanner;

public class Ohm
{
    public static void main( String[] args )
    {
        float v;
        int r;
        Scanner s = new Scanner( System.in );
            System.out.println("How much voltage is there?");
            v = s.nextInt();
            Scanner p = new Scanner( System.in );
                System.out.println("How much resistance?");
                r = p.nextInt();
                System.out.println("I =" + (v + 0.0) / r );
    }
}