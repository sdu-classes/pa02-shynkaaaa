public class Shape {
    protected String color = "red";
    protected boolean filled = true;
    Shape() {
    }
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    boolean isFilled() {
        return filled;
    }
    void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
