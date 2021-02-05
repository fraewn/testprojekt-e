package CommandPattern;

public class ConcreteCommand2 implements CommandInterface {
	private CommandReceiver receiver;
	public ConcreteCommand2(CommandReceiver receiver){
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		System.out.println("I am ConcreteCommand2 and stop the receiver");
		receiver.stop();
	}
}
