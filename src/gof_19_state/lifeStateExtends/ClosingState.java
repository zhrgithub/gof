package gof_19_state.lifeStateExtends;

import gof_19_state.Context;
import gof_19_state.LifeState;

/**
 * @author zhr_java@163.com
 * @date 2022/4/12 10:25
 */
public class ClosingState extends LifeState {

  @Override
  public void open() {
    super.context.setLifeState(Context.OPENNING_STATE);
    super.context.getLifeState().open();
  }

  @Override
  public void close() {
    System.out.println("电梯门关闭...");
  }

  @Override
  public void run() {
    super.context.setLifeState(Context.RUNNING_STATE);
    super.context.getLifeState().run();
  }

  @Override
  public void stop() {
    super.context.setLifeState(Context.STOPPING_STATE);
    super.context.getLifeState().stop();
  }
}
