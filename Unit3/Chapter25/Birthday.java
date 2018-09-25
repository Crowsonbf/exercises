import java.util.Scanner;
public class Birthday
{
    public static void main(String[]args)
    {
    Scanner s = new Scanner(System.in);
    double sum;

    System.out.println("How many people are at the party?");
    int people = s.nextInt();
    double percent = 100.0;
    for(int i = 2; i <= people; i++){
        sum = ((365.0 - (i - 1.0)) / 365.0);
        percent = percent * sum;

    }
    System.out.println("there is a " + percent + " percent chance that noone shares a birthday");



    }
}