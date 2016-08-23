package wxl.com.a5_fifth_day.iterator.demo;

/**
 * Created on 2016/8/14.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public interface MyIterator<T> {
    /**
     * 是否还有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移至下一位
     * @return
     */
    T next();
}
