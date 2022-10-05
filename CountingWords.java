import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Number of words is: " + countingWords(str));
    }

    public static int countingWords(String string) {
//        int count = 0;
//        for (int i = 0; i < string.length(); i++) {
//            char temp = string.charAt(i);
//            if (string.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        return count;

        return string.split(" ").length;
    }
}


