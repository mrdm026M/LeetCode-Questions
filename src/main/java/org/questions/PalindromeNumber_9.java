package org.questions;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        int num = 121;
        boolean output = isPalindrome(num);
        System.out.println(output);
    }

    private static boolean isPalindrome(int num) {
        int temp = 0;
        int res = num;

        while (res > 0) {
            temp = (temp * 10) + (res % 10);
            res = res / 10;
        }

        return temp == num;
    }
}
