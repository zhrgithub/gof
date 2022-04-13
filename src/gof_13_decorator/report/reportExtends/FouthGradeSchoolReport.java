package gof_13_decorator.report.reportExtends;

import gof_13_decorator.report.SchoolReport;

/**
 * @author zhr
 */
public class FouthGradeSchoolReport extends SchoolReport {
  @Override
  public void report() {
    // 成绩单
    System.out.println("尊敬的家长XXX：");
    System.out.println("。。。。。。。。");
    System.out.println("您孩子的在校成绩：语文 62 数学 65 体育 98 自然 63 ");
    System.out.println("。。。。。。。。。");
    System.out.println("请家长签字后回交学校！！！");
  }

  @Override
  public void sign(String name) {
    System.out.println("家长名字：" + name);
  }
}
