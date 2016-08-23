package wxl.com.a2_second_day.factory_pattern;

/**
 * Created on 2016/8/8.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public class AudiCarFactory extends AudiFactory {
    @Override
    public  <T extends AudiCar> T createAudiCar(Class<T> c) {
        try {
            //利用反射的方式更简洁的生产具体产品对象
            AudiCar audiCar = (AudiCar) Class.forName(c.getName()).newInstance();
            return (T) audiCar;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
