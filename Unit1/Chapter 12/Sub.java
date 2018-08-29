import java.util.Scanner;

public class Sub {
    public static void main( String[] args)
    {
        int p;
        int e;
        String strin = new String();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String");
        strin = s.nextLine();
        String str = new String( strin  );
        Scanner f = new Scanner(System.in);
         System.out.println("Enter beginning index: ");
            p = f.nextInt();
         System.out.println("Enter ending index: ");
        Scanner g = new Scanner(System.in);
             e = g.nextInt();
        String sub = str.substring( p , e );
        System.out.println( sub );
    }
}