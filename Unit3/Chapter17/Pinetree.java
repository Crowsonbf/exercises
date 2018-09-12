import java.util.Scanner;
public class Pinetree
{
    public static void main(String[]args)
    {
    Scanner s = new Scanner(System.in);
    int n;
    System.out.println("How tall would you like the tree?");
    n = s.nextInt();

    for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - i; j++)
    System.out.print(" ");
    for (int k = 0; k < (2 * i + 1); k++)
    System.out.print("*");
    System.out.println();
    }

    }
}