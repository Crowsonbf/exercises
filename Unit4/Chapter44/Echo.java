import java.util.Scanner;
public class Echo
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        String first;
        System.out.println("First name");
        first = s.nextLine();
        String last;
        System.out.println("Last name");
        last = s.nextLine();
        first = first.trim();
        last = last.toUpperCase();
        last = " " + last;
        String name = first.concat(last);
        System.out.println(name);
    }
}