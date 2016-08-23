package wxl.com.a4_forth_day.command.demo;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 定义所有具体命令类的抽象接口
 */
public interface Command {
    /**
     * 执行具体的命令
     */
    void execute();
}
