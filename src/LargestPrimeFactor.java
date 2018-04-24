import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by harry on 24/04/2018.
 */

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrimeFactorOf( 9900851475144L));
    }

    private static long getLargestPrimeFactorOf(long number) {

        double root = Math.sqrt(number);

        long maxPrimeFactor = number % 2 == 0 ? 2L : 1L;

        for(long i = 3; i <= root; i+=2) {
            if(number % i == 0 && isPrime(i)) {
                maxPrimeFactor = i;
            }

        }

        return maxPrimeFactor;
    }

    private static boolean isPrime(long number) {
        if(number % 2 == 0) return false;
        double root = Math.sqrt(number);

        for(long i = 3; i <= root; i+=2) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
