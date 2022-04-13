package gof_16_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhr
 */
public class LiSi implements Observer {
  @Override
  public void update(Observable o, Object arg) {
    String context = (String) arg;
    this.findMessage(context);
    System.out.println("报告完毕");
  }

  private void findMessage(String context) {
    System.out.println("报告老板-----》" + context);
  }
}
