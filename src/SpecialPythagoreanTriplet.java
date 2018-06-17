/**
 * Created by mpampis on 6/17/2018.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(findProduct(1000));
    }

    public static int findProduct(int sum) {
        for(int i = 1; i < sum - 2; i++) {
            for(int j = i + 1; j < sum - 2; j++) {
                int k = sum - i - j;
                if(i + j + k == sum && isPythagorianTuplet(i, j, k)) {
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(k);
                    return i * j * k;
                }
            }
        }
        return -1;
    }

    public static boolean isPythagorianTuplet(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}
