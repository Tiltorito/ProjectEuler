/**
 * Created by harry on 01/05/2018.
 */

public class NthPrime {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(nthPrime(10001));
        System.out.println(stopWatch.elapsedTime());
    }


    private static int nthPrime(int n) {
        int ctr = 1; // cuz first prime is 2
        int i;

        if(n < 1) return -1;
        if(n == 1) return 2; // first prime


        for(i = 3; i < Integer.MAX_VALUE; i+=2) {
            if(isPrime(i)) {
                ctr++;
                if(ctr == n) {
                    break;
                }
            }
        }

        if(i == Integer.MAX_VALUE) {
            return -1; // error
        }

        return i;
    }

    private static boolean isPrime(int n) {
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        double root = Math.sqrt(n);

        for(int i = 3; i <= root; i+=2) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
