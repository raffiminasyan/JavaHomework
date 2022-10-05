import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        areaOfTriangle(7,5,8);
    }

    public static void areaOfTriangle(double firstSide, double secondSide, double base) {
        if (firstSide + secondSide > base && firstSide + base > secondSide && base + secondSide > firstSide) {
            double s = (firstSide + secondSide + base) / 2;
            double area = Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - base));
            System.out.println("The area of triangle is " + area);
        } else {
            System.out.println("The triangle is not valid");
        }


    }
}
