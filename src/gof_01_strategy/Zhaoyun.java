package gof_01_strategy;

import gof_01_strategy.service.impl.BlockEmney;
import gof_01_strategy.service.impl.DockDoor;
import gof_01_strategy.service.impl.GivenGreenLight;

/**
 * 策略模式
 *
 * <p>优点：
 *
 * <p>1、符合开闭原则。
 *
 * <p>2、可以减少if...else...语句、switch 语句
 *
 * <p>3、可以提高算法的保密性和安全性。
 *
 * <p>缺点：
 *
 * <p>1、客户端必须知道所有的策略，并且自行决定使用哪一个策略类。
 *
 * <p>2、代码中会产生非常多策略类，增加维护难度。
 *
 * <p>适用场景： 1、系统有很多类，但是他们的区别只是行为不同 2、一个系统需要动态的在几个算法中选择一种 3、多个类只有在算法或行为上稍有不同的场景 4、算法需要自由切换的场景
 * 5、需要屏蔽算法规则的场景
 *
 * <p>注意：具体策略数量超过4个，则需要考虑使用混合模式。
 *
 * @author zhr
 */
public class Zhaoyun {
  public static void main(String[] args) {
    Context context = new Context(new DockDoor());
    context.operation();
    context = new Context(new GivenGreenLight());
    context.operation();
    context = new Context(new BlockEmney());
    context.operation();
  }
}
