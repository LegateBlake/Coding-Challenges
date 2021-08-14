package LeetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String output = "";

        int smallestIndex = 0;
        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minSize) {
                minSize = strs[i].length();
                smallestIndex = i;
            }
        }

        String smallest = strs[smallestIndex];
        for (int i = smallest.length(); i > 0; i--) {
            boolean doAllContain = true;
            for (String str : strs) {
                if (!str.startsWith(smallest.substring(0, i))) {
                    doAllContain = false;
                    break;
                }
            }
            if (doAllContain) {
                return smallest.substring(0, i);
            }
        }

        return output;
    }
}
