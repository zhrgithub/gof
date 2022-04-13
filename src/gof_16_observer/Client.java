package gof_16_observer;

/**
 * 观察者模式： 适用场景：取钱，聊天，广播链，异步处理
 *
 * @author zhr
 */
public class Client {
  public static void main(String[] args) {
    LiSi liSi = new LiSi();
    HanFeiZi hanFeiZi = new HanFeiZi();

    hanFeiZi.addObserver(liSi);

    hanFeiZi.haveBreakFast();
  }
}
