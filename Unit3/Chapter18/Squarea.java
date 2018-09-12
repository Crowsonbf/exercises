import java.util.Scanner;
public class Squarea
{
    public static void main(String[]args)
    {
        int x1;
        int y1;
        int x2;
        int y2;
        int r = 1;
        int sum = 0;
        int sum2 = 0;
        int area = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("X1 coordinate:");
        x1 = s.nextInt();
        System.out.println("y1 coordinate:");
        y1 = s.nextInt();
        System.out.println("x2 coordinate:");
        x2 = s.nextInt();
        System.out.println("y2 coordinate:");
        y2 = s.nextInt();
            sum = x2 - x1;
            sum2 = y2 - y1;
            area = sum * sum2;

    System.out.println("Area:" + sum);
    }
}