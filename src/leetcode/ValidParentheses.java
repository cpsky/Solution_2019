package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * \* User: sky
 * \* Date: 2019/6/6
 * \* Time: 21:28
 * \* Description:Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * \
 */
public class ValidParentheses {
    static Map<Character, Character> mappings = new HashMap<>();

    static {
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');
    }

    public static void main(String[] args) {
        System.out.println(isValid("({)}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (mappings.containsKey(c)) {
                stack.push(mappings.get(c));
            } else if (mappings.containsValue(c)) {
                if (stack.empty() || stack.pop() != c) {
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