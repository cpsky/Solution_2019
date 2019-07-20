package leetcode.Pascal_Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * \* Author: sky
 * \* Date: 2019/7/20
 * \* Description:https://leetcode.com/problems/pascals-triangle/submissions/ 杨辉三角
 * \
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
 * Memory Usage: 34 MB, less than 5.04% of Java online submissions for Pascal's Triangle.
 */
public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> r = generate(3);
        System.out.println(r.get(2));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList<>();
        List temp = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i;j ++) {
                if (j == 0 || j ==i) {
                    temp.add(1);
                } else  if (i -  1 >= 0 && j - 1 >= 0){
                    temp.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(temp);
            temp = new ArrayList();
        }
        return res;
    }
}