package gof_06_abstractFactory.human.service.impl;

import gof_06_abstractFactory.human.service.abstractImpl.YellowHuman;

/**
 * @author zhr
 */
public class FemaleBlackHuman extends YellowHuman {
  @Override
  public void sex() {
    System.out.println("女性黑种人");
  }
}
