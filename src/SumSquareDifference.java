/**
 * Created by harry on 01/05/2018.
 */

public class SumSquareDifference {
    public static void main(String[] args) {
        System.out.println(sumSquareDifference(1000));
    }

    public static int sumSquareDifference(int n) {
        int[] squares = new int[n + 1];
        int[] sum = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            squares[i] = squares[i - 1] + (int)Math.pow(i, 2);
            sum[i] = sum[i - 1] + i;
        }


        return (int)(Math.pow(sum[n], 2) - squares[n]);
    }
}
