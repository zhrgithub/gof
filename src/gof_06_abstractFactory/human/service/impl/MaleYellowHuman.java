package gof_06_abstractFactory.human.service.impl;

import gof_06_abstractFactory.human.service.abstractImpl.YellowHuman;

/**
 * @author zhr
 */
public class MaleYellowHuman extends YellowHuman {
  @Override
  public void sex() {
    System.out.println("男性黄种人");
  }
}
