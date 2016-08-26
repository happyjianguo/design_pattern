package operations.strategy.eg1;

/**
 * 环境角色，主要完成对特定策略的调用
 * 
 */
public class Context {
    private AbstractStrategy strategy;

    public Context(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        this.strategy.algorithm();
    }
}
