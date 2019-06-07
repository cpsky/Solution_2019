/**
 * \* User: 史锴源
 * \* Date: 2019/4/20
 * \* Time: 20:44
 * \* Description:青蛙跳
 * \
 */
public class Solution_6 {
    public static void main(String[] args) {
        System.out.println(Count(4));
        System.out.println(Count1(4));
    }

    public static int Count(int n) {
        int res;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        else {
            return Count(n - 1) + Count(n - 2);
        }
    }

    public static int Count1(int n) {
        int a = 1, b = 2, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    //跳1,2,3
    public static int Count2(int n) {
        if(n <= 1) {
            return 1;
        }
        else
            return 2 * Count2(n-1);
    }
}