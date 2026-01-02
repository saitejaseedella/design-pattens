package org.design.pattern.command;

import org.design.pattern.command.commands.Stereo.StereoOffCommand;
import org.design.pattern.command.commands.Stereo.StereoOnWithCdCommand;
import org.design.pattern.command.commands.light.LightOffCommand;
import org.design.pattern.command.commands.light.LightOnCommand;
import org.design.pattern.command.receiver.Light;
import org.design.pattern.command.receiver.Stereo;

public class RemoteControlTestDrive {
  public static void main(String[] args) {

    RemoteControl remote = new RemoteControl(2);

    Light livingRoomLight = new Light("Living Room");
    Stereo livingRoomStereo = new Stereo("Living Room");

    remote.setCommand(0,
        new LightOnCommand(livingRoomLight),
        new LightOffCommand(livingRoomLight));

    remote.setCommand(1,
        new StereoOnWithCdCommand(livingRoomStereo),
        new StereoOffCommand(livingRoomStereo));

    System.out.println(remote);

    remote.onButtonWasPressed(0);
    remote.offButtonWasPressed(0);
    remote.undoButtonWasPressed();

    System.out.println();

    remote.onButtonWasPressed(1);
    remote.undoButtonWasPressed();
  }
}

