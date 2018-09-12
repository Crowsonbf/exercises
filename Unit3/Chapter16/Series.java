import java.util.Scanner;
public class Series
{
    public static void main(String[]args)
    {
        double n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = s.nextInt();
        double sum = 0;
        double add = 0;
        while (n >= 1){
            add = 1 / n;
            sum = sum + add;
            n = n - 1;
        }
        System.out.println(sum);
    }
}