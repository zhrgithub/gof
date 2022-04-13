package gof_05_factoryMethod.service.impl;

import gof_05_factoryMethod.service.Human;

/**
 * @author zhr
 */
public class WhiteHuman implements Human {

  @Override
  public void laugh() {
    System.out.println("白种人会笑");
  }

  @Override
  public void cry() {
    System.out.println("白种人会哭");
  }

  @Override
  public void talk() {
    System.out.println("白种人会讲话");
  }
}
