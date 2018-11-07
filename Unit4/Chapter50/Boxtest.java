class Boxtest
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;
     BigBox BigBox = new BigBox(4,7.0,8.1);
     System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
     System.out.println( "topArea: "  + BigBox.topArea() );
    System.out.println( "Area: "  + BigBox.area() + " volume: " + BigBox.volume() );

    if(BigBox.getLength() > box.getLength() && BigBox.getWidth() > box.getWidth()){
         System.out.println("The Boxes would fit inside eachother");
    }
    else System.out.println("The boxes dont fit");
  }
}