package gof_01_strategy.service.impl;

import gof_01_strategy.service.IStrategy;

/**
 * @author zhr
 */
public class DockDoor implements IStrategy {
  @Override
  public void operation() {
    System.out.println("敲乔国老的大门！！！");
  }
}
