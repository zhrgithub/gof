package gof_13_decorator.report.decorator.decoratorExtends;

import gof_13_decorator.report.SchoolReport;
import gof_13_decorator.report.decorator.Decorator;

/**
 * @author zhr_java@163.com
 * @date 2022/4/8 18:01
 */
public class LastCoreDecorator extends Decorator {

  /**
   * 传递成绩单过来
   *
   * @param schoolReport
   */
  public LastCoreDecorator(SchoolReport schoolReport) {

    super(schoolReport);
  }

  private void lastCore() {
    System.out.println("倒数第一名的成绩是：语文：32 数学：33 体育：100 自然：9");
  }

  @Override
  public void report() {
    this.lastCore();
    super.report();
  }
}
