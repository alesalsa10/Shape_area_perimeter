public class Rectangle extends Shape {

    public Rectangle(double length, double width) {
        setLengthWidth(length, width);
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public double perimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public String toString() {
        return "The area is " + area() + " and the perimeter is " + perimeter();
    }
}