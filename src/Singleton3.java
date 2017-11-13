/**
 * 懒汉模式3 双重检查锁
 * @author wsz
 * @date 2017年11月13日
 */
public class Singleton3 {

    private static Singleton3 s1 =  null;

    private Singleton3(){ }

    public static synchronized Singleton3 getInstance() {
        if (null == s1){
            synchronized (Singleton3.class){
                if (null == s1){
                    s1 = new Singleton3();
                }
            }
        }
        return s1;
    }
}
