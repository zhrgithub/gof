package gof_13_decorator.report.decorator;

import gof_13_decorator.report.SchoolReport;

/**
 * 装饰者
 *
 * @author zhr
 */
public abstract class Decorator extends SchoolReport {

  /** 首先要知道是那个成绩单 */
  private SchoolReport schoolReport;

  /**
   * 传递成绩单过来
   *
   * @param schoolReport
   */
  public Decorator(SchoolReport schoolReport) {
    this.schoolReport = schoolReport;
  }

  /**
   * 看到成绩单
   *
   * <p>根据debug查看执行逻辑：当前方法，会对子类挨个判断，如果子类重写的report方法中，在超类之前执行了自定义的方法，
   * 就先执行子类定义的方法，然后执行超类的方法，如果子类定义的方法是在超类方法之后执行的，那么最后执行该子类的方法
   */
  @Override
  public void report() {
    this.schoolReport.report();
  }

  /**
   * 签名
   *
   * @param name
   */
  @Override
  public void sign(String name) {
    this.schoolReport.sign(name);
  }
}
