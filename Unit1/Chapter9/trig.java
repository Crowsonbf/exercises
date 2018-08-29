public class trig {
    public static void main( String[] args)
    {
        double sinx = Math.sin( 0.5236);
        double cosx = Math.cos( 0.5236 );
        double sum = ((sinx * sinx ) + (cosx * cosx)); 
        System.out.println("sine:" + sinx + "cosine: " + cosx + "sum of squares: " + sum );
        System.out.println("in degrees" + ( sinx * Math.PI/180 ) + "cosine: "  ( cosx * Math.PI/180 ));
    }
}