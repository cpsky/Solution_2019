package classload;

/**
 * \* User: 史锴源
 * \* Date: 2019/4/22
 * \* Time: 10:01
 * \* Description:
 * \
 */
public class TestSingleton {
    public static void main(String args[]){
        System.out.println(FinalTest.x);
    }
}
class FinalTest{
    static String x = "a";
    static {
        System.out.println("FinalTest static block");
    }
}