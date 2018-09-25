import java.util.Scanner;
public class Quizgrade
{
    public static void main(String[]args)
    {

        int high;
        int low;
        int r = 1;
        double sum = 0.0;
        double sum2 = 0.0;
        int amount = 0;
        boolean breakLoop = false;
        Scanner s = new Scanner(System.in);

        System.out.println("High: ");
        high = s.nextInt();
        System.out.println("Low: ");
        low = s.nextInt();
    if(high > low && high < 101 && low > -1){


        while ( r > -1 ){
            System.out.println("Enter other grades one at a time (0 to exit): ");
            r = s.nextInt();
            amount = amount + 1;
            sum = sum + r;
            
            if ( r == 0){
                breakLoop = false;
                break;
            }
            else if ( r > 100 || r < 0 ){
                System.out.println("Error, the grading scale is 0-100");
                breakLoop = true;
                break;
            }

            else if (r > high || r < low ){
                System.out.println("Error, you have entered a grade higher or lower than your range");
                breakLoop = true;
                break;
                    }
            }
        if (!breakLoop){
            sum2 = (sum + 1) / (amount);
            System.out.println("Average Grade: " + sum2+ "%" );
        }
        else {
            System.out.println("error");
        }
     }

        else if ( low > high ){
            System.out.println("Error, the low grade acnnot be higher than the top score");
        }
       
     }
    
}