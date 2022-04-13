package gof_23_flyweight;

/**
 * @author zhr
 */
public class FlightImpl implements Flight {
  @Override
  public void action(int number) {
    System.out.println("数据信息" + number);
  }
}
