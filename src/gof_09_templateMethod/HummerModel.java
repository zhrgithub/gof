package gof_09_templateMethod;

/**
 * @author zhr
 */
public abstract class HummerModel {

  /** 启动 */
  protected abstract void start();

  /** 停止 */
  protected abstract void stop();

  /** 鸣笛 */
  protected abstract void alarm();

  /** 发动机 */
  protected abstract void engineBoom();

  public final void run() {
    this.start();

    this.engineBoom();

    if (this.isAlarm()) {
      this.alarm();
    }

    this.stop();
  }

  protected boolean isAlarm() {
    return false;
  }
}
