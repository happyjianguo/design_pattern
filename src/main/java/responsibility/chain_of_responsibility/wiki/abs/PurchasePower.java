package responsibility.chain_of_responsibility.wiki.abs;

import responsibility.chain_of_responsibility.wiki.req.PurchaseRequest;
public abstract class PurchasePower {
    protected static final double BASE = 500;
    protected PurchasePower successor;

    abstract protected double getAllowable();

    abstract protected String getRole();

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
