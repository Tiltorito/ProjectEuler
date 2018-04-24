import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by harry on 24/04/2018.
 */

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfEven(4000000));
    }


    private static long sumOfEven(long limit) {
        // bottom up
        Deque<Long> fibo = new LinkedList<>();
        fibo.add(1L);
        fibo.add(1L);

        long sum = 0;

        while(fibo.getLast() < limit) {
            Iterator<Long> iterator = fibo.descendingIterator();

            long term = iterator.next() + iterator.next(); // getting 2 last

            if(term % 2 == 0) {
                sum += term;
            }

            fibo.add(term);
        }

        return sum;
    }
}
