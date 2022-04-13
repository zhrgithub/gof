package gof_13_decorator.report;

/**
 * @author zhr
 */
public abstract class SchoolReport {

  /** 成绩报告 */
  public abstract void report();

  /**
   * 签名
   *
   * @param name
   */
  public abstract void sign(String name);
}
