public class Triangle extends Shape {
    public Triangle(double side1, double side2, double side3){
        setSides(side1, side2,side3);
    }
    public double area(){
        double s = (getSide1() + getSide2() + getSide3()) / 2;
        return Math.sqrt(s * (s-getSide1()) * (s-getSide2()) * (s-getSide3()));
    }
    public double perimeter(){
        return getSide1() + getSide2() + getSide3();
    }
    public String toString(){
        return "The area is " + area() + " and the perimeter is " + perimeter();
    }
}
