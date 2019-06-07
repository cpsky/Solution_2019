/**
 * \* User: 史锴源
 * \* Date: 2019/4/20
 * \* Time: 20:35
 * \* Description:括号问题
 * \
 */
public class Solution_5 {
    static int num = 0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count = 3;
        char[] str2 = new char[count * 2];
        Out(count, count, str2, 0);
        System.out.println(num);
    }
    
    public static void Out(int l, int r, char[] str, int count) {
        if (l < 0 || r < l)
            return;
        if (r == 0 && l == 0) {
            num++;
            System.out.println(str);
        } else {
            if (l > 0) {
                str[count] = '(';
                Out(l - 1, r, str, count + 1);
            }
            if (r > l) {
                str[count] = ')';
                Out(l, r - 1, str, count + 1);
            }
        }
    }
}