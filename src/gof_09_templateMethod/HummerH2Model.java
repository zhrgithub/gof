package gof_09_templateMethod;

/**
 * @author zhr
 */
public class HummerH2Model extends HummerModel {
  private boolean alarmFlag = false;

  @Override
  protected void start() {
    System.out.println("模型车二再启动");
  }

  @Override
  protected void stop() {
    System.out.println("模型车二停止");
  }

  @Override
  protected void alarm() {
    System.out.println("模型车二鸣笛！");
  }

  @Override
  protected void engineBoom() {
    System.out.println("模型车二发动机启动");
  }

  /**
   * 设置钩子函数
   *
   * @return
   */
  @Override
  public boolean isAlarm() {
    return this.alarmFlag;
  }

  public void setAlarmFlag(boolean alarmFlag) {
    this.alarmFlag = alarmFlag;
  }
}
