    
    import java.util.Scanner;
public class Ulucky
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        String Number;
        String th = "13";
        int luck = 0 ;
        System.out.println("enter a number: ");
        Number = s.nextLine();
        
        for (int i = 0; i < Number.length()-1; i++){
            String sub = Number.substring(i,i+2);
            if(Number.equals(th)){
              luck = 1;
            }
            else if (sub.equals(th)){
            luck = 1;
            }
            System.out.println(sub);
        }
        if(luck == 1){
            System.out.println("Unlucky");
        }
        if (luck == 0 ) System.out.println("Safe");

        int count = 0; 
        
        
        for (int p = 0; p < Number.length(); p++ ){
            if(Number.charAt(p) == '1'){
                count++;
                
            }
            else System.out.println(" ");
        }
        
        if((count%2)==0){
            System.out.println("This number is Evil");
        }

        else System.out.println("This number is Odious");
      
        }
    }
