package operations.strategy.eg1;

public class Client {
    public static void main(String[] args) {
        
        Context context = new Context(new ConcreteStrategy1());
        context.algorithm();

        context = new Context(new ConcreteStrategy2());
        context.algorithm();
        
        //or without Context Class-----------------------------//
        AbstractStrategy strategy = new ConcreteStrategy1();  
        strategy.algorithm();  
          
        strategy = new ConcreteStrategy2();  
        strategy.algorithm();
    }
}
