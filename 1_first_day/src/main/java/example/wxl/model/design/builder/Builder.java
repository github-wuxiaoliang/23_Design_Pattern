package example.wxl.model.design.builder;

/**
 * Created on 2016/8/8.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 抽象builder
 */
public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);
    //设置显示器
    public abstract void buildDisplay(String diplay);
    //设置操作系统
    public abstract void buildOs();
    //创建computer
    public abstract Computer create();
}
