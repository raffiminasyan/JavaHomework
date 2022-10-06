public class AreaOfPentagon {
    public static void main(String[] args) {
    area(5);
    }
    public static void area(double a) {

        double area = (float)(Math.sqrt(5 * (5 + 2
                * (Math.sqrt(5)))) * a * a) / 4;

        System.out.println("The area is " + area);
    }
}
