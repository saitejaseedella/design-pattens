package org.design.pattern.command.commands.light;

import org.design.pattern.command.Command;
import org.design.pattern.command.receiver.Light;

public class LightOffCommand implements Command {

  private final Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }

}
