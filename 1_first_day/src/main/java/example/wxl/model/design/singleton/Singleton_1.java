package example.wxl.model.design.singleton;

/**
 * Created on 2016/8/8.
 *
 * @author wuxiaoliang
 * @since 1.0
 *
 *
 * 双重校验锁机制
 */
public class Singleton_1 {
    private Singleton_1() {

    }
    private static Singleton_1 mInstance;

    public static Singleton_1 getInstance() {
        if (mInstance == null) {
            synchronized (Singleton_1.class) {
                if (mInstance == null) {
                    mInstance = new Singleton_1();
                }
            }
        }
        return mInstance;
    }
}
