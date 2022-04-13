package gof_19_state.lifeStateExtends;

import gof_19_state.Context;
import gof_19_state.LifeState;

/**
 * @author zhr_java@163.com
 * @date 2022/4/12 10:24
 */
public class OpenningState extends LifeState {

  @Override
  public void open() {
    System.out.println("电梯门打开。。。。。");
  }

  @Override
  public void close() {
    super.context.setLifeState(Context.CLOSEING_STATE);
    super.context.getLifeState().close();
  }

  @Override
  public void run() {
    // do nothing;
  }

  @Override
  public void stop() {
    // do nothing;
  }
}
