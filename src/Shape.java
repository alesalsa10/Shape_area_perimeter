public abstract class Shape {
    private double radius;
    private double length, width;
    private double side1, side2, side3;
    private double sides;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setLengthWidth(double len, double wid){
        this.length = len;
        this.width = wid;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setSquareSides(double side){
        this.sides = side;
    }
    public double getSquareSides(){
        return sides;
    }
    public void setSides(double s1, double s2, double s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public abstract double area();
    public abstract double perimeter();
    public abstract String toString();
}
