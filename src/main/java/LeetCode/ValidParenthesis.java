package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();
        for(char character : s.toCharArray()) {
            if (map.containsKey(character)) {
                stack.push(character);
            } else {
                if(!stack.empty() && character == map.get(stack.peek())){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        }

        return false;
    }
}
