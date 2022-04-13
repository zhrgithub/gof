package gof_06_abstractFactory.human.service.impl;

import gof_06_abstractFactory.human.service.abstractImpl.YellowHuman;

/**
 * @author zhr
 */
public class FemaleWhiteHuman extends YellowHuman {
  @Override
  public void sex() {
    System.out.println("女性白种人");
  }
}
