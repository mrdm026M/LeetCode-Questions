package org.questions;

import java.util.*;

public class UniqueMorseCodeWords_804 {
    public static void main(String[] args) {
        String[] words = new String[]{"a"};
        int result = uniqueMorseRepresentations(words);
        System.out.println(result);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> morseCode = new HashSet<>();

        for (String s: words) {
            morseCode.add(morseCodeString(s));
        }

        return morseCode.size();
    }

    private static String morseCodeString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(morseString(s.charAt(i)));
        }

        return sb.toString();
    }

    private static String morseString(char charAt) {
        return switch (charAt) {
            case 'a' -> ".-";
            case 'b' -> "-...";
            case 'c' -> "-.-.";
            case 'd' -> "-..";
            case 'e' -> ".";
            case 'f' -> "..-.";
            case 'g' -> "--.";
            case 'h' -> "....";
            case 'i' -> "..";
            case 'j' -> ".---";
            case 'k' -> "-.-";
            case 'l' -> ".-..";
            case 'm' -> "--";
            case 'n' -> "-.";
            case 'o' -> "---";
            case 'p' -> ".--.";
            case 'q' -> "--.-";
            case 'r' -> ".-.";
            case 's' -> "...";
            case 't' -> "-";
            case 'u' -> "..-";
            case 'v' -> "...-";
            case 'w' -> ".--";
            case 'x' -> "-..-";
            case 'y' -> "-.--";
            case 'z' -> "--..";
            default -> "";
        };
    }
}
