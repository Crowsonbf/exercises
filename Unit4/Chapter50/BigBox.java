public class BigBox{
    public double length ;
  public double width  ;
  public double height ;

public BigBox ( double width, double height, double length )
  {
    this.width  = width * 1.25 ;
    this.height = height * 1.25 ;
    this.length = length * 1.25;
  }

  public BigBox ( double side )
  {
    width  = side ;
    height = side ;
    length = side ;
  }

  // Methods
  public double volume()
  {
    return (width*1.25) * (height*1.25) * (length*1.25) ;
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

