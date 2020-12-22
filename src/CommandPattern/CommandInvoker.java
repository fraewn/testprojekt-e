package CommandPattern;

public class CommandInvoker {
	private CommandInterface command;
	public void setCommand(CommandInterface command){
		this.command = command;
	}
	public void useCommand(){
		command.execute();
	}
}
