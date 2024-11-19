package org.example.Behavioral.Command;

public class VolumeDownCommand implements Command{

    private final ElectronicDevice electronicDevice;

    public VolumeDownCommand(ElectronicDevice newDevice){
        electronicDevice = newDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeDown();
    }
}
