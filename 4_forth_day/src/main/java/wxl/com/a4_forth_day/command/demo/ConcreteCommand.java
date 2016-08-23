package wxl.com.a4_forth_day.command.demo;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 具体命令的实现类，在execute方法中调用接收者角色的相关方法，在接收者和命令执行的具体行为之间加以弱耦合。
 * execute通常称为执行方法，本文开头所诉“关机的”操作实现，具体可能还包含很多操作，如关闭进程，保存数据，
 * 如果将这一系列具体的逻辑处理看做接收者，那么调用这些具体逻辑的方法就可以看作是执行方法。
 */
public class ConcreteCommand implements Command {
    private Receiver mReceiver;

    public ConcreteCommand(Receiver receiver) {
        this.mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
