/* For user-prompted input consisting of long values n and m,
 * this algorithm calculates the nth term in the Fibonacci
 * sequence modulo m. "Pisano period" refers to the periodic
 * sequence yielded from the Fibonacci sequence modulo m for
 * any integer m >= 2.
 */

import java.util.*;

public class FibonacciHuge {
    
    private static long getFibonacciHuge(long n, long m) {
        ArrayList<Long> pisanoPeriod = new ArrayList<Long>();
        long a = 0, b = 1, c;
        pisanoPeriod.add(a);
        pisanoPeriod.add(b);
        long i = 2;
        while (true) {
            c = (a + b) % m;
            if (c == 1 && b == 0) break;
            pisanoPeriod.add(c);
            a = b;
            b = c;
            i++;
        }
        i--;
        return pisanoPeriod.get((int)(n % i));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n, m));
    }
}

