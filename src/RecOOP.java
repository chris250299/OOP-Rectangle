import java.util.Scanner;

public class RecOOP {

    public static class Rectangle {
        double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + " ,height=" + height + "}";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        Rectangle myRectangle = new Rectangle(width, height);
        System.out.println("Your rectangle \n" + myRectangle.display());
        System.out.println("The perimeter of your rectangle: " + myRectangle.getPerimeter());
        System.out.println("The area of your rectangle: " + myRectangle.getArea());

    }
}