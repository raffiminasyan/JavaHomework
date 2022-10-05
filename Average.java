import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number ");
        double x = sc.nextInt();
        System.out.println("Input the second number ");
        double y = sc.nextInt();
        System.out.println("Input the third number ");
        double z = sc.nextInt();
        System.out.println("The average is " + averageNumber(x,y,z));
    }

    public static double averageNumber(double a, double b, double c){
        double average = (a+b+c)/3;
        return average;
    }
}
