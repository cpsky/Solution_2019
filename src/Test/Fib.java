package Test;

/**
 * \* Author: sky
 * \* Date: 2019/6/19
 * \* Description:
 * \
 */
public class Fib {
    public static void main(String[] args) {
        System.out.println(Fibonacci(6));
        System.out.println(fib(6));
    }

    public static int Fibonacci(int n) {
        if (n <= 0)
            return n;
        int[] Memo = new int[n + 1];
        for (int i = 0; i <= n; i++)
            Memo[i] = -1;
        return fib(n, Memo);
    }

    public static int fib(int n, int[] Memo) {

        if (Memo[n] != -1)
            return Memo[n];
        //如果已经求出了fib（n）的值直接返回，否则将求出的值保存在Memo备忘录中。
        if (n <= 2)
            Memo[n] = 1;

        else Memo[n] = fib(n - 1, Memo) + fib(n - 2, Memo);

        return Memo[n];
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        int res = 0;
        int a1 = 1;
        int a2 = 1;
        for (int i = 3; i <= n; i++) {
            res = a1 + a2;
            a1 = a2;
            a2 = res;
        }
        return res;
    }
}