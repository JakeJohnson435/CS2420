public abstract class Rectangle extends Shape implements Comparable<Rectangle>
{
    public Rectangle( double len, double wid, double x)
    {
        length = len; width = wid; position = x;
    }
     
    public double area( )
    {
        return length * width;
    }
    
    public double perimeter( )
    {
        return 2 * ( length + width );
    }
    
    public String toString( )
    {
        return "Rectangle: " + length + " " + width;
    }
    
    public double getLength( )
    {
        return length;
    }
    
    public double getWidth( )
    {
        return width;
    }

    private double length;
    private double width;
    private double position;
}