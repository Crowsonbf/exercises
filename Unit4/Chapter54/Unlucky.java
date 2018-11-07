import java.util.Scanner;
public class Unlucky
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        String Number;
        String th = "13";
        Boolean luck = false;
        System.out.println("enter a number: ");
        Number = s.nextLine();
        for (int i = 0; i < Number.length(); i++){
            String sub = Number.substring(i,i+1);
            if(Number.equals(th)){
               luck = true;
            }
            else if (sub.equals(th)){
                 luck = true;
            }
            else luck = false;
        }
        if(luck = true){
            System.out.println("Unlucky");
        }
        else  System.out.println("Safe");
           
        }
    }
