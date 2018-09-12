import java.util.Scanner;
public class Addingints
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int NumofInts;
        int num;
        
        
        System.out.println("How many numbers will be added? ");
        NumofInts = s.nextInt();
        int sum = 0;
        while ( NumofInts > 0 ){
            System.out.println("Enter a number: ");
            num = s.nextInt();
            NumofInts = NumofInts - 1;
            sum = sum + num;
        }
        System.out.println("The sum is: " + sum );
    }
}