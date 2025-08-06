package commanddesign;

public class LightOffCommands  implements Command{

	private Light light;
// StackString> forwardHistory;
// Stack<String> backwardHistory;
	public LightOffCommands(Light light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOff();
		
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.turnOn();
	}

}