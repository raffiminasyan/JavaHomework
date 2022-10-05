import java.util.Scanner;

public class CountingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Number of vowels is " + countingVowels(str));
    }

    public static int countingVowels(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            if ((string.charAt(i) == 'a') || (string.charAt(i) == 'o') || (string.charAt(i) == 'u') || (string.charAt(i) == 'e') || string.charAt(i) == 'i' || string.charAt(i) == 'y') {
                counter++;
            }
        }
        return counter;
    }
}
