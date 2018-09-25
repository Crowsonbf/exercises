import java.util.Scanner;
public class Sheep
{
    public static void main(String[]args)
    {
    double years = 1.0;
    double number = 1.0;
    int count = 0;

      for (count = 0; count < 26;)
      {
          number = 220/((1+10) * Math.pow(0.83,years));
          System.out.println(number);
          years = years + 1;
          count = count + 1;
      }  
    }
}