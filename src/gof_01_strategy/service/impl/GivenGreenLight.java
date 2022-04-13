package gof_01_strategy.service.impl;

import gof_01_strategy.service.IStrategy;

/**
 * @author zhr
 */
public class GivenGreenLight implements IStrategy {

  @Override
  public void operation() {
    System.out.println("给吴国太要绿灯！！");
  }
}
