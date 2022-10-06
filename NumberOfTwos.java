import java.util.Scanner;

public class NumberOfTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        double number = sc.nextInt();
        System.out.println(countTwos(number));
    }


    public static int countTwos(double num) {
        String str = Double.toString(num);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '2') {
                count++;


            }
        }
        return count;
    }
}
