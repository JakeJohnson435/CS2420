
public abstract class Shape 
{
    public abstract double area( );
    public abstract double perimeter( );
    public abstract double position ();

 
    public double semiperimeter( )
    {
        return perimeter( ) / 2; 
    }

    public static double distance(Shape a, Shape b){

        double distance;

        distance = (a.position() - b.position());

        return distance;
    }

    public static void main(String[] args) {

        Square sq1 = new Square(5, 10);
        Circle c1 = new Circle(2.5, 5);

        System.out.println("The two shapes are " + distance(sq1, c1) + " units apart");



    }
    
//    public static void stretchAll(WhatType[] arr, factor) {
//    	for(WhatType s: arr) {
//    		s.stretch(factor);
//    	}
//    }
}
