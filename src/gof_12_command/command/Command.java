package gof_12_command.command;

import gof_12_command.group.CodeGroup;
import gof_12_command.group.PageGroup;
import gof_12_command.group.RequirementGroup;

/**
 * @author zhr
 */
public abstract class Command {
  protected RequirementGroup requirementGroup = new RequirementGroup();

  protected PageGroup pageGroup = new PageGroup();

  protected CodeGroup codeGroup = new CodeGroup();

  /** 执行命令 */
  public abstract void excute();
}
