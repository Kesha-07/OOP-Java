import java.util.Scanner;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {

    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {

    double calculateArea() {
        return d1 * d2;
    }
}

public class Practical22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
	System.out.println("250393107008");
        System.out.println("Enter base and height of Triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        t.getData(base, height);
        System.out.println("Area of Triangle: " + t.calculateArea());

        Rectangle r = new Rectangle();
        System.out.println("Enter length and breadth of Rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        r.getData(length, breadth);
        System.out.println("Area of Rectangle: " + r.calculateArea());

        sc.close();
    }
}