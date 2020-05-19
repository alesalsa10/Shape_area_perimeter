public class Square extends Shape{

    public Square(double sides){
        setSquareSides(sides);
    }

    @Override
    public double area(){
        return Math.pow(getSquareSides(),2);
    }

    //calculate perimeter
    @Override
    public double perimeter(){
        return 4 * getSquareSides();
    }

    //return string representation of perimeter and area
    @Override
    public String toString() {
        return "The area is " + area() + " and the perimeter is " + perimeter();
    }
}
