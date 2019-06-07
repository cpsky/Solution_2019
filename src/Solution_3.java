import java.util.Arrays;

/**
 * \* User: 史锴源
 * \* Date: 2019/4/20
 * \* Time: 16:25
 * \* Description:堆排序 (完全二叉树可以使用数组储存)
 * \
 */
public class Solution_3 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 1, 9, 10, 3};
        sort(a, 5);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int n) {
        bulidHeap(a, n);
        int k = n;
        while (k > 1) {
            swap(a, k, 1);
            --k;
            heapify(a, k, 1);
        }
    }

    public static void bulidHeap(int[] a, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(a, n, i);
        }
    }

    public static void heapify(int[] a, int n, int i) {
        while (true) {
            int maxPos = i;
            if (2 * i <= n && a[i] < a[2 * i]) maxPos = i * 2;
            if (2 * i + 1 <= n && a[maxPos] < a[i * 2 + 1]) maxPos = i * 2 + 1;
            if (maxPos == i) break;
            swap(a, i, maxPos);
            i = maxPos;
        }
    }

    public static void swap(int[] l, int low, int high) {
        int a = l[low];
        l[low] = l[high];
        l[high] = a;
    }
}