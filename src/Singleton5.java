/**
 * 饿汉模式
 * @author wsz
 * @date 2017年11月13日
 */
public class Singleton5 {

    private static  Singleton5 s5 =  new Singleton5();

    private Singleton5(){ }

    public static Singleton5 getInstance() {
        return s5;
    }
}
