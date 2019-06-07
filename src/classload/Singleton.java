package classload;

/**
 * \* User: 史锴源
 * \* Date: 2019/4/22
 * \* Time: 10:01
 * \* Description:
 * \
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    public static int counter1;
    public static int counter2 = 0;
    private Singleton() {
        counter1++;
        counter2++;
    }
    public static Singleton getSingleton() {
        return singleton;
    }
}