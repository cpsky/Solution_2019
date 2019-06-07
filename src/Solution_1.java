import java.util.ArrayList;

/**
 * \* User: 史锴源
 * \* Date: 2019/4/20
 * \* Time: 16:12
 * \* Description:求一个集合的所有子集,通过位运算
 * \
 */
public class Solution_1 {
    public static void main(String[] args){
        ArrayList<Integer> L = new ArrayList<Integer>();
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        System.out.println(getSubset(L));
    }
    public static ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> list){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(list.size() < 0)
            return null;
        for(int i = 0; i < Math.pow(2, list.size()); i++) {
            int index = i;
            ArrayList<Integer> subSet = new ArrayList<Integer>();
            for(int j = 0; j < list.size(); j++) {
                if((index & 1) == 1) {
                    subSet.add(list.get(j));
                }
                index >>= 1;
            }
            result.add(subSet);
        }
        return result;
    }
}