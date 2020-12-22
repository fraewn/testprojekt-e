package CommandPattern;

public class CommandClient {
	public void executeCommandExample() {
		CommandInvoker invoker = new CommandInvoker();
		invoker.setCommand(new ConcreteCommand1());
		invoker.useCommand();
		invoker.setCommand(new ConcreteCommand2());
		invoker.useCommand();
	}

}
