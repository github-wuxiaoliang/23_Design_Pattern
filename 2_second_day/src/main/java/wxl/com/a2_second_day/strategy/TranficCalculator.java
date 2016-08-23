package wxl.com.a2_second_day.strategy;

/**
 * Created on 2016/8/9.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public class TranficCalculator {
    ICalculateStrategy mCalculateStrategy;

    public ICalculateStrategy getCalculateStrategy() {
        return mCalculateStrategy;
    }

    /**
     * 通过set方法传递具体的策略类进来。
     * @param calculateStrategy
     */
    public void setCalculateStrategy(ICalculateStrategy calculateStrategy) {
        mCalculateStrategy = calculateStrategy;
    }

    public int calculatePrice(int km) {
        //实际调用的是传进来的具体的策略实现类。
        return mCalculateStrategy.calculatePrice(km);
    }
}
