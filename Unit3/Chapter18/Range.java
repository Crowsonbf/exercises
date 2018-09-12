import java.util.Scanner;
public class Range
{
    public static void main(String[]args)
    {
        int high;
        int low;
        int r = 1;
        int sum = 0;
        int sum2 = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("High: ");
        high = s.nextInt();
        System.out.println("Low: ");
        low = s.nextInt();
        while ( r > 0 ){
            System.out.println("Enter number: ");
            r = s.nextInt();
            if (r > low && r < high){
                sum = sum + r;
            }
            else if ( r < low || r > high){
                sum2 = sum2 + r;
            }
        }
    System.out.println("Sum of in range:" + sum);
    System.out.println("Sum of out of range: " +  sum2);
    }
}