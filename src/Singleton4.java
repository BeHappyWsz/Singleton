/**
 * 懒汉模式4
 * @author wsz
 * @date 2017年11月13日
 */
public class Singleton4 {

    private static volatile Singleton4 s4 =  null;

    private Singleton4(){ }

    public static  Singleton4 getInstance() {
        if (null == s4){
            synchronized (Singleton4.class){
                if (null == s4){
                    s4 = new Singleton4();
                }
            }
        }
        return s4;
    }
}
