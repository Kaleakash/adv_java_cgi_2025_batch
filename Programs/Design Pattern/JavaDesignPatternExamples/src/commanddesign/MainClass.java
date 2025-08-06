package commanddesign;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light roomLight = new Light();
		
		Command lightOn = new LightOnCommands(roomLight);
		Command lightOff = new LightOffCommands(roomLight);
		
		
		RemoteControl rc = new RemoteControl();
		
		System.out.println(rc.getAllCommandDetails());
		
		rc.presssButton(lightOn);
		rc.undoButton();
			
		rc.presssButton(lightOff);
		rc.undoButton();
		
		
		
	}

}
