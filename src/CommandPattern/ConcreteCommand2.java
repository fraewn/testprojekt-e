package CommandPattern;

public class ConcreteCommand2 implements CommandInterface {
	CommandReceiver receiver = new CommandReceiver();

	@Override
	public void execute() {
		System.out.println("I am ConcreteCommand2 and stop the receiver");
		receiver.stop();
	}
}
