package kmp;

import java.util.Arrays;

/**
 * \* Author: sky
 * \* Date: 2019/6/24
 * \* Description:
 * \
 */
public class Solution {
    public static void main(String[] args) {
        char[] b = {'a','b','a','a','b','c','a','c'};
        char[] f = {'a','b','c','a','b','a','a','b','c','a','c','d'};
        int[] next = getNexts(b);
        System.out.println(Arrays.toString(next));
        getNextval(b);
        System.out.println(kmp(b,f));
    }
    //b为模式 c为长字符串
    public static int kmp(char[] b, char[] c) {
        int[] next = getNexts(b);
        int j = 1,i = 1;
        while (j < b.length && i < c.length) {
            if (j == 0 || b[j - 1] == c[i - 1]) {
                i++;j++;
            } else {
                j = next[j - 1];
            }
        }
        if (j > b.length - 1) return i - b.length;
        return -1;
    }
    public static int[] getNexts(char[] b) {
        int[] next = new int[b.length];
        int i = 1,j = 0;
        next[0] = 0;
        while (i < b.length) {
            if (j == 0 || b[i - 1] == b[j - 1]) {
                i++;j++;next[i - 1] = j;
            } else {j = next[j - 1];}
        }
        return next;
    }
    public static int[] getNextval(char[] b) {
        int[] nextval = new int[b.length];
        int i = 1,j = 0;
        nextval[0] = 0;
        while (i < b.length) {
            if (j == 0 || b[i - 1] == b[j - 1]) {
                i++;j++;
                if (b[i - 1] == b[j - 1])
                    nextval[i - 1] = nextval[j - 1];
                else
                    nextval[i - 1] = j;
            } else {j = nextval[j - 1];}
        }
        System.out.println(Arrays.toString(nextval));
        return nextval;
    }
}