package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * \* User: 史锴源
 * \* Date: 2019/5/15
 * \* Time: 9:07
 * \* Description:最小差值
 * https://leetcode-cn.com/problems/smallest-range-ii/
 * 先排序，在某个节点上 前面数字全部减去，后面数字全部加上 找到这个点 就是最小值
 * \
 */
public class Solution910 {
    public static void main(String[] args){
        int[] A = {1, 3, 6};
        int K = 3;
        System.out.println(smallestRangeII(A, K));
    }
    public static int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int res = A[A.length - 1] - A[0];
        for(int i = 0; i < A.length -1 ; i++){
            int max = Math.max(A[A.length - 1] - K, A[i] + K);
            int min = Math.min(A[i + 1] - K, A[0] + K);
            res = Math.min(max - min ,res);
        }
        return res;
    }
}