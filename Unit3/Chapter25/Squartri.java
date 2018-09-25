import java.util.Scanner;
public class Squartri
{
    public static void main(String[] args) 
    {
        int number;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter an upper limit");
        number = s.nextInt();

        int square = 0;
        int triangle = 0;

        for(int a = 1; square <= number; a++){
            square = a * a;
            
            for (int b = 0; triangle <= square; b++){
                triangle = triangle + b;
            if (triangle == square){
               System.out.println(a * a + " is square and triangular");
                }

            }
        triangle = 0;
        }

    }

}