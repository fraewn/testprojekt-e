package CommandPattern;

public class ConcreteCommand1 implements CommandInterface {
	CommandReceiver receiver = new CommandReceiver();

	@Override
	public void execute() {
		System.out.println("I am ConcreteCommand1 and start the receiver");
		receiver.start();
	}
}
