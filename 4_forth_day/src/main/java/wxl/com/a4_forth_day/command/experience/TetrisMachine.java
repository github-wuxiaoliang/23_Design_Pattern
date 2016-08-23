package wxl.com.a4_forth_day.command.experience;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 接收者，处理真正的具体逻辑，其它的类都是直接或间接地调用到该类的方法。
 */
public class TetrisMachine {
    /**
     * 向左
     */
    public void toLeft() {
        System.out.println("to left");
    }

    /**
     * 向右
     */
    public void toRight() {
        System.out.println("to right");
    }

    /**
     * 快速落下
     */
    public void fastToButtom() {
        System.out.println("fast to buttom");
    }

    /**
     * 改变形状
     */
    public void transform() {
        System.out.println("transform");
    }
}
