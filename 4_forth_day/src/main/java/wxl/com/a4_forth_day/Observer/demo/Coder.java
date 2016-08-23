package wxl.com.a4_forth_day.Observer.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 程序员你类，观察者
 */
public class Coder implements Observer {

    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("hi, " + name + ", DevTechFrontier更新啦，内容 ：" + o);
    }

    @Override
    public String toString() {
        return "码农" + name;
    }
}
