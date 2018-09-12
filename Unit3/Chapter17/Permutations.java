import java.util.Scanner;

public class Permutations
{
    public static void main(String[]args)
    {
        int N;
        int R;
        double sum = 0.0;
        double sum2 = 0.0;
        double perm = 0.0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        N = s.nextInt();
        System.out.println("Enter a number: ");
        R = s.nextInt();
        while (N > 0){
         sum = (N - 1) + sum;
         sum2 = N - R;
         N = N - 1
        
    }
        perm = sum / sum2;
        System.out.println(perm);
    }
}