import java.util.Scanner;
public class Password
{
    public static void main(String[]args)
    {

        Scanner s = new Scanner(System.in);
        String password;
        boolean checkUpper = false;
        boolean checkLower = false;
      
        boolean checkNum = false;
 System.out.println("Enter a passcode");
        password = s.nextLine();
        if (password.length() >= 7){
             for(int i=password.length()-1; i>=0; i--) {
        if(Character.isUpperCase(password.charAt(i))) {
            checkUpper = true;
        for(int l=password.length()-1; l>=0; l--) {
        
        if(Character.isUpperCase(password.charAt(l))) {
            checkLower=true;
                }
            }
        }
  
    }
    if(checkUpper == true && checkLower == true){
        for(int o=password.length()-1; o>=0; o--) {
        
        if(Character.isUpperCase(password.charAt(o))) {
         checkNum = true;
    }
    else  checkNum = false;
}

    }
}
       if(checkUpper == false || checkLower == false || checkNum == false){
           System.out.println("password not acceptable");
       } 
        if(checkUpper == true && checkLower == true && checkNum == true){
            System.out.println("password accepted");
       } 
    }
}
