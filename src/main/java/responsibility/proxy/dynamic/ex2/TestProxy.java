package responsibility.proxy.dynamic.ex2;

public class TestProxy {
    public static void main(String[] args) {
        BookFacadeProxy bookFacadeProxy = new BookFacadeProxy();
        BookFacade proxy = (BookFacade)bookFacadeProxy.bind(new BookFacadeImpl());
        proxy.addBook();
    }
}
