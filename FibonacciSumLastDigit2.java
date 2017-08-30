/* This algorithm is a more efficient version of FibonacciSumLastDigit
 * that already has the Pisano period modulo 10 evaluated and stored
 * as a constant integer array, thus eliminating the need for the
 * getPisanoPeriod helper function.
 */

import java.util.*;

public class FibonacciSumLastDigit {
    
    private static long getFibonacciSum(long n) {
        if (n <= 2) return n;
        long pisanoSum = 0;
        long remainder = n % 60;
        for (int i = 0; i <= remainder; i++) {
            pisanoSum = (pisanoSum + PISANO_PERIOD_MODULO_10[i]) % 10;
        }
        return pisanoSum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSum(n);
        System.out.println(s);
    }
    
    private static final int[] PISANO_PERIOD_MODULO_10 = {0, 1, 1, 2, 3, 5, 8, 3, 1, 4, 5, 9, 4, 3, 7, 0, 7, 7, 4, 1, 5, 6, 1, 7, 8, 5, 3, 8, 1, 9, 0, 9, 9, 8, 7, 5, 2, 7, 9, 6, 5, 1, 6, 7, 3, 0, 3, 3, 6, 9, 5, 4, 9, 3, 2, 5, 7, 2, 9, 1};
}

