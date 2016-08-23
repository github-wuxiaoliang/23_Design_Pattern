package wxl.com.a2_second_day.factory_pattern;

/**
 * Created on 2016/8/8.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> c);
}
