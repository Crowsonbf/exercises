import java.util.Scanner;
public class Echo
{
    public static void main(String[]args)
    {
        String inputString;
        int times;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a word: ");
        inputString = s.nextLine();
        times = inputString.length();
        while (times > 1){
            System.out.println(inputString);
            times = times - 1;
        }
    }
}