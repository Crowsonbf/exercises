import java.util.Scanner;
public class MPG
{
    public static void main(String[]args)
    {
        int initial = 1;
        int final1;
        int gallons;
        double mpg;
        Scanner s = new Scanner(System.in);
    while(initial > 0){
        System.out.println("Initial Miles:");
        initial = s.nextInt();
        System.out.println("Final Miles:");
        final1 = s.nextInt();
        System.out.println("Gallons");
        gallons = s.nextInt();
        mpg = (final1 - initial) / gallons;
        System.out.println("Miles Per Gallon: "+ mpg);
    }
    if (initial < 0){
        System.out.println("Bye");
    }
    }
}