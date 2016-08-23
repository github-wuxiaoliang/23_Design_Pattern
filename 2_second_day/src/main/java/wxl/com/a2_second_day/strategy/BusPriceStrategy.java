package wxl.com.a2_second_day.strategy;

/**
 * Created on 2016/8/9.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 公交策略类
 */
public class BusPriceStrategy implements ICalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int extralTotal = km - 10;
        int extraFactor = extralTotal / 5;
        int fraction = extraFactor % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
