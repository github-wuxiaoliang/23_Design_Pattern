package wxl.com.a2_second_day.factory_pattern;

/**
 * Created on 2016/8/8.
 *
 * @author wuxiaoliang
 * @since 1.0
 */
public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q5 qi dong le");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5 start navigation");
    }
}
