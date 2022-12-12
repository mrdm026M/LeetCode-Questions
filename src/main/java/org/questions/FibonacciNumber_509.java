package org.questions;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber_509 {
    public static void main(String[] args) {
        int n = 2;
        int result = fib(n);
        System.out.println(result);
    }

    // method 1 - DP, Iterative
    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = 0;

        while (n > 1) {
            sum = a + b;
            a = b;
            b = sum;
            n -= 1;
        }

        return sum;
    }

    // method 2 - DP, Recursive
//    public static int fib(int N) {
//        if (N <= 1) {
//            return N;
//        }
//
//        // initialize our memoization map and put our base cases
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(0, 0);
//        map.put(1, 1);
//
//        return fib(N, map);
//    }
//
//    private static int fib(int N, Map<Integer, Integer> map) {
//        if (!map.containsKey(N)) {
//            int currentFib = fib(N - 1, map) + fib(N - 2, map);
//            map.put(N, currentFib);
//        }
//
//        return map.get(N);
//    }
}
