import java.util.Scanner;
public class Pie
{
    public static void main(String[]args)
    {
        double weight;
        
        Scanner s = new Scanner(System.in);
        System.out.println("What is your weight? ");
        weight = s.nextInt();

        if (weight < 220 || weight > 280){
            System.out.println("You are not allowed to participate");
        
        }
        else {
            System.out.println("Welcome to the contest");
        }
    }
}
