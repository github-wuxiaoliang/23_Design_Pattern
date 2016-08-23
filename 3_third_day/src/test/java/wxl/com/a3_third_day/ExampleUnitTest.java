package wxl.com.a3_third_day;

import org.junit.Test;

import wxl.com.a3_third_day.chain.Director;
import wxl.com.a3_third_day.chain.GroupLeader;
import wxl.com.a3_third_day.chain.Manager;
import wxl.com.a3_third_day.state.demo.TvController;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    /**
     * 状态模式的demo测试
     * @throws Exception
     */
    @Test
    public void testStateDemo() throws Exception {
        TvController tvController = new TvController();
        tvController.powerOn();//开机
        tvController.nextChannel();
        tvController.turnUp();
        tvController.powerOff();//关机
    }

    /**
     * 责任链模式的demo测试
     * @throws Exception
     */
    @Test
    public void testChainDemo() throws Exception {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();

        //设置上一级领导者对象
        groupLeader.nextLeader = director;
        director.nextLeader = manager;
        //发起报销
        groupLeader.handleRequest(50000);
    }
}
}