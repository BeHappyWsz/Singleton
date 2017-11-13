/**
 * 基础懒汉模式
 * @author wsz
 * @date 2017年11月13日
 */
public class Singleton1 {

    private static Singleton1 s1 =  null;

    private Singleton1(){ }

    public static Singleton1 getInstance() {
        if (null == s1){
            s1 = new Singleton1();
        }
        return s1;
    }
}
