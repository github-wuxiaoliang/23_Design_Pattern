package wxl.com.a3_third_day.chain;

/**
 * Created on 2016/8/10.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public abstract class Leader {
    public Leader nextLeader;

    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (nextLeader != null) {
                nextLeader.handleRequest(money);
            }
        }
    }

    protected abstract int limit();

    protected abstract void handle(int money);
}
