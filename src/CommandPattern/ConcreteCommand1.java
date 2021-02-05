package CommandPattern;

public class ConcreteCommand1 implements CommandInterface {
	private CommandReceiver receiver;
	public ConcreteCommand1(CommandReceiver receiver){
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		System.out.println("I am ConcreteCommand1 and start the receiver");
		receiver.start();
	}
}
