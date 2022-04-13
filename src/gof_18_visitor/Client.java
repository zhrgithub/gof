package gof_18_visitor;

import gof_18_visitor.service.IShowVisitor;
import gof_18_visitor.service.ITotalVisitor;
import gof_18_visitor.service.impl.ShowVisitor;
import gof_18_visitor.service.impl.TotalVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 *
 * @author zhr
 */
public class Client {

  public static void main(String[] args) {

    // 展示报表访问者
    IShowVisitor showVisitor = new ShowVisitor();

    // 汇总报表的访问者
    ITotalVisitor totalVisitor = new TotalVisitor();

    for (Employee emp : mockEmployee()) {
      // 接受展示报表访问者
      emp.accept(showVisitor);

      // 接受汇总表访问者
      emp.accept(totalVisitor);
    }

    // 展示报表
    showVisitor.report();

    // 汇总报表
    totalVisitor.totalSalary();
  }

  /**
   * 模拟出公司的人员情况，我们可以想象这个数据室通过持久层传递过来的
   *
   * @return
   */
  public static List<Employee> mockEmployee() {
    List<Employee> empList = new ArrayList<Employee>();
    // 产生张三这个员工
    CommonEmployee zhangSan = new CommonEmployee();
    zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
    zhangSan.setName("张三");
    zhangSan.setSalary(1800);
    zhangSan.setSex(Employee.MALE);
    empList.add(zhangSan);
    // 产生李四这个员工
    CommonEmployee liSi = new CommonEmployee();
    liSi.setJob("页面美工，审美素质太不流行了！");
    liSi.setName("李四");
    liSi.setSalary(1900);
    liSi.setSex(Employee.FEMALE);
    empList.add(liSi);
    // 再产生一个经理
    Manager wangWu = new Manager();
    wangWu.setName("王五");
    wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
    wangWu.setSalary(18750);
    wangWu.setSex(Employee.MALE);
    empList.add(wangWu);
    return empList;
  }
}
