class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
    Rectangle() {}
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    double getWidth() {
        return width;
    }
    void setWidth(double width) {
        this.width = width;
    }
    double getLength() {
        return length;
    }
    void setLength(double length) {
        this.length = length;
    }
    double getArea() {
        return length * width;
    }
    double getPerimeter() {
        return 2 * (length + width);
    }
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}
