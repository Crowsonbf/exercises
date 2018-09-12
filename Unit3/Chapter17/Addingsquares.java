import java.util.Scanner;
public class Addingsquares
{
    public static void main(String[]args)
    {
        int N;
        int P;
        double sum = 0.0;
        double sum2 = 0.0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        N = s.nextInt();
        while (N > 0){
         sum = Math.pow( N, 2 ) + sum;
         sum2 = Math.pow( N, 3 ) + sum2;
         N = N -1;
        
        }
        System.out.println("The sum of squares is: " + sum);
        System.out.println("The sum of cubes is: " + sum2);
    }
}