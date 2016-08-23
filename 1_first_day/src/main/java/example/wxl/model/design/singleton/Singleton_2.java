package example.wxl.model.design.singleton;

/**
 * Created on 2016/8/8.
 *
 * @author wuxiaoliang
 * @since 1.0
 *
 * 静态内部类,
 * 第一次加载该类时不会初始化 mInstance
 * 第一次调用getInstance()才会导致mInstance被初始化，
 */
public class Singleton_2 {
    private Singleton_2() {
    }


    private static class SingletonHolder {
        private static final Singleton_2 mInstance = new Singleton_2();
    }

    public static Singleton_2 getInstance() {
        return SingletonHolder.mInstance;
    }

}
