package ObserverPattern;

public class ObserverClient {
    public void executeObserverExample() {
        ConcreteSubscriber con = new ConcreteSubscriber();
        ConcreteSubscriber2 con2 = new ConcreteSubscriber2();
        con.update();
        con2.update();
    }
}
