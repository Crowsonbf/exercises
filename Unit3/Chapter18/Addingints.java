import java.util.Scanner;
public class Addingints
{
    public static void main(String[]args)
    {
        double sum = 0.0;
        int R;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first number");
        F = s.nextInt();
        if (R == 0 ){
            sum = R + sum;
            System.out.println(sum);
        }
        else if(R >= 1 ){
        while (R > 0){
         System.out.println("Enter a number (0 to stop)");
         R = s.nextInt();
         sum = R + sum;
        }
        }
        System.out.println(sum);
    }
}