package wxl.com.a2_second_day.strategy;

/**
 * Created on 2016/8/9.
 *
 * @author wuxiaoliang
 * @since 1.0
 *
 * 此类违背了单一职责原则，除了承担计算公交车和地铁乘坐交个的职责，另一个问题就是通过if-else的形式判断使用
 * 哪种计算方式。增加一种出行方式时，需要修改该类。代码也会变得臃肿。if-else语句会增加。
 */
public class PriceCalculator {
    //公交车类型
    private static int BUS = 1;
    //地铁
    private static int SUBWAY = 2;

    /**
     *十公里之内一元钱，超过十公里之后没加一元钱可以乘坐5公里
     * @param km
     * @return
     */
    private int busPrice(int km) {
        int extralTotal = km - 10;
        int extraFactor = extralTotal / 5;
        int fraction = extraFactor % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

    private int subwayPrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km >6 && km <=12) {
            return 4;
        } else if (km > 12 && km <=22) {
            return 5;
        } else if (km >22 && km <32) {
            return 6;
        }
        return 7;
    }

    int calculatePrice(int km, int type) {
        if (type == 1) {
            return busPrice(km);
        } else if (type == 2) {
            return subwayPrice(km);
        }
        return 0;
    }

}
