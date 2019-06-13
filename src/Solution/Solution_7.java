package Solution;

/**
 * \* User: 史锴源
 * \* Date: 2019/4/21
 * \* Time: 10:03
 * \* Description:删除数组中重复元素（排好序），返回长度
 * \
 */
public class Solution_7 {
    public static void main(String[] args){
        int[] a = new int[]{1, 1, 2, 2, 3};
        System.out.println(size(a));
    }
    public static int size(int[] a){
        int cur = 0, pre = 0, n = a.length;
        while(cur < n){
            if(a[cur] == a[pre]){
                cur ++;
            }
            else{
                pre++;
                a[pre] = a[cur];
                cur ++;
            }
        }
        return pre + 1;
    }
}