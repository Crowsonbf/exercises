import java.util.Scanner;

public class Movie 
{
    public static void main(String[]args)
    {
        double madult;
        double mchild;
        double adult;
        double child;
        double dage;
        double dtime;
        Scanner s = new Scanner(System.in);
        System.out.println("How Old are you in years?");
        dage = s.nextInt();
        System.out.println("What time is your show in army time?");
        dtime = s.nextInt();

        if (dage <= 13 && dtime < 1700 ){
            System.out.println("Your ticket costs: $2.00" );
        }
        else if (dage <= 13 && dtime >= 1700 ){
            System.out.println("Your ticket costs: $4.00");
        }
        else if (dage > 13 && dtime < 1700 ){
            System.out.println("Your ticket costs: $5.00");
        }
        else if (dage > 13 && dtime >= 1700 ){
            System.out.println("Your ticket costs: $8.00");
        }
    }
}