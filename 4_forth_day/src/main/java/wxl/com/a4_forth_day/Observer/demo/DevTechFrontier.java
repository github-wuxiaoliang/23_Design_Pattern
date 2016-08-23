package wxl.com.a4_forth_day.Observer.demo;

import java.util.Observable;

/**
 * Created on 2016/8/13.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 被观察者
 */
public class DevTechFrontier extends Observable {
    public void postNewPublication(String content) {
        //标识状态或者内容改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
