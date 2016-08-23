package wxl.com.a3_third_day.state.demo;

/**
 * Created on 2016/8/10.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public class TvController implements PowerController {
    private TvState mTvState;

    public void setTvState(TvState tvState) {
        mTvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
