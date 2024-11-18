package org.example.Behavioral.ChainOfResponsibility;

public class MultiplyHandler implements Handler{

    private Handler handler;

//    public MultiplyHandler(Handler handler) {
//        this.handler = handler;
//    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void processRequest(int number1, int number2, String description) {
        if(description.equals("multiply")){
            System.out.println(number1 * number2);
        }else{
            System.out.println("4 type of operations are supported: Sum, Subtract, Multiply and Divide");
        }
    }
}
