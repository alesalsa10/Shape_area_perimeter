public class Circle extends Shape {
    public Circle(double radius){
        setRadius(radius);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(),2);
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * getRadius();
    }
    @Override
    public String toString(){
        return "The area of the circle is " + area() + " and the perimeter is " + perimeter();
    }
}
