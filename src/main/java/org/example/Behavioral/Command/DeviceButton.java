package org.example.Behavioral.Command;

public class DeviceButton {

    private final Command command;

    public DeviceButton(Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }
}
