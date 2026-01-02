package org.design.pattern.command;

import java.util.Arrays;
import org.design.pattern.command.commands.NoCommand;

public class RemoteControl {
  private final Command[] onCommands;
  private final Command[] offCommands;
  private Command lastCommand = new NoCommand();

  public RemoteControl(int slots) {
    onCommands = new Command[slots];
    offCommands = new Command[slots];

    Command no = new NoCommand();
    Arrays.fill(onCommands, no);
    Arrays.fill(offCommands, no);
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPressed(int slot) {
    onCommands[slot].execute();
    lastCommand = onCommands[slot];
  }

  public void offButtonWasPressed(int slot) {
    offCommands[slot].execute();
    lastCommand = offCommands[slot];
  }

  public void undoButtonWasPressed() {
    lastCommand.undo();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("\n------ Remote Control ------\n");
    for (int i = 0; i < onCommands.length; i++) {
      sb.append("[slot ").append(i).append("] ")
          .append(onCommands[i].getClass().getSimpleName())
          .append("    ")
          .append(offCommands[i].getClass().getSimpleName())
          .append("\n");
    }
    sb.append("[undo] ").append(lastCommand.getClass().getSimpleName()).append("\n");
    return sb.toString();
  }
}

