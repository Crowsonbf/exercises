import java.util.Scanner;
public class Tire
{
    public static void main(String[]args)
    {
        int flt;
        int frt;
        int blt;
        int brt;
        Scanner s = new Scanner(System.in);
        System.out.println("What is the tire pressure of your front left tire? ");
            flt = s.nextInt();
        System.out.println("What is the tire pressure of your front right tire? ");
            frt = s.nextInt();
        System.out.println("What is the tire pressure of your back left tire? ");
            blt = s.nextInt();
        System.out.println("What is the tire pressure of your back right tire? ");
            brt = s.nextInt();
        if (flt == frt && blt == brt){
            System.out.println("Your tire pressure is OK.");
        }
        else if (flt != frt && blt != brt ){
            System.out.println("Your tires are not OK, please make sure the back and front tires are equal pressure");
        }
        else if (flt == frt && blt != brt ){
            System.out.println("Your tires are not OK, please make sure the back tires are equal pressure");
        }
        else if (flt != frt && blt == brt ){
            System.out.println("Your tires are not OK, please make sure the front tires are equal pressure");
        }
    }
}