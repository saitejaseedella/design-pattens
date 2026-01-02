package org.design.pattern.command.commands.Stereo;

import org.design.pattern.command.Command;
import org.design.pattern.command.receiver.Stereo;

public class StereoOffCommand implements Command {
  private final Stereo stereo;

  public StereoOffCommand(Stereo stereo) { this.stereo = stereo; }

  @Override public void execute() { stereo.off(); }
  @Override public void undo() { stereo.on(); }
}

