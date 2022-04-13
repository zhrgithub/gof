package gof_23_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhr
 */
public class FlyweightFactory {
  private static Map data = new HashMap<>();

  public static Flight createFlght(String string) {
    if (data.get(string) == null) {
      data.put(string, new FlightImpl());
    }
    return (Flight) data.get(string);
  }

  public static void getSize() {
    System.out.println("数据的大小：" + data.size());
  }
}
