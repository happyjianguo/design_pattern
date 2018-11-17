package com.design.pattern.operations.strategy.eg2;

public class Client {
    public static void main(String[] args) {
        
        Context context = new Context(new ConcreteStrategy1());  
        context.algorithm();  
          
        context = new Context(new ConcreteStrategy2(),100, 200);  
        context.algorithm();  
          
        context = new Context(new ConcreteStrategy3(), 100, 200);  
        context.algorithm();
        
    }
}
