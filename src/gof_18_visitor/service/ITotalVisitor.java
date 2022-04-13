package gof_18_visitor.service;

/**
 * 负责汇总表
 *
 * @author zhr
 */
public interface ITotalVisitor extends Ivisiter {

  /** 薪水合计 */
  public void totalSalary();
}
