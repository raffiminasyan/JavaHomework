import java.util.Scanner;
public class FindSmallest {
    public static void main(String[] args) {
        System.out.println(smallestNumber(6543,765,7643));
    }

    public static int smallestNumber(int sc, int sc1, int sc2) {
        int min = sc;
        if(min < sc1 && min < sc2 ) {
            return min;
        } else if(sc2< min && sc2 < sc1){
            return sc2;
        }
        return sc1;
    }

}
