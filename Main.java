public class Main {
    public static void main(String[] args) {
        ConcreteSubscriber con = new ConcreteSubscriber();
        ConcreteSubscriber2 con2 = new ConcreteSubscriber2();
        con.update();
        con2.update();
    }
}
