public class Cylinder extends Circle{
   public double height;

    Cylinder() {

    };

    Cylinder(double radius) {
        this.radius = radius;
    }

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return (2 * radius * height * Math.PI) +(2 * Math.PI * radius * radius) ;
    }

}
