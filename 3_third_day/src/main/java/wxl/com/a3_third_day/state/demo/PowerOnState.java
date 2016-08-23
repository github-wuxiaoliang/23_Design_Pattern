package wxl.com.a3_third_day.state.demo;

/**
 * Created on 2016/8/10.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 开机状态
 */
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("nextChannel");
    }

    @Override
    public void prevChannel() {
        System.out.println("prevChannel");

    }

    @Override
    public void turnUp() {
        System.out.println("turnUp");
    }

    @Override
    public void turnDown() {
        System.out.println("turnDown");
    }
}
