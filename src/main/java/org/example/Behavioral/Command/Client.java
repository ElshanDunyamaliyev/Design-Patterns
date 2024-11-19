package org.example.Behavioral.Command;

public class Client {

    public static void main(String[] args) {
        var electronicDevice = TvRemote.getElectronicDevice();

        TurnTvOnCommand turnTvOnCommand = new TurnTvOnCommand(electronicDevice);
        DeviceButton deviceButton = new DeviceButton(turnTvOnCommand);
        deviceButton.press();

        TurnTvOffCommand turnTvOffCommand = new TurnTvOffCommand(electronicDevice);
        deviceButton = new DeviceButton(turnTvOffCommand);
        deviceButton.press();
    }
}
