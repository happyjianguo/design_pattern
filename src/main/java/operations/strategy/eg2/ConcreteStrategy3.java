package operations.strategy.eg2;

public class ConcreteStrategy3 extends AbstractStrategy {
    @Override
    public void algorithm(Context context) {
        System.out.println("----------------我是策略二算法----------------");
        System.out.println("------------------我需要的参数parameter1="+context.getParameter1());  
        System.out.println("------------------我需要的参数parameter2="+context.getParameter2());  
        
    }
}
