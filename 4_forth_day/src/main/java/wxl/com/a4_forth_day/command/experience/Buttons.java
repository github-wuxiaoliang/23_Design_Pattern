package wxl.com.a4_forth_day.command.experience;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 请求者类，命令由按钮发起
 */
public class Buttons {

    private LeftCommand mLeftCommand;
    private RightCommand mRightCommand;
    private FallCommand mFallCommand;
    private TransformCommand mTransformCommand;

    public void setTransformCommand(TransformCommand transformCommand) {
        mTransformCommand = transformCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        mFallCommand = fallCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        mRightCommand = rightCommand;
    }

    public void setLeftCommand(LeftCommand leftCommand) {
        mLeftCommand = leftCommand;
    }

    public void toLeft() {
        mLeftCommand.execute();
    }

    public void toRight() {
        mRightCommand.execute();
    }

    public void fall() {
        mFallCommand.execute();
    }

    public void transform() {
        mTransformCommand.execute();
    }
}
