import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * \* User: 史锴源
 * \* Date: 2019/5/5
 * \* Time: 22:11
 * \* Description:为了测验List是否可修改、牵扯到浅拷贝
 * \
 */
public class UnmodifiedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        List unmodifiableList = Collections.unmodifiableList(list);
        System.out.println(unmodifiableList);//[wyp, good]
    }
}