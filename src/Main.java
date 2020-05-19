import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);


        while (true){
            System.out.println("Choose a shape");
            System.out.println("1 = circle, 2 = rectangle, 3 = square, 4 = triangle. Type break to exit");
            String choice = reader.nextLine();
            if (choice.equals("1")){
                System.out.println("Enter the radius of the circle");
                double r = Double.parseDouble(reader.nextLine());
                Circle circle = new Circle(r);
                System.out.println(circle);
            } else if (choice.equals("2")){
                System.out.println("What is the length?");
                double l = Double.parseDouble(reader.nextLine());
                System.out.println("What is the width?");
                double w = Double.parseDouble(reader.nextLine());
                Rectangle rectangle = new Rectangle(l,w);
                System.out.println(rectangle);
            }else if (choice.equals("3")){
                System.out.println("What is the length of the sides?");
                double s = Double.parseDouble(reader.nextLine());
                Square square = new Square(s);
                System.out.println(square);
            }else if (choice.equals("4")){
                System.out.println("What is the lenght of side 1?");
                double s1 = Double.parseDouble(reader.nextLine());

                System.out.println("What is the lenght of side 2?");
                double s2 = Double.parseDouble(reader.nextLine());

                System.out.println("What is the lenght of side 3?");
                double s3 = Double.parseDouble(reader.nextLine());

                Triangle triangle = new Triangle(s1, s2, s3);
                System.out.println(triangle);
            } else if (choice.equals("break")){
                break;
            } else {
                System.out.println("We can't computer calculations for that shape.");
            }
        }
    }
}
