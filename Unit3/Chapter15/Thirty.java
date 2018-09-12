import java.util.Scanner;
public class Thirty
{
    public static void main(String[]args)
    {
        String firstString;
        String secString;
        int length;
        String periods = ".";
        Scanner s = new Scanner(System.in);

        System.out.println("First Word: ");
        firstString = s.nextLine();
        System.out.println("Second Word: ");
        secString = s.nextLine();

        length = firstString.length() + secString.length() + periods.length();
        while (length < 30 ){
            periods = periods + ".";
            length = firstString.length() + secString.length() + periods.length();
        }
        System.out.println(firstString + periods + secString);
    }
}