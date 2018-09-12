import java.util.Scanner;
public class Jetlag
{
    public static void main(String[]args)
    {
        int departtime;
        int arrivetime;
        int hours;
        int timezones;
        int hours2;
        int recovery;
        Scanner s = new Scanner(System.in);

        System.out.println("What time did you depart? (Army time) ");
        departtime = s.nextInt();
        System.out.println("What time did you arrive? (Army time) ");
        arrivetime = s.nextInt();
        System.out.println("How many timezones did you cross?");
        timezones = s.nextInt();
        System.out.println("How many hours were you traveling?");
        hours = s.nextInt();

        hours2 = (arrivetime + departtime) / 100;
        recovery = (hours/2 + (timezones - 1) + hours2 )/10;
        System.out.println(recovery);


    }
}