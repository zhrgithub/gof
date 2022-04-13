package gof_09_templateMethod;

/**
 * 模板方法模型
 *
 * <p>优点：
 *
 * <p>缺点：
 *
 * <p>应用场景：
 *
 * @author zhr
 */
public class Client {
  public static void main(String[] args) {

    HummerH1Model hummerH1Model = new HummerH1Model();
    hummerH1Model.run();
    System.out.println(".............");
    HummerH2Model hummerH2Model = new HummerH2Model();
    hummerH2Model.setAlarmFlag(true);
    hummerH2Model.run();
  }
}
