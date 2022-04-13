package gof_19_state;

import gof_19_state.lifeStateExtends.ClosingState;

/**
 * 优点：不需要通过if或者Switch判断状态，符合开闭原则，迪米特法则
 * 缺点：子类比较多，显得臃肿
 *
 * @author zhr_java@163.com
 * @date 2022/4/12 10:47
 */
public class Client {

  public static void main(String[] args) {
    //单元测试
      Context context = new Context();
      context.setLifeState(new ClosingState());
      context.open();
      context.close();
      context.run();
      context.stop();
  }
}
