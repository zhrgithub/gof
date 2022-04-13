package gof_13_decorator.report.decorator.decoratorExtends;

import gof_13_decorator.report.SchoolReport;
import gof_13_decorator.report.decorator.Decorator;

/**
 * 修饰器实现类（添加最高分）
 *
 * @author zhr
 */
public class HighScoreDecorator extends Decorator {
  public HighScoreDecorator(SchoolReport schoolReport) {
    super(schoolReport);
  }

  private void reportHighScore() {
    System.out.println("年级最高分：语文是75，数学是78，自然是80");
  }

  @Override
  public void report() {
    this.reportHighScore();
    super.report();
  }
}
