package org.design.pattern.command.commands.light;

import org.design.pattern.command.Command;
import org.design.pattern.command.receiver.Light;

public class LightOnCommand implements Command {

  private final Light light;
  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override public void execute() {
    light.on();
  }

  @Override public void undo() {
    light.off();
  }

}
