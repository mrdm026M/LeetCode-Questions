package org.questions;

public class CountSquareSumTriples_1925 {
    public static void main(String[] args) {
        int n = 5;
        int result = countTriples(n);
        System.out.println(result);
    }

    public static int countTriples(int n) {
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                double c = Math.sqrt(i*i + j*j);
                if(c == (int) c && c <= n) temp++;
            }
        }
        return temp * 2;
    }
}
