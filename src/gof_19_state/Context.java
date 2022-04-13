package gof_19_state;

import gof_19_state.lifeStateExtends.ClosingState;
import gof_19_state.lifeStateExtends.OpenningState;
import gof_19_state.lifeStateExtends.RunningState;
import gof_19_state.lifeStateExtends.StoppingState;

/**
 * @author zhr_java@163.com
 * @date 2022/4/12 10:17
 */
public class Context {

  /** 开门状态 */
  public static final OpenningState OPENNING_STATE = new OpenningState();

  /** 关门状态 */
  public static final ClosingState CLOSEING_STATE = new ClosingState();

  /** 运行状态 */
  public static final RunningState RUNNING_STATE = new RunningState();

  /** 停止状态 */
  public static final StoppingState STOPPING_STATE = new StoppingState();

  /** 当前电梯的状态 */
  private LifeState lifeState;

  /**
   * 返回电梯的当前状态
   *
   * @return
   */
  public LifeState getLifeState() {
    return this.lifeState;
  }

  public void setLifeState(LifeState lifeState) {

    this.lifeState = lifeState;

    // 把当前的环境通知到各个实现类中
    this.lifeState.setContext(this);
  }

  public void open() {
    this.lifeState.open();
  }

  public void close() {
    this.lifeState.close();
  }

  public void run() {
    this.lifeState.run();
  }

  public void stop() {
    this.lifeState.stop();
  }
}
