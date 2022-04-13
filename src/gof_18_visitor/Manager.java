package gof_18_visitor;

import gof_18_visitor.service.Ivisiter;

/**
 * 管理者
 *
 * @author zhr
 */
public class Manager extends Employee {

  /** 这类人物的职责非常明确：业绩 */
  private String performance;

  public String getPerformance() {
    return performance;
  }

  public void setPerformance(String performance) {
    this.performance = performance;
  }

  @Override
  public void accept(Ivisiter ivisiter) {
    ivisiter.visit(this);
  }
}
