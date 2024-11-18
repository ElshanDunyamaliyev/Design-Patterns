package org.example.Behavioral.ChainOfResponsibility;

public interface Handler {

    void setNextHandler(Handler handler);
    void processRequest(int number1, int number2, String description);
}
