package example.wxl.model.design.prototype;

import java.util.ArrayList;

/**
 * Created on 2016/8/8.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public class WordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("------------WordDocument构造函数-----------");
    }


    @Override
    public WordDocument clone() throws CloneNotSupportedException {
        WordDocument wordDocument = (WordDocument) super.clone();
        //浅拷贝,并不是将原始对象的所有字段都重新构造一份，而是对象副本。
//        wordDocument.mText = this.mText;
//        wordDocument.mImages = this.mImages;
        //深拷贝,将对象的属性也复制一份
        wordDocument.mImages = (ArrayList<String>) this.mImages.clone();
        return wordDocument;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void setImages(ArrayList<String> images) {
        mImages = images;
    }
}
