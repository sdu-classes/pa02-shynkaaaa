public class Circle extends Shape {
    protected double radius = 1.0;
    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return 3.14 * radius * radius;
    }
    double getPerimeter() {
        return 2 * radius * 3.14;
    }
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}
