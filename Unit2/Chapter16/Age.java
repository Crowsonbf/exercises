// Please don't hurt me
import java.util.Scanner;
public class Age
{
    public static void main(String[]args)
    {
        int y;
        int month;
        int day;
        double seconds;
        int mday = 31;
        int mday2 = 30;
        int feb = 28;
        int tday;
        double tsec;
        double percent;

        Scanner s = new Scanner(System.in);
        System.out.println("How Many years old are you? ");
        y = s.nextInt();
        System.out.println("How many months? ");
        month = s.nextInt();
        System.out.println("How many days? ");
        day = s.nextInt();

        if (month == 1 ){
          tday = (mday + day) + (y * 365);
                  System.out.println("Total days: " +tday);
                          System.out.println("You are " + tday * 86400 + " seconds old" );
                          tsec = tday * 86400;
                          percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 2 ){
            tday = (mday + feb + day) + (y * 365);
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 3 ){
            tday = ((2 * mday) + day) + (y * 365)+ feb ;
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 4 ){
            tday = ((2 * mday) + day + mday2) + (y * 365)+ feb ;
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 5){
            tday = ((3 * mday) + day + mday2) + (y * 365)+ feb ;
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 6){
            tday = ((3 * mday) + feb + day +(2 * mday2)) + (y * 365)+ feb ;
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 7 ){
            tday = ((4 * mday) + day +(2 * mday2)) + (y * 365)+ feb ;
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 8){
            tday = ((5 * mday) + day +(2 * mday2)) + (y * 365)+ feb ;
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 9 ){
            tday = ((5 * mday) + day +(3 * mday2)) + (y * 365)+ feb ;
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 10 ){
            tday = ((5 * mday) + day +(4 * mday2)) + (y * 365)+ feb ;
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");
        }
        else if (month == 11 ){
            tday = ((6 * mday) + day +(4 * mday2)) + (y * 365)+ feb ;
                    System.out.println("Total days: " +tday);
                            System.out.println("You are " + tday * 86400 + " seconds old" );
                            tsec = tday * 86400;
                            percent = (tsec / 2500000000.0) * 100.0;
                            System.out.println("You have lived %" + percent + "of your life.");

        }
        else {
            System.out.println("Convert that to years silly!");
        }

    }
}