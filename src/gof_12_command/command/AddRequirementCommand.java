package gof_12_command.command;

/**
 * @author zhr
 */
public class AddRequirementCommand extends Command {
  @Override
  public void excute() {
    super.requirementGroup.find();

    super.requirementGroup.add();

    super.pageGroup.add();

    super.codeGroup.add();

    super.requirementGroup.plan();
  }
}
