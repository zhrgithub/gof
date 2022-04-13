package gof_12_command.group;

/**
 * @author zhr
 */
public abstract class Group {

  /** 新增 */
  public abstract void add();

  /** 删除 */
  public abstract void delete();

  /** 修改 */
  public abstract void change();

  /** 查找 */
  public abstract void find();

  /** 计划 */
  public abstract void plan();
}
