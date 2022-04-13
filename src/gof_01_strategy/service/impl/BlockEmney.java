package gof_01_strategy.service.impl;

import gof_01_strategy.service.IStrategy;

/**
 * @author zhr
 */
public class BlockEmney implements IStrategy {
  @Override
  public void operation() {
    System.out.println("让孙尚香截住兵马！！！");
  }
}
