import java.util.Scanner;
import java.text.*;

public class Deli
{
    public static void main(String[]args)
    {
    String food;
    int cents;
    int delivery;
    Scanner s = new Scanner(System.in);
    System.out.println("What food are you ordering? ");
    food = s.nextLine();
    String Order  = new String ("You order:"+ food );
    System.out.println("How much does this cost in cents? ");
    cents = s.nextInt();
    System.out.println("Would you like express delivery? 1==yes 0==no");
    delivery = s.nextInt();
    if ( delivery == 1 && cents < 1000 ){
        System.out.println("Invoice");
        System.out.println(food);
        System.out.println("Delivery 5.00");
        System.out.println("Total: $" + ((500.0 + cents)/100.00));
    }
    else if ( delivery == 0 && cents < 1000 ){
        System.out.println("Invoice");
        System.out.println(food);
        System.out.println("Delivery 5.00");
        System.out.println("Total: $" + ((200.0 + cents)/100.00));
    }
    else if ( delivery == 0 && cents > 1000 ){
        System.out.println("Invoice");
        System.out.println(food);
        System.out.println("Delivery 0.00");
        System.out.println("Total: $" + (cents/100.00));
    }
    else if ( delivery == 1 && cents > 1000 ){
        System.out.println("Invoice");
        System.out.println(food);
        System.out.println("Delivery 3.00");
        System.out.println("Total: $" + ((300.0 + cents)/100.00));
    }
    



    }
}