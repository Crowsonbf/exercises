import java.util.Scanner;
public class Oneletter
{
    public static void main(String[]args)
    {
        String inputstring;
        int letters = 0;
        int place = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a word: ");
        inputstring = s.nextLine();
        letters = inputstring.length();
        while (letters > 1){
        System.out.println(inputstring.charAt(place));
        place = place + 1;
        }
    }
}