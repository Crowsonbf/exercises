public class Trim{
    public static void main( String[] args)
    {
       String str;
       int  len;

       str = new String("   fjkghSDFL   ");
       String second;
       second = str.trim();
       len = str.length();

       System.out.println("The length is: " + len ); 
    }
}