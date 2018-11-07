import java.util.Scanner;
public class Odious{
    public static void main(String[]args)
    {
    Scanner s = new Scanner(System.in);
    int x;
    int count = 0;
    
    System.out.println("Enter a non-negative number: ");
    x = s.nextInt();
    System.out.println(Integer.toBinaryString(x));
    String num = Integer.toBinaryString(x);
        
        
        for (int i = 0; i < num.length(); i++ ){
            if(num.charAt(i) == '1'){
                count++;
                
            }
            else System.out.println(" ");
        }
        System.out.println(count);
        if((count%2)==0){
            System.out.println("This number is Evil");
        }

        else System.out.println("This number is Odious");
    }
}