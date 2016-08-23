package example.wxl.model.design;

import org.junit.Test;

import example.wxl.model.design.builder.Builder;
import example.wxl.model.design.builder.Director;
import example.wxl.model.design.builder.MacbookBuilder;
import example.wxl.model.design.prototype.WordDocument;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    /**
     * 在现实开发中，director经常会被省略，而是直接使用一个builder来进行对象的组装，builder通常为链式调用，
     * 关键点是每个set方法都返回自身，也即是return this，
     * new TestBuilder().setA("a").setB("b").create();
     */
    @Test
    public void pattern_builder() {
        Builder builder = new MacbookBuilder();
        Director director = new Director(builder);
        director.construct("因特尔主板", "retina显示器");
        System.out.println(builder.create().toString());
    }

    /**
     * 原型模式的使用与测试
     */
    @Test
    public void protoTypeTest() throws CloneNotSupportedException {
        WordDocument wordDocument = new WordDocument();
        WordDocument clone = wordDocument.clone();
    }
}