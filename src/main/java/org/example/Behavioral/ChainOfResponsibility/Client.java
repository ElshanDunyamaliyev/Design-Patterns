package org.example.Behavioral.ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        SumHandler sumHandler = new SumHandler();
        SubtractHandler subtractHandler = new SubtractHandler();
        DivideHandler divideHandler = new DivideHandler();
        MultiplyHandler multiplyHandler = new MultiplyHandler();

        sumHandler.setNextHandler(subtractHandler);
        subtractHandler.setNextHandler(divideHandler);
        divideHandler.setNextHandler(multiplyHandler);
        multiplyHandler.setNextHandler(null);

        sumHandler.processRequest(4,2,"power");
    }
}
