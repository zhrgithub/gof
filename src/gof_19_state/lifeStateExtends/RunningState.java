package gof_19_state.lifeStateExtends;

import gof_19_state.Context;
import gof_19_state.LifeState;

/**
 * @author zhr_java@163.com
 * @date 2022/4/12 10:25
 */
public class RunningState extends LifeState {

  @Override
  public void open() {
    // do nothing;
  }

  @Override
  public void close() {
    // do nothing;
  }

  @Override
  public void run() {
    System.out.println("电梯正在运行");
  }

  @Override
  public void stop() {
    super.context.setLifeState(Context.STOPPING_STATE);
    super.context.getLifeState().stop();
  }
}
