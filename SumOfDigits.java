public class SumOfDigits {
    public static void main(String[] args) {


        System.out.println(sumOfDigits(73456789));
    }


    public static int sumOfDigits(int x) {
        int sum = 0;
        if(x< 10) {
            return x;
        }
         while(x>0){
             int a = x % 10;
             sum += a;
             x = x /10;
         }
         return sum;

        }
    }

