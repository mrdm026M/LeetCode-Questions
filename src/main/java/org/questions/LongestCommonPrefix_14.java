package org.questions;


public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strs = new String[]{"aaa", "aa", "aaa"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        String word = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(word)) {
                word = getCommonPrefix(word, strs[i]);
            }
        }

        return word;
    }

    private static String getCommonPrefix(String word, String str) {
        StringBuilder pre = new StringBuilder();
        int length = word.length() > str.length() ? str.length() : word.length();

        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == str.charAt(i)) {
                pre.append(word.charAt(i));
            } else {
                break;
            }
        }

        return pre.toString();
    }
}
