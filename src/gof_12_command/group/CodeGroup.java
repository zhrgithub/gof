package gof_12_command.group;

/**
 * @author zhr
 */
public class CodeGroup extends Group {
  @Override
  public void add() {
    System.out.println("客户要求新增加一个代码。。。");
  }

  @Override
  public void delete() {
    System.out.println("客户要求删除一个代码。。。");
  }

  @Override
  public void change() {
    System.out.println("客户要求变更一个代码。。。。。");
  }

  @Override
  public void find() {
    System.out.println("找到开发组");
  }

  @Override
  public void plan() {
    System.out.println("客户代码变更计划书。。。。");
  }
}
