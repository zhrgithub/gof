package gof_13_decorator.report.decorator.decoratorExtends;

import gof_13_decorator.report.SchoolReport;
import gof_13_decorator.report.decorator.Decorator;

/**
 * 修饰器实现类（添加排名）
 *
 * @author zhr
 */
public class SortDecorator extends Decorator {

  public SortDecorator(SchoolReport schoolReport) {
    super(schoolReport);
  }

  /** 告诉老爸学校的排名情况 */
  private void reportSort() {
    System.out.println("您孩子的排名第38名...");
  }

  @Override
  public void report() {
    super.report();
    this.reportSort();
  }
}
