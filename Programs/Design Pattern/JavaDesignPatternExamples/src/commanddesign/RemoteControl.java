package commanddesign;

import java.util.Stack;

public class RemoteControl {

	private Stack<Command> history = new Stack<Command>();
	
	public void presssButton(Command command) {
		command.execute();		// command is reference of on or off 
		history.add(command);
	}
	
	public void undoButton() {
		if(history.isEmpty()) {
			System.out.println("Nothing to undo");
		}else {
			Command lastCommand = history.pop();		// command object of on 
			lastCommand.undo();
		}
	}
	
	public Stack<Command> getAllCommandDetails() {
		return history;
	}
}
