package org.example.Behavioral.Command;

public class TurnTvOnCommand implements Command{

    private final ElectronicDevice electronicDevice;

    public TurnTvOnCommand(ElectronicDevice newDevice){
        electronicDevice = newDevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    }
}
