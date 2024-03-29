package Solution;

/**
 * \* User: 史锴源
 * \* Date: 2019/4/21
 * \* Time: 10:22
 * \* Description:去石子问题，看谁拿的多
 * \
 */

public class Solution_8 {
    static int[] d; // 储存结果
    static int[] coins = {1,3,4}; // 硬币种类

    public static void d_func(int i, int num) {
        if (i == 0) {
            d[i] = 0;
            d_func(i + 1, num);
        } else {
            int min = 9999999; // 初始化一个很大的数值。当最后如果得出的结果是这个数时，说明凑不出来。
            for (int coin : coins) {
                if (i >= coin && d[i - coin] + 1 < min) {
                    min = d[i - coin] + 1;
                }
            }
            d[i] = min;

            if (i < num) {
                d_func(i + 1, num);
            }
        }
    }
    public static int dd_func(int i, int[] dp) {
        if (i == 2 || i == 6 || i == 4) {
            return 1;
        }
        if (dp[i] != 0) {
            return dp[i];
        }
        dp[i] = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (i - coin > 0) {
            int temp = dd_func(i - coin, dp) + 1;
            dp[i] = Math.min(dp[i], temp);}
        }
        return dp[i];
    }

    public static void main(String[] args) {
        int sum = 9; // 需要凑 11 元
        d = new int[sum + 1]; // 初始化数组
        int[] e = new int[sum + 1];
        d_func(0, sum); // 计算需要凑出 0 ～ sum 元需要的硬币数量
        for (int i = 0; i <= sum; i++) {
            System.out.println("凑齐 " + i + " 元需要 " + d[i] + " 个硬币");
        }
        System.out.println("aa" +dd_func(sum,e));
    }
}