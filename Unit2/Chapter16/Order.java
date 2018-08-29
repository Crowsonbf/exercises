import java.util.Scanner;

public class Order{
    public static void main(String[]args)
    {
        double nut;
        double bolt;
        double washer;

        Scanner s = new Scanner(System.in);
        System.out.println("Number of bolts: ");
        bolt = s.nextInt();

        System.out.println("Number of Washers: ");
        washer = s.nextInt();

        System.out.println("Number of Nuts: ");
        nut = s.nextInt();

        double bolt2 = bolt * 2; 
        if (nut < bolt){
            System.out.println("Check order: Too few nuts");
        }
        else if ( bolt2 > washer ){
            System.out.println("Check order: Too few washers.");
        }
        else if ( bolt2 > washer && nut < bolt){
            System.out.println("Too few nuts and washers");

        }
        else{
            System.out.println("Check order: Order is OK");
            double np = nut * 3.0;
            double wp = washer * 1.0;
            double bp = bolt * 5;
            double cost = np + wp + bp;
            System.out.println("Total cost in cents is: "+ cost);
        }

    }


}