public class Circle {
    private String color = "red";
    private double radius;
    private static final double pi = 3.14;

    // Constructors
    public Circle() {
        this.color = "red";
        this.radius = 1.0;
    }

    public Circle(double r) {
        this.radius = r;

    }

    public Circle(String c, double r) {
        this.color = c;
        this.radius = r;
    }

    public Circle(Circle c) {
        this.color = c.color;
        this.radius = c.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String s) {
        this.color = s;
    }

    public void setRadius(double r) {

        this.radius = r;
    }

    public double getArea() {
        return (pi * this.radius * this.radius);
    }

    public String toString() {
        return "Circle Radius = " + radius + " has color = " + color;
    }
}
