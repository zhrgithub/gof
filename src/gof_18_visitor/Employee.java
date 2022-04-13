package gof_18_visitor;

import gof_18_visitor.service.Ivisiter;

/**
 * 员工信息
 *
 * @author zhr
 */
public abstract class Employee {

  /** 男性 */
  public static final int MALE = 0;

  /** 女性 */
  public static final int FEMALE = 1;

  /** 姓名 */
  private String name;

  /** 薪水 */
  private int salary;

  /** 性别 */
  private int sex;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  /** 打印出员工的信息 */
  public final void report() {
    String info = "姓名：" + this.name + "\t";
    info = info + "性别：" + (this.sex == FEMALE ? "女" : "男") + "\t";
    info = info + "薪水：" + this.salary + "\t";
    // 获得员工的其他信息
    info = info;
    System.out.println(info);
  }

  /**
   * 用于接收访问者
   *
   * @param ivisiter
   */
  public abstract void accept(Ivisiter ivisiter);
}
