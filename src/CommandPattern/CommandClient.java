package CommandPattern;

public class CommandClient {
	public void executeCommandExample() {
		CommandReceiver commandReceiver = new CommandReceiver();
		CommandInvoker invoker = new CommandInvoker();
		CommandInterface command1 = new ConcreteCommand1(commandReceiver);
		invoker.setCommand(command1);
		invoker.useCommand();

		CommandInterface command2 = new ConcreteCommand2(commandReceiver);
		invoker.setCommand(command2);
		invoker.useCommand();




	}

}
