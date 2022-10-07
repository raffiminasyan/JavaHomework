public class ExtractingTheFirstDigit {
    public static void main(String[] args) {

    }
        public static int extract ( int x){
            while (x >= 10) {
                x /= 10;
            }
            return x;
        }
    }


