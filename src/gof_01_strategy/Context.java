package gof_01_strategy;

import gof_01_strategy.service.IStrategy;

/**
 * @author zhr
 */
public class Context {
  private IStrategy iStrategy;

  public Context(IStrategy iStrategy) {
    this.iStrategy = iStrategy;
  }

  public void operation() {
    this.iStrategy.operation();
  }
}
