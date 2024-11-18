package org.example.Behavioral.ChainOfResponsibility;

public class SubtractHandler implements Handler{

    private Handler handler;

//    public SubtractHandler(Handler handler) {
//        this.handler = handler;
//    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void processRequest(int number1, int number2, String description) {
        if(description.equals("subtract")){
            System.out.println(number1 - number2);
        }else{
            handler.processRequest(number1,number2,description);
        }
    }
}
