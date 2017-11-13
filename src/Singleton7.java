/**
 * 枚举实现单例
 * @author wsz
 * @date 2017年11月13日
 */
public enum Singleton7 {
    INSTANCE;

    public void say(){
        System.out.println("haha");
    }

    public static void main(String[] args){
        Singleton7 instance = Singleton7.INSTANCE;
        instance.say();
    }
}
