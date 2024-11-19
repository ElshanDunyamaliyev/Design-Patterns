package org.example.Behavioral.Command;

public class TvRemote {

    public static ElectronicDevice getElectronicDevice(){
        return new Television();
    }
}
