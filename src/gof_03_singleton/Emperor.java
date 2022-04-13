package gof_03_singleton;

/**
 * @author zhr
 */
public class Emperor {
  private static Emperor emperor = null;

  public Emperor() {}

  public static Emperor getInstance() {
    if (emperor == null) {
      emperor = new Emperor();
    }
    return emperor;
  }

  public static void emperorInfo() {
    System.out.println("我就是皇帝XXX");
  }
}
