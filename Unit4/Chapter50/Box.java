public class Box
{
  // Instance Variables
  public double length ;
  public double width  ;
  public double height ;


  // Constructors
  public Box ( double width, double height, double length )
  {
    this.width  = width ;
    this.height = height ;
    this.length = length ;
  }

  public Box ( double side )
  {
    width  = side ;
    height = side ;
    length = side ;
  }

  // Methods
  public double volume()
  {
    return width * height * length ;
  }

  public double area()
  {
    return 2 * (  width*height  +  width *length  +  length* height  ) ;
  }
  public double topArea(){
      return width * length;
  }
  public double sideArea(){
      return width*height;
  }
  public double faceArea(){
      return length* height;
  }
  public double getLength(){
      return length;
  }
  public double getWidth(){
      return width;
  }
  public double getHeight(){
      return height;
  }
}

  