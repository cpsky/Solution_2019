import java.util.Arrays;

/**
 * \* User: 史锴源
 * \* Date: 2019/4/20
 * \* Time: 16:16
 * \* Description:快排
 * \
 */
public class Solution_2 {
    public static void main(String[] args){
        int[] demo = {6,4,6,8,2,3,5,11,99,2,2324,242,2,42,124,1241,12312,21,2};
        qsort(demo,0,demo.length - 1);
        System.out.println(Arrays.toString(demo));
    }
    public static void qsort(int[] l, int low, int high){
        int key;
        if(low < high){
            key = partition(l, low, high);
            qsort(l, low, key - 1);
            qsort(l, key + 1, high);
        }
    }
    public static int partition(int[] l, int low, int high){
        int key = l[low];
        while(low < high){
            while(low < high && key <= l[high]){
                high --;
            }
            swap(l, low, high);
            while(low < high && key >= l[low]){
                low ++;
            }
            swap(l, low, high);
        }
        return low;
    }
    public static void swap(int[] l, int low, int high){
        int a = l[low];
        l[low] = l[high];
        l[high] = a;
    }
}