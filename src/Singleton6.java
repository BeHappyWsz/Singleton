/**
 * 内部类Holder模式
 * @author wsz
 * @date 2017年11月13日
 */
public class Singleton6 {

    private Singleton6(){
        System.out.println("singleton");
    }

    private static class SingletonHolder{
        public   SingletonHolder(){
            System.out.println("holder");
        }
        private static Singleton6 s6 =  new Singleton6();
    }

    public static Singleton6 getInstance() {
        System.out.println("getInstance");
        return SingletonHolder.s6;
    }

    public static void main(String[] args){
        Singleton6 instance = Singleton6.getInstance();
    }
}
