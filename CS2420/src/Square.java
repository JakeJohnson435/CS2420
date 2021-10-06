public class Square extends Shape implements Comparable<Square>{

    public Square( double side, double x )
    {
        if (side < 0){
            throw new IllegalArgumentException();
        } else {
            length = side;
        }
        position = x;
    }

    public double area( )
    {
        return length * length;
    }

    public double perimeter( )
    {
        return 4 * length;
    }

    @Override
    public double position() {
        return position;
    }

    public String toString( )
    {
        return "Square: " + length;
    }

    private double length;
    private double position;


    @Override
    public int compareTo(Square o) {
        return 0;
    }
}
