import java.util.Scanner;
public class Check
{
    public static void main(String[]args )
    {
        double cmoney;
        double smoney;
        Scanner s = new Scanner(System.in);
        System.out.println("What is your checking account balance in dollars?");
        cmoney = s.nextDouble();
        System.out.println("What is your saving account balance in dollars?");
        smoney = s.nextDouble();

        if (cmoney > 1000 || smoney > 1500 ) {
            System.out.println("You have no service charge")
        }
        else if (cmoney < 1000 || smoney < 1500 ) {
            System.out.println("You have a .15 service charge")
        }
    }
}