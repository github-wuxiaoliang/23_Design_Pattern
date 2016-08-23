package wxl.com.a4_forth_day;

import org.junit.Test;

import wxl.com.a4_forth_day.Observer.demo.Coder;
import wxl.com.a4_forth_day.Observer.demo.DevTechFrontier;
import wxl.com.a4_forth_day.command.demo.ConcreteCommand;
import wxl.com.a4_forth_day.command.demo.Invoker;
import wxl.com.a4_forth_day.command.demo.Receiver;
import wxl.com.a4_forth_day.command.experience.Buttons;
import wxl.com.a4_forth_day.command.experience.FallCommand;
import wxl.com.a4_forth_day.command.experience.LeftCommand;
import wxl.com.a4_forth_day.command.experience.RightCommand;
import wxl.com.a4_forth_day.command.experience.TetrisMachine;
import wxl.com.a4_forth_day.command.experience.TransformCommand;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void testCommandDemo() throws Exception {
        ConcreteCommand command = new ConcreteCommand(new Receiver());
        Invoker invoker = new Invoker(command);
        invoker.action();
    }

    @Test
    public void testCommandExperience() throws Exception {
        TetrisMachine machine = new TetrisMachine();
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(new LeftCommand(machine));
        buttons.setFallCommand(new FallCommand(machine));
        buttons.setRightCommand(new RightCommand(machine));
        buttons.setTransformCommand(new TransformCommand(machine));

        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();
    }

    @Test
    public void testObserverDemo() throws Exception {
        //被观察者角色
        DevTechFrontier frontier = new DevTechFrontier();

        //观察者角色
        Coder mrsimple = new Coder("mr-simple");
        Coder coder1 = new Coder("coder1");
        Coder coder2 = new Coder("coder 2");
        Coder coder3 = new Coder("coder 3");

        //将观察者角色注册到可观察对象的观察者列表中
        frontier.addObserver(mrsimple);
        frontier.addObserver(coder1);
        frontier.addObserver(coder2);
        frontier.addObserver(coder3);

        frontier.postNewPublication("新的一期开发技术前线周报发布啦！");

    }
}