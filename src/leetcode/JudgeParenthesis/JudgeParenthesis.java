package leetcode.JudgeParenthesis;

/**
 * \* User: sky
 * \* Date: 2019/6/5
 * \* Time: 22:45
 * \* Description:Given a string containing only three types of characters: '(', ')'
 * and '*', write a function to check whether this string is valid.
 * We define the validity of a string by these rules:
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 * \
 */
public class JudgeParenthesis {
    public static void main(String[] args) {
        System.out.println(isTrue("(*))"));
        System.out.println(isTrue("()"));
        System.out.println(isTrue("*()(())*()(()()((()(()()*)(*(())((((((((()*)(()(*)"));
    }

    public static boolean isTrue(String s) {
        int lo = 0, hi = 0;
        for (char c: s.toCharArray()) {
            lo += c == '(' ? 1 : -1;
            hi += c != ')' ? 1 : -1;
            if (hi < 0) return false;
            lo = Math.max(lo, 0);
        }
        return lo == 0;
    }
}