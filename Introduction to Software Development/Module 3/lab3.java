// This files contains more than one Java class

public class Circle {
    double radius;
    
    public Circle() {
        this.radius = 1.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
}


//-------------------------------------------------

public class Rectangle {
    double length;
    double width;
    
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

//-------------------------------------------------

public class ShapeMetricCalculator {
    public static double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.width * rectangle.length;
    }
    
    public static double calculateCircleArea(Circle circle) {
        return Math.pow(circle.radius, 2) * Math.PI;
    }
}

//-------------------------------------------------

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        System.out.println("The area of the rectangle: " + areaOfRectangle);
        
        Circle circle = new Circle(3.0);
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);
        System.out.println("The area of the circle: " + areaOfCircle);

    }
}
