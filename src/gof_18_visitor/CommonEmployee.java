package gof_18_visitor;

import gof_18_visitor.service.Ivisiter;

/**
 * 普通用户
 *
 * @author zhr
 */
public class CommonEmployee extends Employee {

  /** 工作内容，这个非常重要，以后的职业规划就是靠这个了 */
  private String job;

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public void accept(Ivisiter ivisiter) {
    ivisiter.visit(this);
  }
}
