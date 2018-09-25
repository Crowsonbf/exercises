import java.util.Scanner;
public class Runintegers
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int start;
        int end;
        int between = 0;
        int range;

        System.out.println("Enter a Starting number: ");
        start = s.nextInt();
        System.out.println("Enter a ending number: ");
        end = s.nextInt();

        while (start <= end ){
            System.out.println(start);
            start = start + 1;
        }
    }
}