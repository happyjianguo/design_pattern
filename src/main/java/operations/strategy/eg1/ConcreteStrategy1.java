package operations.strategy.eg1;


/** 
* 对算法的第一种具体实现策略 
* 
*/
public class ConcreteStrategy1 extends AbstractStrategy{
    @Override  
    public void algorithm() {  
        System.out.println("----------------我是策略一算法----------------");  
    }
}
