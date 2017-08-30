/* This algorithm evaluates the sum of the last digits of
 * the numbers in the Fibonacci sequence from the nth to the
 * mth term, where n and m are two non-negative integers. As
 * with FibonacciSumLastDigit2, the Pisano period modulo 10
 * is stored as a constant to eliminate the CPU-demanding
 * helper function required to evaluate the Pisano period.
 */

import java.util.*;

public class FibonacciPartialSum {

    private static long getFibonacciPartialSum(long from, long to) {
        long partialSum = 0;
        int remainderFrom = (int)(from % 60);
        int remainderTo = (int)(to % 60);
        for (int i = remainderFrom; i < 60; i++) {
            partialSum = (partialSum + PISANO_PERIOD_MODULO_10[i]) % 10;
        }
        for (int i = 0; i <= remainderTo; i++) {
            partialSum = (partialSum + PISANO_PERIOD_MODULO_10[i]) % 10;
        }
        return partialSum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSum(from, to));
    }
    
    private static final int[] PISANO_PERIOD_MODULO_10 = {0, 1, 1, 2, 3, 5, 8, 3, 1, 4, 5, 9, 4, 3, 7, 0, 7, 7, 4, 1, 5, 6, 1, 7, 8, 5, 3, 8, 1, 9, 0, 9, 9, 8, 7, 5, 2, 7, 9, 6, 5, 1, 6, 7, 3, 0, 3, 3, 6, 9, 5, 4, 9, 3, 2, 5, 7, 2, 9, 1};
}

