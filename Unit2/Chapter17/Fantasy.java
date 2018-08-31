import java.util.Scanner;
public class Fantasy
{
    public static void main(String[]args)
    {
        int strength;
        int health;
        int speed;
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Wizards 101");
        System.out.println("Enter the name of your character: ");
        name = s.nextLine();
        System.out.println("Welcome " + name);
        System.out.println("Choose your skills, you may use no more than 15 points total!");
        System.out.println("Enter your strength (1-10): ");
        strength = s.nextInt();
        System.out.println("Enter your health (1-10): ");
        health = s.nextInt();
        System.out.println("Enter your speed (1-10): ");
        speed = s.nextInt();
        
        int totalpoint = (speed + health + strength);
        System.out.println("You have used "+totalpoint+" of your 15 skill points");

        if (totalpoint > 15 ){
            System.out.println("You have exceeded 15 skill points, skills assigned to default");
            System.out.println("Strength: 5, Health 5, Speed 5");
        }
        else if (totalpoint <= 15 ){
            System.out.println(name + " you have Chosen");
            System.out.println("Strength: "+strength);
            System.out.println("Health: "+ health);
            System.out.println("Speed: "+ speed);
        }

    }
}