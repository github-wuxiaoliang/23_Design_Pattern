package wxl.com.a2_second_day;

import org.junit.Test;

import wxl.com.a2_second_day.factory_pattern.AudiCarFactory;
import wxl.com.a2_second_day.factory_pattern.AudiQ3;
import wxl.com.a2_second_day.factory_pattern.AudiQ5;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_factory() throws Exception {
        AudiCarFactory factory = new AudiCarFactory();
        AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigation();
        AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigation();
    }
}