package gof_16_observer;

import java.util.Observable;

/**
 * @author zhr
 */
public class HanFeiZi extends Observable {
  public void haveBreakFast() {
    System.out.println("韩非子准备去干饭！");
    super.setChanged();
    super.notifyObservers("韩非子在吃饭");
  }

  public void haveFun() {
    System.out.println("韩非子开始玩了！");
    super.setChanged();
    super.notifyObservers("韩非子在玩");
  }
}
