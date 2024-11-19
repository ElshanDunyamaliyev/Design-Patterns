package org.example.Behavioral.Command;

public class VolumeUpCommand implements Command{

    private final ElectronicDevice electronicDevice;

    public VolumeUpCommand(ElectronicDevice newDevice){
        electronicDevice = newDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeUp();
    }
}
