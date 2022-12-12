package org.questions;

public class FirstUniqueCharacterString_387 {
    public static void main(String[] args) {
        String str = "aabb";
        int idx = firstUniqChar(str);
        System.out.println(idx);
    }

    public static int firstUniqChar(String s) {
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            int startIdx = s.indexOf(s.charAt(i));
            int endIdx = s.lastIndexOf(s.charAt(i));

            if (startIdx == endIdx) {
                idx = i;
                break;
            } else {
                idx = -1;
            }
        }

        return idx;
    }
}
