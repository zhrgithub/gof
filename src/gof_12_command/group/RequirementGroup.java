package gof_12_command.group;

/**
 * @author zhr
 */
public class RequirementGroup extends Group {
  @Override
  public void add() {
    System.out.println("客户要求新增加一个需求。。。");
  }

  @Override
  public void delete() {
    System.out.println("客户要求删除一个需求。。。");
  }

  @Override
  public void change() {
    System.out.println("客户要求变更一个需求。。。。。");
  }

  @Override
  public void find() {
    System.out.println("找到需求组");
  }

  @Override
  public void plan() {
    System.out.println("客户需求变更计划书。。。。");
  }
}
