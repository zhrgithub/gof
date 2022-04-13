package gof_23_flyweight;

/**
 * 亨元模式
 *
 * @author zhr
 */
public class Test {
  public static void main(String[] args) {
    Flight flight1 = FlyweightFactory.createFlght("a");
    flight1.action(1);

    Flight flight2 = FlyweightFactory.createFlght("b");
    flight2.action(2);

    Flight flight3 = FlyweightFactory.createFlght("c");
    flight1.action(3);

    FlyweightFactory.getSize();
  }
}
