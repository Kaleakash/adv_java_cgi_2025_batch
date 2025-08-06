package commanddesign;

public class LightOnCommands implements Command{

	private Light light;
// StackString> forwardHistory;
// Stack<String> backwardHistory;
	public LightOnCommands(Light light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnOn();
		
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.turnOff();
	}
}

