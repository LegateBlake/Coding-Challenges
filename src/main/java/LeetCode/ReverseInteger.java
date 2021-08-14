package LeetCode;

public class ReverseInteger {
    public int reverse(int x) {
        if (x >= Math.pow(2,31)-1 || x <= Math.pow(-2,31) ) {
            return 0;
        }
        int reverse = 0;

        while (x != 0) {
            final int pop = x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reverse = reverse * 10 + pop;
        }

        return reverse;
    }
}
