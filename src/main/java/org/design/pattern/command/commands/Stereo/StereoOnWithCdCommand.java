package org.design.pattern.command.commands.Stereo;

import org.design.pattern.command.Command;
import org.design.pattern.command.receiver.Stereo;

public class StereoOnWithCdCommand implements Command {
  private final Stereo stereo;

  public StereoOnWithCdCommand(Stereo stereo) { this.stereo = stereo; }

  @Override
  public void execute() {
    stereo.on();
    stereo.setCd();
    stereo.setVolume(11);
  }

  @Override
  public void undo() {
    stereo.off();
  }
}

