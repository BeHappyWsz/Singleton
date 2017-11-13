/**
 * 懒汉模式1
 * @author wsz
 * @date 2017年11月13日
 */
public class Singleton2 {

    private static Singleton2 s1 =  null;

    private Singleton2(){ }

    public static synchronized Singleton2 getInstance() {
        if (null == s1){
            s1 = new Singleton2();
        }
        return s1;
    }
}
