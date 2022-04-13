package gof_12_command;

import gof_12_command.command.AddRequirementCommand;
import gof_12_command.command.Command;
import gof_12_command.invoker.Invoker;

/**
 * @author zhr
 */
public class Client {
  public static void main(String[] args) {

    Command addRequirementCommand = new AddRequirementCommand();

    Invoker invoker = new Invoker();
    invoker.setCommand(addRequirementCommand);
    invoker.action();
  }
}
