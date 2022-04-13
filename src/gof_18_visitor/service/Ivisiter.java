package gof_18_visitor.service;

import gof_18_visitor.CommonEmployee;
import gof_18_visitor.Manager;

/**
 * @author zhr
 */
public interface Ivisiter {

  /**
   * 访问普通员工
   *
   * @param commonEmployee
   */
  void visit(CommonEmployee commonEmployee);

  /**
   * 访问管理员
   *
   * @param manager
   */
  void visit(Manager manager);
}
