package org.example.Behavioral.ChainOfResponsibility;

public class SumHandler implements Handler{

    private Handler handler;

//    public SumHandler(Handler handler) {
//        this.handler = handler;
//    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void processRequest(int number1, int number2, String description) {
        if(description.equals("sum")){
            System.out.println(number1 + number2);
        }else{
            handler.processRequest(number1,number2,description);
        }
    }
}
