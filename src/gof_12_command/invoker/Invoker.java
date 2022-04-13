package gof_12_command.invoker;

import gof_12_command.command.Command;

/**
 * @author zhr
 */
public class Invoker {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void action() {
    this.command.excute();
  }
}
