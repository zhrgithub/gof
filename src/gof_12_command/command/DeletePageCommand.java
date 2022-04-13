package gof_12_command.command;

/**
 * @author zhr
 */
public class DeletePageCommand extends Command {
  @Override
  public void excute() {
    super.pageGroup.find();

    super.pageGroup.delete();

    super.pageGroup.plan();
  }
}
