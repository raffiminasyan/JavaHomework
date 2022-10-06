public class ConsecutiveOrNot {
    public static void main(String[] args) {
        System.out.println(consecutive(1,2,3));
    }

public static boolean consecutive(int a,int b, int c) {
        if((a == b-1) && (b == c-1) &&(a==c-2)){
            return true;
        }
    return false;
}

}
