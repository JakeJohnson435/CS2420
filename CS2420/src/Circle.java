public class Circle extends Shape implements Comparable<Circle>
{
    public Circle( double rad, double x )
    {

        if (rad < 0){
            throw new IllegalArgumentException();
        } else {
            radius = rad;
        }

        position = x;
    }
    
    public double area( )
    {
        return Math.PI * radius * radius;
    }
    
    public double perimeter( )
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public double position() {
        return 0;
    }

    public String toString( )
    {
        return "Circle: " + radius;
    }
    
    private double radius;
    private double position;

    @Override
    public int compareTo(Circle o) {
        return 0;
    }
}
