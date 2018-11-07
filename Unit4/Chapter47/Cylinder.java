public class Cylinder{
    private double height , radius;

    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public double area(){
     return Math.PI*2*(radius*radius) + (Math.PI*2*radius*height);
    }
    public double volume(){
    return Math.PI*radius*radius*height;
    }
     public void setHeight( double height )
  {
    if ( height >= 0 )
      this.height = height ;
  }
  
  public void setRadius( double radius )
  {
    if ( radius >= 0 )
      this.radius = radius ;
  }
  
  public double getHeight( )
  {
    return height ;
  }
  
  public double getRadius( )
  {
    return radius ;
  }
  
}