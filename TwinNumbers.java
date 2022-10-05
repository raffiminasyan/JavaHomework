public class TwinNumbers {
    public static void main(String[] args) {
        twinNumbers();
    }

    public static void twinNumbers() {

        for (int i = 3; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", "  + (i + 2) + ")");
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0 && num != i) {
                return false;
            }
        }
        return true;
    }
}
