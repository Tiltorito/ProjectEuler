/**
 * Created by harry on 01/05/2018.
 */

public class LargestPalindromeProduct {
    public static void main(String[] args) {
        System.out.println(greaterPalindrome(3));
    }

    private static int greaterPalindrome(int digits) {
        int limit = (int)Math.pow(10, digits);
        int maxProduct = 0;

        for(int i = 0; i < limit - 1; i++) {
            for(int j = 0; j < limit; j++) {
                int product = i * j;

                if(isPalindrome(product)) {
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }

        return maxProduct;
    }


    private static boolean isPalindrome(int num) {
        return getReverse(num) == num;
    }

    private static int getReverse(int num) {
        int reverse = 0;

        while(num != 0) {
            reverse = (reverse * 10) + num % 10;
            num /= 10;
        }

        return reverse;
    }
}
