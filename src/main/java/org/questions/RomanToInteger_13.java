package org.questions;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        String s = "III";
        int output = romanToInt(s);
        System.out.println(output);
    }

    private static int romanToInt(String s) {
        int temp = 0;
        for (int i = 0; i <= s.length() - 2; i++) {
            if (valueOfRoman(s.charAt(i)) >= valueOfRoman(s.charAt(i+1))) {
                temp += valueOfRoman(s.charAt(i));
            } else {
                temp -= valueOfRoman(s.charAt(i));
            }
        }

        return temp + valueOfRoman(s.charAt(s.length() - 1));
    }

    private static int valueOfRoman(char s) {
        int num = 0;
        switch (s) {
            case 'I': num = 1; break;
            case 'V': num = 5; break;
            case 'X': num = 10; break;
            case 'L': num = 50; break;
            case 'C': num = 100; break;
            case 'D': num = 500; break;
            case 'M': num = 1000; break;
        }

        return num;
    }
}
