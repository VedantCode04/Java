interface Shape2D {
    void getArea();
}

abstract class Shape {
    abstract void display();
}

class Circle extends Shape implements Shape2D {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    void display() {
        System.out.println("Circle with radius " + radius);
    }
    
    public void getArea() {
        double area =  Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class main {
    public static void main(String[] args) {
    	System.out.println("\nVEDANT PATEL IU2141230208\n");
        Circle circle = new Circle(5.0);
        circle.display();
        circle.getArea();
    }
}
