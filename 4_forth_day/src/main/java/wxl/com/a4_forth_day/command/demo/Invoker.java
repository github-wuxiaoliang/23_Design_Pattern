package wxl.com.a4_forth_day.command.demo;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 *
 * 请求者角色，该类的职责就是调用命令对象执行具体的请求，相关方法称之为行动方法，当我们点击关机按钮后，
 * 这个关机方法会去调用具体的命令执行具体的逻辑。
 */
public class Invoker {
    private Command mCommand;

    public Invoker(Command command) {
        mCommand = command;
    }

    public void action() {
        mCommand.execute();
    }
}
