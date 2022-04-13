package gof_22_memento;

/**
 * 备忘录模式！！！
 *
 * @author zhr
 */
public class Test {
  public static void main(String[] args) {
    Origin origin = new Origin();

    origin.setState("在吃饭！！！");
    Craker craker = new Craker();
    craker.setMemen(origin.createMemen());

    origin.setState("在睡觉！！！");

    origin.show();

    origin.setMemen(craker.getMemen());

    origin.show();
  }
}
