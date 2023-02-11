class Square extends Rectangle {
    Square() {}
    Square(double side) {
        super(side, side);
        this.color = "black";
        this.filled = true;
    }
    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.color = color;
        this.filled = filled;
    }
    double getSide() {
        return super.getWidth();
    }
    void setSide(double side) {
        super.setWidth(side);
    }
    void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
