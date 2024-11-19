package org.example.Behavioral.Command;

public class TurnTvOffCommand implements Command {

    private final ElectronicDevice electronicDevice;

    public TurnTvOffCommand(ElectronicDevice newDevice) {
        electronicDevice = newDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }

}
