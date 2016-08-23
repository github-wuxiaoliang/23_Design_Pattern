package wxl.com.a4_forth_day.command.experience;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 具体命令者
 */
public class TransformCommand implements Command {
    private TetrisMachine mMachine;

    public TransformCommand(TetrisMachine machine) {
        mMachine = machine;
    }

    @Override
    public void execute() {
        mMachine.transform();
    }
}
