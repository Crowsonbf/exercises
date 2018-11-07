import java.util.Scanner;
public class SumofOdds
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int n;
        int count;
        
        System.out.println("Enter an integer: ");
        n = s.nextInt();
        for ( count= 1 ; count < n; count+=2 ){
        System.out.println("Count: " + count );
        }
    }
}