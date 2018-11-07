import java.util.Scanner;
public class PantryTester
{
  public static void main ( String[] args )
  {
      int select = 0;
    Scanner s = new Scanner(System.in);
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( hubbard );
  
  
  while(select != -1){
   System.out.println("Which jam?");
    select = s.nextInt();
   System.out.println("How much jam?");
    int amount = s.nextInt();
    hubbard.select(select);
    hubbard.spread(amount);
    System.out.println( hubbard );
  
  }
  
  }
}