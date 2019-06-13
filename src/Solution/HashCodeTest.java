package Solution;

import java.util.HashMap;

/**
 * \* User: 史锴源
 * \* Date: 2019/5/7
 * \* Time: 19:30
 * \* Description:Integer++先拆箱 后装箱 所以会生成新的对象
 * \
 */
public class HashCodeTest {
    public static void main(String[] args){
        HashMap<String, String> mapp= new HashMap<String, String>();
        String a = new String("a");
        String b = new String("b");
        String c = new String("a");
        b = c;
        Integer n = new Integer(1);
        Integer m = n;
        n ++;
        System.out.println(m + " " + n);
        System.out.println(b);
        if(a == c){
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
        System.out.println(a == c);
        System.out.println(a.hashCode() + "   " + c.hashCode());
        Student s = new Student("xiaoming", 1);
        Student ss = s;
        s.setName("hehehehheh");
        System.out.println(ss.getName());
        Integer inttest=new Integer(15);
        Integer inttest2 = ++inttest;//跟 ++的位置有关
        System.out.println(inttest==inttest2);
    }
}
class Student{
    private String name;
    private int id;
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
}