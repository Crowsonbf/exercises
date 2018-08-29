import java.util.Scanner; 
    public class Money {
        public static void main(String[]args)
        {
            int r;
            double c = .01, money;
            Scanner s = new Scanner(System.in);
            System.out.println("How many cents do you have?");
            r = s.nextInt();
            money = r * c ;
            System.out.println("Dollars: " + money);
        }
    }