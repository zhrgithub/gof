package gof_13_decorator;

import gof_13_decorator.report.decorator.decoratorExtends.HighScoreDecorator;
import gof_13_decorator.report.decorator.decoratorExtends.LastCoreDecorator;
import gof_13_decorator.report.decorator.decoratorExtends.SortDecorator;
import gof_13_decorator.report.reportExtends.FouthGradeSchoolReport;
import gof_13_decorator.report.SchoolReport;

/**
 * 装饰者模式 特点：减少继承过多，减少方法臃肿
 *
 * @author zhr
 */
public class Father {
  public static void main(String[] args) {

    // 成绩单拿过来
    SchoolReport sr;
    // 原装的成绩单
    sr = new FouthGradeSchoolReport();

    // 加了最高分说明的成绩单
    sr = new HighScoreDecorator(sr);

    // 倒数第一名同学的成绩
    sr = new LastCoreDecorator(sr);

    // 成绩排名的说明
    sr = new SortDecorator(sr);

    // 看成绩单
    sr.report();

    // 然后老爸，一看，很开心，就签名了
    // 我叫小三，老爸当然叫老三
    sr.sign("老三");
  }
}
