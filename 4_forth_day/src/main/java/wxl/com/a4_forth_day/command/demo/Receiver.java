package wxl.com.a4_forth_day.command.demo;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 *
 * 命令接收者,该类负责实施或执行一个请求，通俗点就是，执行具体逻辑的角色，真正执行各项关机逻辑的底层代码，
 * 封装具体操作逻辑的方法我们称之为行动方法。
 *
 */
public class Receiver {
    public void action() {
        System.out.println("执行具体操作");
    }
}
