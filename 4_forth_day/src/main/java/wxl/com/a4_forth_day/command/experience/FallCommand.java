package wxl.com.a4_forth_day.command.experience;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public class FallCommand implements Command {
    private TetrisMachine mMachine;

    public FallCommand(TetrisMachine machine) {
        mMachine = machine;
    }

    @Override
    public void execute() {
        mMachine.fastToButtom();
    }
}
