package gof_18_visitor.service.impl;

import gof_18_visitor.CommonEmployee;
import gof_18_visitor.Employee;
import gof_18_visitor.Manager;
import gof_18_visitor.service.IShowVisitor;

/**
 * 展示报表，该访问者的工作就是看到什么数据展示什么数据
 *
 * @author zhr
 */
public class ShowVisitor implements IShowVisitor {
  private String info = "";

  @Override
  public void report() {
    System.out.println(this.info);
  }

  /**
   * 访问普通员工，组装信息
   *
   * @param commonEmployee
   */
  @Override
  public void visit(CommonEmployee commonEmployee) {
    this.info =
        this.info + this.getBasicInfo(commonEmployee) + "工作:" + commonEmployee.getJob() + "\t\n";
  }

  /**
   * 访问经理，然后组装信息
   *
   * @param manager
   */
  @Override
  public void visit(Manager manager) {
    this.info = this.info + this.getBasicInfo(manager) + "业绩:" + manager.getPerformance() + "\t\n ";
  }

  /**
   * 组装出基本信息
   *
   * @param employee
   * @return
   */
  private String getBasicInfo(Employee employee) {
    String info = "姓名：" + employee.getName() + "\t";
    info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
    info = info + "薪水：" + employee.getSalary() + "\t";
    return info;
  }
}
