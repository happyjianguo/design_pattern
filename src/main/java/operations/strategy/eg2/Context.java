package operations.strategy.eg2;

public class Context {
    /**
     * 持有对策略的引用
     */
    private AbstractStrategy strategy;
    /** 
     * parameter1、parameter2只是ConcreteStrategy2ConcreteStrategy3需要使用的参数， 
     * 而ConcreteStrategy1不使用 
     */  
    private int parameter1;  
    private int parameter2;  
    //count用来统计所有策略的算法algorithm调用的总次数  
    public static int count  = 0;  
    
    public Context(AbstractStrategy strategy) {  
        this.strategy = strategy;  
    }  
    
    public Context(AbstractStrategy strategy, int parameter1, int parameter2) {  
        super();  
        this.strategy = strategy;  
        this.parameter1 = parameter1;  
        this.parameter2 = parameter2;  
    }  


    /**
     * 算法入口
     */
    public void algorithm() {
        count++;  
        System.out.println("------------这是第"+count+"次调用algorithm算法--------"); 
        this.strategy.algorithm(this);
    }
    
    
    public int getParameter1() {  
        return parameter1;  
    }  
  
    public int getParameter2() {  
        return parameter2;  
    }
    
}
