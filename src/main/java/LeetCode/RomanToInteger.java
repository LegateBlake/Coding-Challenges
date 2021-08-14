package LeetCode;

public class RomanToInteger {
    private int value (char numeral) {
        if (numeral == 'I') {
            return 1;
        }
        if (numeral == 'V') {
            return 5;
        }
        if (numeral == 'X') {
            return 10;
        }
        if (numeral == 'L') {
            return 50;
        }
        if (numeral == 'C') {
            return 100;
        }
        if (numeral == 'D') {
            return 500;
        }
        if (numeral == 'M') {
            return 1000;
        }
        return -1;
    }

    public int romanToInt(String s) {
        int output = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int cur = value(chars[i]);
            if(i + 1 < chars.length) {
                int next = value(chars[i+1]);
                if(next > cur) {
                    output -= cur;
                } else {
                    output += cur;
                }
            }
            else {
                output += cur;
            }
        }

        return output;
    }
}
