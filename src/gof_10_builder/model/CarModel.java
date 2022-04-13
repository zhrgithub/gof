package gof_10_builder.model;

import java.util.ArrayList;

/**
 * 建造车模型的抽象 不同车辆的基本动作类型是一样的，但是具体实现是不同的，所以可以把基本动作类型抽象出来；具体的实现可以具体到实际的类型车辆去实现
 * 在建造车模型的时候可以根据顺序来建造，比如说先造启动器，再造喇叭然后再造等等，这些步骤可以放到List中存储起来，然后遍历判断进行有序的建造
 *
 * @author zhr
 */
public abstract class CarModel {

  private ArrayList<String> sequence = new ArrayList<String>();

  /** 启动 */
  protected abstract void start();

  /** 停止 */
  protected abstract void stop();

  /** 鸣笛 */
  protected abstract void alarm();

  /** 发动机 */
  protected abstract void engineBoom();

  public final void run() {
    for (int i = 0; i < this.sequence.size(); i++) {
      String actionName = this.sequence.get(i);
      if (actionName.equalsIgnoreCase("start")) {
        this.start();
      } else if (actionName.equalsIgnoreCase("stop")) {
        this.stop();
      } else if (actionName.equalsIgnoreCase("alarm")) {
        this.alarm();
      } else if (actionName.equalsIgnoreCase("engineBoom")) {
        this.engineBoom();
      }
    }
  }

  public final void setSequence(ArrayList<String> sequence) {
    this.sequence = sequence;
  }
}
