package responsibility.proxy.exp1;

public class RealSubject implements Subject {

    @Override
    public void operate() {
        System.out.println("realsubject operate started......");
    }

}
