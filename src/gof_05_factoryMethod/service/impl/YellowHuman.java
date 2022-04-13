package gof_05_factoryMethod.service.impl;

import gof_05_factoryMethod.service.Human;

/**
 * @author zhr
 */
public class YellowHuman implements Human {

  @Override
  public void laugh() {
    System.out.println("黄种人会笑");
  }

  @Override
  public void cry() {
    System.out.println("黄种人会哭");
  }

  @Override
  public void talk() {
    System.out.println("黄种人会讲话");
  }
}
