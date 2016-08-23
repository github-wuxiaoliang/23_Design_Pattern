package example.wxl.model.design.builder;

/**
 * Created on 2016/8/8.
 *
 * @author wuxiaoliang
 * @since 1.0
 * Director类，复杂构造computer
 */
public class Director {
    Builder mBuilder;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs();
    }
}
