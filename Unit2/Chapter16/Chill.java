import java.util.Scanner;
public class Chill
{
    public static void main(String[]args)
    {
      double speed;
      double temp;

      Scanner s = new Scanner(System.in);
      System.out.println("Enter Wind Speed: ");
      speed = s.nextInt();
      System.out.println("Enter Temperature: ");
      temp = s.nextInt();

      double chill = (35.74 + (0.6215*temp) - Math.pow(35.75*speed,0.16) + Math.pow(0.4275*temp*speed,0.16));

      if (speed < 3 || temp > 50 ){
          System.out.println("Wind chill: "+ temp);
      }  
      else{
          System.out.println("Wind Chill: "+ chill );
      }

    }
}