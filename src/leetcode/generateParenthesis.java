package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * \* User: sky
 * \* Date: 2019/6/5
 * \* Time: 19:56
 * \* Description:
 * \Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
public class generateParenthesis {

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<String>();
        char[] str = new char[2 * n];
        printPar(n, n, str, 0, list);
        return list;
    }

    public static void printPar(int l, int r, char[] str, int count, ArrayList<String> ss) {//l,r为剩下个数
        if (l < 0 || r < l) return;
        if (l == 0 && r == 0) {
            ss.add(String.valueOf(str));
        } else {
            if (l > 0) {
                str[count] = '(';
                printPar(l - 1, r, str, count + 1, ss);
            }
            if (r > l) {
                str[count] = ')';
                printPar(l, r - 1, str, count + 1, ss);
            }
        }

    }
}