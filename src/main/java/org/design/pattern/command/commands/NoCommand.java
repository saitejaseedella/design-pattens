package org.design.pattern.command.commands;

import org.design.pattern.command.Command;

public class NoCommand implements Command {
  @Override public void execute() {}
  @Override public void undo() {}
}

