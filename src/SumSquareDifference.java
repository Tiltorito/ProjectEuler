/**
 * Created by harry on 01/05/2018.
 */

public class SumSquareDifference {
    public static void main(String[] args) {
        System.out.println(sumSquareDifference(1000));
    }

    public static int sumSquareDifference(int n) {
        int squares = 0;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            squares += (int)Math.pow(i, 2);
            sum += i;
        }


        return (int)(Math.pow(sum, 2) - squares);
    }
}
