import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        System.out.println(validPassword("abcdessdf6"));
    }

    public static boolean validPassword(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (password.length() >= 10 && Character.isLetterOrDigit(c)) {
                return true;
            } else if (Character.isDigit(c)) {
                count++;
            }
            if (count < 2) {
                return false;
            }
        }


        return false;
    }


}
