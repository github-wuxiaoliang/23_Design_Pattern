package wxl.com.a2_second_day.strategy;

/**
 * Created on 2016/8/9.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 计算接口，再添加具体的策略类时只需实现该接口即可。
 */
public interface ICalculateStrategy {
    int calculatePrice(int km);
}
