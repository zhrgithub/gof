package gof_09_templateMethod;

/**
 * @author zhr
 */
public class HummerH1Model extends HummerModel {
  @Override
  protected void start() {
    System.out.println("模型车一再启动");
  }

  @Override
  protected void stop() {
    System.out.println("模型车一停止");
  }

  @Override
  protected void alarm() {
    System.out.println("模型车一鸣笛！");
  }

  @Override
  protected void engineBoom() {
    System.out.println("模型车一发动机启动");
  }
}
