package gof_19_state.lifeStateExtends;

import gof_19_state.Context;
import gof_19_state.LifeState;

/**
 * @author zhr_java@163.com
 * @date 2022/4/12 10:24
 */
public class StoppingState extends LifeState {

  @Override
  public void open() {
    super.context.setLifeState(Context.OPENNING_STATE);
    super.context.getLifeState().open();
  }

  /** 从运行到停止，门本来就是关着的 */
  @Override
  public void close() {
    // do nothing;
  }

  /**
   * 从停止状态到运行状态
   */
  @Override
  public void run() {
    super.context.setLifeState(Context.RUNNING_STATE);
    super.context.getLifeState().run();
  }

  @Override
  public void stop() {
    System.out.println("电梯停止啦！！！");
  }
}
