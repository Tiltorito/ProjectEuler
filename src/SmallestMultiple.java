/**
 * Created by harry on 01/05/2018.
 */

public class SmallestMultiple {
    public static void main(String[] args) {
        System.out.println(smallestMultiple(20));
    }


    private static int smallestMultiple(int upTo) {

        for(int i = upTo; i < Integer.MAX_VALUE; i++) {
            if(isMultiple(i, upTo)) {
                return i;
            }
        }

        return -1;
    }

    private static boolean isMultiple(int num, int upTo) {
        for(int i = upTo; i >= 2; i--) {
            if(num % i != 0) {
                return false;
            }
        }

        return true;
    }
}
