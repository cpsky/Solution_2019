package lambda;

/**
 * \* User: sky
 * \* Date: 2019/6/9
 * \* Time: 14:57
 * \* Description:
 * \
 */
public class HelloWorld {
    public static void main(String[] args) {
        MyLamda hello = () -> System.out.println("hello world");
        System.out.println(hello);
    }
}
interface MyLamda {
    void foo();
}