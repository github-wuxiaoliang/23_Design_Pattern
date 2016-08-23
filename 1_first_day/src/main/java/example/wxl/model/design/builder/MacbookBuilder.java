package example.wxl.model.design.builder;

/**
 * Created on 2016/8/8.
 *
 * @author wuxiaoliang
 * @since 1.0
 * 具体的Builder类，MacbookBuilder
 */
public class MacbookBuilder extends Builder {
    private Computer mComputer = new MacBook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String diplay) {
        mComputer.setDisplay(diplay);
    }

    @Override
    public void buildOs() {
        mComputer.setOs();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
