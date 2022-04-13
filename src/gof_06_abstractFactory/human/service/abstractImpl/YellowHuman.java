package gof_06_abstractFactory.human.service.abstractImpl;

import gof_06_abstractFactory.human.service.Human;

/**
 * @author zhr
 */
public abstract class YellowHuman implements Human {
  @Override
  public void cry() {
    System.out.println("黄种人会哭");
  }

  @Override
  public void laugh() {
    System.out.println("黄种人会笑");
  }

  @Override
  public void talk() {
    System.out.println("黄种人会讲话");
  }
}
