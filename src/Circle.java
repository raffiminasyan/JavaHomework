public class Circle {
    public double radius;
    public String color;


    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " The color of radius is " + color + " and the radius is " + radius;
    }
}
