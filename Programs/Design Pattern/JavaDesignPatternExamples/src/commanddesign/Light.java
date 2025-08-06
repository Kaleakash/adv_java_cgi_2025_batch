package commanddesign;

public class Light {
	private boolean isOn  = false;

	public void turnOn() {
		this.isOn=true;
		System.out.println("Light is On");
	}
	public void turnOff() {
		this.isOn=false;
		System.out.println("Light is Of");
	}
	
	public boolean isOn() {
		return this.isOn;
	}
	
}
