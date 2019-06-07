import java.util.Arrays;

/**
 * \* User: 史锴源
 * \* Date: 2019/4/20
 * \* Time: 19:53
 * \* Description:归并排序
 * \
 */
public class Solution_4 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 6, 3, 4, 11, 4};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int x = 0; x < temp.length; x++) {
                a[x + low] = temp[x];
        }
    }
}