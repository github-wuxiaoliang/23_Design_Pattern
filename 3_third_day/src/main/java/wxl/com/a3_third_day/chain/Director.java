package wxl.com.a3_third_day.chain;

/**
 * Created on 2016/8/10.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public class Director extends Leader {
    @Override
    protected int limit() {
        return 5000;
    }

    @Override
    protected void handle(int money) {
        System.out.println("主管报销" + money + "元");
    }
}
