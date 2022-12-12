package org.questions;

public class MaximumRepeatingSubstring_1668 {
    public static void main(String[] args) {
        String word = "aaaba";
        String seq = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        int result = maxRepeating(seq, word);
        System.out.println(result);
    }

    private static int maxRepeating(String seq, String word) {
        int count = 0;
        StringBuilder sb = new StringBuilder(seq);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.toString().startsWith(word)) {
                sb.replace(0, sb.length(), seq.substring(i + word.length()));
                count++;
            } else {
                sb.replace(0, sb.length(), seq.substring(i + 1));
            }
        }

        return count;
    }
}
