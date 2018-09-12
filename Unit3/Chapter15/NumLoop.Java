import java.util.Scanner;

public class NumLoop
{
    public static void main(String[]args)
    {
         // start count out at one
    int count1;
    int count2;   
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter a starting number: ");
    count1 = s.nextInt();
    System.out.println("Enter and ending number: ");
    count2 = s.nextInt();
    while ( count1 < count2 )   
    {
      System.out.println( "count is:" + count1 );
      
      count1 = count1 + 1;    
    }
    System.out.println( "Done with the loop" );
  }
}
