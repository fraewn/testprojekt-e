package ObserverPattern;

public class ConcreteSubscriber2 implements Subscriber {
    @Override
    public void update() {
        ConcretePublisher2 concretePublisher = new ConcretePublisher2();
        concretePublisher.getState();
    }
}
