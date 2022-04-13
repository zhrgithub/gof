package gof_06_abstractFactory.human.service.impl;

import gof_06_abstractFactory.human.service.abstractImpl.YellowHuman;

/**
 * @author zhr
 */
public class FemaleYellowHuman extends YellowHuman {
  @Override
  public void sex() {
    System.out.println("女性黄种人");
  }
}
